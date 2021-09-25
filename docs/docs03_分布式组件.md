# 分布式组件

## SpringCloud Alibaba

Spring Cloud Alibaba 致力于提供微服务开发的一站式解决方案。此项目包含开发分布式应用 微服务的必需组件，方便开发者通过 Spring Cloud 编程模型轻松使用这些组件来开发分布式应用服务。

依托 Spring Cloud Alibaba，您只需要添加一些注解和少量配置，就可以将 Spring Cloud 应用 接入阿里微服务解决方案，通过阿里中间件来迅速搭建分布式应用系统。

https://github.com/alibaba/spring-cloud-alibab

### 注册中心

选择调用哪一台机器的服务

### 配置中心

集中管理配置，修改某个服务的配置，其他同类型服务的配置也同步改动

### 网关

前端的请求先通过统一的鉴权，过滤，路由

```
结合 SpringCloud Alibaba 我们最终的技术搭配方案：
SpringCloud Alibaba - Nacos：注册中心（服务发现/注册）
SpringCloud Alibaba - Nacos：配置中心（动态配置管理）
SpringCloud - Ribbon：负载均衡
SpringCloud - Feign：声明式 HTTP 客户端（调用远程服务）
SpringCloud Alibaba - Sentinel：服务容错（限流、降级、熔断）
SpringCloud - Gateway：API 网关（webflux 编程模式）
SpringCloud - Sleuth：调用链监控
SpringCloud Alibaba - Seata：原 Fescar，即分布式事务解决方案
```

