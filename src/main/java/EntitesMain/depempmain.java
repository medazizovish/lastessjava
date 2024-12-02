package EntitesMain;

public class depempmain {

        public static void main(String[] args) {
            SocieteArrayList societe = new SocieteArrayList();

            Employee e1 = new Employee(1, "Hamami", "Eya", "IT", 5);
            Employee e2 = new Employee(2, "Ben Ali", "Ahmed", "Finance", 3);
            Employee e3 = new Employee(3, "Trabelsi", "Fatma", "IT", 4);

            societe.ajouterEmploye(e1);
            societe.ajouterEmploye(e2);
            societe.ajouterEmploye(e3);

            System.out.println("Affichage des employés :");
            societe.displayEmploye();

            System.out.println("\nRecherche par nom (Hamami) : " + societe.rechercherEmploye("Hamami"));
            System.out.println("Recherche par employé e1 : " + societe.rechercherEmploye(e1));

            System.out.println("\nTri par ID :");
            societe.trierEmployeParId();
            societe.displayEmploye();

            System.out.println("\nTri par département et grade :");
            societe.trierEmployeParNomDépartementEtGrade();
            societe.displayEmploye();
            DepartementHashSet gestionDepartements = new DepartementHashSet();

            Departement d1 = new Departement(1, "IT", 10);
            Departement d2 = new Departement(2, "Finance", 15);
            Departement d3 = new Departement(3, "HR", 5);

            gestionDepartements.ajouterDepartement(d1);
            gestionDepartements.ajouterDepartement(d2);
            gestionDepartements.ajouterDepartement(d3);

            System.out.println("Liste des départements :");
            gestionDepartements.afficherDepartements();

            System.out.println("\nRecherche par nom (Finance) : " + gestionDepartements.rechercherDepartement("Finance"));
            System.out.println("Recherche par département d1 : " + gestionDepartements.rechercherDepartement(d1));

            gestionDepartements.supprimerDepartement(d3);

            System.out.println("\nListe des départements après suppression de HR :");
            gestionDepartements.afficherDepartements();

            AffectationHashMap map = new AffectationHashMap();
            map.ajouterEmployeDepartement(e1,d1);
            map.afficherEmployesEtDepartements();
        }
    }


