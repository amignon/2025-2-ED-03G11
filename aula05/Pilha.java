public class Pilha <T> {
    // atributos
    private final static int TAM_DEFAULT = 100;
    private int topoPilha;
    private T elementos[];

    // construtores
    public Pilha(int tamanho) {
        elementos = (T[]) new Object[tamanho];
        topoPilha = -1;
    }

    public Pilha() {
        this(TAM_DEFAULT);
    }

    // métodos
    public void push(T e) throws Exception {
        if (!isFull()) {
            elementos[++topoPilha] = e;
        }
        else {
            throw new Exception("Overflow - Estouro de Pilha");
        }
    }

    public T pop() throws Exception {
        if (!isEmpty()) {
            return elementos[topoPilha--];
        }
        else {
            throw new Exception("Underflow - Esvaziamento de Pilha");
        }
    }

    public T topo() throws Exception {
        if (!isEmpty()) {
            return elementos[topoPilha];
        }
        else {
            throw new Exception("Underflow - Esvaziamento de Pilha");
        }
    }

    public int sizeElements() {
        return topoPilha + 1;
    }

    public boolean isEmpty() {
        return topoPilha == -1;
    }

    public boolean isFull() {
        return topoPilha == elementos.length - 1;
    }
}