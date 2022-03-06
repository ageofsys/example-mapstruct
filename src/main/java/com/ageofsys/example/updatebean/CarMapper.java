package com.ageofsys.example.updatebean;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

/**
 * @author YongSu Son
 * @since 1.0
 */
@Mapper
public interface CarMapper {

    @Mapping(source = "manufacturer", target = "make")
    void updateCarFromDto(CarDto carDto, @MappingTarget Car car);

    @Mapping(source = "manufacturer", target = "make")
    Car updateCarFromDtoAndReturn(CarDto carDto, @MappingTarget Car car);
}
