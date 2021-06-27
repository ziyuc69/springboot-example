package com.wangxingangs.mapstruct.listmapping;

import lombok.Data;

import java.util.List;

/**
 * @author wangxingangs
 */
public class OrderItemDto {
    public Long id;
    public String customerName;
    public List<OrderItemDto> orders;
}
