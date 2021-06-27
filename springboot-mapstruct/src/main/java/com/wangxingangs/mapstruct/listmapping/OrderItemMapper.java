package com.wangxingangs.mapstruct.listmapping;

import org.mapstruct.Mapper;

/**
 * @author wangxingangs
 */
@Mapper
public interface OrderItemMapper {

    OrderItemDto orderToOrderDto(OrderItem orderItem);
}
