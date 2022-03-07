package com.ageofsys.example.usingbuilder;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * @author YongSu Son
 * @since 1.0
 */
@Mapper
public interface PersonMapper {

    @Mapping(source = "personName", target = "name")
    Person toPerson(PersonDto personDto);
}
