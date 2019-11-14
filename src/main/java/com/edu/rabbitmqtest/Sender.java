package com.edu.rabbitmqtest;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Sender {
    @Autowired
    AmqpTemplate amqpTemplate;

    void send(String msg){
        //param1:name of the queue
        //param2:message
        amqpTemplate.convertAndSend("que1",msg);
    }
}
