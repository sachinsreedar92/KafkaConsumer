package com.kafkaconsumer.KafkaConsumerExample.config;

import com.kafkaconsumer.KafkaConsumerExample.Listner.GreetingsStreams;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(GreetingsStreams.class)
public class StreamsConfig {
}
