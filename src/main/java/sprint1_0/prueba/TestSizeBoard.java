package sprint1_0.prueba;

import org.junit.Test;
import sprint1_0.produccion.Board;

import static org.junit.Assert.assertEquals;

public class TestSizeBoard {
    // Criterio de Aceptacion 1.1
    @Test
    public void TestIncorrectSizeBoard()
    {
        Board board = new Board(1);
        assertEquals(board.getSize(),-1);
    }
    // Criterio de Aceptacion 1.1
    @Test
    public void TestCorrectSizeBoard(){
        Board board = new Board(4);
        assertEquals(board.getSize(),4);
        assertEquals(board.getCell(0,0),0);
    }
}
