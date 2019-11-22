package com.travelocity.framework.utils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.Option;
import com.jayway.jsonpath.spi.json.JacksonJsonProvider;
import com.jayway.jsonpath.spi.mapper.JacksonMappingProvider;

import java.io.IOException;
import java.io.InputStream;
import java.util.Optional;

import static java.lang.Thread.currentThread;
import static java.util.Optional.empty;


public final class FileUtils {

    private static final Configuration conf = Configuration.builder()
            .jsonProvider(new JacksonJsonProvider())
            .mappingProvider(new JacksonMappingProvider())
            .options(Option.SUPPRESS_EXCEPTIONS).build();

    private FileUtils() {
    }

    public static <T> Optional<T> loadFromJson(String jsonPath, String file, Class<T> clazz) {
        InputStream input = currentThread().getContextClassLoader().getResourceAsStream(file + ".json");
        T obj = JsonPath.using(conf).parse(input).read(jsonPath, clazz);
        return Optional.of(obj);
    }

    public static <T> Optional<T> loadFromJson(String file, Class<T> clazz) {
        InputStream input = currentThread().getContextClassLoader().getResourceAsStream(file + ".json");
        T obj = JsonPath.using(conf).parse(input).read("$..*", clazz);
        return Optional.of(obj);
    }

    public static <T> Optional<T> loadFromYML(String file, Class<T> clazz) {
        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
        try (InputStream input = currentThread().getContextClassLoader().getResourceAsStream(file + ".yml")) {
            T obj = objectMapper.readValue(input, clazz);
            return Optional.of(obj);
        } catch (IOException e) {
            return empty();
        }
    }
}