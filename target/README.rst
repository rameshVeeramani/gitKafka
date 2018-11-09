============
Introduction
============

=================
Source Connectors
=================

======================
Super Source Connector
======================

This is a description of this connector and will show up in the documentation


.. IMPORTANT::
    This is a important information that will show up in the documentation.


.. TIP::
    This is a tip that will show up in the documentation.


.. NOTE::
    This is a note that will show up in the documentation



-------------
Configuration
-------------

-------
General
-------


^^^^^^^^^^
my.setting
^^^^^^^^^^

This is a setting important to my connector.

**Importance:** High

**Type:** String






--------
Examples
--------

^^^^^^^^^^^^^^^^^^^^^^
Property based example
^^^^^^^^^^^^^^^^^^^^^^


This configuration is used typically along with `standalone mode
<http://docs.confluent.io/current/connect/concepts.html#standalone-workers>`_.

.. code-block:: properties
    :name: connector.properties
    :emphasize-lines: 4

    name=MySourceConnector1
    connector.class=com.ramesh.kafka.MySourceConnector
    tasks.max=1
    my.setting=< Required Configuration >




^^^^^^^^^^^^^^^^^^
Rest based example
^^^^^^^^^^^^^^^^^^


This configuration is used typically along with `distributed mode
<http://docs.confluent.io/current/connect/concepts.html#distributed-workers>`_.
Write the following json to `connector.json`, configure all of the required values, and use the command below to
post the configuration to one the distributed connect worker(s). Check here for more information about the
`Kafka Connect REST Interface. <https://docs.confluent.io/current/connect/restapi.html>`_

.. code-block:: json
    :caption: Connect Distributed REST example
    :name: connector.json
    :emphasize-lines: 6

    {
      "config" : {
        "name" : "MySourceConnector1",
        "connector.class" : "com.ramesh.kafka.MySourceConnector",
        "tasks.max" : "1",
        "my.setting" : "< Required Configuration >"
      }
    }



Use curl to post the configuration to one of the Kafka Connect Workers. Change `http://localhost:8083/` the the endpoint of
one of your Kafka Connect worker(s).

.. code-block:: bash
    :caption: Create a new connector

    curl -s -X POST -H 'Content-Type: application/json' --data @connector.json http://localhost:8083/connectors


.. code-block:: bash
    :caption: Update an existing connector

    curl -s -X PUT -H 'Content-Type: application/json' --data @connector.json http://localhost:8083/connectors/MySourceConnector1/config




===============
Sink Connectors
===============

====================
Super Sink Connector
====================

This is a description of this connector and will show up in the documentation


.. IMPORTANT::
    This is a important information that will show up in the documentation.


.. TIP::
    This is a tip that will show up in the documentation.


.. NOTE::
    This is a note that will show up in the documentation



-------------
Configuration
-------------

-------
General
-------


^^^^^^^^^^
my.setting
^^^^^^^^^^

This is a setting important to my connector.

**Importance:** High

**Type:** String






--------
Examples
--------

^^^^^^^^^^^^^^^^^^^^^^
Property based example
^^^^^^^^^^^^^^^^^^^^^^


This configuration is used typically along with `standalone mode
<http://docs.confluent.io/current/connect/concepts.html#standalone-workers>`_.

.. code-block:: properties
    :name: connector.properties
    :emphasize-lines: 4,5

    name=MySinkConnector1
    connector.class=com.ramesh.kafka.MySinkConnector
    tasks.max=1
    topics=< Required Configuration >
    my.setting=< Required Configuration >




^^^^^^^^^^^^^^^^^^
Rest based example
^^^^^^^^^^^^^^^^^^


This configuration is used typically along with `distributed mode
<http://docs.confluent.io/current/connect/concepts.html#distributed-workers>`_.
Write the following json to `connector.json`, configure all of the required values, and use the command below to
post the configuration to one the distributed connect worker(s). Check here for more information about the
`Kafka Connect REST Interface. <https://docs.confluent.io/current/connect/restapi.html>`_

.. code-block:: json
    :caption: Connect Distributed REST example
    :name: connector.json
    :emphasize-lines: 6,7

    {
      "config" : {
        "name" : "MySinkConnector1",
        "connector.class" : "com.ramesh.kafka.MySinkConnector",
        "tasks.max" : "1",
        "topics" : "< Required Configuration >",
        "my.setting" : "< Required Configuration >"
      }
    }



Use curl to post the configuration to one of the Kafka Connect Workers. Change `http://localhost:8083/` the the endpoint of
one of your Kafka Connect worker(s).

.. code-block:: bash
    :caption: Create a new connector

    curl -s -X POST -H 'Content-Type: application/json' --data @connector.json http://localhost:8083/connectors


.. code-block:: bash
    :caption: Update an existing connector

    curl -s -X PUT -H 'Content-Type: application/json' --data @connector.json http://localhost:8083/connectors/MySinkConnector1/config




