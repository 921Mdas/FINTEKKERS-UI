package common.model.security;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Period;

import static org.junit.jupiter.api.Assertions.*;

class TenorTest {
    @Test
    public void testDescriptionIsReversible() {
        LocalDate today = LocalDate.now();
        LocalDate moreThanOneYear = today.minusYears(1).minusMonths(1);
        Tenor tenor = new Tenor(TenorType.TERM, Period.between(today, moreThanOneYear));

        System.out.println(tenor.getTenorDescription());
    }
}