package SpaceSystem;

/**

 * - Рассчитывающие диаметр космического объекта
 */
public interface Counterable {

    int CONSTANT = 2;

    default long countDiametr() {
        return getRadius() * CONSTANT;
    }

    long getRadius();

}

