package com.ageofsys.example.basicmapping;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * @author YongSu Son
 * @since 1.0
 */
@Mapper
public interface CarMapper {

    @Mapping(source = "make", target = "manufacturer")
    @Mapping(source = "numberOfSeats", target = "seatCount")
    CarDto carToCarDto(Car car);

}