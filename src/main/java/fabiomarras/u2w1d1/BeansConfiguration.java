package fabiomarras.u2w1d1;

import fabiomarras.u2w1d1.entities.Drinks;
import fabiomarras.u2w1d1.entities.Menù;
import fabiomarras.u2w1d1.entities.Pizzas;
import fabiomarras.u2w1d1.entities.Toppings;
import lombok.ToString;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

@Configuration
public class BeansConfiguration {
    @Bean
    public Pizzas PizzaIMargherita(List<Toppings> allTopings) {
        List<Toppings> margheritaToppings = Arrays.asList(Cheese(), Tomato());
        return new Pizzas("Margherita", "Tomato, cheese", 1104,4.99, margheritaToppings);
    }

    @Bean
    Pizzas PizzaHawaiian(List<Toppings> allTopings) {
        List<Toppings> HawaiianToppings = Arrays.asList(Cheese(), Tomato(), Ham(), Pineaaple());
        return new Pizzas("Hawaiian", "Tomato, cheese, ham, pineaaple", 1024, 6.49, HawaiianToppings);
    }

    @Bean
    Pizzas PizzaSalami(List<Toppings> allTopings) {
        List<Toppings> SalamiToppings = Arrays.asList(Cheese(), Tomato(), Salami());
        return new Pizzas("Salami", "Tomato, cheese, Salami", 1160, 5.99, SalamiToppings);
    }
    @Bean
    public List<Pizzas> allPizzas(List<Toppings> allTopings) {
        return Arrays.asList(PizzaIMargherita(allTopings), PizzaSalami(allTopings), PizzaHawaiian(allTopings));
    }

    @Bean
    public Drinks lemonade() {
        return new Drinks("Lemonade", "128", "1.29$");
    }

    @Bean
    public Drinks water() {
        return new Drinks("Water", "0", "1.29$");
    }

    @Bean
    public Drinks wine() {
        return new Drinks("Wine", "607", "7.49$");
    }
    @Bean
    public List<Drinks> allDrinks() {
        return Arrays.asList(lemonade(), water(), wine());
    }

    @Bean
    public Toppings Cheese() {
        return new Toppings("Cheese", "92", "0.69$");
    }
    @Bean
    public Toppings Tomato() {
        return new Toppings("Tomato", "50", "0.99$");
    }
    @Bean
    public Toppings Ham() {
        return new Toppings("Ham", "35", "0.99$");
    }
    @Bean
    public Toppings Onions() {
        return new Toppings("Onions", "22", "0.69$");
    }
    @Bean
    public Toppings Pineaaple() {
        return new Toppings("Pineaaple", "24", "0.79$");
    }
    @Bean
    public Toppings Salami() {
        return new Toppings("Salami", "86", "0.99$");
    }
    @Bean
    public List<Toppings> allTopings() {
        return Arrays.asList(Cheese(), Tomato(), Ham(),Onions(), Pineaaple(), Salami());
    }
    @Bean
    public Menù allMenù (List<Pizzas> pizzas, List<Drinks> drinks, List<Toppings> toppings) {
        return new Menù(pizzas, drinks, toppings);
    }
}
