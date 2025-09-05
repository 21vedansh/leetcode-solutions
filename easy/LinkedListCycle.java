public class LinkedListCycle {
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
        // public void print() {
        //     Node temp = head;
        //     while(temp != null) {
        //         System.out.print(temp.val+"->");
        //         temp = temp.next;
        //     }
        //     System.out.println("null");
        // }
        public boolean hasCycle() {
            if(head == null || head.next == null) {
                return false;
            }
            Node turtle = head;
            Node hare = head;
            while(hare != null && hare.next != null) {
                turtle = turtle.next;
                hare = hare.next.next;

                if(turtle == hare) {
                    return true;
                }
            }
            return false;
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(3);
        list.addLast(2);
        list.addLast(0);
        list.addLast(-4);
        list.tail.next = list.head.next;
        System.out.println(list.hasCycle());
    }
}