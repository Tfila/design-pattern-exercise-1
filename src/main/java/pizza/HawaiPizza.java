package pizza;

import java.util.Arrays;
import java.util.List;

public class HawaiPizza extends Pizza {

    public HawaiPizza(double cost,List<String> components) {
        super(cost,components);

    }


    public void showPizzaInfo(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "HawaiPizza{" +
                "cost=" + cost +
                ", components=" + components +
                '}';
    }
}
