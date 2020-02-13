# 微服务开发模板工程说明

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

# 现状
一台2核 4G内存云服务部署：
app_eureka 服务发现
app_config 配置服务
app_gateway 网关服务
app_user 用户服务
rabbitmq
mysql
>[12]+  Stopped                 top
 [root@VM_0_9_centos ~]# free -h
               total        used        free      shared  buff/cache   available
 Mem:           3.7G        3.3G        138M        908K        230M        142M
 Swap:            0B          0B          0B
 [root@VM_0_9_centos ~]# docker ps -a
 CONTAINER ID        IMAGE                                               COMMAND                  CREATED             STATUS                        PORTS                                                                                                                      NAMES
 ba32d48dc65a        redis                                               "docker-entrypoint.s…"   28 minutes ago      Exited (0) 27 minutes ago                                                                                                                                app_redis
 a8dcd46ec32a        122.51.43.155:5000/article:1.0-SNAPSHOT             "java -jar /app.jar"     About an hour ago   Exited (137) 32 minutes ago                                                                                                                              app_article
 6126e5feb56e        122.51.43.155:5000/microservice_user:1.0-SNAPSHOT   "java -jar /app.jar"     About an hour ago   Up 12 minutes                 0.0.0.0:9005->9005/tcp                                                                                                     app_user
 93a793074625        122.51.43.155:5000/base:1.0-SNAPSHOT                "java -jar /app.jar"     2 hours ago         Exited (1) 2 hours ago                                                                                                                                   app_base
 c7a8186d1e47        122.51.43.155:5000/appgateway:1.0-SNAPSHOT          "java -jar /app.jar"     2 hours ago         Up 2 hours                    0.0.0.0:8686->8686/tcp                                                                                                     app_gateway
 7efc2c2dd629        122.51.43.155:5000/config:1.0-SNAPSHOT              "java -jar /app.jar"     2 hours ago         Up 2 hours                    0.0.0.0:18000->18000/tcp                                                                                                   app_config
 da7c2b1990e2        122.51.43.155:5000/eureka:1.0-SNAPSHOT              "java -jar /app.jar"     2 hours ago         Up 5 minutes                  0.0.0.0:6688->6688/tcp                                                                                                     app_eureka
 5ee255cc9aad        ubuntu                                              "/bin/bash -c 'apt-g…"   2 hours ago         Exited (137) 2 hours ago                                                                                                                                 gifted_leakey
 0411889745e7        jdk1.8                                              "/bin/bash"              8 hours ago         Exited (255) 7 hours ago                                                                                                                                 myjdk8
 fa5af31a212d        registry                                            "/entrypoint.sh /etc…"   33 hours ago        Up 7 hours                    0.0.0.0:5000->5000/tcp                                                                                                     registry
 ffb026a4e761        rabbitmq                                            "docker-entrypoint.s…"   2 days ago          Up 2 hours                    0.0.0.0:4369->4369/tcp, 0.0.0.0:5671-5672->5671-5672/tcp, 0.0.0.0:15671-15672->15671-15672/tcp, 0.0.0.0:25672->25672/tcp   my_rabbitmq
 e7c6f6a62c46        mongo                                               "docker-entrypoint.s…"   7 days ago          Exited (0) 32 hours ago                                                                                                                                  app_mongo
 1e537ad31d9f        mysql                                               "docker-entrypoint.s…"   7 days ago          Up 2 hours                    0.0.0.0:3306->3306/tcp, 33060/tcp                                                                                          app_mysql
 [root@VM_0_9_centos ~]# 

还有几个服务没开。一个应用容器大约4 5百兆左右。redis mongo也没开。
还剩150M不到。一台只能玩玩，吃不消。本来也是分布式的部署。

# 例子
1. 测试服务发现
http://122.51.43.155:6688/
目前能看到gateway 和 user
2. 测试用户登录
POST ： 122.51.43.155:8686/user/user
body:选择raw和application/json
>{
  "mobile": "234526365",
 "password": "123"
}
>返回
>{
     "flag": true,
     "code": 20000,
     "message": "登录成功",
     "data": {
         "roles": "app-user",
         "token": "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiIxMjI2MzgyMTU0OTc2NTk1OTY4Iiwic3ViIjoiMjM0NTI2MzY1IiwiaWF0IjoxNTgxNTk1Njk0LCJyb2xlcyI6ImFwcC11c2VyIiwiZXhwIjoxNTgxNTk5Mjk0fQ.0Tp3tD5HvzdulIFlQ4zgbiw-UF4pL0vSCLl_BUq_lgA"
     }
 }
然后就可以拿着token去访问其他链接
3. 不带token直接GET
122.51.43.155:8686/user/user
返回权限不足





