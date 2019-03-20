# kafka-spring
Simple Kafka Producer-Consumer Application With Spring

KAFKA Simple Consumer-Producer - Steps run the project
=============================================

1. Download kafka binary

2. Run the zookeeper & kafka server (scripts found in kafka folder)
	
	   bin/windows/zookeeper-server-start.bat config/zookeeper.properties
	   bin/windows/kafka-server-start.bat config/server.properties
	
	in config/server.properties file, add the following line if missing from file 
			
			listeners=PLAINTEXT://127.0.0.1:9092
			
	
3. Create topics using kafka CLI

	   bin/windows/kafka-topics.bat --create --zookeeper <zookeeperServerAddr> --replication-factor <replicationFactor> --partitions <numberPartitions> --topic <topicName>
	
	Example:
  
	   bin/windows/kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic odd
	
4. Create & compile the project

5. Run the program






Useful commands
============================================

List created topics created
-----------------------------
	bin/windows/kafka-topics.bat --list --zookeeper <zookeeperAddr> 
	
	
Diplay messages from topics
---------------------------------------------
	bin/windows/kafka-console-consumer.bat --bootstrap-server <brokerAddr> --topic <topicName>
	
	bin/windows/kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic topicA
