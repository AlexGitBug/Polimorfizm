package SpaceSystem;

/***
 Создать общие методы:
 - Рассчитывающие диаметр космического объекта
 - Сравнивающий массы 2 космических объектов (метод не статический!)
 */


public abstract class SpaceJam implements Redefinitionable, Counterable, Comparable {


    private String name;
    private long radius;
    private long weight;

    public SpaceJam(String name, long radius, long weight) {
        this.name = name;
        this.radius = radius;
        this.weight = weight;
    }

    public abstract void nameOfTheObject();

    public String getName() {
        return name;
    }

    public long getRadius() {
        return radius;
    }

    public long getWeight() {
        return weight;
    }
}
