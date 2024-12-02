package map;

import EntitesMain.Departement;
import EntitesMain.Employee;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AffectationHashMap {
    private Map<Employee, Departement> employeeMap = new HashMap<>();

    public void ajouterEmployeDepartement(Employee e, Departement d) {
        employeeMap.put(e, d);


    }

    public void afficherEmployesEtDepartements() {
        for (Map.Entry<Employee, Departement> entry : employeeMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

    public void supprimerEmployee(Employee emp) {
        employeeMap.remove(emp);
    }

    public void supprimerEmployeEtDepartement(Employee e, Departement d) {
        if (employeeMap.containsKey(e) && employeeMap.get(e).equals(d)) {
            employeeMap.remove(e);
        }

    }

    public void afficherEmployes() {
        System.out.println("Liste des employés:");
        for (Employee e : employeeMap.keySet()) {
            System.out.println(e);
        }
    }

    public void afficherDepartements() {
        System.out.println("Liste des départements:");
        for (Departement d : employeeMap.values()) {
            System.out.println(d);
        }
    }

    public boolean rechercherEmploye(Employee e) {
        return employeeMap.containsKey(e);
    }


    public boolean rechercherDepartement(Departement d) {
        return employeeMap.containsValue(d);
    }
    public TreeMap<Employee, Departement> trierMap() {
        return new TreeMap<>(employeeMap);
    }
}

