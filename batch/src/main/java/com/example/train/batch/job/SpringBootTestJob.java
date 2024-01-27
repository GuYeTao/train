package com.example.train.batch.job;


import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

//spring自带定时任务适合单体任务，不适合集群（多模块会多次执行，虽然可以用分布式锁解决，但无法实时更改定时任务状态和策略）
@Component
@EnableScheduling
public class SpringBootTestJob {

    @Scheduled(cron = "0/5 * * * * ?")
    private void test(){
        System.out.println("testJob");
    }

}
