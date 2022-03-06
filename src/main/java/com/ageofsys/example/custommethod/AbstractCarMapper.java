package com.ageofsys.example.custommethod;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * @author YongSu Son
 * @since 1.0
 */
@Mapper
public abstract class AbstractCarMapper {

    @Mapping(source = "make", target = "manufacturer")
    @Mapping(source = "numberOfSeats", target = "seatCount")
    public abstract CarDto carToCarDto(Car car);

    public PersonDto personToPersonDto(Person person) {
        return new PersonDto(person.getName());
    };
}