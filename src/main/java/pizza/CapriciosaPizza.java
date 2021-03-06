package pizza;

import java.util.Arrays;
import java.util.List;

public class CapriciosaPizza extends Pizza {

    public CapriciosaPizza(double cost,List<String> components) {
        super(cost,components);

    }

    public void showPizzaInfo(){
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "CapriciosaPizza{" +
                "cost=" + cost +
                ", components=" + components +
                '}';
    }
}
