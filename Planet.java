package SpaceSystem;

public class Planet extends SpaceJam {

    private long countPeople;

    public Planet(String name, long radius, long weight, int countPeople) {
        super(name, radius, weight);
        this.countPeople = countPeople;
    }

    @Override
    public void nameOfTheObject() {
        System.out.println("Описываемый объект: планета");
        countOfThePeople();
    }

    private void countOfThePeople() {
        System.out.println("Численность людей " + getCountPeople());
    }

    @Override
    public String toString() {
        return "Название = " + getName() + ", " + "радиус = " + getRadius() + ", " + "масса = " + getWeight();
    }

    public long getCountPeople() {
        return countPeople;
    }

}
