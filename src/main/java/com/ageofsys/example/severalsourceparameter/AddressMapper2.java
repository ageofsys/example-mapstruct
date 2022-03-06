package com.ageofsys.example.severalsourceparameter;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * @author YongSu Son
 * @since 1.0
 */
@Mapper
public interface AddressMapper2 {

    @Mapping(source = "person.description", target = "description")
    @Mapping(source = "hn", target = "houseNumber")
    DeliveryAddressDto personAndAddressToDeliveryAddressDto(Person person, Integer hn);

}
