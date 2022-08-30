package com.zuo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author zuozuo
 * @Date 2022 08 29
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = Springboot02Application.class)
public class TestLoggers {

    /*引入日志*/
    private static final Logger logger = LoggerFactory.getLogger(TestLoggers.class);
    @Test
    public void testLogger(){
        System.out.println(logger.getName());

        logger.debug("debug log");
        logger.info("info log");
        logger.warn("warn log");
        logger.error("error log");
    }
}
