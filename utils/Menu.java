package utils;
import dataStructures.LinkedList;
import dataStructures.Queue;
import dataStructures.Stack;

import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);

    static void divider(){
        System.out.println("-----+-----");
    }
    private static void queue() {
        Queue queue = new Queue();
        while(true) {
            divider();
            System.out.println("Fila:");
            queue.print();
            System.out.println("Opções:\n1-Adicionar\n2-Remover\n3-Voltar");
            int option = scanner.nextInt();
            switch (option) {
                case 1 -> {
                    System.out.println("Digite o valor a ser adicionado:");
                    int data = scanner.nextInt();
                    queue.add(data);
                }
                case 2 -> queue.remove();
                case 3 -> {return;}
                default -> System.out.println("Opção inválida.");
            }
        }
    }
    private static void stack() {
        Stack stack = new Stack();
        while(true) {
            divider();
            System.out.println("Pilha:");
            stack.print();
            System.out.println("Opções:\n1-Adicionar\n2-Remover\n3-Voltar");
            int option = scanner.nextInt();
            switch (option) {
                case 1 -> {
                    System.out.println("Digite o valor a ser adicionado:");
                    int data = scanner.nextInt();
                    stack.add(data);
                }
                case 2 -> stack.remove();
                case 3 -> {return;}
                default -> System.out.println("Opção inválida.");
            }
        }
    }
    private static void merge() {
        LinkedList listA = new LinkedList();
        LinkedList listB = new LinkedList();
        while(true) {
            divider();
            System.out.println("Merge:\nLista A:");
            listA.print();
            System.out.println("Lista B:");
            listB.print();
            System.out.println("Opções:\n1-Editar lista A\n2-Editar lista B\n3-Realizar merge\n4-Voltar");
            int option = scanner.nextInt();
            switch (option) {
                case 1 -> listA = editList(listA);
                case 2 -> listB = editList(listB);
                case 3 -> {
                    System.out.println("Resultado do merge:");
                    Merge.merge(listA, listB).print();
                }
                case 4 -> {return;}
                default -> System.out.println("Opção inválida.");
            }
        }
    }
    private static LinkedList editList(LinkedList list){
        while (true) {
            divider();
            System.out.println("Lista:");
            list.print();
            System.out.println("Opções:\n1-Adicionar\n2-Remover\n3-Voltar");
            int option = scanner.nextInt();
            switch (option) {
                case 1 -> {
                    System.out.println("Digite o valor a ser adicionado:");
                    int data = scanner.nextInt();
                    list.appendNode(data);
                }
                case 2 -> {
                    System.out.println("Índice a ser removido:");
                    int index = scanner.nextInt();
                    list.remove(index);
                }
                case 3 -> {return list;}
                default -> System.out.println("Opção inválida.");
            }
        }
    }
    public static void init() {
        while (true){
            System.out.println("Opções:\n1-Fila\n2-Pilha\n3-Merge\n4-Sair");
            int option = scanner.nextInt();
            switch (option) {
                case 1 -> queue();
                case 2 -> stack();
                case 3 -> merge();
                case 4 -> {return;}
                default -> System.out.println("Opção inválida.");
            }
        }
    }
}
