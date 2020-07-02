package HealthyHeaven_100;

import java.util.ArrayList;
import java.util.List;

public class Salad {
    private String name;
    private List<Vegetable> products;

    public Salad(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public int getTotalCalories (){
        int totalCalories = 0;
        for (Vegetable product : products) {
            totalCalories += product.getCalories();
        }
        return totalCalories;
    }
    public int getProductCount(){
        return this.products.size();
    }
    public void add(Vegetable product){
        this.products.add(product);
    }

    @Override
    public String toString() {
        String result = "";
        result += String.format("* Salad %s is %d calories and have %d products:%n",this.name,
              this.getTotalCalories(),this.getProductCount());
        for (Vegetable product : products) {
            result += product.toString() + System.lineSeparator();
        }
        return result.trim();
    }
}
