package com.example.dubbo.demo.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Demo 接口定义
 *
 * @author jeftom
 * @date 2019-03-23 22:35
 * @since 1.0.0
 */
public interface DemoApi {

    String sayHello(String name);
}