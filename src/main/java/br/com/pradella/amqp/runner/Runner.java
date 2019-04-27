package br.com.pradella.amqp.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

import br.com.pradella.amqp.producer.SendQueue;

@Configuration
public class Runner implements ApplicationRunner {

	@Autowired
	private SendQueue sendQueue;
	
	
    public void run(ApplicationArguments applicationArguments) throws Exception {
        System.out.println( "START Application Runner" );
        sendQueue.send("Teste usando mensageria");
        System.out.println( "END Application Runner" );
    }
}
