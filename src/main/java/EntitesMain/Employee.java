package EntitesMain;

public class Employee implements Comparable<Employee>{
    private Integer id;
    private String nom;
    private String prenom;
    private String nomDep;
    private int grade;
    public Employee() {}
    public Employee(int id, String nom, String prenom, String nomDep, int grade) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.nomDep = nomDep;
        this.grade = grade;

    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getNomDep() {
        return nomDep;
    }
    public void setNomDep(String nomDep) {
        this.nomDep = nomDep;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Employee employe = (Employee) obj;
        return id == employe.id && nom.equals(employe.nom);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", nomDep='" + nomDep + '\'' +
                ", grade=" + grade +
                '}';
    }
    public boolean equals(Employee employee) {
        return this.id == employee.id;
    }
    public int compareTo(Employee employee) {
        return this.id.compareTo(employee.id);
    }
}
