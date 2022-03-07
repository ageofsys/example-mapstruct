package com.ageofsys.example;

import com.ageofsys.example.custommethod.*;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.*;

/**
 * https://mapstruct.org/documentation/stable/reference/html/#adding-custom-methods
 *
 * @author YongSu Son
 * @since 1.0
 */
class CustomMethodTests {

    private final CarMapper carMapper = Mappers.getMapper(CarMapper.class);
    private final AbstractCarMapper abstractCarMapper = Mappers.getMapper(AbstractCarMapper.class);
    private final Person person = new Person("miju");

    @Test
    void Should_FieldValueIsMapped_When_CustomMethodIsDefined() {
        PersonDto personDto = carMapper.personToPersonDto(person);

        assertEquals("miju", personDto.getFullName());
    }

    @Test
    void Should_FieldValueIsMapped_When_CustomMethodInAbstractClassIsDefined() {
        PersonDto personDto = abstractCarMapper.personToPersonDto(person);

        assertEquals("miju", personDto.getFullName());
    }
}
