package drugstore;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        Component water = new Water("Water", 10d, 1);
        Component azitronit = new Azitronite("Azitronit", 2d, 14);
        Component penicillin = new Penicillin("Penicillin", 1.6d, 6);

        Pharmacy2 p1 = new Pharmacy2();
        p1.addComponents(water, azitronit);

        Pharmacy2 p2 = new Pharmacy2();
        p2.addComponents(azitronit, penicillin);

        Pharmacy2 p3 = new Pharmacy2();
        p3.addComponents(water, penicillin);

        List<Component> components = new ArrayList<>();

        components.add(azitronit);
        components.add(water);
        components.add(penicillin);
        System.out.println(components);

        Collections.sort(components, Comparator.reverseOrder());
        System.out.println(components);
    }
}
