package list;

import EntitesMain.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SocieteArrayList implements IGestion<Employee> {
    private List<Employee> employes= new ArrayList<>();



    @Override
    public void ajouterEmploye(Employee employe) {
        employes.add(employe);
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (int i = 0; i < employes.size(); i++) {
            if (employes.get(i).getNom().equals(nom)) {
                return true;
            }
            }

        return false;
    }

    @Override
    public boolean rechercherEmploye(Employee employe) {
        return employes.contains(employe);
    }

    @Override
    public void supprimerEmploye(Employee employe) {
        employes.remove(employe);
    }

    @Override
    public void displayEmploye() {
        System.out.println(employes);
    }

    @Override
    public void trierEmployeParId() {
        Collections.sort(employes);
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Collections.sort(employes, new ComparetoParDepart().thenComparing(new CompartorParGrade()));
    }
}
