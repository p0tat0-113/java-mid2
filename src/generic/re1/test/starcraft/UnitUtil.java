package generic.re1.test.starcraft;

public class UnitUtil {
    public static <T extends BioUnit> T maxHp(T u1, T u2){
        return u1.getHp() > u2.getHp() ? u1 : u2;
    }
}
