import java.util.*;

public class Snake {

    private char[][] board = null;
    private Queue<Node> queue = new LinkedList<>();
    private Queue<Node> food = new LinkedList<>();

    public Snake(int row, int col) {
        board = new char[row][col];
        queue.add(new Node(0, 0));

        food.add(new Node(1, 0));
        food.add(new Node(2, 2));
        food.add(new Node(3, 4));
        food.add(new Node(5, 2));
        food.add(new Node(4, 5));

        displayFood(food.poll());
    }

    public void startGame() {
        int r = 0, c = 0;
        board[r][c] = '.';
        Scanner scan = new Scanner(System.in);
        while (true) {
            displayBoard();
            System.out.println("Enter a position (R/L/U/D)");
            char pos = scan.next().charAt(0);
            if (pos == 'U') {
                snakeMove(--r, c);
            } else if (pos == 'D') {
                snakeMove(++r, c);
            } else if (pos == 'R') {
                snakeMove(r, ++c);
            } else {
                snakeMove(r, --c);
            }

        }

    }

    public void snakeMove(int r, int c) {
        if (r >= 0 && r < board.length && c >= 0 && c < board[0].length) {
            queue.add(new Node(r, c));
            if (board[r][c] != 'X') {
                Node tail = queue.poll();
                int row = tail.getRow();
                int col = tail.getCol();
                board[row][col] = '\0';
            }

            if (board[r][c] == 'X') {
                if (food.isEmpty()) {
                    moveForwardandPrint(r, c);
                    System.out.println("Game Over!!");
                    System.exit(0);
                }
                displayFood(food.poll());
            }

            if (board[r][c] == '.') {
                System.out.println("Game Over!!");
                System.exit(0);
            }
            moveForwardandPrint(r, c);

        } else {
            System.out.println("Invalid position");
            System.exit(0);
        }
    }

    public void moveForwardandPrint(int r, int c) {
        board[r][c] = '.';
        displayBoard();
    }

    public void displayFood(Node n) {
        int r = n.getRow();
        int c = n.getRow();
        board[r][c] = 'X';
    }

    public void displayBoard() {
        for (char[] a : board) {
            for (int i = 0; i < board[0].length; i++) {
                if (a[i] == '\0') {
                    System.out.print("- ");
                } else {
                    System.out.print(a[i] + " ");
                }
            }
            System.out.println();
        }
        System.out.println("****************************************************************");
    }
}
