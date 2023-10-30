package fabiomarras.u2w1d1.entities;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
public class Pizzas {
    private String name;
    private String ingredients;

    public Pizzas(String name, String ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }
}
