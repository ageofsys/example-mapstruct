package com.ageofsys.example.usingconstructor;

import lombok.Getter;

/**
 * @author YongSu Son
 * @since 1.0
 */
@Getter
public class Car {
    private String make;
    private String color;

    public Car() {}

    public Car(String make, String color) {
        this.make = make;
        this.color = color;
    }
}
