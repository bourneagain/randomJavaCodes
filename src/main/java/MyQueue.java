/**
 * Created by srajendran on 7/28/15.
 */

class Node{
    int val;
    Node next;
    Node(int x ){
        val = x;
        next = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}

public class MyQueue
{

    Node first, last;

    public void enqueue(Node newNode){
        if ( first == null ){
            first = newNode;
            last = first;
        } else  {
            last.next = newNode;
            last = newNode;
        }
    }

    public Node deque(){
        if ( first != null ){
            Node temp = new Node(first.val);
            // check the difference if u return first: the return node changes the source!!!
//            Node temp = first;
            first = first.next;
            return temp;
        } else {
            return null;
        }

    }


    public static void main(String[] args) {
        MyQueue t = new MyQueue();
        t.enqueue(new Node(1));
        t.enqueue(new Node(2));
        t.enqueue(new Node(3));
        Node a = t.deque();
        a.next.next.val = 50;
        System.out.println(t.deque());
        System.out.println(t.deque());

    }
}
