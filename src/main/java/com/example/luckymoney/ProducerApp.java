package com.example.luckymoney;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 陈玉林
 * @desc TODO
 * @date 2020/6/4 9:00
 */
@SpringBootApplication
@RestController
public class ProducerApp {
    private static Logger logger = LoggerFactory.getLogger(ProducerApp.class);
    public static void main(String[] args) {
        SpringApplication.run(ProducerApp.class, args);
    }

    @GetMapping("/log_test")
    public String test() {
        for (int i = 0; i < 10; i++) {
            logger.info("info正常的测试测试测试测试测试测试测试测试测试测试测试测试-"+i);
            logger.debug("debuggger测试测试测试测试测试测试测试测试测试测试测试测试-"+i);
            logger.warn("warn测试测试测试测试测试测试测试测试测试测试-"+i);
            logger.error("error测试测试测试测试测试测试测试测试测试测试测试测试测试测试-"+i);
        }
        System.out.println(1/0);
        return "success";
    }
}
