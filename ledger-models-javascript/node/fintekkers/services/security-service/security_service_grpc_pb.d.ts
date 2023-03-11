// package: fintekkers.services.security_service
// file: fintekkers/services/security-service/security_service.proto

/* tslint:disable */
/* eslint-disable */

import * as grpc from "@grpc/grpc-js";
import * as fintekkers_services_security_service_security_service_pb from "../../../fintekkers/services/security-service/security_service_pb";
import * as fintekkers_requests_security_query_security_request_pb from "../../../fintekkers/requests/security/query_security_request_pb";
import * as fintekkers_requests_security_query_security_response_pb from "../../../fintekkers/requests/security/query_security_response_pb";
import * as fintekkers_requests_security_create_security_request_pb from "../../../fintekkers/requests/security/create_security_request_pb";
import * as fintekkers_requests_security_create_security_response_pb from "../../../fintekkers/requests/security/create_security_response_pb";
import * as fintekkers_requests_util_errors_summary_pb from "../../../fintekkers/requests/util/errors/summary_pb";

interface ISecurityService extends grpc.ServiceDefinition<grpc.UntypedServiceImplementation> {
    createOrUpdate: ISecurityService_ICreateOrUpdate;
    getByIDs: ISecurityService_IGetByIDs;
    search: ISecurityService_ISearch;
    listIDs: ISecurityService_IListIDs;
    validateCreateOrUpdate: ISecurityService_IValidateCreateOrUpdate;
    validateQueryRequest: ISecurityService_IValidateQueryRequest;
}

interface ISecurityService_ICreateOrUpdate extends grpc.MethodDefinition<fintekkers_requests_security_create_security_request_pb.CreateSecurityRequestProto, fintekkers_requests_security_create_security_response_pb.CreateSecurityResponseProto> {
    path: "/fintekkers.services.security_service.Security/CreateOrUpdate";
    requestStream: false;
    responseStream: false;
    requestSerialize: grpc.serialize<fintekkers_requests_security_create_security_request_pb.CreateSecurityRequestProto>;
    requestDeserialize: grpc.deserialize<fintekkers_requests_security_create_security_request_pb.CreateSecurityRequestProto>;
    responseSerialize: grpc.serialize<fintekkers_requests_security_create_security_response_pb.CreateSecurityResponseProto>;
    responseDeserialize: grpc.deserialize<fintekkers_requests_security_create_security_response_pb.CreateSecurityResponseProto>;
}
interface ISecurityService_IGetByIDs extends grpc.MethodDefinition<fintekkers_requests_security_query_security_request_pb.QuerySecurityRequestProto, fintekkers_requests_security_query_security_response_pb.QuerySecurityResponseProto> {
    path: "/fintekkers.services.security_service.Security/GetByIDs";
    requestStream: false;
    responseStream: false;
    requestSerialize: grpc.serialize<fintekkers_requests_security_query_security_request_pb.QuerySecurityRequestProto>;
    requestDeserialize: grpc.deserialize<fintekkers_requests_security_query_security_request_pb.QuerySecurityRequestProto>;
    responseSerialize: grpc.serialize<fintekkers_requests_security_query_security_response_pb.QuerySecurityResponseProto>;
    responseDeserialize: grpc.deserialize<fintekkers_requests_security_query_security_response_pb.QuerySecurityResponseProto>;
}
interface ISecurityService_ISearch extends grpc.MethodDefinition<fintekkers_requests_security_query_security_request_pb.QuerySecurityRequestProto, fintekkers_requests_security_query_security_response_pb.QuerySecurityResponseProto> {
    path: "/fintekkers.services.security_service.Security/Search";
    requestStream: false;
    responseStream: true;
    requestSerialize: grpc.serialize<fintekkers_requests_security_query_security_request_pb.QuerySecurityRequestProto>;
    requestDeserialize: grpc.deserialize<fintekkers_requests_security_query_security_request_pb.QuerySecurityRequestProto>;
    responseSerialize: grpc.serialize<fintekkers_requests_security_query_security_response_pb.QuerySecurityResponseProto>;
    responseDeserialize: grpc.deserialize<fintekkers_requests_security_query_security_response_pb.QuerySecurityResponseProto>;
}
interface ISecurityService_IListIDs extends grpc.MethodDefinition<fintekkers_requests_security_query_security_request_pb.QuerySecurityRequestProto, fintekkers_requests_security_query_security_response_pb.QuerySecurityResponseProto> {
    path: "/fintekkers.services.security_service.Security/ListIDs";
    requestStream: false;
    responseStream: false;
    requestSerialize: grpc.serialize<fintekkers_requests_security_query_security_request_pb.QuerySecurityRequestProto>;
    requestDeserialize: grpc.deserialize<fintekkers_requests_security_query_security_request_pb.QuerySecurityRequestProto>;
    responseSerialize: grpc.serialize<fintekkers_requests_security_query_security_response_pb.QuerySecurityResponseProto>;
    responseDeserialize: grpc.deserialize<fintekkers_requests_security_query_security_response_pb.QuerySecurityResponseProto>;
}
interface ISecurityService_IValidateCreateOrUpdate extends grpc.MethodDefinition<fintekkers_requests_security_create_security_request_pb.CreateSecurityRequestProto, fintekkers_requests_util_errors_summary_pb.SummaryProto> {
    path: "/fintekkers.services.security_service.Security/ValidateCreateOrUpdate";
    requestStream: false;
    responseStream: false;
    requestSerialize: grpc.serialize<fintekkers_requests_security_create_security_request_pb.CreateSecurityRequestProto>;
    requestDeserialize: grpc.deserialize<fintekkers_requests_security_create_security_request_pb.CreateSecurityRequestProto>;
    responseSerialize: grpc.serialize<fintekkers_requests_util_errors_summary_pb.SummaryProto>;
    responseDeserialize: grpc.deserialize<fintekkers_requests_util_errors_summary_pb.SummaryProto>;
}
interface ISecurityService_IValidateQueryRequest extends grpc.MethodDefinition<fintekkers_requests_security_query_security_request_pb.QuerySecurityRequestProto, fintekkers_requests_util_errors_summary_pb.SummaryProto> {
    path: "/fintekkers.services.security_service.Security/ValidateQueryRequest";
    requestStream: false;
    responseStream: false;
    requestSerialize: grpc.serialize<fintekkers_requests_security_query_security_request_pb.QuerySecurityRequestProto>;
    requestDeserialize: grpc.deserialize<fintekkers_requests_security_query_security_request_pb.QuerySecurityRequestProto>;
    responseSerialize: grpc.serialize<fintekkers_requests_util_errors_summary_pb.SummaryProto>;
    responseDeserialize: grpc.deserialize<fintekkers_requests_util_errors_summary_pb.SummaryProto>;
}

