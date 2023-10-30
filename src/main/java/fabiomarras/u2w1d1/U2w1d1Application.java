package fabiomarras.u2w1d1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U2w1d1Application {

	public static void main(String[] args) {
		SpringApplication.run(U2w1d1Application.class, args);
	}

	public static void configurationClass() {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(U2w1d1Application.class);
		System.out.println(ctx.getBean("getPizza"));
		ctx.close();
	}

}
