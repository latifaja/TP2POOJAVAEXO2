public  class Ingénieur extends Employe{
    private String specialite;

    public Ingénieur(String nom, String prenom, String email, String telephone, double salaire, String specialite) {
        super(nom, prenom, email, telephone, salaire);
        this.specialite = specialite;
    }



    public  double calculerSalire(){
        double z = super.getSalaire()+0.15*super.getSalaire();
        return z;
    }


}
