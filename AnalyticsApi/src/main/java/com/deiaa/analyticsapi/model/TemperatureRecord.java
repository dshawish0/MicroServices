package com.deiaa.analyticsapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "temperaturerecord")

public class TemperatureRecord {

    @Id
    private int temp_Id;
    private double temperature;
    private Date date;
}
