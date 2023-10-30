package fabiomarras.u2w1d1.entities;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
public class Drinks {
    private String name;
    private String calories;
    private String price;

    public Drinks(String name, String calories, String price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
    }

}
