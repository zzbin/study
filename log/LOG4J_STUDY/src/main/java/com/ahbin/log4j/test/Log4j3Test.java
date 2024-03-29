package com.ahbin.log4j.test;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.io.IOException;

/**
 * 通过配置文件打印日志
 */
public class Log4j3Test {

    @Test
    public void test01() throws IOException {
        /*

         */
        //加载初始化配置
//        BasicConfigurator.configure();
        Logger logger = Logger.getLogger(Log4j3Test.class);
        logger.fatal("fatal 信息");
        logger.error("error 信息");
        logger.warn("warn 信息");
        logger.info("info 信息");
        logger.debug("debug 信息");
        logger.trace("trace 信息");
    }
}
