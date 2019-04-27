package br.com.pradella.amqp.producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.pradella.amqp.config.RabitMQAppConfig;

@Component
public class SendQueue {

	    @Autowired
	    private RabbitTemplate rabbitTemplate;
	 
	    @Autowired
	    private RabitMQAppConfig queue;
	 
	    public void send(String order) {
	        rabbitTemplate.convertAndSend(this.queue.queue().getName() , order);
	    }
}
