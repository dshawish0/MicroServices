package com.deiaa.analyticsapi.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collection = "Analytic")
public class Analytic {
    private double max;
    private double min;
    private double avg;
}
