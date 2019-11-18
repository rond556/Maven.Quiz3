package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {

    private String[][] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        String[] values = new String[3];
        for(int i = 0; i <= 2; i ++){
            values[i] = board[value][i];
        }
        return values;
    }

    public String[] getColumn(Integer value) {
        String[] values = new String[3];
        for(int i = 0; i <= 2; i ++){
            values[i] = board[i][value];
        }
        return values;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        if(board[rowIndex][0].equals(board[rowIndex][1]) && (board[rowIndex][1] == board[rowIndex][2])){
            return true;
        }
        return false;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        if(board[0][columnIndex].equals(board[1][columnIndex]) && (board[1][columnIndex] == board[2][columnIndex])){
            return true;
        }
        return false;
    }

    public String getWinner() {
        for(int i = 0; i <= 2; i++){
            if(isRowHomogenous(i)){
                return board[i][i];
            }
        }
        for(int i = 0; i <= 2; i++){
            if(isColumnHomogeneous(i)){
                return board[i][i];
            }
        }
        if((board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2])) ||
                (board[2][0].equals(board[1][1]) && board[1][1].equals(board[0][2]))){
            return board[1][1];
        }
        return "";
    }

    public String[][] getBoard() {
        return board;
    }
}
