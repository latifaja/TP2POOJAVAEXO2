public class Manager  extends Employe{
    private String service;

    public Manager(String nom, String prenom, String email, String telephone, double salaire, String service) {
        super(nom, prenom, email, telephone, salaire);
        this.service = service;
    }

    public  double calculerSalire(){
        double z = super.getSalaire()+0.2*super.getSalaire();
        return z;
    }

}
