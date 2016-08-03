package com.example;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.MessageSource;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import javax.annotation.Resource;
import java.util.Locale;

import static org.junit.Assert.assertEquals;

/**
 * @author Petar Tahchiev
 * @since 1.2
 */
//@SpringApplicationConfiguration(classes = { DemoConfig.class })
@SpringBootTest(classes = DemoConfig.class)
public class DemoTest extends AbstractJUnit4SpringContextTests {

    @Resource(name = "messageSource")
    private MessageSource messageSource;

    @Test
    public void test() {
        assertEquals("value", messageSource.getMessage("key", null, Locale.ENGLISH));
    }
}
