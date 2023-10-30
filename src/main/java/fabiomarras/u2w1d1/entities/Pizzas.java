package fabiomarras.u2w1d1.entities;

public class Pizzas implements PizzaStandard{
    private String name;
    @Override
    public void getPizza(){
        System.out.println("Pizza with ham and pineapple");
    }
}
