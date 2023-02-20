package common.models.security;

import fintekkers.models.security.SecurityTypeProto;

import java.time.ZonedDateTime;
import java.util.UUID;

public class EquitySecurity extends Security {
    public final static String ASSET_CLASS = "Equity";

    public EquitySecurity(UUID id, String issuer,
                          ZonedDateTime asOf, CashSecurity settlementSecurity) {
        super(id, issuer, asOf, settlementSecurity);
    }

    @Override
    public String getAssetClass() {
        return ASSET_CLASS;
    }

    @Override
    public QuantityType getQuantityType() {
        return QuantityType.UNITS;
    }

    @Override
    public SecurityTypeProto getSecurityType() {
        return SecurityTypeProto.EQUITY_SECURITY;
    }

    @Override
    public ProductType getProductType() {
        return ProductType.EQUITY;
    }
}
