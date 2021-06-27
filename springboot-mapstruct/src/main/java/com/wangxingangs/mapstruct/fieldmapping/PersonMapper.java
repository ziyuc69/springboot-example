package com.wangxingangs.mapstruct.fieldmapping;

import com.wangxingangs.mapstruct.listmapping.OrderItemMapper;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @author wangxingangs
 */
@Mapper(uses = { AppleMapper.class })
public interface PersonMapper {

    @Mapping(source = "appleDto", target = "apple")
    Person toPerson(PersonDto personDto);

    @Mapping(source = "apple", target = "appleDto")
    @InheritInverseConfiguration
    PersonDto fromPerson(Person person);
}
