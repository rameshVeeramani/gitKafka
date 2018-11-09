package com.ramesh.kafka;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.kafka.common.config.ConfigDef;
import org.apache.kafka.connect.connector.Task;
import org.apache.kafka.connect.errors.ConnectException;
import org.apache.kafka.connect.source.SourceConnector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.jcustenborder.kafka.connect.utils.VersionUtil;
import com.github.jcustenborder.kafka.connect.utils.config.Description;
import com.github.jcustenborder.kafka.connect.utils.config.DocumentationImportant;
import com.github.jcustenborder.kafka.connect.utils.config.DocumentationNote;
import com.github.jcustenborder.kafka.connect.utils.config.DocumentationTip;
import com.github.jcustenborder.kafka.connect.utils.config.TaskConfigs;
import com.github.jcustenborder.kafka.connect.utils.config.Title;

@Description("This is a description of this connector and will show up in the documentation")
@DocumentationImportant("This is a important information that will show up in the documentation.")
@DocumentationTip("This is a tip that will show up in the documentation.")
@Title("Super Source Connector") //This is the display name that will show up in the documentation.
@DocumentationNote("This is a note that will show up in the documentation")
public class MySourceConnector extends SourceConnector {
  /*
    Your connector should never use System.out for logging. All of your classes should use slf4j
    for logging
 */
  private static Logger log = LoggerFactory.getLogger(MySourceConnector.class);
  private MySourceConnectorConfig config;

  @Override
  public String version() {
    return VersionUtil.version(this.getClass());
  }

  @Override
  public void start(Map<String, String> map) {
    config = new MySourceConnectorConfig(map);
  }

  @Override
  public Class<? extends Task> taskClass() {
    return MySourceTask.class;
  }

  @Override
  public List<Map<String, String>> taskConfigs(int i) {
    //suppposed to define all the task configuartion
    ArrayList<Map<String,String>> a = new ArrayList<>(1);
    a.add(config.originalsStrings());
    return a;
  }

  @Override
  public void stop() {
    // this where you close the db or file that you open as part of the start

  }

  @Override
  public ConfigDef config() {
    return MySourceConnectorConfig.config();
  }
}
