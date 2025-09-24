// Task 1.a
public class Main {
    public static void main(String[] args) {
        // Task 1.g
        Team team1 = new Team("BIF");

        // Task 1.i
        team1.setRank(1);

        // Task 1.l
        team1.addPlayer("Filip");
        team1.addPlayer("Daniel");

        // Task 1.j & 1.m
        System.out.println(team1);

        // Task 1.k
        Team team2 = new Team("FCK");
        team2.setRank(2);
        team2.addPlayer("Lars");
        team2.addPlayer("Gabriel");

        Team team3 = new Team("AGF");
        team3.setRank(3);
        team3.addPlayer("Mark");
        team3.addPlayer("Kevin");

        Team team4 = new Team("FCN");
        team4.setRank(4);
        team4.addPlayer("Morten");
        team4.addPlayer("Emil");

        Team team5 = new Team("SIF");
        team5.setRank(5);
        team5.addPlayer("Dennis");
        team5.addPlayer("Peter");


        // Udskriv alle hold
        System.out.println(team2);
        System.out.println(team3);
        System.out.println(team4);
        System.out.println(team5);
    }
}