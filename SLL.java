class SLL{
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
        }
    }

    public void addfirst(String data){

        Node newNode =new Node(data);
        if(head==null){
            head=newNode;
            return;
        }

        newNode.next=newNode;
        head=newNode;
    }



public void addlast(String data){
    Node curr=head;
    Node newNode =new Node(data);
    if(head==null){
        head=newNode;
        return;
    }
    while(curr.next !=null){
        curr=curr.next;
    }
    curr.next=newNode;
}



public void removeFirst() {
    if(head == null) {
        System.out.println("Empty List, nothing to delete");
        return;
    }


    head = this.head.next;
    
}


public void removeLast() {
    if(head == null) {
        System.out.println("Empty List, nothing to delete");
        return;
    }


    
    if(head.next == null) {
        head = null;
        return;
    }


    Node currNode = head;
    Node lastNode = head.next;
    while(lastNode.next != null) {
        currNode = currNode.next;
        lastNode = lastNode.next;
    }


    currNode.next = null;
}



public void display(){
    Node curr=head;

    while(curr !=null){
  System.out.print(curr.data +"->");
  curr=curr.next;
    }
    System.out.print("null");

}


public Node revercerecursive(Node head){

    if(head==null || head.next==null){
        return head;
    }
    Node newhead=revercerecursive(head.next);
    head.next.next=head;
    head.next=null;
    return newhead ;

}



public static void main(String[] args) {
    SLL li =new SLL();
    li.addfirst("odd");
    li.addlast("kckc");
    li.addlast("kd lkd");
    li.addlast("dkm;");
    li.addlast(" AL ");

    li.revercerecursive(li.head);
    li.display();
}
}