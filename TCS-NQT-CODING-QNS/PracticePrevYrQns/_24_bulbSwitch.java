// Description:
// There are $n$ bulbs that are initially turned off. You perform $n$ rounds of switching. 
// In each round $i$ (from $1$ to $n$), you toggle every $i$-th bulb.
// Toggling means:If the bulb is off, you turn it on.If the bulb is on, you turn it off.T
// he Rounds:Round 1: Toggle every 1st bulb (you turn on all the bulbs).
// Round 2: Toggle every 2nd bulb (you turn off bulbs 2, 4, 6...).
// Round 3: Toggle every 3rd bulb (you toggle bulbs 3, 6, 9...).
// Round $i$: You toggle every $i$-th bulb.
// Round $n$: You toggle only the last bulb (the $n$-th bulb).Task:

// ### 1. The Rule of the Game
// A bulb only stays **ON** if you touch it an **odd** number of times.
// * Touch it **twice** (On, then Off) $\rightarrow$ It's **OFF**.
// * Touch it **three times** (On, Off, then On) $\rightarrow$ It's **ON**.

// ### 2. Who touches the bulbs?
// A bulb is touched in a round if that round number is a **factor** of the bulb's number.
// * **Bulb 6** is touched in rounds **1, 2, 3, and 6**. (4 times = Even $\rightarrow$ **OFF**)
// * **Bulb 8** is touched in rounds **1, 2, 4, and 8**. (4 times = Even $\rightarrow$ **OFF**)

// ### 3. The "Aha!" Moment
// Most numbers have factors that come in **pairs**.
// * For **6**: $(1 \times 6)$ and $(2 \times 3)$. That’s 4 factors (Even).
// * For **10**: $(1 \times 10)$ and $(2 \times 5)$. That’s 4 factors (Even).

// **But look at Perfect Squares:**
// * For **9**: $(1 \times 9)$ and $(3 \times 3)$. 
// * Wait! Since $3$ is multiplied by itself, we only count it **once**. 
// * The factors of **9** are $\{1, 3, 9\}$. That is **3 factors (Odd)**.

// ### 4. The Conclusion
// Only **Perfect Squares** (1, 4, 9, 16, 25...) have an odd number of factors. Therefore, **only the perfect square bulbs will stay ON.**

// To find how many perfect squares are between $1$ and $n$, you just take the **Square Root** of $n$.

// ---

// ### Example: $n = 20$
// * Which bulbs stay on? Bulb **1**, Bulb **4**, Bulb **9**, and Bulb **16**.
// * How many is that? **4 bulbs**.
// * Check the math: $\sqrt{20} \approx 4.47$. Drop the decimal $\rightarrow$ **4**.

// ### The 1-Line Java Code:
// ```java
// public int bulbSwitch(int n) {
//     return (int) Math.sqrt(n); 
// }
// ```

// Does the connection between "Perfect Squares" and "Odd number of factors" make more sense now?4
import java.util.*;

public class _24_bulbSwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println((int) Math.sqrt(n));
        scan.close();
    }
}
