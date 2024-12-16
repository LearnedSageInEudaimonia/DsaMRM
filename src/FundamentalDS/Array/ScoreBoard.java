package FundamentalDS.Array;

public class ScoreBoard {
    private int numEntries=0;
    private GameEntry[] board;

    public ScoreBoard(int capacity) {
        this.board = new GameEntry[capacity];
    }

    public void add(GameEntry e){
        int newScore = e.getScore();
        if((numEntries< board.length)||(newScore>board[numEntries-1].getScore())){
            if(numEntries< board.length)
                numEntries++;

            int j = numEntries-1;
            while(j>0&&board[j-1].getScore()<newScore){
                board[j] = board[j-1];
                j--;
            }
            board[j] =e;
        }
    }

    public GameEntry remove(int i ) throws IndexOutOfBoundsException {
        if (i < 0 || i >= numEntries)
            throw new IndexOutOfBoundsException(STR."Invalid index:\{i}");

        GameEntry temp = board[i];
        for(int j =i ; j< numEntries;j++)
            board[j] = board[j+1];
        board[numEntries-1] = null;
        numEntries--;
        return temp;


    }
    public void display(){
        for(int i =0 ;i<numEntries;i++){
            System.out.println(board[i]);
        }
    }

}
