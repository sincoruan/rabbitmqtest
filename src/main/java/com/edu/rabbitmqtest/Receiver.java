package com.edu.rabbitmqtest;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {
    @RabbitListener(queues = "myfirstque")
    public void process(String msg){
        System.out.println(msg);
    }
}