export const SecurityService: ISecurityService;

export interface ISecurityServer extends grpc.UntypedServiceImplementation {
    createOrUpdate: grpc.handleUnaryCall<fintekkers_requests_security_create_security_request_pb.CreateSecurityRequestProto, fintekkers_requests_security_create_security_response_pb.CreateSecurityResponseProto>;
    getByIDs: grpc.handleUnaryCall<fintekkers_requests_security_query_security_request_pb.QuerySecurityRequestProto, fintekkers_requests_security_query_security_response_pb.QuerySecurityResponseProto>;
    search: grpc.handleServerStreamingCall<fintekkers_requests_security_query_security_request_pb.QuerySecurityRequestProto, fintekkers_requests_security_query_security_response_pb.QuerySecurityResponseProto>;
    listIDs: grpc.handleUnaryCall<fintekkers_requests_security_query_security_request_pb.QuerySecurityRequestProto, fintekkers_requests_security_query_security_response_pb.QuerySecurityResponseProto>;
    validateCreateOrUpdate: grpc.handleUnaryCall<fintekkers_requests_security_create_security_request_pb.CreateSecurityRequestProto, fintekkers_requests_util_errors_summary_pb.SummaryProto>;
    validateQueryRequest: grpc.handleUnaryCall<fintekkers_requests_security_query_security_request_pb.QuerySecurityRequestProto, fintekkers_requests_util_errors_summary_pb.SummaryProto>;
}

