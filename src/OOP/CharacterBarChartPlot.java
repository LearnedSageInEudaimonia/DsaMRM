package OOP;/*Write a Java program that inputs a document and then outputs a bar-chart plot of
the frequencies of each alphabet character that appears within that document.
 */
import java.util.Scanner;

public class CharacterBarChartPlot {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Enter the Document Text.Type 'End' to exit");

        StringBuilder document = new StringBuilder();

        while(true){

            String line = read.nextLine();
            if(line.equals("End")){
                break;
            }

            document.append(line.toLowerCase());

        }

        int[] frequencies = new int[26];

        for(int i =0;i<document.length();i++){

            char c = document.charAt(i);

            if(c>='a' & c<='z'){
                frequencies[c-'a']++;
            }
        }

        System.out.println("The Character Frequency Bar-Chart Graph:");

        for(int i =0 ;i<26;i++){

            if(frequencies[i]>0){
            System.out.print(STR."\{(char)( i + 'a')}:");

            for(int j =0 ;j<frequencies[i];j++){
                System.out.print("*");
            }
                System.out.println(STR."( \{frequencies[i]} )");
            }
        }

    }
}
