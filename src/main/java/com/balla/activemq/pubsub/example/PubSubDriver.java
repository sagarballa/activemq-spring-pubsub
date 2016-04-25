/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.balla.activemq.pubsub.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author sagar
 */
public class PubSubDriver {

    public static void main(String args[]) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:activemq-jms-spring-context.xml");
        MessagePublisher messagePublisher = (MessagePublisher) applicationContext.getBean("messagePublisher");
        messagePublisher.sendMessage("This is a message that will be posted into Topic Sagar.");
    }
}
