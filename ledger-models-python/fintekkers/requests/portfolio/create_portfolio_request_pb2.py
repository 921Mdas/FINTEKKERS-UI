# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: fintekkers/requests/portfolio/create_portfolio_request.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from fintekkers.models.portfolio import portfolio_pb2 as fintekkers_dot_models_dot_portfolio_dot_portfolio__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n<fintekkers/requests/portfolio/create_portfolio_request.proto\x12\x1d\x66intekkers.requests.portfolio\x1a+fintekkers/models/portfolio/portfolio.proto\"\x91\x01\n\x1b\x43reatePortfolioRequestProto\x12\x14\n\x0cobject_class\x18\x01 \x01(\t\x12\x0f\n\x07version\x18\x02 \x01(\t\x12K\n\x16\x63reate_portfolio_input\x18\x14 \x01(\x0b\x32+.fintekkers.models.portfolio.PortfolioProtoB B\x1c\x43reatePortfolioRequestProtosP\x01\x62\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'fintekkers.requests.portfolio.create_portfolio_request_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'B\034CreatePortfolioRequestProtosP\001'
  _CREATEPORTFOLIOREQUESTPROTO._serialized_start=141
  _CREATEPORTFOLIOREQUESTPROTO._serialized_end=286
# @@protoc_insertion_point(module_scope)