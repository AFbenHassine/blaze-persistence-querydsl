package com.pallasathenagroup.querydsl;

import com.querydsl.core.types.Operator;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;

public enum JPQLNextOps implements Operator {
    PAGE_POSITION(Long.class),
    ENTITY_FUNCTION(Object.class),
    SET_UNION(Object.class),
    SET_UNION_ALL(Object.class),
    SET_INTERSECT(Object.class),
    SET_INTERSECT_ALL(Object.class),
    SET_EXCEPT(Object.class),
    SET_EXCEPT_ALL(Object.class),
    GROUP_CONCAT(String.class),
    WINDOW_GROUP_CONCAT(String.class),
    GREATEST(Object.class),
    LEAST(Object.class),
    REPEAT(String.class),
    ROW_VALUES(Boolean.class),
    ROW_NUMBER(Object.class),
    RANK(Object.class),
    DENSE_RANK(Object.class),
    PERCENT_RANK(Object.class),
    CUME_DIST(Object.class),
    NTILE(Object.class),
    LEAD(Object.class),
    LAG(Object.class),
    FIRST_VALUE(Object.class),
    LAST_VALUE(Object.class),
    NTH_VALUE(Object.class),
    WITH_ALIAS(Object.class),
    WITH_COLUMNS(Object.class),
    WITH_RECURSIVE_COLUMNS(Object.class),
    BIND(Object.class),
    CAST_BOOLEAN(Boolean.class),
    CAST_BYTE(Byte.class),
    CAST_SHORT(Short.class),
    CAST_LONG(Long.class),
    CAST_INTEGER(Integer.class),
    CAST_FLOAT(Float.class),
    CAST_DOUBLE(Double.class),
    CAST_CHARACTER(Character.class),
    CAST_STRING(String.class),
    CAST_BIGINTEGER(BigInteger.class),
    CAST_BIGDECIMAL(BigDecimal.class),
    CAST_TIME(Time.class),
    CAST_DATE(Date.class),
    CAST_TIMESTAMP(Timestamp.class),
    CAST_CALENDAR(Calendar.class),
    TREAT_BOOLEAN(Boolean.class),
    TREAT_BYTE(Byte.class),
    TREAT_SHORT(Short.class),
    TREAT_LONG(Long.class),
    TREAT_INTEGER(Integer.class),
    TREAT_FLOAT(Float.class),
    TREAT_DOUBLE(Double.class),
    TREAT_CHARACTER(Character.class),
    TREAT_STRING(String.class),
    TREAT_BIGINTEGER(BigInteger.class),
    TREAT_BIGDECIMAL(BigDecimal.class),
    TREAT_TIME(Time.class),
    TREAT_DATE(Date.class),
    TREAT_TIMESTAMP(Timestamp.class),
    TREAT_CALENDAR(Calendar.class),

    ;

    private final Class<?> type;

    private JPQLNextOps(Class<?> type) {
        this.type = type;
    }

    public Class<?> getType() {
        return this.type;
    }

}
