import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class SportsStatistics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String rootPath = "Part4-3.11-FilesAndReadingData-SportStatistics";

        System.out.println("File:");
        String file = scan.nextLine();
        String absolutePath = rootPath + "/" + file;

        System.out.println("Team:");
        String teamPick = scan.nextLine();

        try (Scanner readFile = new Scanner(Paths.get(absolutePath))) {

            int gamesPlayed = 0;
            int teamWins = 0;
            int teamLosses = 0;

            while (readFile.hasNextLine()) {
                String[] parts = readFile.nextLine().split(",");

                String homeTeam = parts[0];
                String awayTeam = parts[1];
                int homeScore = Integer.valueOf(parts[2]);
                int awayScore = Integer.valueOf(parts[3]);

                if (homeTeam.equals(teamPick)) {
                    gamesPlayed++;
                    if (homeScore > awayScore) {
                        teamWins++;
                    } else {
                        teamLosses++;
                    }
                } else if (awayTeam.equals(teamPick)) {
                    gamesPlayed++;
                    if (awayScore > homeScore) {
                        teamWins++;
                    } else {
                        teamLosses++;
                    }
                } else {
                    continue;
                }
            }

            System.out.println("Games: " + gamesPlayed);
            System.out.println("Wins: " + teamWins);
            System.out.println("Losses: " + teamLosses);

        } catch (Exception error) {
            System.out.println("Error finding: " + error.getMessage());
        }
    }
}
