# KafkaConsumer
1. Kafka produces from a different App and Consumes it in a different App

2. Run KafkaConsumer in different port because kafka producer is running in the same port in your local machine.
Ex: mvn spring-boot:run -Dspring-boot.run.arguments=--server.port=8085
