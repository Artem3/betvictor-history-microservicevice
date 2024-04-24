package com.betvictor.history.kafka;

import static com.betvictor.history.mapper.MetricsMapper.mapToEntity;

import com.betvictor.history.entity.MetricsEntity;
import com.betvictor.history.kafka.payload.MetricsResponseMsg;
import com.betvictor.history.repository.MetricsRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class MetricsConsumer {

    private final MetricsRepository metricsRepository;

    @Transactional
    @KafkaListener(topics = "${consumer.topic.name}")
    public void consume(MetricsResponseMsg message) {

        log.info("Received message from Kafka: {}", message);
        try {
            MetricsEntity entity = mapToEntity(message);
            metricsRepository.save(entity);
        } catch (Exception e) {
            log.error("Error saving entity: {}", message, e);
            throw e;
        }
    }
}
