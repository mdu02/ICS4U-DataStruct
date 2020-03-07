import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

class Encoder{
    public static void main(String[] args) throws FileNotFoundException {
        HashMap<String, String> translations = new HashMap<String, String>();
        String path = "morse_code.txt";
        Scanner sc1 = new Scanner(new File(path));
        while (sc1.hasNextLine()){
            String line = sc1.nextLine();
            String[] parts = line.split("\t", 2);
            translations.put(parts[0].trim(),parts[1].trim());
        }
        sc1.close();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter your word");
        while (true){
            String word = (sc2.next()).toUpperCase();
            String translated = "";
            for (int i = 0; i<word.length(); i++){
                translated += translations.get(word.substring(i,i+1));
                translated += "  ";
            }
            System.out.println("Morse Code is ");
            System.out.println(translated);
        }
    }
}