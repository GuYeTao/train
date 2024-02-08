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

### RocketMQ启动及环境配置

本机环境为java17，给RocketMQ 4.9.5单独手动配置java8。修改runserver.cmd、runbroker.cmd、mqshutdown.cmd和tools.cmd都添加

    set JAVA_HOME=D:\Software\RocketMQ\rocketmq-all-4.9.5-bin-release\jdk1.8.0_341
    set PATH=%JAVA_HOME%\bin;%PATH%

启动命令(在RocketMQ\rocketmq-all-4.9.5-bin-release\bin):

    start mqnamesrv.cmd
    start mqbroker.cmd -n 127.0.0.1:9876

测试发送接收：

    start tools.cmd org.apache.rocketmq.example.quickstart.Producer
    start tools.cmd org.apache.rocketmq.example.quickstart.Consumer

关闭命令：

    mqshutdown broker
    mqshutdown namesrv