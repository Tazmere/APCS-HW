public class MyLinkedList{
    
    private Node head;
    
    public MyLinkedList(){
	head = null;
    }

    public MyLinkedList(String s){
	head.data = s;
	head.next = null;
    }

    public MyLinkedList(String s, Node n){
	head.data = s;
	head.next = n;
    }

    
    public void add(String d){
	Node tmp = new Node(d);
	//head = tmp;
	tmp.setNext(head);
	head = tmp;
    }
    
    public String toString(){
	  String z = "";
	  Node c = head;
	  while (c != null){
	      z = z + c.data + " " ;
	      c = c.next;
	  }
	  return z;
      }
    
    public int length(){
	int count = 0;
	Node c = head;
	while(c != null){
	    count++;
	    c = c.next;
	}
	return count;
    }

	