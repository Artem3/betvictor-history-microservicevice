package com.betvictor.history.mapper;

import com.betvictor.history.entity.MetricsEntity;
import com.betvictor.history.kafka.payload.MetricsResponseMsg;
import java.time.Instant;


public class MetricsMapper {

    public static MetricsEntity mapToEntity(MetricsResponseMsg msg) {
        MetricsEntity entity = new MetricsEntity();
        entity.setFreqWord(msg.getFreqWord());
        entity.setAvgParagraphSize(msg.getAvgParagraphSize());
        entity.setAvgParagraphProcessingTime(msg.getAvgParagraphProcessingTime());
        entity.setTotalProcessingTime(msg.getTotalProcessingTime());
        entity.setCreatedAt(Instant.now());

        return entity;
    }
}

