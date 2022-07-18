package com.nicky.springcloudrabbit.streamfunctonal;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;
import java.util.function.Function;

@Slf4j
@Configuration
public class FunctionalConfig {
    // function / processor : make input output
    // consumer / consumer : make input
    // supplier / publisher,producer: make output

    @Bean
    public Function<String, String> toUpperCase() {
        return value -> {
            log.info("toUpperCase {}", value);
            return value.toUpperCase();
        };
    }

    @Bean
    public Function<String, String> data() {
        return value -> {
            log.info("data {}", value);
            return value;
        };
    }

    @Bean
    public Consumer<String> consume() {
        return value -> {
            log.info("CONSUME {} ", value);
//            return value; // SEE CONSUMER!!
        };
    }
}
