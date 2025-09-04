public class BinaryNumtoIntInLL {
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
        public int getDecimalValue() {
        int decimalNum = 0;
        Node temp = head;
        while(temp != null) {
            decimalNum = (decimalNum * 2) + temp.val;
            temp = temp.next;
        }
        return decimalNum;
    }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(1);
        list.addLast(0);
        list.addLast(1);
        list.print();
        System.out.println(list.getDecimalValue());        
    }
}