# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: fintekkers/models/security/security.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from fintekkers.models.util import decimal_value_pb2 as fintekkers_dot_models_dot_util_dot_decimal__value__pb2
from fintekkers.models.util import local_date_pb2 as fintekkers_dot_models_dot_util_dot_local__date__pb2
from fintekkers.models.util import local_timestamp_pb2 as fintekkers_dot_models_dot_util_dot_local__timestamp__pb2
from fintekkers.models.util import uuid_pb2 as fintekkers_dot_models_dot_util_dot_uuid__pb2
from fintekkers.models.security.identifier import identifier_pb2 as fintekkers_dot_models_dot_security_dot_identifier_dot_identifier__pb2
from fintekkers.models.security import security_type_pb2 as fintekkers_dot_models_dot_security_dot_security__type__pb2
from fintekkers.models.security import security_quantity_type_pb2 as fintekkers_dot_models_dot_security_dot_security__quantity__type__pb2
from fintekkers.models.security import coupon_frequency_pb2 as fintekkers_dot_models_dot_security_dot_coupon__frequency__pb2
from fintekkers.models.security import coupon_type_pb2 as fintekkers_dot_models_dot_security_dot_coupon__type__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n)fintekkers/models/security/security.proto\x12\x1a\x66intekkers.models.security\x1a*fintekkers/models/util/decimal_value.proto\x1a\'fintekkers/models/util/local_date.proto\x1a,fintekkers/models/util/local_timestamp.proto\x1a!fintekkers/models/util/uuid.proto\x1a\x36\x66intekkers/models/security/identifier/identifier.proto\x1a.fintekkers/models/security/security_type.proto\x1a\x37\x66intekkers/models/security/security_quantity_type.proto\x1a\x31\x66intekkers/models/security/coupon_frequency.proto\x1a,fintekkers/models/security/coupon_type.proto\"\xe5\x07\n\rSecurityProto\x12\x14\n\x0cobject_class\x18\x01 \x01(\t\x12\x0f\n\x07version\x18\x02 \x01(\t\x12/\n\x04uuid\x18\x05 \x01(\x0b\x32!.fintekkers.models.util.UUIDProto\x12:\n\x05\x61s_of\x18\x06 \x01(\x0b\x32+.fintekkers.models.util.LocalTimestampProto\x12\x0f\n\x07is_link\x18\x07 \x01(\x08\x12\x44\n\rsecurity_type\x18\n \x01(\x0e\x32-.fintekkers.models.security.SecurityTypeProto\x12\x13\n\x0b\x61sset_class\x18\x0b \x01(\t\x12\x13\n\x0bissuer_name\x18\x0c \x01(\t\x12\x46\n\x13settlement_currency\x18\r \x01(\x0b\x32).fintekkers.models.security.SecurityProto\x12L\n\rquantity_type\x18\x0e \x01(\x0e\x32\x35.fintekkers.models.security.SecurityQuantityTypeProto\x12?\n\nidentifier\x18( \x01(\x0b\x32+.fintekkers.models.security.IdentifierProto\x12\x13\n\x0b\x64\x65scription\x18) \x01(\t\x12\x0f\n\x07\x63\x61sh_id\x18\x32 \x01(\t\x12>\n\x0b\x63oupon_rate\x18< \x01(\x0b\x32).fintekkers.models.util.DecimalValueProto\x12@\n\x0b\x63oupon_type\x18= \x01(\x0e\x32+.fintekkers.models.security.CouponTypeProto\x12J\n\x10\x63oupon_frequency\x18> \x01(\x0e\x32\x30.fintekkers.models.security.CouponFrequencyProto\x12:\n\ndated_date\x18? \x01(\x0b\x32&.fintekkers.models.util.LocalDateProto\x12=\n\nface_value\x18@ \x01(\x0b\x32).fintekkers.models.util.DecimalValueProto\x12:\n\nissue_date\x18\x41 \x01(\x0b\x32&.fintekkers.models.util.LocalDateProto\x12=\n\rmaturity_date\x18\x42 \x01(\x0b\x32&.fintekkers.models.util.LocalDateProtoB\x12\x42\x0eSecurityProtosP\x01\x62\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'fintekkers.models.security.security_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'B\016SecurityProtosP\001'
  _SECURITYPROTO._serialized_start=498
  _SECURITYPROTO._serialized_end=1495
# @@protoc_insertion_point(module_scope)