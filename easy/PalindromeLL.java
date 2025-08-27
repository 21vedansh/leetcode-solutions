public class PalindromeLL {
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
        public Node findMid(Node head) {
            Node turtle = head;
            Node hare = head;
            while(hare != null && hare.next != null) {
                turtle = turtle.next;
                hare = hare.next.next;
            }
            return turtle;
        }
        public boolean isPalindrome() {
            if(head == null && head.next == null) {
                return true;
            }
            Node mid = findMid(head);

            Node prev = null;
            Node current = mid;
            Node next;
            while(current != null) {
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
            }
            Node right = prev;
            Node left = head;

            while(right != null) {
                if(left.val != right.val) {
                    return false;
                }
                left = left.next;
                right = right.next;
            }
            return true;
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(2);
        list.addLast(1);
        System.out.println(list.isPalindrome());
    }
}