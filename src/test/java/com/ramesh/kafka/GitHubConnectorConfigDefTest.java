package com.ramesh.kafka;

import org.apache.kafka.common.config.ConfigDef;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class GitHubConnectorConfigDefTest  {

    private ConfigDef configDef = GithubConnectorConfigDef.conf();
    private Map<String ,String > initialConfig(){
        Map<String,String> baseProps = new HashMap<>();
        baseProps.put(GithubConnectorConfigDef.TOPIC_CONFIG,"myConnector");
        baseProps.put(GithubConnectorConfigDef.AUTH_USERNAME_CONFIG,"myConnector");
        baseProps.put(GithubConnectorConfigDef.AUTH_PASSWORD_CONFIG,"myConnector");
        baseProps.put(GithubConnectorConfigDef.REPO_CONFIG,"bar");
        baseProps.put(GithubConnectorConfigDef.BATCH_SIZE,"50");
        return baseProps;
    }

    @Test
    public void initialConfigIsValid(){
        assert (configDef.validate(initialConfig())
                .stream()
                .allMatch(configValue -> configValue.errorMessages().size() == 0));

    }
}
