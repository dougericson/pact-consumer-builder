package com.github.dougericson.pact.consumer.pactbuilder.buildertests.customconsumerbuilder;

import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

import com.github.dougericson.pact.consumer.pactbuilder.TestUtil;
import com.github.dougericson.pact.consumer.pactbuilder.ConsumerBuilder;
import com.github.dougericson.pact.consumer.pactbuilder.ConsumerExpects;
import com.remondis.resample.Samples;

import au.com.dius.pact.consumer.dsl.PactDslJsonBody;

public class UseGlobalCustomConsumerTest {
  @Test
  public void shouldUseCustomConsumerBuilderAndChangeFieldName() throws Exception {
    PactDslJsonBody pactDslJsonBody = new PactDslJsonBody();

    Parent parent = Samples.Default.of(Parent.class)
        .get();

    pactDslJsonBody = ConsumerExpects.type(Parent.class)
        .referencing(getStructureDefinition())
        .build(pactDslJsonBody, parent);

    String actualJson = TestUtil.toJson(pactDslJsonBody);

    JSONAssert.assertEquals("{\"structure\":{\"anotherName\":\"string\"}}", actualJson, JSONCompareMode.NON_EXTENSIBLE);
  }

  public ConsumerBuilder<Structure> getStructureDefinition() {
    return ConsumerExpects.type(Structure.class)
        .field(Structure::getString)
        .as("anotherName");
  }
}
