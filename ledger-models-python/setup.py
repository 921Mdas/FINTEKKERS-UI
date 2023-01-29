from setuptools import find_packages, setup
import os

src_folder = './src'
packages = find_packages(where=src_folder)

print(packages)

def package_files(directory):
    paths = []
    for (path, directories, filenames) in os.walk(directory):
        for filename in filenames:
            paths.append(os.path.join(path.replace(src_folder+'/', ''), filename))

    print(paths)
    return paths

extra_files = package_files('.')

setup(
    name='fintekkers-ledger-models',
    # package_dir = {"": "src"}
    version='0.0.1',
    package_dir={'':'src'},
    packages=packages,
    package_data={'': extra_files},
    # package_data=['fintekkers', 'dummyService'],
    py_modules=['models', 'requests', 'services']
)