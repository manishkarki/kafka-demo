# kafka-demo
uses docker container underneath to bring up zookeeper and kafka

a simple demo application demonstrating a producer and client can be brought up using the script
start-broker-and-client.sh

then start the normal spring-boot app

then a curl command e.g curl -d "message=hey, kafka really works now yayyy" -X POST http://localhost:9000/events/publish
should be suffice to check the subscription exists i.e message is realyed to the consumer
