package com.ageofsys.example;

import com.ageofsys.example.basicmapping.Car;
import com.ageofsys.example.basicmapping.CarDto;
import com.ageofsys.example.basicmapping.CarMapper;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.*;

/**
 * https://mapstruct.org/documentation/stable/reference/html/#basic-mappings
 *
 * @author YongSu Son
 * @since 1.0
 */
class BasicMappingTests {

    private final CarMapper carMapper = Mappers.getMapper(CarMapper.class);
    private final Car car = new Car("bmw", 4, "red");

    @Test
    void Should_FieldValueIsMapped_When_MappingAnnotationIsDefined() {
        CarDto carDto = carMapper.carToCarDto(car);

        assertEquals("bmw", carDto.getManufacturer());
        assertEquals(4, carDto.getSeatCount());
    }

    @Test
    void Should_FieldValueIsMapped_When_MappingAnnotationIsNotDefinedAndFieldNameIsSame() {
        CarDto carDto = carMapper.carToCarDto(car);

        assertEquals("red", carDto.getColor());
    }

    @Test
    void Should_FieldValueIsNull_When_MappingAnnotationIsNotDefinedAndFieldNameIsNotSame() {
        CarDto carDto = carMapper.carToCarDto(car);

        assertNull(carDto.getModel());
    }

}
