# KafkaConsumer
Kafka produces from a different App and Consumes it in a different App
Run KafkaConsumer in different port because kafka producer is running in the same port in your local machine.
Please find the below command for the same:
mvn spring-boot:run -Dspring-boot.run.arguments=--server.port=8085