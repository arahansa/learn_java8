package effectivejava.chap6_enum;

/**
 * Created by jarvis on 16. 4. 10..
 */
public class WeightTable {

    public static void main(String[] args) {
        double earthWeight = Double.parseDouble("175");
        double mass = earthWeight / Planet.EARTH.surfaceGravity();
        for(Planet p : Planet.values()) {
            System.out.printf("Weight on %s is %f %n", p, p.surfaceWeight(mass));
        }

    }
}
