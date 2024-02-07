class LL {
    private int size;
    LL(){
        this.size = 0;
    }
    Node head;
    public class Node{
        String data;
        Node next;

        Node(String data){
            this.data= data;
            this.next=null;
            size++;
        }
    }
    //Add in First

    public void addFirst(String data){
      Node newnode = new Node(data);
      if(head==null){
        head = newnode;
        return;
      }
      newnode.next=head;
      head=newnode;
    }

    // Add element in last
    public void addLast(String data){
        Node newnode = new Node(data);
        if(head== null){
            head = newnode;
            return;
        }
        Node currNode = head;
        while(currNode.next!=null){
            currNode = currNode.next;
        }
        currNode.next = newnode;
    }
    //display list
    
    public void printList(){
        if(head== null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    // Delete element from first
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head=head.next;
    }

    // delete element from last

    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node secondLast= head;
        Node last = secondLast.next;
        while(last.next != null){
            last = last.next;
            secondLast = secondLast.next;
        }
        secondLast.next=null;
    }
    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("is");
        list.printList();
        list.addLast("a");
        list.printList();
        list.addFirst("this");
        list.printList();
        list.addLast("list");
        list.printList();
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();
        System.out.println(list.getSize());
        list.addFirst("this");
        System.out.println(list.getSize());
    }
}
