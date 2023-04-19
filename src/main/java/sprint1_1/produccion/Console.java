package sprint1_1.produccion;

import sprint1_0.produccion.Board;

public class Console {
    private sprint1_0.produccion.Board board;
    public Console(sprint1_0.produccion.Board board)
    {
        this.board = board;
    }
    public void displayBoard()
    {
        int size = board.getSize();
        for(int row=0;row<size;row++) {
            System.out.println("-------");
            for (int column=0;column<size;column++){
                System.out.print("|"+ board.getCell(row, column));
            }
            System.out.println();
        }
        System.out.println("-------");
    }
    public static void main(String[] args) {
        new sprint1_0.produccion.Console(new Board(5)).displayBoard();;
    }
}
