package com.ageofsys.example.usingconstructor;

import org.mapstruct.Mapper;

/**
 * @author YongSu Son
 * @since 1.0
 */
@Mapper
public interface VehicleMapper {

    Vehicle map(VehicleDto vehicleDto);
}
