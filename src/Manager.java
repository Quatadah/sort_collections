package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Manager {
    private List<Intern> interns;

    public Manager(){
        this.interns = new ArrayList<Intern>();
    }

    public boolean addIntern(Intern i){
        return interns.add(i);
    }

    public void showInterns(){
        for (Intern i : interns){
            System.out.print(i.toString());
        }
    }

    public void orderInterns(){
        Collections.sort(interns);
    }
}
