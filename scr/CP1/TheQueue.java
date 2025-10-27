// https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/ArrayDeque.html
// ChatGPT (GPT-5)

import java.util.*;

public class TheQueue {

    private Deque<String> queue;

    public TheQueue() {
        this.queue = new ArrayDeque<>();
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        TheQueue q = new TheQueue();
        String[] nucleotides = {"A", "T", "C", "G"};

        // llenar la cola
        for (int i = 0; i < n; i++) {
            q.enqueue(nucleotides[(int)(Math.random() * 4)]);
        }

        System.out.println("\nFilled {full}");
        System.out.printf(" ↳ print() → %s%n", q.queue);
        System.out.printf("   ↳ getFront() → %s%n", q.getFront());
        System.out.printf("   ↳ getSize() → %d%n", q.getSize());
        System.out.printf("   ↳ isEmpty() → %b%n", q.isEmpty());

        System.out.printf("%ngetCodons() → %s%n", Arrays.toString(q.getCodons(n)));

        System.out.println("\nEnd {empty}");
        System.out.printf(" ↳ print() → %s%n", q.queue);
        System.out.printf("   ↳ getFront() → %s%n", q.getFront());
        System.out.printf("   ↳ getSize() → %d%n", q.getSize());
        System.out.printf("   ↳ isEmpty() → %b%n", q.isEmpty());
    }

    public void enqueue(String item) {
        queue.addLast(item);
    }

    // Improvement: usar métodos que retornan null si está vacía
    public String dequeue() {
        return queue.pollFirst(); // retorna null si vacío
    }

    // Improvement: retornar primero sin quitarlo
    public String getFront() {
        return queue.peekFirst(); // retorna null si vacío
    }

    public int getSize() {
        return queue.size();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // Update: generar arreglo de codones
    public String[] getCodons(int n) {
        String[] codons = new String[n / 3];
        for (int i = 0; i < codons.length; i++) {
            String a = dequeue();
            String b = dequeue();
            String c = dequeue();
            codons[i] = a + b + c;
        }
        return codons;
    }
}
