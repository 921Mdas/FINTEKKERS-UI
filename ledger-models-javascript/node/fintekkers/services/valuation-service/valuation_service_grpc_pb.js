// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('@grpc/grpc-js');
var fintekkers_requests_valuation_valuation_request_pb = require('../../../fintekkers/requests/valuation/valuation_request_pb.js');
var fintekkers_requests_valuation_valuation_response_pb = require('../../../fintekkers/requests/valuation/valuation_response_pb.js');

function serialize_fintekkers_requests_valuation_ValuationRequestProto(arg) {
  if (!(arg instanceof fintekkers_requests_valuation_valuation_request_pb.ValuationRequestProto)) {
    throw new Error('Expected argument of type fintekkers.requests.valuation.ValuationRequestProto');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_fintekkers_requests_valuation_ValuationRequestProto(buffer_arg) {
  return fintekkers_requests_valuation_valuation_request_pb.ValuationRequestProto.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_fintekkers_requests_valuation_ValuationResponseProto(arg) {
  if (!(arg instanceof fintekkers_requests_valuation_valuation_response_pb.ValuationResponseProto)) {
    throw new Error('Expected argument of type fintekkers.requests.valuation.ValuationResponseProto');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_fintekkers_requests_valuation_ValuationResponseProto(buffer_arg) {
  return fintekkers_requests_valuation_valuation_response_pb.ValuationResponseProto.deserializeBinary(new Uint8Array(buffer_arg));
}


var ValuationService = exports.ValuationService = {
  runValuation: {
    path: '/fintekkers.services.valuation_service.Valuation/RunValuation',
    requestStream: false,
    responseStream: false,
    requestType: fintekkers_requests_valuation_valuation_request_pb.ValuationRequestProto,
    responseType: fintekkers_requests_valuation_valuation_response_pb.ValuationResponseProto,
    requestSerialize: serialize_fintekkers_requests_valuation_ValuationRequestProto,
    requestDeserialize: deserialize_fintekkers_requests_valuation_ValuationRequestProto,
    responseSerialize: serialize_fintekkers_requests_valuation_ValuationResponseProto,
    responseDeserialize: deserialize_fintekkers_requests_valuation_ValuationResponseProto,
  },
};

exports.ValuationClient = grpc.makeGenericClientConstructor(ValuationService);
