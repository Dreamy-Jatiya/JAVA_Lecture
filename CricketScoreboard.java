// Cricket Scoreboard Program

import java.util.Scanner;

class Player {
    String name;
    int runs;
    int balls;

    Player(String name) {
        this.name = name;
        this.runs = 0;
        this.balls = 0;
    }
}

class Team {
    String name;
    Player players[] = new Player[11];

    int totalRuns = 0;
    int wickets = 0;
    int balls = 0;

    int four = 0;
    int six = 0;
    int wide = 0;
    int noBall = 0;

    Team(String name) {
        this.name = name;

        for (int i = 0; i < 11; i++) {
            players[i] = new Player("Player" + (i + 1));
        }
    }
}

public class CricketScoreboard {

    public static void playInnings(Team team, int overs) {

        Scanner sc = new Scanner(System.in);

        int totalBalls = overs * 6;

        System.out.println("\n================================");
        System.out.println("Batting Team: " + team.name);
        System.out.println("================================");

        for (int i = 0; i < totalBalls; i++) {

            System.out.print("Enter ball result (0-6 / wide / no / wicket): ");
            String input = sc.next();

            if (input.equalsIgnoreCase("wide")) {

                team.totalRuns += 1;
                team.wide++;

                // Wide is not a legal ball
                i--;

            } 
            else if (input.equalsIgnoreCase("no")) {

                team.totalRuns += 1;
                team.noBall++;

                // No-ball is not a legal ball
                i--;

            } 
            else if (input.equalsIgnoreCase("wicket")) {

                if (team.wickets < 10) {
                    team.wickets++;
                }

                // Wicket is a legal ball
                team.balls++;

            } 
            else {

                int runs;

                try {
                    runs = Integer.parseInt(input);

                    if (runs < 0 || runs > 6) {
                        System.out.println("Please enter runs between 0 and 6.");
                        i--;
                        continue;
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Invalid input! Enter 0-6, wide, no or wicket.");
                    i--;
                    continue;
                }

                team.totalRuns += runs;
                team.balls++;

                if (runs == 4) {
                    team.four++;
                }

                if (runs == 6) {
                    team.six++;
                }
            }

            // Over completed after every 6 legal balls
            if (team.balls > 0 && team.balls % 6 == 0) {

                System.out.println("\n----- Over Completed -----");
                System.out.println("Score: " + team.totalRuns + "/" + team.wickets);
                System.out.println("Balls: " + team.balls);

                System.out.println("4s: " + team.four
                        + "  6s: " + team.six
                        + "  Wides: " + team.wide
                        + "  NoBalls: " + team.noBall);

                System.out.println("--------------------------");
            }

            // Innings ends if 10 wickets fall
            if (team.wickets == 10) {
                System.out.println("\nAll Out!");
                break;
            }
        }

        System.out.println("\n================================");
        System.out.println("Innings Over");
        System.out.println(team.name + ": "
                + team.totalRuns + "/" + team.wickets);
        System.out.println("Balls: " + team.balls);
        System.out.println("================================");
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Team 1 Name: ");
        String t1 = sc.nextLine();

        System.out.print("Enter Team 2 Name: ");
        String t2 = sc.nextLine();

        System.out.print("Enter Overs: ");
        int overs = sc.nextInt();

        if (overs <= 0) {
            System.out.println("Overs must be greater than 0.");
            return;
        }

        Team team1 = new Team(t1);
        Team team2 = new Team(t2);

        // First innings
        playInnings(team1, overs);

        // Second innings
        playInnings(team2, overs);

        // Match Result
        System.out.println("\n\n================================");
        System.out.println("         MATCH RESULT");
        System.out.println("================================");

        System.out.println(team1.name + " Score: "
                + team1.totalRuns + "/" + team1.wickets
                + "  Balls: " + team1.balls);

        System.out.println(team2.name + " Score: "
                + team2.totalRuns + "/" + team2.wickets
                + "  Balls: " + team2.balls);

        if (team1.totalRuns > team2.totalRuns) {

            System.out.println("\n" + team1.name + " Wins!");

        } 
        else if (team2.totalRuns > team1.totalRuns) {

            System.out.println("\n" + team2.name + " Wins!");

        } 
        else {

            System.out.println("\nMatch Draw!");

        }

        // Average Runs Per Over
        double avg1 = (double) team1.totalRuns / overs;
        double avg2 = (double) team2.totalRuns / overs;

        System.out.println("\n----- Average Runs Per Over -----");

        System.out.printf("%s: %.2f%n", team1.name, avg1);
        System.out.printf("%s: %.2f%n", team2.name, avg2);

        // Team 1 Statistics
        System.out.println("\n----- " + team1.name + " Statistics -----");

        System.out.println("Total 4s: " + team1.four);
        System.out.println("Total 6s: " + team1.six);
        System.out.println("Total Wides: " + team1.wide);
        System.out.println("Total NoBalls: " + team1.noBall);

        // Team 2 Statistics
        System.out.println("\n----- " + team2.name + " Statistics -----");

        System.out.println("Total 4s: " + team2.four);
        System.out.println("Total 6s: " + team2.six);
        System.out.println("Total Wides: " + team2.wide);
        System.out.println("Total NoBalls: " + team2.noBall);

        sc.close();
    }
}