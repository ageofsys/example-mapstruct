package com.ageofsys.example.basicmapping;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

/**
 * @author YongSu Son
 * @since 1.0
 */
@Getter
@Setter
@RequiredArgsConstructor
public class Car {
    private Long id = 1L;
    private final String make;
    private final Integer numberOfSeats;
    private final String color;
}
