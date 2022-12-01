package com.github.dougericson.pact.consumer.pactbuilder.regression.longListBug;

import org.junit.Test;
import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

import com.github.dougericson.pact.consumer.pactbuilder.ConsumerExpects;
import com.github.dougericson.pact.consumer.pactbuilder.TestUtil;
import com.remondis.resample.Samples;

import au.com.dius.pact.consumer.dsl.PactDslJsonBody;

public class LongListBug {

  @Test
  public void testList() {
    ListParent listParent = Samples.Default.of(ListParent.class)
        .newInstance();
    PactDslJsonBody pactDslJsonBody = ConsumerExpects.type(ListParent.class)
        .build(new PactDslJsonBody(), listParent);

    String actualJson = TestUtil.toJson(pactDslJsonBody);
    JSONAssert.assertEquals("{\"list\":[0]}", actualJson, JSONCompareMode.NON_EXTENSIBLE);
  }

}
