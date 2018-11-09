package com.ramesh.kafka;

import com.ramesh.kafka.Validators.TimeStampValidator;
import com.sun.deploy.security.ValidationState;
import org.apache.kafka.common.config.AbstractConfig;
import org.apache.kafka.common.config.ConfigDef;
import org.apache.kafka.common.protocol.types.Field;
import org.apache.kafka.common.serialization.StringDeserializer;
import sun.jvm.hotspot.debugger.win32.coff.COFFException;

import java.time.ZonedDateTime;
import java.util.Map;

public class GithubConnectorConfigDef extends AbstractConfig {

    public static final String TOPIC_CONFIG ="topic";
    public static final String REPO_CONFIG ="github.repo";
    public static final String BATCH_SIZE ="batch.size";
    public static final String AUTH_USERNAME_CONFIG="auth.username";
    public static final String AUTH_PASSWORD_CONFIG="auth.password";
    public static final String SINCE_CONFIG = "since.timestamp";


    public GithubConnectorConfigDef(ConfigDef definition, Map<?, ?> originals, boolean doLog) {
        super(definition, originals, doLog);
    }

    public static ConfigDef conf(){
        return  new ConfigDef()
                .define(TOPIC_CONFIG,ConfigDef.Type.STRING,ConfigDef.Importance.HIGH,"")
                .define(REPO_CONFIG,ConfigDef.Type.STRING,ConfigDef.Importance.HIGH, "")
                .define(BATCH_SIZE, ConfigDef.Type.INT,100,new com.ramesh.kafka.Validators.BatchSizeValidator(),ConfigDef.Importance.LOW,"")
                .define(AUTH_USERNAME_CONFIG,ConfigDef.Type.STRING,ConfigDef.Importance.HIGH,"")
                .define(AUTH_PASSWORD_CONFIG,ConfigDef.Type.PASSWORD,ConfigDef.Importance.HIGH,"")
                .define(SINCE_CONFIG, ConfigDef.Type.STRING, ZonedDateTime.now().minusYears(1).toInstant().toString(),new TimeStampValidator(),ConfigDef.Importance.HIGH,"");
    }
}
