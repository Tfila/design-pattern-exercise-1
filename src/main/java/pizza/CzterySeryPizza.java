package pizza;

import java.util.List;

public class CzterySeryPizza extends Pizza {

    public CzterySeryPizza(double cost, List<String> components) {
        super(cost, components);
    }

    public void showPizzaInfo(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "CzterySeryPizza{" +
                "cost=" + cost +
                ", components=" + components +
                '}';
    }
}
