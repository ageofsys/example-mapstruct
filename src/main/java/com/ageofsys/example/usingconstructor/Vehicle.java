package com.ageofsys.example.usingconstructor;

import lombok.Getter;

/**
 * @author YongSu Son
 * @since 1.0
 */
@Getter
public class Vehicle {
    private String color;

    protected Vehicle(){}

    public Vehicle(String color) {
        this.color = color;
    }
}
