package list;

import EntitesMain.Employee;

import java.util.Comparator;

public class CompartorParGrade implements Comparator<Employee> {
    @Override
   public int compare(Employee e1, Employee e2) {
    return e1.getGrade() - e2.getGrade();}
}

