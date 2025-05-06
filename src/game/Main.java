package game;
import java.util.Scanner;
import java.util.Random;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Random ran = new Random();
    static String word = "";
    static String solution;
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
    public static void main(String[] args){

    }

    public static void printMenu(){
        System.out.println("Welcome to the Word Guesser Game!");
        System.out.println(getRandomWord());
    }

    public static void initWord(){

    }

    public static String getRandomWord(){
        return words[ran.nextInt(200)];
    }
}
