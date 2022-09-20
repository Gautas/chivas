package com.perl.demo.config;

import com.perl.demo.dto.RequestDTO;
import com.perl.demo.model.Champ;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;

public class orikaConfig extends ConfigurableMapper {
@Override
protected void configure(MapperFactory factory) {
	factory.classMap(Champ.class, RequestDTO.class).byDefault().register();
}
}
