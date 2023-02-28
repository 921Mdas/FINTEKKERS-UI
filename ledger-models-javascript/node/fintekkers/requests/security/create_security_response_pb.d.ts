// package: fintekkers.requests.security
// file: fintekkers/requests/security/create_security_response.proto

/* tslint:disable */
/* eslint-disable */

import * as jspb from "google-protobuf";
import * as fintekkers_models_security_security_pb from "../../../fintekkers/models/security/security_pb";
import * as fintekkers_requests_security_create_security_request_pb from "../../../fintekkers/requests/security/create_security_request_pb";
import * as fintekkers_requests_util_errors_summary_pb from "../../../fintekkers/requests/util/errors/summary_pb";

export class CreateSecurityResponseProto extends jspb.Message { 
    getObjectClass(): string;
    setObjectClass(value: string): CreateSecurityResponseProto;
    getVersion(): string;
    setVersion(value: string): CreateSecurityResponseProto;

    hasSecurityRequest(): boolean;
    clearSecurityRequest(): void;
    getSecurityRequest(): fintekkers_requests_security_create_security_request_pb.CreateSecurityRequestProto | undefined;
    setSecurityRequest(value?: fintekkers_requests_security_create_security_request_pb.CreateSecurityRequestProto): CreateSecurityResponseProto;

    hasSecurityResponse(): boolean;
    clearSecurityResponse(): void;
    getSecurityResponse(): fintekkers_models_security_security_pb.SecurityProto | undefined;
    setSecurityResponse(value?: fintekkers_models_security_security_pb.SecurityProto): CreateSecurityResponseProto;

    hasErrorsOrWarnings(): boolean;
    clearErrorsOrWarnings(): void;
    getErrorsOrWarnings(): fintekkers_requests_util_errors_summary_pb.SummaryProto | undefined;
    setErrorsOrWarnings(value?: fintekkers_requests_util_errors_summary_pb.SummaryProto): CreateSecurityResponseProto;

    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): CreateSecurityResponseProto.AsObject;
    static toObject(includeInstance: boolean, msg: CreateSecurityResponseProto): CreateSecurityResponseProto.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: CreateSecurityResponseProto, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): CreateSecurityResponseProto;
    static deserializeBinaryFromReader(message: CreateSecurityResponseProto, reader: jspb.BinaryReader): CreateSecurityResponseProto;
}

export namespace CreateSecurityResponseProto {
    export type AsObject = {
        objectClass: string,
        version: string,
        securityRequest?: fintekkers_requests_security_create_security_request_pb.CreateSecurityRequestProto.AsObject,
        securityResponse?: fintekkers_models_security_security_pb.SecurityProto.AsObject,
        errorsOrWarnings?: fintekkers_requests_util_errors_summary_pb.SummaryProto.AsObject,
    }
}
