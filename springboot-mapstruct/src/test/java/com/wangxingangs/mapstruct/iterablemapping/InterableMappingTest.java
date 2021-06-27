package com.wangxingangs.mapstruct.iterablemapping;

import org.assertj.core.util.Lists;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author wangxingangs
 */
public class InterableMappingTest {

    @Autowired
    private SourceTargetMapper sourceTargetMapper;

    @Test
    public void testInterableMapping() {
        Source source = new Source();
        source.setMyStrings(Lists.newArrayList("1", "2", "3", "4"));
        Target target = sourceTargetMapper.toTarget(source);
        System.out.println(target.getTargets());
    }
}
