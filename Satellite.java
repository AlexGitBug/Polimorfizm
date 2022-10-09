package SpaceSystem;

public class Satellite extends SpaceJam implements Comparable {

    private String production;

    public Satellite(String name, long radius, long weight, String production) {
        super(name, radius, weight);
        this.production = production;
    }

    @Override
    public void nameOfTheObject() {
        System.out.println("Описываемый объект: спутник");
    }

    @Override
    public String toString() {
        return "Название = " + getName() + ", " + "радиус = " + getRadius() + ", " + "масса = " + getWeight() + ", " + "Страна происхожения = " + getProduction();
    }

    public String getProduction() {
        return production;
    }

}
