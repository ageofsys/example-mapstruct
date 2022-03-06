package com.ageofsys.example;

import com.ageofsys.example.updatebean.Car;
import com.ageofsys.example.updatebean.CarDto;
import com.ageofsys.example.updatebean.CarMapper;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.*;

/**
 * https://mapstruct.org/documentation/stable/reference/html/#updating-bean-instances
 *
 * @author YongSu Son
 * @since 1.0
 */
class UpdatingExistingBeanTests {

    private final CarMapper carMapper = Mappers.getMapper(CarMapper.class);
    private final CarDto carDto = new CarDto("genesis", 4, "red", "5");
    private final Car car = new Car("bmw", 6, "blue");

    @Test
    void Should_Updated_When_ExplicitMapping() {
        carMapper.updateCarFromDto(carDto, car);

        assertEquals("genesis", car.getMake());
    }

    @Test
    void Should_NotUpdated_When_NoMappingAndNoSameFieldName() {
        carMapper.updateCarFromDto(carDto, car);

        assertEquals(6, car.getNumberOfSeats());
    }

    @Test
    void Should_Updated_When_SameFieldNameButNoMapping() {
        carMapper.updateCarFromDto(carDto, car);

        assertEquals("red", car.getColor());
    }

    @Test
    void Should_SameTargetAndReturnInstance_When_ReturnMappedTarget() {
        Car mappedCar = carMapper.updateCarFromDtoAndReturn(carDto, car);

        assertEquals(car, mappedCar);
    }
}
