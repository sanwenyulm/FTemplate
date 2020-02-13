# 说明
[Boot 和 Cloud版本需要对应]：
父工程将Spring Cloud 锁在Finchley.M9版本
Spring Boot使用2.0.1版本
# 介绍
1. 模板子模块使用了[模板构建提取码:is4s](https://pan.baidu.com/s/1zzOtAnhWNb8xegJFAzsO_Q)，可以快速基于数据库构建springAll+cloud2.0版本的模板工程。
2. 采用最小独立微服务模式 ：用户微服务、文章微服务、评论微服务、基础微服务、配置微服务、服务发现微服务、网关微服务。IDEA模块开发自动构建docker镜像到服务器的私有镜像仓库。
3. spring cloud config+bus+git服务器实现动态不宕机配置。
4. 微服务网关Zuul负载均衡分发；网关过滤有效token用户[用户微服务颁发的token].
5. Eureka服务发现中心。基于Feign微服务相互调用。完善的熔断器机制。
6. 使用JWT 制作颁发token，控制用户访问。
7. Redis分布式缓存完成查询缓存和时效性缓存管理。
8. MongoDB实现大吞吐量但价值不高的数据存储管理。
9. 基于雪花算法的分布式ID生成器。
10. 依赖服务使用POM依赖+注解方式启动。
# 依赖的Docker容器：
MySql:
>docker run -di --name=app_mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=yourpassword   mysql

Redis:
>docker run -di  --name my_redis -p 6379:6379 redis --requirepass "123456"
跨机器使用需要设置密码，防止被挖矿；此项目中查询缓存和时效缓存使用

MongoDB:
>docker run -di  --name my_mongodb -p 27017:27017 mongo
吞吐数据量大 但是不敏感的数据使用，比如评论

RabbitMQ:
>docker run ‐di ‐‐name=my_rabbitmq ‐p 5671:5617 ‐p 5672:5672 ‐p 4369:4369 ‐p 15671:15671 ‐p 15672:15672 ‐p 25672:25672 rabbitmq:management
如果不是基于management版本需要自己输命令开启管理插件；异步订阅分发使用；Spring Bus 动态配置使用

私有镜像Registry:
>docker run ‐di ‐‐name=registry ‐p 5000:5000 registry
开启2375端口；配合本地maven-docker-build插件使用

JDK1.8应用容器基础镜像：
> 基于centos7和1.8构建。此项目基于jdk1.8.0_171版本。

# JPA Sql辅助工具：
Navicat for MySql

# 测试：
RestFul Api接口工具
PostMan+Swagger


