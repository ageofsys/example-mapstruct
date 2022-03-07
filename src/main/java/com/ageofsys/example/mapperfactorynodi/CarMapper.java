package com.ageofsys.example.mapperfactorynodi;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @author YongSu Son
 * @since 1.0
 */
@Mapper
public interface CarMapper {
    CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

    Car map(CarDto carDto);
}
