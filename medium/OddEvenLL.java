public class OddEvenLL {
    static class LinkedList {
        class Node {
            int val;
            Node next;
            public Node(int val) {
                this.val = val;
                this.next = null;
            }
        }
        private Node head, tail;
        private int size = 0;

        public void addLast(int val) {
            Node newNode = new Node(val);
            if(head == null) {
                head = tail = newNode;
                size++;
                return;
            }
            tail.next = newNode;
            tail = newNode;
            size++;
        }
        public Node oddEvenList(Node head) {
            if(head == null || head.next == null) return null;

            Node odd = head;
            Node even = head.next;
            Node evenHead = even;

            while(even != null && even.next != null) {
                odd.next = even.next;
                odd = odd.next;

                even.next = odd.next;
                even = even.next;
            }
            odd.next = evenHead;
            return head;
        }
        public void print() {
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.val+"->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.print();
        list.oddEvenList(list.head);
        list.print();
    }
}