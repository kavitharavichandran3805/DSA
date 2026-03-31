// Problem 1: The Smart Elevator
// Description:
// A company has installed a smart elevator in a 10-floor building (floors numbered 0 to 9). The elevator starts at floor 0. You are given a sequence of floor requests.

// Rules:

// If the requested floor is higher than the current floor → elevator moves up.

// If the requested floor is lower than the current floor → elevator moves down.

// Moving 1 floor takes 2 seconds.

// Stopping at a floor takes 1 second.

// If the request is the same as the current floor → only 1 second (stop time).

// Task: Calculate the total time taken to serve all requests in order.

// Input (n and floors),Calculation Logic,Expected Output
// 2 
// 3 3,(0 to 3: 3 floors * 2s) + 1s stop + (3 to 3: 0 floors) + 1s stop,8
// 3 
// 1 2 0,(0→1: 2s + 1s) + (1→2: 2s + 1s) + (2→0: 4s + 1s),11
// 10,(0 to 0: 0 floors) + 1s stop,1

import java.util.*;

public class _18_smartElevator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        String[] input = scan.nextLine().trim().split(" ");
        int total = 0, curfloor, prevfloor;
        for (int i = 0; i < n; i++) {
            curfloor = Integer.parseInt(input[i]);
            if (i == 0) {
                total += Math.abs((2 * curfloor)) + 1;
            } else {
                prevfloor = Integer.parseInt(input[i - 1]);
                total += Math.abs(2 * (curfloor - prevfloor)) + 1;
            }
            System.out.println(total + " " + i);
        }
        System.out.println(total);
        scan.close();
    }
}
