
# Introduction




# Source Connectors


## Super Source Connector

This is a description of this connector and will show up in the documentation

### Important

This is a important information that will show up in the documentation.
### Note

This is a note that will show up in the documentation
### Tip

This is a tip that will show up in the documentation.


### Configuration

#### General


##### `my.setting`

This is a setting important to my connector.

*Importance:* High

*Type:* String





# Sink Connectors


## Super Sink Connector

This is a description of this connector and will show up in the documentation

### Important

This is a important information that will show up in the documentation.
### Note

This is a note that will show up in the documentation
### Tip

This is a tip that will show up in the documentation.


### Configuration

#### General


##### `my.setting`

This is a setting important to my connector.

*Importance:* High

*Type:* String





#### Examples


##### Standalone Example

This configuration is used typically along with [standalone mode](http://docs.confluent.io/current/connect/concepts.html#standalone-workers).

```properties
name=MySinkConnector1
connector.class=com.ramesh.kafka.MySinkConnector
tasks.max=1
topics=< Required Configuration >
my.setting=< Required Configuration >
```

##### Distributed Example

This configuration is used typically along with [distributed mode](http://docs.confluent.io/current/connect/concepts.html#distributed-workers).
Write the following json to `connector.json`, configure all of the required values, and use the command below to
post the configuration to one the distributed connect worker(s).

```json
{
  "config" : {
    "name" : "MySinkConnector1",
    "connector.class" : "com.ramesh.kafka.MySinkConnector",
    "tasks.max" : "1",
    "topics" : "< Required Configuration >",
    "my.setting" : "< Required Configuration >"
  }
}
```

Use curl to post the configuration to one of the Kafka Connect Workers. Change `http://localhost:8083/` the the endpoint of
one of your Kafka Connect worker(s).

Create a new instance.
```bash
curl -s -X POST -H 'Content-Type: application/json' --data @connector.json http://localhost:8083/connectors
```

Update an existing instance.
```bash
curl -s -X PUT -H 'Content-Type: application/json' --data @connector.json http://localhost:8083/connectors/TestSinkConnector1/config
```



