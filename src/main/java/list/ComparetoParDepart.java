package list;

import EntitesMain.Employee;

import java.util.Comparator;

public class ComparetoParDepart implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return e1.getNomDep().compareTo(e2.getNomDep());
    }
}
