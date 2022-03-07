package com.ageofsys.example;

import com.ageofsys.example.usingbuilder.Person;
import com.ageofsys.example.usingbuilder.PersonDto;
import com.ageofsys.example.usingbuilder.PersonMapper;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.*;

/**
 * https://mapstruct.org/documentation/stable/reference/html/#mapping-with-builders
 *
 * @author YongSu Son
 * @since 1.0
 */
class UsingBuilderTests {

    private final PersonMapper personMapper = Mappers.getMapper(PersonMapper.class);
    private final PersonDto personDto = new PersonDto("miju");

    @Test
    void Should_CreatePersonInstanceWithBuilder_When_PersonHasBuilder() {
        Person person = personMapper.toPerson(personDto);

        assertEquals("miju", person.getName());
    }
}