package com.patriciadrive.consumer.pactbuilder.buildertests.nullSample;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.Test;

import com.patriciadrive.consumer.pactbuilder.ConsumerBuilderException;
import com.patriciadrive.consumer.pactbuilder.ConsumerExpects;
import com.patriciadrive.consumer.pactbuilder.api.AddressExternalResource;
import com.remondis.resample.Samples;

public class NullSampleTest {

  @Test
  public void shouldComplainAboutNullValueFromSample() {
    AddressExternalResource sample = Samples.Default.of(AddressExternalResource.class)
        .get();
    sample.setCity(null);

    assertThatThrownBy(() -> ConsumerExpects.type(AddressExternalResource.class)
        .build(sample)).isInstanceOf(ConsumerBuilderException.class)
            .hasMessage(
                "A property of the specified sample data object was null. The following get method returned null: public java.lang.String com.remondis.cdc.consumer.pactbuilder.api.AddressExternalResource.getCity()");
  }

}
