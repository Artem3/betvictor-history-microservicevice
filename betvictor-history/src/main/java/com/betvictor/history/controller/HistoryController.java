package com.betvictor.history.controller;

import com.betvictor.history.entity.MetricsEntity;
import com.betvictor.history.repository.MetricsRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping("/betvictor")
public class HistoryController {

    private final MetricsRepository repository;

    @GetMapping("/history")
    public List<MetricsEntity> getHistory() {
        return repository.findFirst10ByOrderByCreatedAtDesc();
    }
}

