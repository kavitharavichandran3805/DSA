import java.util.HashMap;

public class BrickBreaker {
    private static String wall = "w";
    private static String ground = "g";
    private static String ball = "o";
    private static String brick = "1";
    HashMap<Integer, Integer> brickPosWithLife = new HashMap<>();
    private String[][] board;
    private int[] ballPos = null;
    private int ballLife = 5;

    public BrickBreaker(int row, int col) {
        board = new String[row][col];
        prepareBoard();
        board[row - 1][col / 2] = ball;
        ballPos = new int[] { row - 1, col / 2 };
    }

    public void initializeBrick(int row, int col, int life) {
        board[row][col] = brick;
        int exactPos = getBrickExactPos(row, col);
        brickPosWithLife.put(exactPos, life);
    }

    public void initiateBall(int ballRow, int ballCol, int rowDirection, int colDirection) {
        moveDirection(ballRow, ballCol, rowDirection, colDirection);
        if (!board[ballRow][ballCol].equals(ball))
            board[ballRow][ballCol] = ground;
    }

    public void moveDirection(int ballRow, int ballCol, int rowDirection, int colDirection) {
        while (!board[ballRow][ballCol].equals(wall)) {
            if (board[ballRow][ballCol].equals(brick)) {
                ballGoesDown(ballRow, ballCol);
                return;
            }
            movingIllusion(ballRow, ballCol);
            ballRow += rowDirection;
            ballCol += colDirection;
        }

        wallHit(ballRow, ballCol);
        rowDirection = 0;
        colDirection *= -1;
        if (colDirection == 0) {
            ballGoesDown(ballRow + 1, ballCol);
        } else {
            moveDirection(ballRow, ballCol + colDirection, rowDirection, colDirection);
        }

    }

    public void wallHit(int ballRow, int ballCol) {
        board[ballRow][ballCol] = ball;
        printBoard();
        sleep();
        board[ballRow][ballCol] = wall;

    }

    public void ballGoesDown(int ballRow, int ballCol) {
        while (ballRow != board.length) {
            movingIllusion(ballRow, ballCol);
            ballRow++;
        }
        ballPos = new int[] { ballRow - 1, ballCol };
        board[ballPos[0]][ballPos[1]] = ball;
    }

    public void movingIllusion(int ballRow, int ballCol) {
        if (board[ballRow][ballCol].equals(brick)) {
            reduceBrickAndBallLife(ballRow, ballCol);
            if (brickPosWithLife.get(getBrickExactPos(ballRow, ballCol)) == 0) {
                board[ballRow][ballCol] = " ";
            }
        } else {
            board[ballRow][ballCol] = ball;
            printBoard();
            board[ballRow][ballCol] = " ";
            sleep();

        }
    }

    public void sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.getCause();
        }
    }

    public void reduceBrickAndBallLife(int brickRow, int brickCol) {
        int exactPos = getBrickExactPos(brickRow, brickCol);
        ballLife--;
        if (ballLife >= 0) {
            brickPosWithLife.put(exactPos, brickPosWithLife.get(exactPos) - 1);
        }
    }

    public int getBrickExactPos(int row, int col) {
        return (row * board[0].length) + col + 1;
    }

    public void prepareBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (i == 0 || j == 0 || j == board[0].length - 1) {
                    board[i][j] = wall;
                } else if (i == board.length - 1) {
                    board[i][j] = ground;
                } else {
                    board[i][j] = " ";
                }
            }
        }
    }

    public void printBoard() {
        for (String[] str : board) {
            for (String s : str) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }

    public int getBallLife() {
        return ballLife;
    }

    public int[] getBallPos() {
        return ballPos;
    }
}