export interface ISecurityClient {
    createOrUpdate(request: fintekkers_requests_security_create_security_request_pb.CreateSecurityRequestProto, callback: (error: grpc.ServiceError | null, response: fintekkers_requests_security_create_security_response_pb.CreateSecurityResponseProto) => void): grpc.ClientUnaryCall;
    createOrUpdate(request: fintekkers_requests_security_create_security_request_pb.CreateSecurityRequestProto, metadata: grpc.Metadata, callback: (error: grpc.ServiceError | null, response: fintekkers_requests_security_create_security_response_pb.CreateSecurityResponseProto) => void): grpc.ClientUnaryCall;
    createOrUpdate(request: fintekkers_requests_security_create_security_request_pb.CreateSecurityRequestProto, metadata: grpc.Metadata, options: Partial<grpc.CallOptions>, callback: (error: grpc.ServiceError | null, response: fintekkers_requests_security_create_security_response_pb.CreateSecurityResponseProto) => void): grpc.ClientUnaryCall;
    getByIDs(request: fintekkers_requests_security_query_security_request_pb.QuerySecurityRequestProto, callback: (error: grpc.ServiceError | null, response: fintekkers_requests_security_query_security_response_pb.QuerySecurityResponseProto) => void): grpc.ClientUnaryCall;
    getByIDs(request: fintekkers_requests_security_query_security_request_pb.QuerySecurityRequestProto, metadata: grpc.Metadata, callback: (error: grpc.ServiceError | null, response: fintekkers_requests_security_query_security_response_pb.QuerySecurityResponseProto) => void): grpc.ClientUnaryCall;
    getByIDs(request: fintekkers_requests_security_query_security_request_pb.QuerySecurityRequestProto, metadata: grpc.Metadata, options: Partial<grpc.CallOptions>, callback: (error: grpc.ServiceError | null, response: fintekkers_requests_security_query_security_response_pb.QuerySecurityResponseProto) => void): grpc.ClientUnaryCall;
    search(request: fintekkers_requests_security_query_security_request_pb.QuerySecurityRequestProto, options?: Partial<grpc.CallOptions>): grpc.ClientReadableStream<fintekkers_requests_security_query_security_response_pb.QuerySecurityResponseProto>;
    search(request: fintekkers_requests_security_query_security_request_pb.QuerySecurityRequestProto, metadata?: grpc.Metadata, options?: Partial<grpc.CallOptions>): grpc.ClientReadableStream<fintekkers_requests_security_query_security_response_pb.QuerySecurityResponseProto>;
    listIDs(request: fintekkers_requests_security_query_security_request_pb.QuerySecurityRequestProto, callback: (error: grpc.ServiceError | null, response: fintekkers_requests_security_query_security_response_pb.QuerySecurityResponseProto) => void): grpc.ClientUnaryCall;
    listIDs(request: fintekkers_requests_security_query_security_request_pb.QuerySecurityRequestProto, metadata: grpc.Metadata, callback: (error: grpc.ServiceError | null, response: fintekkers_requests_security_query_security_response_pb.QuerySecurityResponseProto) => void): grpc.ClientUnaryCall;
    listIDs(request: fintekkers_requests_security_query_security_request_pb.QuerySecurityRequestProto, metadata: grpc.Metadata, options: Partial<grpc.CallOptions>, callback: (error: grpc.ServiceError | null, response: fintekkers_requests_security_query_security_response_pb.QuerySecurityResponseProto) => void): grpc.ClientUnaryCall;
    validateCreateOrUpdate(request: fintekkers_requests_security_create_security_request_pb.CreateSecurityRequestProto, callback: (error: grpc.ServiceError | null, response: fintekkers_requests_util_errors_summary_pb.SummaryProto) => void): grpc.ClientUnaryCall;
    validateCreateOrUpdate(request: fintekkers_requests_security_create_security_request_pb.CreateSecurityRequestProto, metadata: grpc.Metadata, callback: (error: grpc.ServiceError | null, response: fintekkers_requests_util_errors_summary_pb.SummaryProto) => void): grpc.ClientUnaryCall;
    validateCreateOrUpdate(request: fintekkers_requests_security_create_security_request_pb.CreateSecurityRequestProto, metadata: grpc.Metadata, options: Partial<grpc.CallOptions>, callback: (error: grpc.ServiceError | null, response: fintekkers_requests_util_errors_summary_pb.SummaryProto) => void): grpc.ClientUnaryCall;
    validateQueryRequest(request: fintekkers_requests_security_query_security_request_pb.QuerySecurityRequestProto, callback: (error: grpc.ServiceError | null, response: fintekkers_requests_util_errors_summary_pb.SummaryProto) => void): grpc.ClientUnaryCall;
    validateQueryRequest(request: fintekkers_requests_security_query_security_request_pb.QuerySecurityRequestProto, metadata: grpc.Metadata, callback: (error: grpc.ServiceError | null, response: fintekkers_requests_util_errors_summary_pb.SummaryProto) => void): grpc.ClientUnaryCall;
    validateQueryRequest(request: fintekkers_requests_security_query_security_request_pb.QuerySecurityRequestProto, metadata: grpc.Metadata, options: Partial<grpc.CallOptions>, callback: (error: grpc.ServiceError | null, response: fintekkers_requests_util_errors_summary_pb.SummaryProto) => void): grpc.ClientUnaryCall;
}

