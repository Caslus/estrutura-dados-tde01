package dataStructures;

public class Stack{
    private final LinkedList list = new LinkedList();
    private int top = -1;

    /**
     * Adiciona valor na pilha
     * @param data Valor a ser adicionado
     */
    public void add(int data) {
        this.list.appendNode(data);
        this.top++;
    }

    /**
     * Remove o valor no topo da pilha
     * @return Valor removido
     */
    public int remove() {
        this.top--;
        return this.list.pop();
    }

    /**
     * @return Tamanho da pilha
     */
    public int size(){
        return this.top+1;
    }

    /**
     * @return Valor no topo da pilha
     */
    public int get(){
        return this.list.get(this.top);
    }

    /**
     * Imprime a pilha
     */
    public void print() {
        this.list.print();
    }
}
