import java.util.Scanner;

public class Double_LL_insert {

  static class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
      this.data = data;
      this.next = null;
      this.prev = null;
    }
  }

  Node head = null;
  Node tail = null;

  public void creation() {

    int data, n;

    Scanner sc = new Scanner(System.in);
    do {
      System.out.print("Enter Data: ");
      data = sc.nextInt();

      Node ob = new Node(data);

      if (head == null) {
        head = ob;
        tail = ob;
      }

      else {
        System.out.print("1--> beg , 2--> end ,--> at any index: ");
        int index = sc.nextInt();

        switch (index) {
          case 1:
            ob.next = head;
            head.prev = ob;
            head = ob;
            break;

          case 2:
            tail.next = ob;
            ob.prev = tail;
            tail = ob;
            break;

          case 3:
            System.out.print("Enter the index value: ");
            int p = sc.nextInt();

            Node temp1 = head;
            Node ptr = temp1.next;
            for (int i = 1; i < (p - 1); i++) {
              temp1 = ptr;
              ptr = ptr.next;
            }
            temp1.next.prev = ob;
            ob.next = temp1.next;
            ob.prev = temp1;
            temp1.next = ob;
            break;
        }
      }

      System.out.print("Do you want to add more data press 1: ");
      n = sc.nextInt();
    }

    while (n == 1);
  }

  public void Transvers() {
    Node temp = head;
    try {
      if (head == null) {
        System.out.println("LL is not present! ");
      }

      else {
        do {
          System.out.print(temp.data + "  ");
          temp = temp.next;
        } while (head != null);
      }
    } catch (Exception e) {
      System.out.println("\n");
    }
  }

  public static void main(String[] args) {
    Double_LL_insert ob1 = new Double_LL_insert();
    ob1.creation();
    ob1.Transvers();
  }
}