package FundamentalDS.Array;

public class Main {
    public static void main(String[] args) {
        ScoreBoard score = new ScoreBoard(100);
        GameEntry game = new GameEntry("John", 25);
        GameEntry game1 = new GameEntry("babul", 55);
        GameEntry game2 = new GameEntry("chacko", 95);
        score.add(game);
        score.add(game1);
        score.add(game2);
        score.display();
        System.out.println(game1.getScore());
        score.remove(2);
        score.display();
    }
}
