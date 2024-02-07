package drugstore;

public abstract class Component implements Comparable<Component>{
    private String title;
    private Double weight;
    private int power;

    public Component(String title, Double weight, int power) {
        this.title = title;
        this.weight = weight;
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public Double getWeight() {
        return weight;
    }

    @Override
    public String toString(){
        return String.format("Title = %s, weight = %s, power = %s", title, weight, power);
    }

    @Override
    public int compareTo(Component o) {
//        return this.power - o.power;
        return Integer.compare(this.power, o.power);
//        if (this.power<o.power){
//            return -1;
//        }
//        else if (this.power>o.power){
//            return 1;
//        }
//        else return 0;
    }
}
