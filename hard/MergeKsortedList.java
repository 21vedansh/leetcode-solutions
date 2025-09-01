public class MergeKsortedList {
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
        public void print(Node head) {
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.val+"->");
                temp = temp.next;
            }
            System.out.println("null");
        }
        public Node mergeKLists(Node[] lists) {
            if(lists.length == 0) return null;

            return mergeInRange(lists, 0, lists.length-1);
        }
    
        public Node mergeInRange(Node lists[], int left, int right) {
            if(left == right) return lists[left];

            int mid = left + (right-left) / 2;
            Node leftPart = mergeInRange(lists, left, mid);
            Node rightPart = mergeInRange(lists, mid+1, right);
            return sortedMerge(leftPart, rightPart);
        }
        public Node sortedMerge(Node a, Node b) {
            if(a == null) return b;
            if(b == null) return a;

            if(a.val <= b.val) {
                a.next = sortedMerge(a.next, b);
                return a;
            } else {
                b.next = sortedMerge(a, b.next);
                return b;
            }
        }
    }
    public static void main(String[] args) {
        LinkedList list1  = new LinkedList();
        list1.addLast(1);
        list1.addLast(4);
        list1.addLast(7);
        
        LinkedList list2  = new LinkedList();
        list2.addLast(1);
        list2.addLast(3);
        list2.addLast(4);

        LinkedList list3  = new LinkedList();
        list3.addLast(2);
        list3.addLast(6);

        LinkedList.Node lists[] = {list1.head, list2.head, list3.head};

        LinkedList helper = new LinkedList();
        LinkedList.Node mergerHead = helper.mergeKLists(lists);

        helper.print(mergerHead);
    }
}