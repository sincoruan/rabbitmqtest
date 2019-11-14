package com.edu.rabbitmqtest;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QueConfig {
    /**
     * 创建队列
     * @return
     */
    @Bean
    public Queue createQueue(){
        return new Queue("myfirstque");
    }
}
