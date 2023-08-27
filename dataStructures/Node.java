package dataStructures;

public class Node {
    private int data;
    private Node next;
    private Node previous;

    /**
     * Cria um nó com o valor especificado
     * @param data Valor do nó
     */
    public Node(int data) {
        this.data = data;
    }

    /**
     * @return Valor do nó
     */
    public int getData() {
        return data;
    }

    /**
     * Define o valor do nó
     * @param data Valor a ser definido
     */
    public void setData(int data) {
        this.data = data;
    }

    /**
     * @return Próximo nó
     */
    public Node getNext() {
        return next;
    }

    /**
     * Define o próximo nó
     * @param next Próximo nó a ser definido
     */
    public void setNext(Node next) {
        this.next = next;
    }

    /**
     * @return Nó anterior
     */
    public Node getPrevious() {
        return previous;
    }

    /**
     * Define o nó anterior
     * @param previous Nó anterior a ser definido
     */
    public void setPrevious(Node previous) {
        this.previous = previous;
    }
}
