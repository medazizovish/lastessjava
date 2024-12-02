package list;

import EntitesMain.Departement;

import java.util.Comparator;

public class DepartById implements Comparator<Departement> {
    public int compare(Departement d1, Departement d2) {
        return d1.getId()-d2.getId();
    }
}
