package Programmering1;

public class SecondClass {
    private int lines;
    private int characters;
    private int words;
    private String longestWord;
    public String stop = "stop";

    public SecondClass() {
        lines = 0;
        characters = 0;
        words = 0;
        longestWord = "";

    }


    //Har koll på om användaren har angett "stop". (Oberoende om versial eller gemen.)
    public void StopCheck(String input) {
        if (input.equalsIgnoreCase(stop)) {
            System.out.println("User entered : 'stop'.");
        }
    }

    //används för test
    public int getLines(int input) {
        return lines;
    }

    //används för test
    public boolean stopBoolean(String text) {
        return text.equals(stop);
    }

    //Utför räkning på rader, tecken och ord
    public void count(String input) {
        lines++;
        characters += input.length();
        String[] wordsArray = input.split(" ");
        words += wordsArray.length;

        //Hittar det längsta ordet.
        for (String word : wordsArray) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
    }


    /*"antal tecken och hur många rader som
    användaren har skrivit, exklusive raden med
    ordet stop"*/
    //Resultat som sedan ska skrivas ut i Main Klassen.
    public void printResults() {
        System.out.println("Number of lines: " + (lines-1));
        System.out.println("Number of characters: " + (characters-4));
        System.out.println("Number of words: " + words);
        System.out.println("Longest word: " + longestWord);
    }
}