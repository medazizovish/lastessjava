package set;

import EntitesMain.Departement;
import list.DepartById;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<Departement> {
    private Set<Departement> departements;

    public DepartementHashSet() {
        this.departements = new HashSet<>();
    }

    @Override
    public void ajouterDepartement(Departement departement) {
        departements.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nomDepartement) {
       // Iterator<Departement> it = departements.iterator();
//        while (it.hasNext()) {
//            Departement d = it.next();
//            if (d.getNom().equals(nom))
//                return true;
//        }

        for (Departement d : departements) {
            if (d.getNomDepartement().equals(nomDepartement))
                return true;
        }

        return false;
    }


    @Override
    public boolean rechercherDepartement(Departement departement) {
        return departements.contains(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        departements.remove(departement);
    }

    @Override
    public void afficherDepartements() {
        System.out.println(departements);
    }
    public TreeSet<Departement> tirerDepartementsParid() {
        TreeSet<Departement> D = new TreeSet<>(new DepartById());
        D.addAll(departements);
        return D;
    }
}

