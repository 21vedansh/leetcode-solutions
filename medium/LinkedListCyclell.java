public class LinkedListCyclell {
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
        public Node detectCycle() {
        Node turtle = head, hare = head;
        boolean hasCycle = false;
        while(hare != null && hare.next != null) {
            turtle = turtle.next;
            hare = hare.next.next;
            if(hare == turtle) {
                hasCycle = true;
                break;
            }
        }
        if(hasCycle == false) {
            return null;
        }

        turtle = head;
        while(turtle != hare) {
            turtle = turtle.next;
            hare = hare.next;
        }
        return turtle;
    }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(3);
        list.addLast(2);
        list.addLast(0);
        list.addLast(-4);
        list.tail.next = list.head.next;
        System.out.println(list.detectCycle().val);
    }
}