package io.github.adt.common;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JsonUtil {
  private static final ObjectMapper mapper = new JsonUtil.CustomObjectMapper();

  public static String stringify(Object value) {
    return stringify(value, false);
  }

  public static String stringify(Object value, boolean pretty) {
    try {
      return pretty ? mapper.writerWithDefaultPrettyPrinter().writeValueAsString(value) : mapper.writeValueAsString(value);
    } catch (Exception e) {
      return "";
    }
  }

  static class CustomObjectMapper extends ObjectMapper {
    private static final long serialVersionUID = 5517319811863038899L;

    public CustomObjectMapper() {
      super.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
      super.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
      super.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }
  }
}