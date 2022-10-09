package SpaceSystem;

import java.util.Arrays;

public class SpaceRunner {

    public static void main(String[] args) {
        SpaceJam asteroid = new Asteroid("Asteroid", 1500, 100_000_000);
        SpaceJam comet = new Comet("Comet", 2000, 100_000_000);
        SpaceJam planet = new Planet("Earth", 7000, 120_000_000, 760_000_000);
        SpaceJam satellite = new Satellite("Belarus", 2, 12, "Minsk");
        SpaceJam star = new Star("Sun", 5000, 1_000_000_000, "Red");

        overrideAllMethod(asteroid, comet, planet, satellite, star);

        double gravityForce = SpaceUtils.findGravityForce(asteroid, star);
        System.out.println("Сила гравитации между объектами = " + gravityForce);
        System.out.println();
        System.out.println("Является ли объект звездой? - " + SpaceUtils.isStar(star));
        System.out.println();
        //  если сравнивать по отдельности System.out.println("Сравнение масс двух объектов: " + star.isWeightEqual(comet));
        System.out.println();


    }


    public static void overrideAllMethod(SpaceJam asteroid, SpaceJam... spaceJams) {
        for (SpaceJam spaceJam : spaceJams) {
            spaceJam.nameOfTheObject();
            System.out.println("Переопределение метода toString() - " + spaceJam.toString());
            System.out.println("Диаметр объекта: " + spaceJam.countDiametr());
            System.out.println("Сравнение масс двух объектов: " + asteroid.getName() + " и " + spaceJam.getName() + ": " + asteroid.isWeightEqual(spaceJam));
            System.out.println();


        }
    }
}
