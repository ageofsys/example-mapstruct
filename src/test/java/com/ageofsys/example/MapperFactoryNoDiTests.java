package com.ageofsys.example;

import com.ageofsys.example.mapperfactorynodi.Car;
import com.ageofsys.example.mapperfactorynodi.CarDto;
import com.ageofsys.example.mapperfactorynodi.CarMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * https://mapstruct.org/documentation/stable/reference/html/#retrieving-mapper
 *
 * @author YongSu Son
 * @since 1.0
 */
class MapperFactoryNoDiTests {

    @Test
    void Should_GetFactoryFromMapper_When_MapperHasFactory() {
        Car car = CarMapper.INSTANCE.map(new CarDto("bmw"));

        assertEquals("bmw", car.getMake());
    }
}
