package com.example;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

/**
 * @author Petar Tahchiev
 * @since 1.2
 */
public class DemoConfig {

    @Bean(name = { "testMessageSource", "messageSource" })
    protected MessageSource testMessageSource() throws Exception {
        final ReloadableResourceBundleMessageSource src = new ReloadableResourceBundleMessageSource();
        src.setBasename("test");
        return src;
    }
}
