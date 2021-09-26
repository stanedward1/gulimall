<!-- START doctoc generated TOC please keep comment here to allow auto update -->
<!-- DON'T EDIT THIS SECTION, INSTEAD RE-RUN doctoc TO UPDATE -->
**Table of Contents**  *generated with [DocToc](https://github.com/thlorenz/doctoc)*

- [快速开发](#%E5%BF%AB%E9%80%9F%E5%BC%80%E5%8F%91)
    - [整合MyBatis-Plus](#%E6%95%B4%E5%90%88mybatis-plus)

<!-- END doctoc generated TOC please keep comment here to allow auto update -->

# 快速开发

### 整合MyBatis-Plus

1. 导入依赖

   ```xml
   <!--mybatis-plus-->
   <dependency>
       <groupId>com.baomidou</groupId>
       <artifactId>mybatis-plus-boot-starter</artifactId>
       <version>3.4.3.3</version>
   </dependency>
   ```

2. 配置

   - 配置数据源

     - 导入数据库的驱动

       ```xml
       <!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
       <dependency>
           <groupId>mysql</groupId>
           <artifactId>mysql-connector-java</artifactId>
           <version>8.0.26</version>
       </dependency>
       ```

     - 导入其他驱动

       ```xml
       <dependency>
           <groupId>javax.servlet</groupId>
           <artifactId>servlet-api</artifactId>
           <version>2.5</version>
           <scope>provided</scope>
       </dependency>
       ```

     - 在application.yml中配置数据源相关信息

       ```yaml
       spring:
         datasource:
           driverClassName: com.mysql.jdbc.Driver
           url: jdbc:mysql://192.168.33.100:3306/gulimall_product?useUnicode=true&characterEncoding=UTF-8&useSSL=false&serverTimezone=Asia/Shanghai
           username: root
           password: longbiu
       ```

   - 配置MyBatis-Plus

     - 使用@MapperScan扫描mapper
     - 告诉MyBatis-Plus，sql映射文件位置
     

