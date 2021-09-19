<!-- START doctoc generated TOC please keep comment here to allow auto update -->
<!-- DON'T EDIT THIS SECTION, INSTEAD RE-RUN doctoc TO UPDATE -->
**Table of Contents**  *generated with [DocToc](https://github.com/thlorenz/doctoc)*

- [分布式基础&环境搭建](#%E5%88%86%E5%B8%83%E5%BC%8F%E5%9F%BA%E7%A1%80%E7%8E%AF%E5%A2%83%E6%90%AD%E5%BB%BA)
  - [环境搭建](#%E7%8E%AF%E5%A2%83%E6%90%AD%E5%BB%BA)
    - [centos docker安装](#centos-docker%E5%AE%89%E8%A3%85)
    - [启动docker](#%E5%90%AF%E5%8A%A8docker)
    - [docker 安装mysql](#docker-%E5%AE%89%E8%A3%85mysql)
    - [docker 进入容器交互页面](#docker-%E8%BF%9B%E5%85%A5%E5%AE%B9%E5%99%A8%E4%BA%A4%E4%BA%92%E9%A1%B5%E9%9D%A2)
    - [docker 安装redis](#docker-%E5%AE%89%E8%A3%85redis)

<!-- END doctoc generated TOC please keep comment here to allow auto update -->

# 分布式基础&环境搭建

## 环境搭建

### centos docker安装

https://www.runoob.com/docker/centos-docker-install.html

### 启动docker

```
sudo systemctl start docker
```

### docker 安装mysql

https://www.runoob.com/docker/docker-install-mysql.html

```shell
docker pull mysql:5.7

docker run -p 3306:3306 --name mysql \
-v /mydata/mysql/log:/var/log/mysql \
-v /mydata/mysql/data:/var/lib/mysq \
-v /mydata/mysql/conf:/etc/mysql \
-e MYSQL_ROOT_PASSWORD=longbiu \
-d mysql:5.7
```

### docker 进入容器交互页面

```shell
docker exec -it container_id||names

docker exec -it mysql /bin/bash
```

### docker 安装redis

1. 下载镜像文件

   ```shell
   docker pull redis
   ```

2. 创建实例并启动

   ```
   mkdir -p /mydata/redis/conf
   
   touch /mydata/redis/conf/redis.conf
   
   docker run -p 6379:6379 --name redis -v /mydata/redis/data:/data \
   -v/mydata/redis/conf/redis.conf:/etc/redis/redis.conf \
   -d redis redis-server /etc/redis/redis.conf
   ```

3. 使用redis镜像执行redis-cli命令连接

   ```shell
   docker exec -it redis redis-cli
   ```

   

