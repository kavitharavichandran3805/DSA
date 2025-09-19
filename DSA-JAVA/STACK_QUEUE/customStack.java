
import java.util.*;

class dynamicStack extends stack {
    @Override
    int push(int ele) throws Myexception {
        if (this.isFull(tos)) {
            System.out.println("hhh");
            int[] temp = new int[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
            System.out.println(Arrays.toString(data));
        }
        return super.push(ele);
    }
}

class Myexception extends Exception {
    Myexception(String s) {
        super(s);
    }
}

class stack {
    protected int[] data;
    int tos = -1;
    private static final int DEFAULT_SIZE = 5;

    stack(int size) {
        this.data = new int[size];
    }

    stack() {
        this(DEFAULT_SIZE);
    }

    boolean isFull(int tos) {
        if (tos >= data.length - 1) {
            return true;
        }
        return false;
    }

    boolean isEmpty(int tos) {
        if (tos == -1) {
            return true;
        }
        return false;
    }

    int push(int ele) throws Myexception {
        if (!isFull(tos)) {
            data[++tos] = ele;
        } else {
            throw new Myexception("Stack is full");
        }
        return 1;

    }

    int pop() throws Myexception {
        if (!isEmpty(tos)) {
            int popped = data[tos];
            --tos;
            return popped;
        } else {
            throw new Myexception("Stack is empty");
        }

    }

    int peek() {
        return data[tos];
    }

    void print() {
        System.out.println(tos);
        for (int i = 0; i <= tos; i++) {
            System.out.println(data[i] + " ");
        }
    }
}

public class customStack {
    public static void main(String[] args) throws Myexception {
        dynamicStack s = new dynamicStack();
        try {
            s.push(4);
            s.push(5);
            s.push(7);
            s.push(2);
            s.push(0);
            s.push(4);
            System.out.println(s.peek());
            System.out.println(s.pop());
            s.print();
        } catch (Myexception e) {
            System.out.println(e.getMessage());
        }

    }
}