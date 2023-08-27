package utils;
import dataStructures.LinkedList;

public class Merge {
    /*
    *    Seguindo o enunciado "Considere que as filas de entrada A e B sempre estarão ordenadas",
    *    não há verificação se as entradas estão ordenadas ou não.
    */

    /**
     * Combina 2 arrays em um array ordenado
     * @param arrayA Array A
     * @param arrayB Array B
     * @return Array A e Array B combinados em um único array ordenado
     */
    public static int[] merge(int[] arrayA, int[] arrayB){
        int length = arrayA.length + arrayB.length;
        if(length == arrayA.length) return arrayA;
        if(length == arrayB.length) return arrayB;
        int[] temp = new int[length];
        int a = 0;
        int b = 0;
        for (int i = 0; i < length; i++) {
            if(b == -1){
                temp[i] = arrayA[a++];
                continue;
            }
            if(a == -1) {
                temp[i] = arrayB[b++];
                continue;
            }
            if(arrayA[a] <= arrayB[b]){
                temp[i] = arrayA[a];
                a = a + 1 <= arrayA.length - 1 ? a+1 : -1;
            }
            else {
                temp[i] = arrayB[b];
                b = b + 1 <= arrayB.length - 1 ? b+1 : -1;
            }
        }
        return temp;
    }

    /**
     * Combina 2 listas em uma lista ordenada
     * @param listA Lista A
     * @param listB Lista B
     * @return Lista A e Lista B combinadas em uma única lista ordenada
     */
    public static LinkedList merge(LinkedList listA, LinkedList listB){
        int length = listA.length() + listB.length();
        if(length == listA.length()) return listA;
        if(length == listB.length()) return listB;
        LinkedList temp = new LinkedList();
        int a = 0;
        int b = 0;
        for (int i = 0; i < length; i++) {
            if(b == -1){
                temp.appendNode(listA.get(a), true);
                a++;
                continue;
            }
            if(a == -1) {
                temp.appendNode(listB.get(b), true);
                b++;
                continue;
            }
            if(listA.get(a) <= listB.get(b)){
                temp.appendNode(listA.get(a), true);
                a = a + 1 <= listA.length() - 1 ? a+1 : -1;
            }
            else {
                temp.appendNode(listB.get(b), true);
                b = b + 1 <= listB.length() - 1 ? b+1 : -1;
            }
        }
        return temp;
    }
}
