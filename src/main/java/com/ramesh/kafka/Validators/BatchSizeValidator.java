package com.ramesh.kafka.Validators;

import org.apache.kafka.common.config.ConfigDef;
import org.apache.kafka.common.config.ConfigException;

public class BatchSizeValidator implements ConfigDef.Validator {
    @Override
    public void ensureValid(String s, Object o) {

        Integer batchSize = (Integer) o;
        if (!(1 <= batchSize && batchSize <= 100)){
        //if (!(batchSize <= 1  && batchSize <= 101)) {
            throw new ConfigException(s, o, "BatchSize should be between 1 and 100" + batchSize + "}");
        }
    }
}
