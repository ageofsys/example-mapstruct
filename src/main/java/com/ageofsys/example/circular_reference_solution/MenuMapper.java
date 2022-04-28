package com.ageofsys.example.circular_reference_solution;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * @author AGEOFSYS
 * @since 1.0
 */
@Mapper
public interface MenuMapper {

    @Mapping(target = "parent", ignore = true)
    MenuDto map(Menu menu);

}
