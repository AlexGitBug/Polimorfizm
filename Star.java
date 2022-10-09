package SpaceSystem;

public class Star extends SpaceJam {

    private String colour;

    public Star(String name, long radius, long weight, String colour) {
        super(name, radius, weight);
        this.colour = colour;
    }

    @Override
    public void nameOfTheObject() {
        System.out.println("Описываемый объект: звезда");
        colourOfTheStar();
    }

    @Override
    public String toString() {
        return "Название= " + getName() + ", " + "радиус = " + getRadius() + ", " + "масса " + getWeight();
    }

    private void colourOfTheStar() {
        System.out.println("Цвет звезды - " + getColour());
    }

    public String getColour() {
        return colour;
    }


}
