package fabiomarras.u2w1d1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
@Getter
@Setter
@ToString
public class Pizzas {
    private String name;
    private String ingredients;
    private int calories;
    private double price;
    private List<Toppings> toppings;

    public Pizzas(String name, String ingredients, int calories, double price, List<Toppings> toppings) {
        this.name = name;
        this.ingredients = ingredients;
        this.calories = calories;
        this.price = price;
        this.toppings = toppings;
    }
}
