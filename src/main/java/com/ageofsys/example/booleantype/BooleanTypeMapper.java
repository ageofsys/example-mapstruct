package com.ageofsys.example.booleantype;

import org.mapstruct.Mapper;

@Mapper
public interface BooleanTypeMapper {
    BooleanPrimitiveTypeDto toDto(BooleanPrimitiveType booleanPrimitiveType);
    BooleanWrapperClassDto toDto(BooleanWrapperClass booleanWrapperClass);
    BooleanWrapperClassDto2 toDto(BooleanWrapperClass2 booleanWrapperClass);
}
