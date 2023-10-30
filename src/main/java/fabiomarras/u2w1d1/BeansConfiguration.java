package fabiomarras.u2w1d1;

import fabiomarras.u2w1d1.entities.Pizzas;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfiguration {
    @Bean
    Pizzas getPizzaIMargherita() {
        return new Pizzas("Margherita", "Tomato, cheese");
    }
    @Bean
    Pizzas getPizzaHawaiian() {
        return new Pizzas("Hawaiian", "Tomato, cheese, ham, pineaaple");
    }
    @Bean
    Pizzas getPizzaSalami() {
        return new Pizzas("Salami", "Tomato, cheese, Salami");
    }

}
