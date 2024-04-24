package com.betvictor.history.repository;

import com.betvictor.history.entity.MetricsEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetricsRepository extends JpaRepository<MetricsEntity, Long> {

    List<MetricsEntity> findFirst10ByOrderByCreatedAtDesc();
}
