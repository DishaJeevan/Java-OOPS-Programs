 import java.util.Scanner;
public class TicTacToe {
    char[] board = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};

    public void displayBoard() {
        System.out.println(board[0] + "|" + board[1] + "|" + board[2]);
        System.out.println("-+-+-");
        System.out.println(board[3] + "|" + board[4] + "|" + board[5]);
        System.out.println("-+-+-");
        System.out.println(board[6] + "|" + board[7] + "|" + board[8]);
    }

    public boolean checkWin(char player) {
        // Rows
        if ((board[0] == player && board[1] == player && board[2] == player) ||
            (board[3] == player && board[4] == player && board[5] == player) ||
            (board[6] == player && board[7] == player && board[8] == player) ||
            // Columns
            (board[0] == player && board[3] == player && board[6] == player) ||
            (board[1] == player && board[4] == player && board[7] == player) ||
            (board[2] == player && board[5] == player && board[8] == player) ||
            // Diagonals
            (board[0] == player && board[4] == player && board[8] == player) ||
            (board[2] == player && board[4] == player && board[6] == player)) {
            return true;
        }
        return false;
    }

    public void play() {
        Scanner sc = new Scanner(System.in);
        char player = 'X';
        for (int i = 0; i < 9; i++) {
            displayBoard();
            System.out.println("Player " + player + ", enter your move (0-8):");
            int move = sc.nextInt();
            if (move < 0 || move > 8 || board[move] != ' ') {
                System.out.println("Invalid move, try again.");
                i--;
                continue;
            }
            board[move] = player;
            if (checkWin(player)) {
                displayBoard();
                System.out.println("Player " + player + " wins!");
                return;
            }
            player = (player == 'X') ? 'O' : 'X';
        }
        displayBoard();
        System.out.println("It's a draw!");
    }

    public static void main(String[] args) {
        TicTacToe ttt = new TicTacToe();
        ttt.play();
    }
}
