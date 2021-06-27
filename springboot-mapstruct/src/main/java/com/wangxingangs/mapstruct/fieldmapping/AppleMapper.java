package com.wangxingangs.mapstruct.fieldmapping;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

/**
 * @author wangxingangs
 */
@Mapper
public interface AppleMapper {

    Apple toApple(AppleDto appleDto);

    @InheritInverseConfiguration
    AppleDto fromApple(Apple apple);
}
