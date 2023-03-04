package com.deiaa.analyticsapi.controller;

import com.deiaa.analyticsapi.model.Analytic;
import com.deiaa.analyticsapi.model.TemperatureRecord;
import com.deiaa.analyticsapi.repository.AnalyticsRepository;
import com.deiaa.analyticsapi.repository.TemperatureRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = {"Content-Type", "Authorization"})
@RestController
@RequestMapping("/api/Analytics")
public class AnalyticsController {

    @Autowired
    private TemperatureRecordRepository temperatureRecordRepository;

    @Autowired
    private AnalyticsRepository analyticsRepository;

    @GetMapping
    public Analytic getAnalytics(){
        Analytic analytics = new Analytic();
        List<TemperatureRecord> temperatureRecords = temperatureRecordRepository.findAll();

        Comparator<TemperatureRecord> TemperatureRecordComparator = Comparator.comparing(TemperatureRecord::getTemperature);

        analytics.setMax((Collections.max(temperatureRecords, TemperatureRecordComparator)).getTemperature());
        analytics.setMin((Collections.min(temperatureRecords, TemperatureRecordComparator)).getTemperature());

        double sum=0;
        for(TemperatureRecord temperatureRecord : temperatureRecords)
               sum+=temperatureRecord.getTemperature();

        analytics.setAvg(sum/temperatureRecords.size());
        analyticsRepository.save(analytics);

        return analytics;

    }

}
