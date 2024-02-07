package drugstore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pharmacy implements Iterable<Component>, Comparable<Pharmacy> {
    private List<Component> components = new ArrayList<>();

    private int index = 0;

    public List<Component> getComponents() {
        return components;
    }

    public int getPower() {
        int thisPower = 0;
        for (Component c : components) {
            thisPower += c.getPower();
        }
        return thisPower;
    }

    public Double getWeight() {
        Double thisWeight = 0d;
        for (Component c : components) {
            thisWeight += c.getWeight();
        }
        return thisWeight;
    }

    public void addComponents(Component... copmonents) {
        for (Component c : copmonents) {
            this.components.add(c);
        }
    }

    @Override
    public String toString() {
        return "Pharmacy{" +
                "Power" + ' ' + getPower() + ',' + "Weight" + ' ' + getWeight() +
                '}';
    }

    @Override
    public Iterator<Component> iterator() {
        return new Iterator<Component>() { // анонимный класс
            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public Component next() {
                return components.get(index++);
            }
        };
    }

    @Override
    public int compareTo(Pharmacy that) {
        return Integer.compare(this.getPower(), that.getPower());
    }
}
