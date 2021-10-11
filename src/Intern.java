package src;

import java.lang.String;

public class Intern implements Comparable<Intern>{
    final private String firstName;
    final private String lastName;

    public Intern(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName(){
        return firstName + lastName;
    }
    
    @Override
    public String toString(){
        return "first name : " + this.firstName +
            " | last name : " + this.lastName + "\n";
    }

    @Override
    public int compareTo(Intern i) {
        if (!this.lastName.equals(i.lastName))
            return this.lastName.compareTo(i.lastName);
        else
            return this.firstName.compareTo(i.firstName);
    }

    
}