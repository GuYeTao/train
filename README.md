# train
仿12306

### 启动准备：

    redis  -->  redis-server.exe
    nacos  -->  bin\startup.cmd
    seata  -->  bin\seata-server.bat

### 项目启动：
    
Spring Boot服务启动：

    GatewayApplication
    BatchApplication
    BusinessApplication
    MemberApplication

Vue启动：
    
    admin
    web

### sentinel启动命令

    java -Dserver.port=18080 -Dcsp.sentinel.dashboard.server=localhost:18080 -Dproject.name=sentinel-dashboard -jar sentinel-dashboard-1.8.6.jar