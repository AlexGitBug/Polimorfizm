package SpaceSystem;

public class Comet extends SpaceJam {

    private int tailLength = 5000;

    public Comet(String name, long radius, long weight) {
        super(name, radius, weight);
    }

    @Override
    public void nameOfTheObject() {
        System.out.println("Описываемый объект: комета");
        fillTailLength();
    }

    private void fillTailLength() {
        System.out.println("Длина хвоста кометы = " + getTailLength());
    }

    @Override
    public String toString() {
        return "Название = " + getName() + ", " + "радиус = " + getRadius() + ", " + "масса = " + getWeight();
    }

    public int getTailLength() {
        return tailLength;
    }

}
