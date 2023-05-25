package composite;

import java.util.ArrayList;
import java.util.List;

public class Employe {

    private String nom;
    private String dept;
    private String salary;
    private List<Employe> subs = new ArrayList<>();

    public Employe() {}

    public Employe(String nom, String dept, String salary) {
        this.nom = nom;
        this.dept = dept;
        this.salary = salary;
    }

    public Employe add(Employe employe) {
        subs.add(employe);
        return this;
    }

    public void remove(Employe employe) {
        subs.remove(employe);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public List<Employe> getSubs() {
        return subs;
    }

    public void setSubs(List<Employe> subs) {
        this.subs = subs;
    }

    @Override
    public String toString() {
        return "Employe [nom=" + nom + ", dept=" + dept + ", salary=" + salary + ", subs=" + subs
                + "]";
    }
}
