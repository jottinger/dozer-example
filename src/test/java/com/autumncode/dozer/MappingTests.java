package com.autumncode.dozer;

import com.github.dozermapper.core.DozerBeanMapperBuilder;
import com.github.dozermapper.core.Mapper;
import org.testng.annotations.Test;

public class MappingTests {
    @Test
    public void testMapping() {
        Mapper mapper= DozerBeanMapperBuilder.buildDefault();
        Source source=new Source("Foo",2);
        Destination destination=new Destination();
        mapper.map(source, destination);
        System.out.println(destination);

    }
}
