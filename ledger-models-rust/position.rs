#[derive(Clone, Copy, Debug, PartialEq, Eq, Hash, PartialOrd, Ord, ::prost::Enumeration)]
#[repr(i32)]
pub enum PositionStatusProto {
    Unknown = 0,
    /// This trade may never happen
    Hypothetical = 1,
    /// This trade is expected to happen, but hasn't been executed yet
    Intended = 2,
    /// Beneficial ownership changes related to this transaction are now legally binding
    Executed = 3,
}
impl PositionStatusProto {
    /// String value of the enum field names used in the ProtoBuf definition.
    ///
    /// The values are not transformed in any way and thus are considered stable
    /// (if the ProtoBuf definition does not change) and safe for programmatic use.
    pub fn as_str_name(&self) -> &'static str {
        match self {
            PositionStatusProto::Unknown => "UNKNOWN",
            PositionStatusProto::Hypothetical => "HYPOTHETICAL",
            PositionStatusProto::Intended => "INTENDED",
            PositionStatusProto::Executed => "EXECUTED",
        }
    }
    /// Creates an enum from field names used in the ProtoBuf definition.
    pub fn from_str_name(value: &str) -> ::core::option::Option<Self> {
        match value {
            "UNKNOWN" => Some(Self::Unknown),
            "HYPOTHETICAL" => Some(Self::Hypothetical),
            "INTENDED" => Some(Self::Intended),
            "EXECUTED" => Some(Self::Executed),
            _ => None,
        }
    }
}
#[derive(Clone, Copy, Debug, PartialEq, Eq, Hash, PartialOrd, Ord, ::prost::Enumeration)]
#[repr(i32)]
pub enum MeasureProto {
    UnknownMeasure = 0,
    DirectedQuantity = 1,
    MarketValue = 2,
    UnadjustedCostBasis = 3,
    AdjustedCostBasis = 4,
    /// The current yield of the security, essentially coupon / current price. The price can be
    /// unadjusted cost basis, adjusted cost basis, market value, and so on. This is a bond-centric
    /// calculation. For equity securities, the TTM dividends will be used as a coupon equivalent (not
    /// currently supported).
    CurrentYield = 5,
    /// The yield if the security is held to maturity. For equities, this will be blank.
    /// For bonds this will be calculated as: <https://www.wallstreetprep.com/knowledge/yield-to-maturity-ytm/>
    /// For TIPS, no future inflation adjustments to principal will be included.
    /// For FRNs, the assumption is the floating rate doesn't change between now and maturity.
    /// In the future, context-overrides will allow customization of these assumptions
    YieldToMaturity = 7,
}
impl MeasureProto {
    /// String value of the enum field names used in the ProtoBuf definition.
    ///
    /// The values are not transformed in any way and thus are considered stable
    /// (if the ProtoBuf definition does not change) and safe for programmatic use.
    pub fn as_str_name(&self) -> &'static str {
        match self {
            MeasureProto::UnknownMeasure => "UNKNOWN_MEASURE",
            MeasureProto::DirectedQuantity => "DIRECTED_QUANTITY",
            MeasureProto::MarketValue => "MARKET_VALUE",
            MeasureProto::UnadjustedCostBasis => "UNADJUSTED_COST_BASIS",
            MeasureProto::AdjustedCostBasis => "ADJUSTED_COST_BASIS",
            MeasureProto::CurrentYield => "CURRENT_YIELD",
            MeasureProto::YieldToMaturity => "YIELD_TO_MATURITY",
        }
    }
    /// Creates an enum from field names used in the ProtoBuf definition.
    pub fn from_str_name(value: &str) -> ::core::option::Option<Self> {
        match value {
            "UNKNOWN_MEASURE" => Some(Self::UnknownMeasure),
            "DIRECTED_QUANTITY" => Some(Self::DirectedQuantity),
            "MARKET_VALUE" => Some(Self::MarketValue),
            "UNADJUSTED_COST_BASIS" => Some(Self::UnadjustedCostBasis),
            "ADJUSTED_COST_BASIS" => Some(Self::AdjustedCostBasis),
            "CURRENT_YIELD" => Some(Self::CurrentYield),
            "YIELD_TO_MATURITY" => Some(Self::YieldToMaturity),
            _ => None,
        }
    }
}
#[derive(Clone, Copy, Debug, PartialEq, Eq, Hash, PartialOrd, Ord, ::prost::Enumeration)]
#[repr(i32)]
pub enum FieldProto {
    UnknownField = 0,
    /// (UUID.class)
    Id = 1,
    /// Attribute fields. Likely to be fields that one would pivot on.
    ///
    /// LocalDate.class
    EffectiveDate = 10,
    /// common.model.strategy.Strategy.class
    Strategy = 11,
    /// common.model.security.Security.class
    Security = 12,
    SecurityDescription = 61,
    /// common.model.security.Security.class
    CashImpactSecurity = 13,
    /// Security Fields
    ///
    ///   AssetClass(String.class), //FixedIncome, Equity, etc
    AssetClass = 50,
    /// ProductClass(String.class), //Bond, CashEquity, etc
    ProductClass = 51,
    /// ProductType (String.class), //TBILL, BOND, etc
    ProductType = 52,
    SecurityId = 53,
    Identifier = 54,
    /// 1M
    Tenor = 55,
    MaturityDate = 56,
    AdjustedTenor = 57,
    /// Portfolio fields
    ///
    /// common.model.portfolio.Portfolio.class
    Portfolio = 14,
    /// UUID
    PortfolioId = 15,
    PortfolioName = 60,
    /// common.model.price.Price.class
    Price = 16,
    /// UUID
    PriceId = 17,
    /// Boolean.class
    IsCancelled = 18,
    /// PositionStatus.class
    PositionStatus = 19,
    /// Transaction only
    ///
    /// TradeDate(LocalDate.class),
    TradeDate = 30,
    ///   SettlementDate(LocalDate.class),
    SettlementDate = 31,
    /// BUY, SELL, MATURATION, etc (TransactionType.class)
    TransactionType = 32,
    /// Tax Lot only
    ///
    ///   TaxLotOpenDate(LocalDate.class),
    TaxLotOpenDate = 40,
    ///   TaxLotCloseDate(LocalDate.class),
    TaxLotCloseDate = 41,
}
impl FieldProto {
    /// String value of the enum field names used in the ProtoBuf definition.
    ///
    /// The values are not transformed in any way and thus are considered stable
    /// (if the ProtoBuf definition does not change) and safe for programmatic use.
    pub fn as_str_name(&self) -> &'static str {
        match self {
            FieldProto::UnknownField => "UNKNOWN_FIELD",
            FieldProto::Id => "ID",
            FieldProto::EffectiveDate => "EFFECTIVE_DATE",
            FieldProto::Strategy => "STRATEGY",
            FieldProto::Security => "SECURITY",
            FieldProto::SecurityDescription => "SECURITY_DESCRIPTION",
            FieldProto::CashImpactSecurity => "CASH_IMPACT_SECURITY",
            FieldProto::AssetClass => "ASSET_CLASS",
            FieldProto::ProductClass => "PRODUCT_CLASS",
            FieldProto::ProductType => "PRODUCT_TYPE",
            FieldProto::SecurityId => "SECURITY_ID",
            FieldProto::Identifier => "IDENTIFIER",
            FieldProto::Tenor => "TENOR",
            FieldProto::MaturityDate => "MATURITY_DATE",
            FieldProto::AdjustedTenor => "ADJUSTED_TENOR",
            FieldProto::Portfolio => "PORTFOLIO",
            FieldProto::PortfolioId => "PORTFOLIO_ID",
            FieldProto::PortfolioName => "PORTFOLIO_NAME",
            FieldProto::Price => "PRICE",
            FieldProto::PriceId => "PRICE_ID",
            FieldProto::IsCancelled => "IS_CANCELLED",
            FieldProto::PositionStatus => "POSITION_STATUS",
            FieldProto::TradeDate => "TRADE_DATE",
            FieldProto::SettlementDate => "SETTLEMENT_DATE",
            FieldProto::TransactionType => "TRANSACTION_TYPE",
            FieldProto::TaxLotOpenDate => "TAX_LOT_OPEN_DATE",
            FieldProto::TaxLotCloseDate => "TAX_LOT_CLOSE_DATE",
        }
    }
    /// Creates an enum from field names used in the ProtoBuf definition.
    pub fn from_str_name(value: &str) -> ::core::option::Option<Self> {
        match value {
            "UNKNOWN_FIELD" => Some(Self::UnknownField),
            "ID" => Some(Self::Id),
            "EFFECTIVE_DATE" => Some(Self::EffectiveDate),
            "STRATEGY" => Some(Self::Strategy),
            "SECURITY" => Some(Self::Security),
            "SECURITY_DESCRIPTION" => Some(Self::SecurityDescription),
            "CASH_IMPACT_SECURITY" => Some(Self::CashImpactSecurity),
            "ASSET_CLASS" => Some(Self::AssetClass),
            "PRODUCT_CLASS" => Some(Self::ProductClass),
            "PRODUCT_TYPE" => Some(Self::ProductType),
            "SECURITY_ID" => Some(Self::SecurityId),
            "IDENTIFIER" => Some(Self::Identifier),
            "TENOR" => Some(Self::Tenor),
            "MATURITY_DATE" => Some(Self::MaturityDate),
            "ADJUSTED_TENOR" => Some(Self::AdjustedTenor),
            "PORTFOLIO" => Some(Self::Portfolio),
            "PORTFOLIO_ID" => Some(Self::PortfolioId),
            "PORTFOLIO_NAME" => Some(Self::PortfolioName),
            "PRICE" => Some(Self::Price),
            "PRICE_ID" => Some(Self::PriceId),
            "IS_CANCELLED" => Some(Self::IsCancelled),
            "POSITION_STATUS" => Some(Self::PositionStatus),
            "TRADE_DATE" => Some(Self::TradeDate),
            "SETTLEMENT_DATE" => Some(Self::SettlementDate),
            "TRANSACTION_TYPE" => Some(Self::TransactionType),
            "TAX_LOT_OPEN_DATE" => Some(Self::TaxLotOpenDate),
            "TAX_LOT_CLOSE_DATE" => Some(Self::TaxLotCloseDate),
            _ => None,
        }
    }
}
#[allow(clippy::derive_partial_eq_without_eq)]
#[derive(Clone, PartialEq, ::prost::Message)]
pub struct MeasureMapEntry {
    #[prost(enumeration = "MeasureProto", tag = "1")]
    pub field: i32,
    #[prost(message, optional, tag = "2")]
    pub measure_value: ::core::option::Option<super::util::DecimalValueProto>,
}
#[allow(clippy::derive_partial_eq_without_eq)]
#[derive(Clone, PartialEq, ::prost::Message)]
pub struct FieldMapEntry {
    #[prost(enumeration = "FieldProto", tag = "1")]
    pub field: i32,
    /// Used for position filters, but not for responses
    #[prost(enumeration = "PositionFilterOperator", tag = "20")]
    pub operator: i32,
    #[prost(oneof = "field_map_entry::FieldMapValueOneOf", tags = "4, 5, 6")]
    pub field_map_value_one_of: ::core::option::Option<
        field_map_entry::FieldMapValueOneOf,
    >,
}
/// Nested message and enum types in `FieldMapEntry`.
pub mod field_map_entry {
    #[allow(clippy::derive_partial_eq_without_eq)]
    #[derive(Clone, PartialEq, ::prost::Oneof)]
    pub enum FieldMapValueOneOf {
        #[prost(message, tag = "4")]
        FieldValuePacked(::prost_types::Any),
        #[prost(string, tag = "5")]
        EnumValue(::prost::alloc::string::String),
        #[prost(message, tag = "6")]
        Identifier(super::super::security::IdentifierProto),
    }
}
#[derive(Clone, Copy, Debug, PartialEq, Eq, Hash, PartialOrd, Ord, ::prost::Enumeration)]
#[repr(i32)]
pub enum PositionFilterOperator {
    UnknownOperator = 0,
    Equals = 1,
    NotEquals = 2,
    LessThan = 3,
    LessThanOrEquals = 4,
    MoreThan = 5,
    MoreThanOrEquals = 6,
}
impl PositionFilterOperator {
    /// String value of the enum field names used in the ProtoBuf definition.
    ///
    /// The values are not transformed in any way and thus are considered stable
    /// (if the ProtoBuf definition does not change) and safe for programmatic use.
    pub fn as_str_name(&self) -> &'static str {
        match self {
            PositionFilterOperator::UnknownOperator => "UNKNOWN_OPERATOR",
            PositionFilterOperator::Equals => "EQUALS",
            PositionFilterOperator::NotEquals => "NOT_EQUALS",
            PositionFilterOperator::LessThan => "LESS_THAN",
            PositionFilterOperator::LessThanOrEquals => "LESS_THAN_OR_EQUALS",
            PositionFilterOperator::MoreThan => "MORE_THAN",
            PositionFilterOperator::MoreThanOrEquals => "MORE_THAN_OR_EQUALS",
        }
    }
    /// Creates an enum from field names used in the ProtoBuf definition.
    pub fn from_str_name(value: &str) -> ::core::option::Option<Self> {
        match value {
            "UNKNOWN_OPERATOR" => Some(Self::UnknownOperator),
            "EQUALS" => Some(Self::Equals),
            "NOT_EQUALS" => Some(Self::NotEquals),
            "LESS_THAN" => Some(Self::LessThan),
            "LESS_THAN_OR_EQUALS" => Some(Self::LessThanOrEquals),
            "MORE_THAN" => Some(Self::MoreThan),
            "MORE_THAN_OR_EQUALS" => Some(Self::MoreThanOrEquals),
            _ => None,
        }
    }
}
#[allow(clippy::derive_partial_eq_without_eq)]
#[derive(Clone, PartialEq, ::prost::Message)]
pub struct MeasureMapFieldEntry {
    #[prost(enumeration = "MeasureProto", tag = "1")]
    pub measure: i32,
    #[prost(message, optional, tag = "2")]
    pub measure_decimal_value: ::core::option::Option<super::util::DecimalValueProto>,
}
#[allow(clippy::derive_partial_eq_without_eq)]
#[derive(Clone, PartialEq, ::prost::Message)]
pub struct PositionProto {
    #[prost(string, tag = "1")]
    pub object_class: ::prost::alloc::string::String,
    #[prost(string, tag = "2")]
    pub version: ::prost::alloc::string::String,
    #[prost(enumeration = "PositionViewProto", tag = "10")]
    pub position_view: i32,
    #[prost(enumeration = "PositionTypeProto", tag = "11")]
    pub position_type: i32,
    #[prost(message, repeated, tag = "20")]
    pub measures: ::prost::alloc::vec::Vec<MeasureMapFieldEntry>,
    #[prost(message, repeated, tag = "21")]
    pub fields: ::prost::alloc::vec::Vec<FieldMapEntry>,
}
#[derive(Clone, Copy, Debug, PartialEq, Eq, Hash, PartialOrd, Ord, ::prost::Enumeration)]
#[repr(i32)]
pub enum PositionViewProto {
    UnknownPositionView = 0,
    DefaultView = 1,
    StrategyView = 2,
}
impl PositionViewProto {
    /// String value of the enum field names used in the ProtoBuf definition.
    ///
    /// The values are not transformed in any way and thus are considered stable
    /// (if the ProtoBuf definition does not change) and safe for programmatic use.
    pub fn as_str_name(&self) -> &'static str {
        match self {
            PositionViewProto::UnknownPositionView => "UNKNOWN_POSITION_VIEW",
            PositionViewProto::DefaultView => "DEFAULT_VIEW",
            PositionViewProto::StrategyView => "STRATEGY_VIEW",
        }
    }
    /// Creates an enum from field names used in the ProtoBuf definition.
    pub fn from_str_name(value: &str) -> ::core::option::Option<Self> {
        match value {
            "UNKNOWN_POSITION_VIEW" => Some(Self::UnknownPositionView),
            "DEFAULT_VIEW" => Some(Self::DefaultView),
            "STRATEGY_VIEW" => Some(Self::StrategyView),
            _ => None,
        }
    }
}
#[derive(Clone, Copy, Debug, PartialEq, Eq, Hash, PartialOrd, Ord, ::prost::Enumeration)]
#[repr(i32)]
pub enum PositionTypeProto {
    UnknownPositionType = 0,
    Transaction = 1,
    TaxLot = 2,
}
impl PositionTypeProto {
    /// String value of the enum field names used in the ProtoBuf definition.
    ///
    /// The values are not transformed in any way and thus are considered stable
    /// (if the ProtoBuf definition does not change) and safe for programmatic use.
    pub fn as_str_name(&self) -> &'static str {
        match self {
            PositionTypeProto::UnknownPositionType => "UNKNOWN_POSITION_TYPE",
            PositionTypeProto::Transaction => "TRANSACTION",
            PositionTypeProto::TaxLot => "TAX_LOT",
        }
    }
    /// Creates an enum from field names used in the ProtoBuf definition.
    pub fn from_str_name(value: &str) -> ::core::option::Option<Self> {
        match value {
            "UNKNOWN_POSITION_TYPE" => Some(Self::UnknownPositionType),
            "TRANSACTION" => Some(Self::Transaction),
            "TAX_LOT" => Some(Self::TaxLot),
            _ => None,
        }
    }
}
#[allow(clippy::derive_partial_eq_without_eq)]
#[derive(Clone, PartialEq, ::prost::Message)]
pub struct PositionFilterProto {
    #[prost(string, tag = "1")]
    pub object_class: ::prost::alloc::string::String,
    #[prost(string, tag = "2")]
    pub version: ::prost::alloc::string::String,
    #[prost(message, repeated, tag = "21")]
    pub filters: ::prost::alloc::vec::Vec<FieldMapEntry>,
}
#[allow(clippy::derive_partial_eq_without_eq)]
#[derive(Clone, PartialEq, ::prost::Message)]
pub struct QueryPositionRequestProto {
    #[prost(string, tag = "1")]
    pub object_class: ::prost::alloc::string::String,
    #[prost(string, tag = "2")]
    pub version: ::prost::alloc::string::String,
    #[prost(enumeration = "super::util::RequestOperationTypeProto", tag = "10")]
    pub operation_type: i32,
    #[prost(enumeration = "PositionTypeProto", tag = "20")]
    pub position_type: i32,
    #[prost(enumeration = "PositionViewProto", tag = "21")]
    pub position_view: i32,
    #[prost(enumeration = "FieldProto", repeated, tag = "30")]
    pub fields: ::prost::alloc::vec::Vec<i32>,
    #[prost(enumeration = "MeasureProto", repeated, tag = "31")]
    pub measures: ::prost::alloc::vec::Vec<i32>,
    #[prost(message, optional, tag = "32")]
    pub filter_fields: ::core::option::Option<PositionFilterProto>,
    #[prost(message, optional, tag = "33")]
    pub as_of: ::core::option::Option<super::util::LocalTimestampProto>,
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
    pub positions: ::prost::alloc::vec::Vec<PositionProto>,
}
