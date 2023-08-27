package dataStructures;

public class Queue {
    private final LinkedList list = new LinkedList();

    /**
     * Adiciona valor na fila
     * @param data Valor a ser adicionado
     */
    public void add(int data) {
        this.list.appendNode(data);
    }

    /**
     * Remove o primeiro valor da fila
     * @return Valor removido
     */
    public int remove() {
        int n = this.list.get(0);
        this.list.remove(0);
        return n;
    }

    /**
     * @return Valor do primeiro elemento da fila
     */
    public int get(){
        return this.list.get(0);
    }

    /**
     * @return Tamanho da fila
     */
    public int length() {
        return this.list.length();
    }

    /**
     * Imprime a fila
     */
    public void print() {
        this.list.print();
    }
}
