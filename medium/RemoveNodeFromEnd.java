public class RemoveNodeFromEnd {
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
        public void print() {
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.val+"->");
                temp = temp.next;
            }
            System.out.println("null");
        }
        public Node removeNthFromEnd(int n) {
            if(n == size) {
                head = head.next;
                return head;
            }
            int i = 1;
            int nodeToRemove = size - n;
            Node temp = head;
            while(i < nodeToRemove) {
                temp = temp.next;
                i++;
            }
            temp.next = temp.next.next;
            return head;
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(1);
        list.addLast(3);
        list.addLast(4);
        list.addLast(7);
        list.addLast(9);
        list.addLast(18);
        list.print();
        list.removeNthFromEnd(2);
        list.print();
    }
}