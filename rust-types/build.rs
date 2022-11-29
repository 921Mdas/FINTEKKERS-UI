use std::{env, path::Path};

use walkdir::WalkDir;

fn main() {
    let dir = env::var("CARGO_MANIFEST_DIR").unwrap();
    let proto_dir_path = Path::new(&dir).join(Path::new("protos"));

    // find paths of all proto files
    let proto_files: Vec<String> = WalkDir::new(proto_dir_path)
        .into_iter()
        .filter_map(|e| e.ok())
        .filter(|e| {
            if let Some(ext) = e.path().extension() {
                if ext == "proto" {
                    return true;
                }
                return false;
            }
            return false;
        })
        .filter_map(|e| {
            e.into_path()
                .strip_prefix(dir.to_owned())
                .unwrap()
                .to_owned()
                .into_os_string()
                .into_string()
                .ok()
        })
        .collect();

    tonic_build::configure()
        .build_client(true)
        .build_server(true)
        .out_dir("src/ledger_models")
        .compile(&proto_files, &["."])
        .unwrap()
}