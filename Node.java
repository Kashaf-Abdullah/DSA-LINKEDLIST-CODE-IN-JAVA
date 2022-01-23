

class Node{
    int data;
    Node next;
    Node(int data ){
        this.data=data;
    }
    Node(int data,Node next ){
        this.data=data;
        this.next=next;
    }
    Node head=null;
    Node tail;
    void add(int data){
        Node curr=new Node(data);
        if(head==null){
            head=curr;
            tail=curr;
        }
        else{
            tail.next=curr;
            tail=curr;

        }
    }
    void printList(){
        Node p=head;
        for(Node i=p;i!=null;i=i.next){
            System.out.print(i.data+"->");
        }
        System.out.print("null");
    }
void search(int num){
    Node p=head;
    int count=0;
    for(Node i=p;i.next!=null;i=i.next){
        count++;
        if(i.data==num){
            break;
        }
        
       
    }
System.out.println("element is found at "+count);
}
void sum(){
    Node p=head;
    int s=0;
    for(Node i=p;i!=null;i=i.next){
     s=s+i.data;
    }
    System.out.println("the sum of linked list elements is "+s);
}
Node delete(Node l,int x){
    if(l==null||l.data>x){
       return l;
    }
    if(l.data==x){
       return l.next;
    }
    for(Node i=l;i.next!=null;i=i.next){
        if(i.next.data>x){
            break;
        }
        if(i.next.data==x){
            i.next=i.next.next;
        }
    }
    return l;
}
void sizeofLL(){
    int count=0;
    Node p=head;
    while(p!=null){
        p=p.next;
        count++;
    }
    System.out.println("the size of LinkedList is "+count);
}
Node  replace(Node n,int pos ,int data){
    Node i=head;
    int count=1;
    while(i.next!=null){
       
       if(count==pos){
           break;
       }
       count++;
        i=i.next;
       
    }
    i.next=new Node(data,i.next.next);
return n;

}
Node deleteLastElemnt(Node node){
    if(node==null){
        return node;
    }
    for(Node i=node;i!=null;i=i.next){
     if(i.next==null){
         return null;
     }
     if(i.next.next==null){
         i.next=null;
     }


}
return node;
}
    public static void main(String args[]){
        Node n=new Node(22);
        n.add(1);
        n.add(2);
        n.add(3);
        n.add(4);
        n.printList();
n.search(2);
n.sum();
// n.delete(n.head,9);
n.printList();
n.sizeofLL();
n.replace(n.head, 1, 32);
n.printList();
n.deleteLastElemnt(n.head);
n.printList();
}
}
