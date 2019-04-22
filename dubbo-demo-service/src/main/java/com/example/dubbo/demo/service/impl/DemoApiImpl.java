package com.example.dubbo.demo.service.impl;

import com.example.dubbo.demo.api.DemoApi;
import org.apache.dubbo.config.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * demo 实现类
 *
 * @author jeftom
 * @date 2019-03-23 23:04
 * @since 1.0.0
 */
@Service(version = "${dubbo.application.version}", owner = "${dubbo.application.owner}", protocol = "dubbo")
public class DemoApiImpl implements DemoApi {

    private Logger logger = LoggerFactory.getLogger(DemoApiImpl.class);

    /**
     * 实现 sayHello 接口
     *
     * @param name
     * @return
     */
    @Override
    public String sayHello(String name) {
        logger.debug("Hello, " + name + " (from Spring Boot with dubbo-2.7.1)");
        return "Hello, " + name + " (from Spring Boot with dubbo-2.7.1)";
    }
}