//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//Employe employe= new Employe("aze","rty","ausii@gmail.com","0777777777777",233) ;

Ingénieur ing = new Ingénieur("adam","ad","hdj@g.com","0999999999",322,"inf");


Manager man=new Manager("qsd","fgh","nnnn@hh","0303300",222,"compta");
System.out.println("le noveau salaire de l ing est "+ ing.calculerSalire());
        System.out.println("le noveau salaire de manager est "+ man.calculerSalire());

    }
}