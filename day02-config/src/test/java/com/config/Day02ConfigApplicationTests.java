package com.config;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Day02ConfigApplicationTests {

    //记录器
    Logger logger  = LoggerFactory.getLogger(getClass());
    @Test
    void contextLoads() {
        //日志的级别
        //级别由低到高 trace<debug<info<warn<error
        //可以调整输出的日志级别，可以在配置文件中调整
        logger.trace("trace");
        logger.debug("debug");

        //springboot默认输出日志级别,没有调整就使用默认级别
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
    }

}
