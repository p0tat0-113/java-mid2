package generic.re1.test.starcraft;

import java.util.List;

public class UnitPrinter {

    public static <T extends BioUnit> void printV1(Shuttle<T> shuttle){
        List<T> list = shuttle.out();
        for (T unit : list) {
            System.out.println(unit);
        }
    }

    public static void printV2(Shuttle<? extends BioUnit> shuttle){
        List<? extends BioUnit> list = shuttle.out();
        for (BioUnit bioUnit : list) {
            System.out.println(bioUnit);
        }
    }
}
