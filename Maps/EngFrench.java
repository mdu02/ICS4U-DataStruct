import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

class EngFrench{
    public static void main(String[] args) throws FileNotFoundException, IOException {
        HashMap<String, String> translations = new HashMap<String, String>();
        String path = "english-french.txt";
        BufferedReader br1 = new BufferedReader(new FileReader(path));
        String line;
        while ((line = br1.readLine()) != null && line!=""){
            String[] parts = line.split("\t", 2);
            translations.put(parts[0].trim(),parts[1].trim());
        }
        br1.close();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter your word");
        while (true){
            String word = (sc2.next()).toLowerCase();
            System.out.println("French is ");
            System.out.println(translations.get(word));
        }
    }
}