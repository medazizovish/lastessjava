package set;

public interface IDepartement<T> {
    void ajouterDepartement(T t);
    boolean rechercherDepartement(String nomDepartement);
    boolean rechercherDepartement(T t);
    void supprimerDepartement(T t);
    void afficherDepartements();
}
