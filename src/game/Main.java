package game;

import java.util.Scanner;
import java.util.Random;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Random ran = new Random();

    static int attempts = 5;

    static boolean run = true; //not ended
    static boolean guessing = true; //word not guessed

    static String secretLetter = "_";
    static String guess; //current chosen word

    static String word = ""; //secret word, will be printed, has these hidden letters
    static String solution; //solution lol
    static String[] words = {"apple", "banana", "cherry", "grape", "lemon", "melon", "peach", "plum", "berry", "orange",
            "forest", "bridge", "stream", "rocket", "planet", "silver", "dragon", "sunset", "sunrise", "flavor",
            "school", "pencil", "eraser", "binder", "lesson", "window", "mirror", "closet", "tunnel", "button",
            "purple", "yellow", "orange", "violet", "indigo", "turkey", "rabbit", "donkey", "monkey", "kitten",
            "puppy", "kitten", "turtle", "eagle", "tiger", "zebra", "camel", "shark", "salmon", "coral",
            "bubble", "sponge", "scarf", "gloves", "jacket", "parka", "sweater", "helmet", "boots", "shoes",
            "cotton", "fabric", "thread", "needle", "button", "zipper", "sewing", "plasma", "energy", "signal",
            "vector", "matrix", "signal", "output", "buffer", "serial", "kernel", "filter", "screen", "sensor",
            "bright", "silent", "noises", "frozen", "thirst", "jungle", "branch", "ground", "valley", "desert",
            "ocean", "island", "resort", "beach", "sunbed", "travel", "ticket", "bottle", "basket", "guitar",
            "violin", "drum", "trumpet", "cello", "flute", "piano", "rhythm", "chorus", "lyrics", "melody",
            "letter", "object", "pocket", "folder", "camera", "screen", "mobile", "router", "modem", "laptop",
            "server", "backup", "upload", "update", "format", "cursor", "window", "widget", "scroll", "mouse",
            "login", "logout", "access", "secure", "config", "script", "prompt", "device", "driver", "cloud",
            "debug", "syntax", "module", "branch", "commit", "merge", "token", "submit", "output", "import",
            "random", "sorted", "number", "binary", "linear", "search", "vector", "string", "append", "filter",
            "domain", "client", "cookie", "header", "cipher", "secure", "system", "crypto", "server", "daemon",
            "script", "engine", "widget", "option", "editor", "viewer", "viewer", "canvas", "layout", "margin",
            "border", "radius", "format", "source", "branch", "toggle", "signal", "static", "public", "export"
    };

    public static void main(String[] args) {

        do {
            attempts = 5;
            guessing = true;
            System.out.println("Welcome to the Word Guesser Game!");

            //make random word
            solution = words[ran.nextInt(190)];
            word = secretLetter.repeat(solution.length());


            while (guessing && attempts > 0) {
                //print menu
                System.out.println("You have " + attempts + " attempts to guess the secret word: " + word);
                System.out.println("To guess just type the word. If you want to end type '0'");
                guess = sc.nextLine().toLowerCase().substring(0, solution.length());
                if (guess.equals("0")) {
                    run = false;
                    guessing = false;
                    System.out.println("Goodbye :)");
                } else if (guess.equals(solution) || word.equals(solution)) {
                    System.out.println("Congratulations, you guessed correct!");
                    guessing = false;
                } else {
                    attempts--;
                    for (int i = 0; i < guess.length(); i++) {
                        for (int j = 0; j < solution.length(); j++) {
                            if (guess.charAt(i) == solution.charAt(j)) {
                                word = replaceChar(word, solution.charAt(j), j);
                            }
                        }
                    }
                    //print menu
                }
            }

            System.out.println("Do you want to play another round? (Y/N)");
            guess = sc.nextLine().toLowerCase();
            if (guess.equals("n")) {
                System.out.println("Goodbye :)");
                run = false;
            }

        } while (run);
    }

    public static String replaceChar(String str, char ch, int index) {
        return str.substring(0, index) + ch + str.substring(index + 1);
    }
}
