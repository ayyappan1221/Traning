import java.util.Scanner;
class Node{
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class BasicLink {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n == 0) {
            sc.close();
            return;
        }

        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        // Create linked list
        Node head = createLinkedList(a);

        // Display linked list
        displaylink(head);
    }

    // Creates linked list and returns head
    static Node createLinkedList(int a[]) {
        
    }

    // Displays linked list
    static void displaylink(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