export class SecurityClient extends grpc.Client implements ISecurityClient {
    constructor(address: string, credentials: grpc.ChannelCredentials, options?: Partial<grpc.ClientOptions>);
    public createOrUpdate(request: fintekkers_requests_security_create_security_request_pb.CreateSecurityRequestProto, callback: (error: grpc.ServiceError | null, response: fintekkers_requests_security_create_security_response_pb.CreateSecurityResponseProto) => void): grpc.ClientUnaryCall;
    public createOrUpdate(request: fintekkers_requests_security_create_security_request_pb.CreateSecurityRequestProto, metadata: grpc.Metadata, callback: (error: grpc.ServiceError | null, response: fintekkers_requests_security_create_security_response_pb.CreateSecurityResponseProto) => void): grpc.ClientUnaryCall;
    public createOrUpdate(request: fintekkers_requests_security_create_security_request_pb.CreateSecurityRequestProto, metadata: grpc.Metadata, options: Partial<grpc.CallOptions>, callback: (error: grpc.ServiceError | null, response: fintekkers_requests_security_create_security_response_pb.CreateSecurityResponseProto) => void): grpc.ClientUnaryCall;
    public getByIDs(request: fintekkers_requests_security_query_security_request_pb.QuerySecurityRequestProto, callback: (error: grpc.ServiceError | null, response: fintekkers_requests_security_query_security_response_pb.QuerySecurityResponseProto) => void): grpc.ClientUnaryCall;
    public getByIDs(request: fintekkers_requests_security_query_security_request_pb.QuerySecurityRequestProto, metadata: grpc.Metadata, callback: (error: grpc.ServiceError | null, response: fintekkers_requests_security_query_security_response_pb.QuerySecurityResponseProto) => void): grpc.ClientUnaryCall;
    public getByIDs(request: fintekkers_requests_security_query_security_request_pb.QuerySecurityRequestProto, metadata: grpc.Metadata, options: Partial<grpc.CallOptions>, callback: (error: grpc.ServiceError | null, response: fintekkers_requests_security_query_security_response_pb.QuerySecurityResponseProto) => void): grpc.ClientUnaryCall;
    public search(request: fintekkers_requests_security_query_security_request_pb.QuerySecurityRequestProto, options?: Partial<grpc.CallOptions>): grpc.ClientReadableStream<fintekkers_requests_security_query_security_response_pb.QuerySecurityResponseProto>;
    public search(request: fintekkers_requests_security_query_security_request_pb.QuerySecurityRequestProto, metadata?: grpc.Metadata, options?: Partial<grpc.CallOptions>): grpc.ClientReadableStream<fintekkers_requests_security_query_security_response_pb.QuerySecurityResponseProto>;
    public listIDs(request: fintekkers_requests_security_query_security_request_pb.QuerySecurityRequestProto, callback: (error: grpc.ServiceError | null, response: fintekkers_requests_security_query_security_response_pb.QuerySecurityResponseProto) => void): grpc.ClientUnaryCall;
    public listIDs(request: fintekkers_requests_security_query_security_request_pb.QuerySecurityRequestProto, metadata: grpc.Metadata, callback: (error: grpc.ServiceError | null, response: fintekkers_requests_security_query_security_response_pb.QuerySecurityResponseProto) => void): grpc.ClientUnaryCall;
    public listIDs(request: fintekkers_requests_security_query_security_request_pb.QuerySecurityRequestProto, metadata: grpc.Metadata, options: Partial<grpc.CallOptions>, callback: (error: grpc.ServiceError | null, response: fintekkers_requests_security_query_security_response_pb.QuerySecurityResponseProto) => void): grpc.ClientUnaryCall;
    public validateCreateOrUpdate(request: fintekkers_requests_security_create_security_request_pb.CreateSecurityRequestProto, callback: (error: grpc.ServiceError | null, response: fintekkers_requests_util_errors_summary_pb.SummaryProto) => void): grpc.ClientUnaryCall;
    public validateCreateOrUpdate(request: fintekkers_requests_security_create_security_request_pb.CreateSecurityRequestProto, metadata: grpc.Metadata, callback: (error: grpc.ServiceError | null, response: fintekkers_requests_util_errors_summary_pb.SummaryProto) => void): grpc.ClientUnaryCall;
    public validateCreateOrUpdate(request: fintekkers_requests_security_create_security_request_pb.CreateSecurityRequestProto, metadata: grpc.Metadata, options: Partial<grpc.CallOptions>, callback: (error: grpc.ServiceError | null, response: fintekkers_requests_util_errors_summary_pb.SummaryProto) => void): grpc.ClientUnaryCall;
    public validateQueryRequest(request: fintekkers_requests_security_query_security_request_pb.QuerySecurityRequestProto, callback: (error: grpc.ServiceError | null, response: fintekkers_requests_util_errors_summary_pb.SummaryProto) => void): grpc.ClientUnaryCall;
    public validateQueryRequest(request: fintekkers_requests_security_query_security_request_pb.QuerySecurityRequestProto, metadata: grpc.Metadata, callback: (error: grpc.ServiceError | null, response: fintekkers_requests_util_errors_summary_pb.SummaryProto) => void): grpc.ClientUnaryCall;
    public validateQueryRequest(request: fintekkers_requests_security_query_security_request_pb.QuerySecurityRequestProto, metadata: grpc.Metadata, options: Partial<grpc.CallOptions>, callback: (error: grpc.ServiceError | null, response: fintekkers_requests_util_errors_summary_pb.SummaryProto) => void): grpc.ClientUnaryCall;
}
