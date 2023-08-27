package dataStructures;

public class LinkedList {
    private Node head;

    /**
     * Insere um nó no começo da lista
     * @param data Valor do nó
     */
    public void pushNode(int data){
        Node temp = new Node(data);
        temp.setNext(this.head);
        this.head.setPrevious(temp);
        this.head = temp;
        System.out.println("Valor adicionado: " + data);
    }

    /**
     * Insere um nó no final da lista
     * @param data Valor do nó
     */
    public void appendNode(int data){
        if(this.head == null) {
            this.head = new Node(data);
            System.out.println("Valor adicionado: " + data);
            return;
        }
        Node temp = this.head;
        while(temp.getNext() != null){
            temp = temp.getNext();
        }
        temp.setNext(new Node(data));
        temp.getNext().setPrevious(temp);
        System.out.println("Valor adicionado: " + data);
    }

    /**
     * Insere um nó no final da lista
     * @param data Valor do nó
     * @param noPrint Se 'true' não irá realizar print do valor adicionado
     */
    public void appendNode(int data, boolean noPrint){
        if(this.head == null) {
            this.head = new Node(data);
            if(!noPrint) {
                System.out.println("Valor adicionado: " + data);
            }
            return;
        }
        Node temp = this.head;
        while(temp.getNext() != null){
            temp = temp.getNext();
        }
        temp.setNext(new Node(data));
        temp.getNext().setPrevious(temp);
        if(!noPrint) {
            System.out.println("Valor adicionado: " + data);
        }
    }

    /**
     * Remove o nó no índice especificado
     * @param index Índice do nó
     */
    public void remove(int index){
        if(index<0) {
            System.out.println("Remoção inválida.");
            return;
        }
        if(index==0) {
            if(this.head == null) {
                System.out.println("Remoção inválida.");
                return;
            }
            System.out.println("Valor removido: " + this.head.getData());
            if(this.head.getNext() == null) {
                this.head = null;
                return;
            }
            this.head = this.head.getNext();
            this.head.setPrevious(null);
            return;
        }
        int count = 0;
        Node temp = this.head;
        while(count < index){
            if(temp.getNext() == null){
                System.out.println("Remoção inválida.");
                return;
            }
            temp = temp.getNext();
            count++;
        }
        if(temp.getNext() == null) {
            temp.getPrevious().setNext(null);
            System.out.println("Valor removido: " + temp.getData());
            return;
        }
        temp.getPrevious().setNext(temp.getNext());
        temp.getNext().setPrevious(temp.getPrevious());
        System.out.println("Valor removido: " + temp.getData());
    }

    /**
     * Remove o último nó da lista
     * @return Valor do nó removido
     */
    public int pop(){
        if(this.head == null){
            System.out.println("Remoção inválida.");
            return -1;
        }
        Node temp = this.head;
        while(temp.getNext() != null){
            temp = temp.getNext();
        }
        System.out.println("Valor removido: " + temp.getData());
        if(temp.getPrevious() == null){
            this.head = null;
            return temp.getData();
        }
        temp.getPrevious().setNext(null);
        return temp.getData();
    }

    /**
     * @return Tamanho da lista
     */
    public int length(){
        Node temp = this.head;
        if(temp == null) { return 0; }
        int length = 1;
        while(temp.getNext() != null) {
            temp = temp.getNext();
            length++;
        }
        return length;
    }

    /**
     * @param index Índice do nó
     * @return Valor do nó especificado
     */
    public int get(int index){
        Node temp = this.head;
        if(temp == null) {
            System.out.println("A lista está vazia.");
            return -1;
        }
        if(index<0) {
            System.out.println("Índice inválido.");
            return -1;
        }
        if(index==0) {
            return this.head.getData();
        }
        if(index > length()) {
            System.out.println("Índice inválido.");
            return -1;
        }
        else{
            for (int i = 0; i < index; i++) {
                temp = temp.getNext();
            }
            return temp.getData();
        }
    }

    /**
     * Imprime a lista
     */
    public void print(){
        if(this.head == null) {
            System.out.println("A lista está vazia.");
            return;
        }
        Node temp = this.head;
        while(temp.getNext()!=null){
            System.out.print(temp.getData() + "->");
            temp = temp.getNext();
        }
        System.out.println(temp.getData());
    }
}