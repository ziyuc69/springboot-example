package com.wangxingangs.mapstruct.listmapping;

import org.assertj.core.util.Lists;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author wangxingangs
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class FieldMappingTest {

    @Autowired
    private CustomerMapper customerMapper;

    @Test
    public void showFieldMapping() {
        Customer customer = new Customer();
        customer.setId( 10L );
        customer.setName( "Filip" );
        OrderItem order1 = new OrderItem();
        order1.setName( "Table" );
        order1.setQuantity( 2L );
        customer.setOrderItems(Lists.newArrayList(order1));

        CustomerDto customerDto = customerMapper.customerToCustomerDto(customer);
        Assert.assertEquals("Filip", customerDto.customerName);
    }
}
