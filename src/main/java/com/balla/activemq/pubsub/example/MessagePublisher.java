/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.balla.activemq.pubsub.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;

/**
 *
 * @author sagar
 */
public class MessagePublisher {

    @Autowired
    private JmsTemplate jmsTemplate;

    public void sendMessage(final String message) {
        jmsTemplate.convertAndSend(message);
    }
}
