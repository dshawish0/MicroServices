package com.deiaa.temperaturerecordapi.model;

import jakarta.persistence.*;
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
