class Nodeee {
    int data;
    Nodeee next;

    Nodeee(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedListtt {
    Nodeee head;

    public void append(int data) {
        if (head == null) {
            head = new Nodeee(data);
        } else {
            Nodeee current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Nodeee(data);
        }
    }

    public void printList() {
        Nodeee current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class llnew {
    public static void main(String[] args) {
        LinkedListtt list = new LinkedListtt();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);

        System.out.println("Linked List:");
        list.printList();
    }
}
