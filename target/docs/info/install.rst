=======
Install
=======

.. image:: https://img.shields.io/github/license/jcustenborder/kafkaConnect.svg

.. image:: https://img.shields.io/github/release/jcustenborder/kafkaConnect.svg
    :target: https://github.com/jcustenborder/kafkaConnect/releases

.. image:: https://img.shields.io/maven-central/v/com.ramesh.kafka/kafkaConnect.svg
    :target: https://search.maven.org/#artifactdetails%7Ccom.ramesh.kafka%7CkafkaConnect%7C1.0-SNAPSHOT%7Cjar

^^^^^^^^^^^^^^^^
RPM Installation
^^^^^^^^^^^^^^^^

Before starting the RPM installation you must configure the :ref:`yum_repository` first.

.. code-block:: bash

    sudo yum install kafkaConnect


^^^^^^^^^^^^^^^^
DEB Installation
^^^^^^^^^^^^^^^^

Before starting the RPM installation you must configure the :ref:`apt_repository` first.

.. code-block:: bash

    sudo apt-get install kafkaConnect


^^^^^^^^^^^^^^^^^^
Maven Installation
^^^^^^^^^^^^^^^^^^

.. code-block:: xml

    <dependency>
        <groupId>com.ramesh.kafka</groupId>
        <artifactId>kafkaConnect</artifactId>
        <version>1.0-SNAPSHOT</version>
    </dependency>


