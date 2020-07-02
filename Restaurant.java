package HealthyHeaven_100;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String name;
    private List<Salad> data;

    public Restaurant(String name) {
        this.name = name;
        this.data = new ArrayList<>();
    }
    public void add(Salad salad){
        this.data.add(salad);
    }
    public boolean buy(String name){
        boolean isBought = false;
        for (Salad salad : data) {
            if (salad.getName().equals(name)){
                data.remove(salad);
                isBought = true;
                break;
            }
        }
        return isBought;
    }

        public Salad getHealthiestSalad(){
        Salad salad = null;
        int value = Integer.MAX_VALUE;

        for (Salad current : data) {
        if(current.getTotalCalories()<value){
            salad = current;
        }
        }
        return salad;
}


    public String generateMenu(){
        String result = "";
        result += String.format("%s have %d salads:",this.name,this.data.size())+System.lineSeparator();
        for (Salad salad : data) {
            result += salad.toString()+System.lineSeparator();
        }
        return result.trim();
    }

}
