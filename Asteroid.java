package SpaceSystem;

public class Asteroid extends SpaceJam {


    public Asteroid(String name, long radius, long weight) {
        super(name, radius, weight);
    }

    @Override
    public void nameOfTheObject() {
        System.out.println("Описываемый объект: астрейод");
    }

    @Override
    public String toString() {
        return "Название = " + getName() + ", " + "радиус = " + getRadius() + ", " + "масса = " + getWeight();
    }
}
