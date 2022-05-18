package com.ageofsys.example;

import com.ageofsys.example.booleantype.*;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BooleanTypeTests {

    private final BooleanTypeMapper mapper = Mappers.getMapper(BooleanTypeMapper.class);

    /**
     * boolean primitive type
     *
     * isAdmin(admin) -> setAdmin(admin)
     * getMember(member) -> setMember(member)
     * isSuperAdmin(isSuperAdmin) -> setSuperAdmin(isSuperAdmin)
     * getSuperMember(isSuperMember) -> setSuperMember(isSuperMember)
     *
     * boolean wrapper class
     *
     *
     */
    @Test
    void booleanPrimitiveTypeSuccessCase() {
        BooleanPrimitiveType booleanPrimitiveType = new BooleanPrimitiveType();
        BooleanPrimitiveTypeDto dto = mapper.toDto(booleanPrimitiveType);

        assertTrue(booleanPrimitiveType.isAdmin());
        assertTrue(booleanPrimitiveType.getMember());
        assertTrue(booleanPrimitiveType.isSuperAdmin());
        assertTrue(booleanPrimitiveType.getSuperMember());

        assertTrue(dto.isAdmin());
        assertTrue(dto.isMember());
        assertTrue(dto.isSuperAdmin());
        assertTrue(dto.isSuperMember());
    }

    /**
     * boolean wrapper class
     *
     * isAdmin(admin) -> setAdmin(admin)
     * getMember(member) -> setMember(member)
     * isSuperAdmin(isSuperAdmin) -> setSuperAdmin(isSuperAdmin)
     * getSuperMember(isSuperMember) -> setSuperMember(isSuperMember)
     *
     * boolean wrapper class
     *
     *
     */
    @Test
    void booleanWrapperClassSuccessCase() {
        BooleanWrapperClass booleanWrapperClass = new BooleanWrapperClass();
        BooleanWrapperClassDto dto = mapper.toDto(booleanWrapperClass);

        assertTrue(booleanWrapperClass.isAdmin());
        assertTrue(booleanWrapperClass.getMember());
        assertTrue(booleanWrapperClass.isSuperAdmin());
        assertTrue(booleanWrapperClass.getSuperMember());

        assertTrue(dto.isAdmin());
        assertTrue(dto.isMember());
        assertTrue(dto.isSuperAdmin());
        assertTrue(dto.isSuperMember());
    }

    /**
     * boolean wrapper class
     *
     * getAdmin(admin) -> setAdmin(admin)
     * getMember(member) -> setMember(member)
     *
     * boolean wrapper class
     *
     *
     */
    @Test
    void booleanWrapperClassSuccessCase2() {
        BooleanWrapperClass2 booleanWrapperClass = new BooleanWrapperClass2();
        BooleanWrapperClassDto2 dto = mapper.toDto(booleanWrapperClass);

        assertTrue(booleanWrapperClass.getAdmin());
        assertTrue(booleanWrapperClass.getMember());

        assertTrue(dto.isAdmin());
        assertTrue(dto.isMember());
    }

    /**
     * boolean wrapper class
     *
     * getIsSuperAdmin(isSuperAdmin) -> setSuperAdmin(isSuperAdmin)
     * getIsSuperMember(isSuperMember) -> setSuperMember(isSuperMember)
     *
     * boolean wrapper class
     *
     *
     */
    @Test
    void booleanWrapperClassFailCase2() {
        BooleanWrapperClass2 booleanWrapperClass = new BooleanWrapperClass2();
        BooleanWrapperClassDto2 dto = mapper.toDto(booleanWrapperClass);

        assertTrue(booleanWrapperClass.getIsSuperAdmin());
        assertTrue(booleanWrapperClass.getIsSuperMember());

        assertFalse(dto.isSuperAdmin());
        assertFalse(dto.isSuperMember());
    }
}
