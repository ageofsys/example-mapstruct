package com.ageofsys.example.updatebean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author YongSu Son
 * @since 1.0
 */
@Getter
@Setter
@AllArgsConstructor
public class CarDto {
    private String manufacturer;
    private Integer seatCount;
    private String color;
    private String model;
}
