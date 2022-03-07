package com.ageofsys.example.usingconstructor;

import lombok.Getter;

/**
 * @author YongSu Son
 * @since 1.0
 */
@Getter
public class Truck {
    private String make;
    private String color;

    public Truck() {}

    @Default
    public Truck(String make, String color) {
        this.make = make;
        this.color = color;
    }
}
