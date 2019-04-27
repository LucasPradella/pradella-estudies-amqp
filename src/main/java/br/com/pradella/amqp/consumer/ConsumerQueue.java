package br.com.pradella.amqp.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class ConsumerQueue {
	
	
	@RabbitListener(queues = "${queue.test.name}")
	public void recievedMessage(String msg) {
		System.out.println("Recebendo mensagem -> " + msg);
	}

}
