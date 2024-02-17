# springboot微服务如何集成监控信息

1. `Spring Boot Actuator`  包含许多附加功能特性，可在应用程序投入生产时通过使用HTTP端点来监控和管理应用程序 。审计信息、应用状态信息和指标采集信息可以自动被加载到应用程序中。
2. `spring-boot-actuator`  模块提供了可用于生产的功能特性。启用这些功能特性的推荐方法是在pom.xml中添加对 spring-boot-starter-actuator的依赖项
3.  Actuator 端点允许监视应用程序并与应用程序交互。 Spring Boot 包含许多内置端点，也可以添加自己的端点。例如，健康端点提供基本的应用程序健康信息。
4. `spring-boot-actuator` 虽然可以采集相关指标信息，但是并未对接Prometheus。这时就需要对接 Micrometer将采集的指标以Promethues能识别的格式进行暴露

---
 更多使用请参考: https://www.yuque.com/hufei85/le9oup/odoi234tukmv49yk