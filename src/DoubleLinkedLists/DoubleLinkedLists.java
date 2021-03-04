package DoubleLinkedLists;

public class DoubleLinkedLists<L> {
    private DoubleLinkedListElement head;
    private DoubleLinkedListElement tail;

    public DoubleLinkedLists() {
        head = tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addHead(L element) {
        DoubleLinkedListElement<L> newElement = new DoubleLinkedListElement<L>(element);
        newElement.next = head;
        newElement.previous = null;
        if (isEmpty()) head = tail = newElement;
        else  {
            head.previous = newElement;
            head = newElement;
        }
    }

    public void addTail(L element) {
        DoubleLinkedListElement<L> newElement = new DoubleLinkedListElement<L>(element);
        newElement.next = null;
        newElement.previous = tail;
        if (isEmpty())  head = tail = newElement;
        else {
            tail.next = newElement;
            tail = newElement;
        }
    }
}
