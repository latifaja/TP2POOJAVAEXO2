public abstract class Employe {
    private String nom;
    private String  prenom;
    private String email;
    private String telephone;
    private double salaire;

    public Employe(String nom, String prenom, String email, String telephone, double salaire) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.salaire = salaire;
    }

    public Employe() {

    }

    public double getSalaire() {
        return salaire;
    }

    public  abstract double calculerSalire();
}
