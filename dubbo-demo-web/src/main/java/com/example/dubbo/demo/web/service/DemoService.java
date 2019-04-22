package com.example.dubbo.demo.web.service;

import com.example.dubbo.demo.api.DemoApi;
import org.apache.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 消费者服务层
 *
 * @author jeftom
 * @date 2019-03-24 00:49
 * @since 1.0.0
 */
@Service
public class DemoService {

    private Logger logger = LoggerFactory.getLogger(DemoService.class);

    @Reference(version = "${dubbo.application.version}", owner = "${dubbo.application.owner}", protocol = "dubbo")
    private DemoApi demoApi;

    public String sayHello(String name) {
        logger.debug(name);
        return demoApi.sayHello(name);
    }
}