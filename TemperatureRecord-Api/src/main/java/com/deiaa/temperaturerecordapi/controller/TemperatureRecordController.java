package com.deiaa.temperaturerecordapi.controller;

import com.deiaa.temperaturerecordapi.model.TemperatureRecord;
import com.deiaa.temperaturerecordapi.repository.TemperatureRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = {"Content-Type", "Authorization"})
@RestController
@RequestMapping("/api/temperature")
public class TemperatureRecordController {

    @Autowired
    private TemperatureRecordRepository temperatureRecordRepository;

    @GetMapping
    public List<TemperatureRecord> getAllTemperatureRecord(){
        return temperatureRecordRepository.findAll();
    }

    @PostMapping
    public TemperatureRecord createTemperatureRecord(@RequestBody TemperatureRecord temperatureRecord){
        return temperatureRecordRepository.save(temperatureRecord);
    }

}
