package com.wangxingangs.mapstruct.quickstart;

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
public class QuickStartTest {

    @Autowired
    private CarMapper carMapper;

    @Test
    public void shouldMapCarToDto() {
        //given
        Car car = new Car( "Morris", 5, CarType.SEDAN );

        //when
        CarDto carDto = carMapper.carToCarDto( car );

        //then
        Assert.assertNotNull(carDto);
        Assert.assertEquals("Morris", carDto.getMake());
        Assert.assertEquals(5, carDto.getSeatCount());
        Assert.assertEquals("SEDAN", carDto.getType());
    }
}
