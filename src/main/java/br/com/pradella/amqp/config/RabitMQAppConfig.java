package br.com.pradella.amqp.config;


import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabitMQAppConfig {
	 
	    @Value("${queue.test.name}")
	    private String testeQueue;
	    
	    @Value("${queue.test.exchange}")
	    private String testeQueueExchange;

	 
	    @Bean
	    public Queue queue() {
	        return new Queue(testeQueue, true);
	    }
	    
}