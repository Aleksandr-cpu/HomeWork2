package drugstore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pharmacy2 implements Iterable<Component> {
    private List<Component> components = new ArrayList<>();
    private int index = 0;

    public void addComponents(Component ... copmonents){
        for (Component c : copmonents){
            this.components.add(c);
        }
    }

//    @Override
//    public boolean hasNext() {
//        return index<components.size();
//    }
//
//    @Override
//    public Component next() {
//        return components.get(index++);
//    }

    @Override
    public Iterator<Component> iterator() {
        return new Iterator<Component>() { // анонимный класс
            @Override
            public boolean hasNext() {
                return index<components.size();
            }

            @Override
            public Component next() {
                return components.get(index++);
            }
        };
    }
}
