package com.betvictor.history;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class BetvictorHistoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(BetvictorHistoryApplication.class, args);
    }

}
