package com.ageofsys.example.usingconstructor;

import org.mapstruct.Mapper;

/**
 * @author YongSu Son
 * @since 1.0
 */
@Mapper
public interface CarMapper {

    Car map(CarDto carDto);
}
