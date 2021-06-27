package com.wangxingangs.mapstruct.iterablemapping;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @author wangxingangs
 */
@Mapper
public interface SourceTargetMapper {

    @Mapping( source = "myStrings", target = "targets")
    Target toTarget(Source s);
}
