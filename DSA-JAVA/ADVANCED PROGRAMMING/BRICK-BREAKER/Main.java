import java.util.*;

public class Main {
    public static void main(String[] args) {
        BrickBreaker bb = new BrickBreaker(7, 7);
        bb.initializeBrick(2, 2, 2);
        bb.initializeBrick(2, 3, 2);
        bb.initializeBrick(2, 4, 2);
        bb.initializeBrick(3, 2, 2);
        bb.initializeBrick(3, 3, 2);
        bb.initializeBrick(3, 4, 2);

        Scanner scan = new Scanner(System.in);
        while (true) {
            bb.printBoard();
            if (bb.getBallLife() <= 0) {
                System.out.println("Ball life ended");
                System.err.println("Game Over!!");
                scan.close();
                System.exit(0);
            }
            System.out.println("Enter the direction(lt/rt/st)");
            String direction = scan.next();
            int[] ballPos;
            switch (direction) {
                case "lt":
                    ballPos = bb.getBallPos();
                    bb.initiateBall(ballPos[0], ballPos[1], -1, -1);
                    break;

                case "rt":
                    ballPos = bb.getBallPos();
                    bb.initiateBall(ballPos[0], ballPos[1], -1, 1);
                    break;

                case "st":
                    ballPos = bb.getBallPos();
                    bb.initiateBall(ballPos[0], ballPos[1], -1, 0);
                    break;

                default:
                    System.out.println("Enter some valid move");
                    System.exit(0);
                    break;
            }
        }

    }
}
