package com.patriciadrive.consumer.pactbuilder;

import java.math.BigDecimal;
import java.util.Hashtable;
import java.util.Map;

import com.patriciadrive.consumer.pactbuilder.types.BooleanMapping;
import com.patriciadrive.consumer.pactbuilder.types.DecimalMapping;
import com.patriciadrive.consumer.pactbuilder.types.IntegerMapping;
import com.patriciadrive.consumer.pactbuilder.types.LongMapping;
import com.patriciadrive.consumer.pactbuilder.types.NumberMapping;
import com.patriciadrive.consumer.pactbuilder.types.StringMapping;

/**
 * This is the is of default out-of-the-box type mappings.
 */
class TypeMappings {

  private static final Map<Class<?>, PactDslModifier<?>> defaultTypeMappings = new Hashtable<>();

  static {
    NumberMapping numberMapping = new NumberMapping();
    DecimalMapping decimalMapping = new DecimalMapping();
    StringMapping stringMapping = new StringMapping();
    BooleanMapping booleanMapping = new BooleanMapping();
    IntegerMapping integerMapping = new IntegerMapping();
    LongMapping longMapping = new LongMapping();

    defaultTypeMappings.put(String.class, stringMapping);

    defaultTypeMappings.put(byte.class, numberMapping);
    defaultTypeMappings.put(short.class, numberMapping);
    defaultTypeMappings.put(int.class, integerMapping);
    defaultTypeMappings.put(long.class, longMapping);
    defaultTypeMappings.put(float.class, numberMapping);
    defaultTypeMappings.put(double.class, decimalMapping);
    defaultTypeMappings.put(boolean.class, booleanMapping);

    defaultTypeMappings.put(Byte.class, numberMapping);
    defaultTypeMappings.put(Short.class, numberMapping);
    defaultTypeMappings.put(Integer.class, integerMapping);
    defaultTypeMappings.put(Long.class, longMapping);
    defaultTypeMappings.put(Float.class, numberMapping);
    defaultTypeMappings.put(Double.class, decimalMapping);
    defaultTypeMappings.put(Boolean.class, booleanMapping);

    defaultTypeMappings.put(BigDecimal.class, decimalMapping);
  }

  public static Map<Class<?>, PactDslModifier<?>> getDatatypeMappings() {
    return new Hashtable<>(defaultTypeMappings);
  }

}
