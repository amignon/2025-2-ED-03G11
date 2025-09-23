public class TestaFila {
    public static void main(String[] args) {
        Fila<String> f = new Fila<>(5);
        f.enqueue("A");
        f.enqueue("B");
        f.enqueue("C");

        String s = f.dequeue();
        System.out.println(s);
    }
}