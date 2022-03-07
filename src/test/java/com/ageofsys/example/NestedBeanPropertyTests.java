package com.ageofsys.example;

import com.ageofsys.example.nestedbean.*;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.*;

/**
 * https://mapstruct.org/documentation/stable/reference/html/#mapping-nested-bean-properties-to-current-target
 *
 * @author YongSu Son
 * @since 1.0
 */
class NestedBeanPropertyTests {

    private final CustomMapper customMapper = Mappers.getMapper(CustomMapper.class);
    private CustomDto customDto = new CustomDto(1L, "female",
             new RecordDto(2L, "miju", 7), new AccountDto(3L, "mijuid", true));

    @Test
    void Should_FieldValueIsMapped_When_NestedBeanProperty() {
        Custom custom = customMapper.customDtoToCustom(customDto);

        assertEquals("female", custom.getGender());
        assertEquals("miju", custom.getName());
        assertEquals("mijuid", custom.getLoginId());
    }

    @Test
    void Should_ExplicitFieldValueIsMapped_When_DuplicateFieldIsExists() {
        Custom custom = customMapper.customDtoToCustom(customDto);

        assertEquals(3L, custom.getId());
    }
}
