package GestionPaie;

public class Main {
    public static void main(String[] args) {
        Entreprise entreprise = new Entreprise();
        entreprise.ajouterEmploye(new EmployeSalarie("Dupont", "Jean", 2500));
        entreprise.ajouterEmploye(new EmployeHoraire("Martin", "Claire", 20, 160));
        entreprise.afficherPaie();
    }
}
