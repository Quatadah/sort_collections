import src.Intern;
import src.Manager;

public class Main {
    public static void main(String args[]){
        Intern i1 = new Intern("Quatadah", "Nasdami");
        Intern i2 = new Intern("Chihab", "Layadi");
        Intern i3 = new Intern("Ali", "Bennis");
        Intern i4 = new Intern("Yasser", "Saadaoui");

        Manager interns = new Manager();
        interns.addIntern(i1);
        interns.addIntern(i2);
        interns.addIntern(i3);
        interns.addIntern(i4);

        System.out.println("Before sorting : ");
        interns.showInterns();

        interns.orderInterns();

        System.out.println("After sorting : ");
        interns.showInterns();
    }
}
