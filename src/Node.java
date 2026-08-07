class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Main {

    static Node insert(Node head, int data) {
        Node newNode = new Node(data);

        if (head == null)
            return newNode;

        Node temp = head;
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;
        return head;
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data);
            if (head.next != null)
                System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    static Node mergeResult(Node node1, Node node2) {
        Node head = null;

        while (node1 != null && node2 != null) {
            if (node1.data <= node2.data) {
                Node next = node1.next;
                node1.next = head;
                head = node1;
                node1 = next;
            } else {
                Node next = node2.next;
                node2.next = head;
                head = node2;
                node2 = next;
            }
        }

        while (node1 != null) {
            Node next = node1.next;
            node1.next = head;
            head = node1;
            node1 = next;
        }

        while (node2 != null) {
            Node next = node2.next;
            node2.next = head;
            head = node2;
            node2 = next;
        }

        return head;
    }

    public static void main(String[] args) {

        // Both lists MUST be sorted in ascending order
        Node head1 = null;
        head1 = insert(head1, 1);
        head1 = insert(head1, 4);
        head1 = insert(head1, 7);

        Node head2 = null;
        head2 = insert(head2, 2);
        head2 = insert(head2, 3);
        head2 = insert(head2, 6);

        System.out.println("List 1:");
        printList(head1);

        System.out.println("List 2:");
        printList(head2);

        Node result = mergeResult(head1, head2);

        System.out.println("\nMerged List (Descending):");
        printList(result);
    }
}