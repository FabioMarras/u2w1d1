package fabiomarras.u2w1d1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfiguration {
    @Bean
    String getPizza() {
        return "Tomato, cheese";
    }
}
