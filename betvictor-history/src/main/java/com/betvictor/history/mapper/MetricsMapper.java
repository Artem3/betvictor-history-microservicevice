package com.betvictor.history.mapper;

import com.betvictor.history.entity.MetricsEntity;
import com.betvictor.history.kafka.payload.MetricsResponseMsg;


public class MetricsMapper {

    public static MetricsEntity mapToEntity(MetricsResponseMsg msg) {
        MetricsEntity entity = new MetricsEntity();
        entity.setFreqWord(msg.getFreqWord());
        entity.setAvgParagraphSize(msg.getAvgParagraphSize());
        entity.setAvgParagraphProcessingTime(msg.getAvgParagraphProcessingTime());
        entity.setTotalProcessingTime(msg.getTotalProcessingTime());

        return entity;
    }
}

