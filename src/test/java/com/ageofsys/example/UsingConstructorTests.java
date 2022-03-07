package com.ageofsys.example;

import com.ageofsys.example.usingconstructor.*;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.*;

/**
 * https://mapstruct.org/documentation/stable/reference/html/#mapping-with-constructors
 *
 * @author YongSu Son
 * @since 1.0
 */
class UsingConstructorTests {

    private final VehicleMapper vehicleMapper = Mappers.getMapper(VehicleMapper.class);
    private final CarMapper carMapper = Mappers.getMapper(CarMapper.class);
    private final TruckMapper truckMapper = Mappers.getMapper(TruckMapper.class);
    private final VanMapper vanMapper = Mappers.getMapper(VanMapper.class);

    @Test
    void Should_CreateWithPublicConstructor_When_OnlyOnePublicConstructorIsExists() {
        Vehicle vehicle = vehicleMapper.map(new VehicleDto("blue"));

        assertEquals("blue", vehicle.getColor());
    }

    @Test
    void Should_CreateWithDefaultConstructor_When_SeveralPublicConstructorIsExists() {
        Car car = carMapper.map(new CarDto("bmw", "blue"));

        assertNull(car.getMake());
        assertNull(car.getColor());
    }

    @Test
    void Should_CreateWithDefaultAnnotationConstructor_When_SeveralPublicConstructorIsExistsAndOneHasDefaultAnnotation() {
        Truck truck = truckMapper.map(new TruckDto("bmw", "blue"));

        assertEquals("bmw", truck.getMake());
        assertEquals("blue", truck.getColor());
    }

}
