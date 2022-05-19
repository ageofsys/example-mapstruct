package com.ageofsys.example.accessor;

import org.mapstruct.Mapper;

@Mapper
public interface GetterSampleMapper {

    GetterSample toGetterSample(GetterSampleDto getterSampleDto);
    SetterSample toSetterSample(SetterSampleDto setterSampleDto);
}
