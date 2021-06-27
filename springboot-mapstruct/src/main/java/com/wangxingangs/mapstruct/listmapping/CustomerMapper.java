package com.wangxingangs.mapstruct.listmapping;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Repository;

/**
 * @author wangxingangs
 */
@Repository
@Mapper(uses = { OrderItemMapper.class })
public interface CustomerMapper {

    @Mapping(source = "orderItems", target = "orders")
    @Mapping(source = "name", target = "customerName")
    CustomerDto customerToCustomerDto(Customer customer);
}
