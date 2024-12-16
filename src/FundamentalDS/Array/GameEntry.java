package FundamentalDS.Array;

// Here basic components of Arrays are created in terms of an Example; Game



//Storing a Array

public class GameEntry{
    private String name;
    private int score;

     public GameEntry(String name, int score) {
         this.name = name;
         this.score = score;
     }

     public String getName(){
         return name;
     }

     public int getScore() {
         return score;
     }

     public String toString(){
         return STR."(\{name}, \{score} )";
     }

 }

