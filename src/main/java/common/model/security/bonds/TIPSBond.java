package common.model.security.bonds;

import common.model.security.*;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.UUID;

/**
 * TIPS bonds are issued by the US Treasury and pay a regular coupon. The par value
 * is adjusted according to changes in CPI though the coupon rate is fixed through the life
 * of the bond. From Pimco:
 *
 * "It works like this: Suppose you invest $1,000 in a new 10-year TIPS with a 2% coupon rate.
 * If inflation is 3% over the next year, the face value will be changed to $1,030 and the annual
 * interest payment would be $20.60, or 2% (the coupon rate) of the adjusted principal and so on.
 * In a deflationary environment, the reverse would be true: the face value and interest payments
 * would decrease, but still keep pace with the now lower cost of goods and services."
 *
 * Note: 'Real' yields show the par-value-adjusted-yield, assuming the bond is held to maturity.
 */
public class TIPSBond extends BondSecurity implements IndexLinkedSecurity {
    private BigDecimal spread;
    private Security index;

    public TIPSBond(UUID id, String issuer, ZonedDateTime asOf, CashSecurity settlementCurrency) {
        super(id, issuer, asOf, settlementCurrency);
    }

    public Security getIndex() {
        throw new UnsupportedOperationException("Not supported yet. Need to think this through:" +
                "" +
                "1a/ Index could just be a security. E.g. Index = Treasury FRN Index. " +
                "Perhaps it would be an index security that has an identifier. It has the logic embedded " +
                "in it that knows how to look up other securities to resolve. In this case the index would have " +
                "to know to find securities with 13 week maturities, find the auction dates, resolve the data " +
                "and stitch it together. Perhaps makes sense to think through the response structure to the client " +
                "before modelling. " +
                "" +
                "Why do we need this:" +
                "* As the rate changes over time, we need the ability to query rates as of a point in time. This " +
                "is needed in turn to calculate interest" +
                "TODO: Given the Fed holdings of this are smaller than TIPS, perhaps we start with TIPS. "
                );
    }

    public void setIndex(Security index) {
        this.index = index;
    }

    @Override
    public SecurityType getSecurityType() {
        return SecurityType.TIPS;
    }

    @Override
    public ProductType getProductType() {
        return ProductType.TIPS;
    }
}
