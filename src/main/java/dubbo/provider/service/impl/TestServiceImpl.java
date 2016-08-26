package dubbo.provider.service.impl;

import dubbo.provider.service.TestService;

public class TestServiceImpl implements TestService {
    /**
     * 服务提供方实现接口：(对服务消费方隐藏实现)
     */
    public String sayHello(String name) {
        System.out.println("调用provider服务");
        return "hello"+name;
    }
}