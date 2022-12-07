package common.models;


import common.models.postion.Field;
import common.models.postion.Measure;

import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.Set;

public interface IFinancialModelObject {
    Object getField(Field field);
    BigDecimal getMeasure(Measure measure);
    Set<Measure> getMeasures();
    Set<Field> getFields();
    ZonedDateTime getAsOf();
}
