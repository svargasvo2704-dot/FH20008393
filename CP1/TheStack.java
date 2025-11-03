// https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html
// ChatGPT

import java.util.Arrays;

public class TheStack {

    private double[] stack;
    private int top;

    public TheStack(int capacity) {
        this.stack = new double[capacity];
        this.top = 0;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        TheStack stk = new TheStack(n);

        System.out.println("\nPushing {capacity + 1}");
        for (int i = 0; i <= n; i++) {
            double val = Math.random();
            System.out.printf(" ↳ push(%s) → %b%n", val, stk.push(val));
        }

        System.out.println("\nPushed {full}");
        System.out.printf(" ↳ print() → %s%n", Arrays.toString(stk.stack()));
        System.out.printf("   ↳ peek() → %s%n", stk.peek());
        System.out.printf("   ↳ size() → %d%n", stk.size());
        System.out.printf("   ↳ empty() → %b%n", stk.empty());

        System.out.println("\nPopping {capacity + 1}");
        for (int i = 0; i <= n; i++) {
            System.out.printf(" ↳ pop() → %s%n", stk.pop());
        }

        System.out.println("\nPopped {empty}");
        System.out.printf(" ↳ print() → %s%n", Arrays.toString(stk.stack()));
        System.out.printf("   ↳ peek() → %s%n", stk.peek());
        System.out.printf("   ↳ size() → %d%n", stk.size());
        System.out.printf("   ↳ empty() → %b%n", stk.empty());
    }

    // Improvement: retornar true o false según éxito
    public boolean push(double value) {
        if (top >= stack.length) {
            return false; // overflow
        }
        stack[top++] = value;
        return true;
    }

    // Update: retornar null si está vacía
    public Double pop() {
        if (top <= 0) {
            return null; // underflow
        }
        return stack[--top];
    }

    // Update: retornar null si está vacía
    public Double peek() {
        if (top <= 0) {
            return null;
        }
        return stack[top - 1];
    }

    public double[] stack() {
        return Arrays.copyOf(stack, top);
    }

    public int size() {
        return top;
    }

    public boolean empty() {
        return top == 0;
    }
}
