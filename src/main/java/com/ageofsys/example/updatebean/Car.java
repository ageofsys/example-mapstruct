package com.ageofsys.example.updatebean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 * @author YongSu Son
 * @since 1.0
 */
@Getter
@Setter
@AllArgsConstructor
public class Car {
    private String make;
    private Integer numberOfSeats;
    private String color;
}
