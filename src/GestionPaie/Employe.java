package GestionPaie;

public abstract class Employe {
    private String nom;
    private String prenom;

    public Employe(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public abstract double calculerSalaire();

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }
}
