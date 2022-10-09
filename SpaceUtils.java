package SpaceSystem;

/**
 * Создать утилитный класс* SpaceUtils со следующими статическими методами:
 * - Принимающий 2 космический объекта и определяющий силу гравитации между ними (можно придумать любую
 * формула на основании расстоянии между объектами и т.д.)
 * - Принимающий космический объект и определяющий, является ли он звездой или нет
 */
public final class SpaceUtils {
    private static final double CONSTANT = 6.67;
    private static final int DISTANCE = 1_000_000_000;

    private static final int CONSTANT_2 = 2;

    private SpaceUtils() {
    }

    public static boolean isStar(SpaceJam object) {
        return object instanceof Star;
    }

    public static double findGravityForce(SpaceJam object, SpaceJam object2) {
        return (CONSTANT * object.getWeight() * object2.getWeight() * DISTANCE) / CONSTANT_2;
    }

}
