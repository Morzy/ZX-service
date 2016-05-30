package com.lz.helper;

import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;

public class HideNullFieldsObjectMapper extends ObjectMapper {
    public HideNullFieldsObjectMapper() {
	super();
	this.setSerializationConfig(this.getSerializationConfig().withSerializationInclusion(Inclusion.NON_NULL));
	this.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

}