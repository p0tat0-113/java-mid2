package generic.re1.test.starcraft;

import java.util.ArrayList;
import java.util.List;

public class Shuttle<T extends BioUnit> {
    private List<T> list = new ArrayList<>();

    public void in(T unit){
        list.add(unit);
    }

    public List<T> out(){
        return list;
    }

    public void showInfo(){
        for (T unit : list) {
            System.out.println(unit);
        }
    }
}
