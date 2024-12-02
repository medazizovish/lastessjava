package EntitesMain;

import java.util.Objects;

public class Departement {
    private int id;
    private String nomDepartement;
    private int nbrEmployees;
    public Departement(int id, String nomDepartement, int nbrEmployees) {
        this.id = id;
        this.nomDepartement = nomDepartement;
        this.nbrEmployees = nbrEmployees;

    }
    public Departement(){}
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNomDepartement() {
        return nomDepartement;
    }
    public void setNomDepartement(String nomDepartement) {
        this.nomDepartement = nomDepartement;
    }
    public int getNbrEmployees() {
        return nbrEmployees;
    }
    public void setNbrEmployees(int nbrEmployees) {
        this.nbrEmployees = nbrEmployees;

    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Departement dep = (Departement) obj;
        return id == dep.id && nomDepartement.equals(dep.getNomDepartement());
    }
    public int hashCode() {
        return Objects.hash(id, nomDepartement.toLowerCase());
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nomDepartement='" + nomDepartement + '\'' +
                ", nbrEmployees=" + nbrEmployees +
                '}';
    }
}
