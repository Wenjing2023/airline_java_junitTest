public enum Plane {

    BOEING747(100, 100000),
    E63(4,200);


    private final int capacity;
    private final int weight;

    Plane (int capacity, int weight){
        this.capacity = capacity;
        this.weight = weight;
    };

    public int getCapacity() {
        return capacity;
    }

    public int getWeight() {
        return weight;
    }

}
