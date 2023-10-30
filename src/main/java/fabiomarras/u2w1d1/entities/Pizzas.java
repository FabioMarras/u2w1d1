package fabiomarras.u2w1d1.entities;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
public class Pizzas implements PizzaStandard{
    private String name;
    private String ingredients;

    public Pizzas(String name, String ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    @Override
    public String getName(){
        return this.name;
    }
    @Override
    public void getPizza(){
        System.out.println("Pizza with: " + ingredients);
    }
}
