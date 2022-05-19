package com.ageofsys.example;

import com.ageofsys.example.accessor.*;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccessorTests {

    GetterSampleMapper getterSampleMapper = Mappers.getMapper(GetterSampleMapper.class);

    @Test
    void Should_SuccessMapping_When_PublicPropertyOrPublicGetterMethod() {
        GetterSample getterSample = getterSampleMapper.toGetterSample(new GetterSampleDto());

        assertEquals("hello1", getterSample.noGetterButPublicAccessor);
        assertEquals("hello2", getterSample.publicAccessor);
        assertEquals(null, getterSample.protectedAccessor);
        assertEquals(null, getterSample.packageAccessor);
    }

    @Test
    void Should_SuccessMapping_When_PublicPropertyOrPublicSetterMethod() {
        SetterSample setterSample = getterSampleMapper.toSetterSample(new SetterSampleDto());

        assertEquals("hello1", setterSample.noSetterButPublicAccessor);
        assertEquals("hello2", setterSample.getPublicAccessor());
        assertEquals(null, setterSample.getProtectedAccessor());
        assertEquals(null, setterSample.getPackageAccessor());
    }
}
