# Spring Boot + Maven Web 后端模板

## 技术栈
- Spring Boot 3.2.4
- Java 17
- MyBatis-Plus 3.5.14
- Springdoc OpenAPI (Swagger)
- Logback

## 启动
```bash
mvn spring-boot:run
```

## 多环境
- dev：控制台日志
- test/pro：文件日志（`logs/application.log`）

切换环境：
```bash
mvn spring-boot:run -Dspring-boot.run.profiles=test
```

## 接口文档
- Swagger UI: `http://localhost:8080/swagger-ui.html`
- OpenAPI: `http://localhost:8080/v3/api-docs`
