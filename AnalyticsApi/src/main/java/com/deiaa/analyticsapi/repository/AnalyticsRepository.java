package com.deiaa.analyticsapi.repository;

import com.deiaa.analyticsapi.model.Analytic;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AnalyticsRepository extends MongoRepository<Analytic,String> {
}
