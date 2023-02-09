#[allow(clippy::derive_partial_eq_without_eq)]
#[derive(Clone, PartialEq, ::prost::Message)]
pub struct QueryPositionRequestProto {
    #[prost(string, tag = "1")]
    pub object_class: ::prost::alloc::string::String,
    #[prost(string, tag = "2")]
    pub version: ::prost::alloc::string::String,
    #[prost(enumeration = "super::util::RequestOperationTypeProto", tag = "10")]
    pub operation_type: i32,
    #[prost(
        enumeration = "super::super::models::position::PositionTypeProto",
        tag = "20"
    )]
    pub position_type: i32,
    #[prost(
        enumeration = "super::super::models::position::PositionViewProto",
        tag = "21"
    )]
    pub position_view: i32,
    #[prost(
        enumeration = "super::super::models::position::FieldProto",
        repeated,
        tag = "30"
    )]
    pub fields: ::prost::alloc::vec::Vec<i32>,
    #[prost(
        enumeration = "super::super::models::position::MeasureProto",
        repeated,
        tag = "31"
    )]
    pub measures: ::prost::alloc::vec::Vec<i32>,
    #[prost(message, optional, tag = "32")]
    pub filter_fields: ::core::option::Option<
        super::super::models::position::PositionFilterProto,
    >,
    #[prost(message, optional, tag = "33")]
    pub as_of: ::core::option::Option<super::super::models::util::LocalTimestampProto>,
}
#[allow(clippy::derive_partial_eq_without_eq)]
#[derive(Clone, PartialEq, ::prost::Message)]
pub struct QueryPositionResponseProto {
    #[prost(string, tag = "1")]
    pub object_class: ::prost::alloc::string::String,
    #[prost(string, tag = "2")]
    pub version: ::prost::alloc::string::String,
    #[prost(message, optional, tag = "11")]
    pub position_request: ::core::option::Option<QueryPositionRequestProto>,
    /// TODO - Think about how to model this long term; ISO code vs. UUID vs. full security object
    #[prost(string, tag = "12")]
    pub reporting_currency: ::prost::alloc::string::String,
    #[prost(message, repeated, tag = "30")]
    pub positions: ::prost::alloc::vec::Vec<
        super::super::models::position::PositionProto,
    >,
}
