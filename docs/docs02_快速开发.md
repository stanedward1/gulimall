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

3. fa

