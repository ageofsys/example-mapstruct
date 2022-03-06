package com.ageofsys.example;

import com.ageofsys.example.severalsourceparameter.*;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.*;

/**
 * https://mapstruct.org/documentation/stable/reference/html/#mappings-with-several-source-parameters
 *
 * @author YongSu Son
 * @since 1.0
 */
class SeveralSourceParameterTests {

    private final AddressMapper addressMapper = Mappers.getMapper(AddressMapper.class);
    private final AddressMapper2 addressMapper2 = Mappers.getMapper(AddressMapper2.class);
    private final Person person = new Person("test person");
    private final Address address = new Address(7);

    @Test
    void Should_CombineIntoOneData_When_TwoEntity() {
        DeliveryAddressDto deliveryAddressDto
                = addressMapper.personAndAddressToDeliveryAddressDto(person, address);

        assertEquals("test person", deliveryAddressDto.getDescription());
        assertEquals(7, deliveryAddressDto.getHouseNumber());
    }

    @Test
    void Should_CombineIntoOneData_When_OneEntityOfTwoEntityIsDirectlyRefer() {
        DeliveryAddressDto deliveryAddressDto
                = addressMapper2.personAndAddressToDeliveryAddressDto(person, 8);

        assertEquals("test person", deliveryAddressDto.getDescription());
        assertEquals(8, deliveryAddressDto.getHouseNumber());
    }
}
