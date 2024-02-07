package drugstore;

import drugstore.components.Azitronite;
import drugstore.components.Penicillin;
import drugstore.components.Water;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Component water = new Water("Water", 10d, 1);
        Component azitronit = new Azitronite("Azitronit", 2d, 14);
        Component penicillin = new Penicillin("Penicillin", 1.6d, 6);


        Pharmacy p1 = new Pharmacy();
        p1.addComponents(water, azitronit);

        Pharmacy p2 = new Pharmacy();
        p2.addComponents(azitronit, penicillin);

        Pharmacy p3 = new Pharmacy();
        p3.addComponents(water, penicillin);

        List<Component> components = new ArrayList<>();

        components.add(azitronit);
        components.add(water);
        components.add(penicillin);
        System.out.println(components);

        Collections.sort(components, Comparator.reverseOrder());
        System.out.println(components);

        List<Pharmacy> pharmacys = new ArrayList<>();
        pharmacys.add(p1);
        pharmacys.add(p2);
        pharmacys.add(p3);

        System.out.println(pharmacys);

        Collections.sort(pharmacys);
        System.out.println(pharmacys);

        Collections.sort(pharmacys, (o , s) -> Double.compare(o.getWeight(), s.getWeight()));
        System.out.println(pharmacys);
    }
}
