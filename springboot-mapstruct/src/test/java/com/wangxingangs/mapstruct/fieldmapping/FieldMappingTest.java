package com.wangxingangs.mapstruct.fieldmapping;

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
    private PersonMapper personMapper;

    @Test
    public void showFieldMapping() {
        Apple apple = new Apple("red");
        Person person = new Person();
        person.setName("zhangsan");
        person.setApple(apple);

        PersonDto fromPerson = personMapper.fromPerson(person);
        System.out.println(fromPerson);

        Person toPerson = personMapper.toPerson(fromPerson);
        System.out.println(toPerson);
    }
}
