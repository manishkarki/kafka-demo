#!/bin/sh -e

#first create the network
docker network create kafka
#run the latest zookeeper image
docker run --net=kafka -d --name=zookeeper -e ZOOKEEPER_CLIENT_PORT=2181 confluentinc/cp-zookeeper:4.1.0
#run the kafka, the id at the end shall vary
docker run --net=kafka -d -p 9092:9092 --name=kafka -e KAFKA_ZOOKEEPER_CONNECT=zookeeper:2181 -e KAFKA_ADVERTISED_LISTENERS=PLAINTEXT://kafka:9092 -e KAFKA_OFFSETS_TOPIC_REPLICATION_FACTOR=1 aa982a32e7c4


