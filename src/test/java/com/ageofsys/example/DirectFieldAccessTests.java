package com.ageofsys.example;

import com.ageofsys.example.directfieldaccess.Customer;
import com.ageofsys.example.directfieldaccess.CustomerDto;
import com.ageofsys.example.directfieldaccess.CustomerMapper;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://mapstruct.org/documentation/stable/reference/html/#direct-field-mappings
 *
 * getters/setters 가 없을 경우 필드 접근자를 기반으로 작동한다.
 *
 * public, public final일 경우 읽기 접근자로 인식하고, static일 경우 읽기 접근자로 인식하지 않는다.
 * public일 경우 쓰기 접근자로 인식하고, final, static일 경우 쓰기 접근자로 인식하지 않는다.
 *
 * @author YongSu Son
 * @since 1.0
 */
class DirectFieldAccessTests {

    private final CustomerMapper customerMapper = Mappers.getMapper(CustomerMapper.class);
    private final Customer customer = new Customer(1L, "miju");
    private final CustomerDto customerDto = new CustomerDto(2L, "jaeseok");

    @Test
    void Should_ReadFieldValue_When_CustomDtoFieldIsPublicFieldAccess() {
        Customer customer = customerMapper.toCustomer(customerDto);

        assertEquals(2L, customer.getId());
        assertEquals("jaeseok", customer.getName());
    }

    @Test
    void Should_WriteFieldValue_When_CustomDtoFieldIsPublicFieldAccess() {
        CustomerDto customDto = customerMapper.fromCustomer(customer);

        assertEquals(1L, customDto.id);
        assertEquals("miju", customDto.customerName);
    }

}
