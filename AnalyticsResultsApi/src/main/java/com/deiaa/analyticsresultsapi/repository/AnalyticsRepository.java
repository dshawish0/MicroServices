package com.deiaa.analyticsresultsapi.repository;


import com.deiaa.analyticsresultsapi.model.Analytic;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AnalyticsRepository extends MongoRepository<Analytic,String> {
}
