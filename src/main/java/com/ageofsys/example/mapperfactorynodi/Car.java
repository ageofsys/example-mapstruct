package com.ageofsys.example.mapperfactorynodi;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author YongSu Son
 * @since 1.0
 */
@Getter
public class Car {
    private String make;

    public Car(String make) {
        this.make = make;
    }
}
