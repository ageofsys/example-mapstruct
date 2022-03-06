package com.ageofsys.example.nestedbean;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * @author YongSu Son
 * @since 1.0
 */
@Mapper
public interface CustomMapper {

    @Mapping(source = "account.id", target = "id")
    @Mapping(source = "record", target = ".")
    @Mapping(source = "account", target = ".")
    Custom customDtoToCustom(CustomDto customDto);
}
