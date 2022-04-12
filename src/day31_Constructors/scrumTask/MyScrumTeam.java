package day31_Constructors.scrumTask;

public class MyScrumTeam {
    public static void main(String[] args) {

        ScrumTeam team = new ScrumTeam("john", "mike", "bill",14);

        Tester[] testers = new Tester[5];
        team.addTesters(testers);

        Developer[] developers = new Developer[4];
        team.addDevelopers(developers);

        System.out.println(team);

        team.developers.set(2,new Developer("jordan", "dev", 3, 30000));

        team.developers.get(2).coding();

      //  team.removeDeveloper(3);

      //  System.out.println(team);

    }
}
