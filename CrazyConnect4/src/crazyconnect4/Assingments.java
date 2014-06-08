package crazyconnect4;

/**
 * @author henrydiazlds
 */
public class Assingments {

    public static void main(String[] args) {

        String[][] teams = {
            {"Connect Four", "Henry Diaz", "Piedad Ficklin", "Mary Peterson", "Karla Lugo"},
            {"Word Scramble", "Heather Jensen", "Sara Bronson", "Charlie Brooks", "Aubrey Raby"},
            {"Battle Ship", "Llody Brown", "Colby Griffiths", "Christopher Caroll", "Rubin Gonzalez", "KamiAnne Dastrup"},
            {"Battle Ship", "Chelsea Miller", "Ethan Stewart", "Colton Blair", "Adam Kelley"},
            {"Battle Ship", "Jeremy Pratt", "Taylor Williams", "Melanie Bradshaw", "Jame Hesketh"},
            {"Sudoku", "Joshiah Hendricks", "Daniel Allen", "Keith Higbee", "Jessie Gomez", "Cameron Simons", "Nick Hulse"},
            {"Sudoku", "Albert Ilizaliturri", "Ethan Nelson", "Devin Steen", "Devin Steen", "Janell Burstall", "Zhong Hui Liang"}};
        int counter = 0;
        for (String[] team : teams) {
            for (String members : team) {
                System.out.println(members);
                System.out.print("\t");
                counter++;
            }

            System.out.println();
        }

        int x = teams.length;
        int y = counter - teams.length;
        System.out.println("Groups: " + x);
        System.out.println("Students: " + y);
    }
}
