package edu.kis.vh.nursery.list;
/**
 * Klasa Node reprezentuje węzeł w strukturze danych.
 * Przechowują one wartości oraz wskazują na swoje sąsiednie węzły, co umożliwia efektywne dodawanie oraz usuwanie.
 *
 * Node -> tworzy nowy węzel z wartościa i
 * getValue -> zwraca wartość przechowywaną w danym węźle
 * setValue(int value) -> ustawia wanego węzła na value
 * getPrev -> zwraca referencję do poprzedniego węzła w liście
 * setPrev(Node prev) -> ustawia referencję do poprzedniego węzła na wartość prev
 * getNext -> zwraca referencję do następnego węzła w liście
 * setNext(Node next) -> ustawia referencję do następnego węzła na wartość next
 */
public class Node {


    private int value;
    private Node prev;
    private Node next;

    public Node(int i) {
        value = i;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
