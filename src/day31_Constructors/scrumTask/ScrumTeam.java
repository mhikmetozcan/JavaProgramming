package day31_Constructors.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
    public String po, ba, sm;
    ArrayList<Tester> testers = new ArrayList<>();
    ArrayList<Developer> developers = new ArrayList<>();
    public int daysOfSprint;

    public ScrumTeam(String po, String ba, String sm, int daysOfSprint) {
        this.po = po;
        this.ba = ba;
        this.sm = sm;
        this.daysOfSprint = daysOfSprint;
    }

    public void addTester(Tester tester){
        this.testers.add(tester);
    }

    public void addTesters(Tester[] testers){
        this.testers.addAll(Arrays.asList(testers));
    }

    public void addDeveloper (Developer dev){
        this.developers.add(dev);
    }

    public void addDevelopers(Developer[] developers){
        this.developers.addAll(Arrays.asList(developers));
    }

    public void removeTester(long id){
        this.testers.removeIf(p -> p.employeeID == id);
    }

    public void removeDeveloper(long id){
        this.developers.removeIf(p -> p.employeeID == id);
    }

    public String toString(){

        return "Number of Testers: "+ testers.size() + "\nNumber of Developers: " + developers.size() + "\nPO name: " + po + "\nBA name: " + ba + "\nSM name: " +sm + "\nDays of Sprint: " + daysOfSprint;

    }

}
