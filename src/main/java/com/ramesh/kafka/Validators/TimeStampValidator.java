package com.ramesh.kafka.Validators;

import org.apache.kafka.common.config.ConfigDef;
import org.apache.kafka.common.config.ConfigException;
import org.apache.kafka.common.protocol.types.Field;
import org.apache.kafka.common.serialization.StringDeserializer;

import java.time.Instant;
import java.time.format.DateTimeParseException;

public class TimeStampValidator implements ConfigDef.Validator {
    @Override
    public void ensureValid(String s, Object o) {
        String timestamp = (String) o;
        try {
            Instant.parse(timestamp);
        }
        catch (DateTimeParseException de){
            throw new ConfigException(s,o,"Wasnt able to parse time");
        }
    }
}
