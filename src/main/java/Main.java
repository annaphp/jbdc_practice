import model.Quote;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import repo.QuoteRepository;
import config.AppConfig;



public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);		
		
		Quote q = new Quote("Hello world", "John");
		QuoteRepository qr = context.getBean("qrepository",QuoteRepository.class);
		qr.addMessage(q);
		
		
		System.out.println(qr.findAll().size());
		
		System.out.println(context.getBeanDefinitionCount());
		for(String beanName: context.getBeanDefinitionNames())
			System.out.println(beanName);
		
		
	}

}
