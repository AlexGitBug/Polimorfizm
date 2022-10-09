package SpaceSystem;

public interface Comparable {

    default boolean isWeightEqual(SpaceJam object) {
        return getWeight() == object.getWeight();
    }

    long getWeight();

}
