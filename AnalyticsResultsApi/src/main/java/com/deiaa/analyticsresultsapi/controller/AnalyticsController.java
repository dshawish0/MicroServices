package com.deiaa.analyticsresultsapi.controller;


import com.deiaa.analyticsresultsapi.model.Analytic;
import com.deiaa.analyticsresultsapi.repository.AnalyticsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = {"Content-Type", "Authorization"})
@RestController
@RequestMapping("/api/AnalyticsResult")
public class AnalyticsController {

    @Autowired
    private AnalyticsRepository analyticsRepository;

    @GetMapping
    public List<Analytic> getAllAnalytics(){
        return analyticsRepository.findAll();
    }


}
