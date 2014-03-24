
public class List {
	    private Node head;
	    
	    
	    public List(){
	head = new Node("");
	    }
	    
	     public void add(String d){
	Node tmp = new Node(d);
	tmp.setNext(head.getNext());
	head.setNext(tmp);
	     }
	     
	    public void addLoc(int i,String d){
	Node tmp = head.getNext();
	        for (int z=1; z<i-1;z++){
	tmp = tmp.getNext();
	}
	Node f = new Node(d);
	f.setNext(tmp.getNext());
	tmp.setNext(f);
	    }
	    
	    public String get(int i){
	int f = 0;
	Node tmp = head.getNext();
	// System.out.println(tmp.getData());
	while (f<i){
	tmp.getNext();
	System.out.println(tmp.getData());
	f++;
	}
	return tmp.getData();
	    }
	    
	    public String set(int i, String d){
	Node tmp = head.getNext();
	for (int z=1;z<i;z++){
	tmp = tmp.getNext();
	}
	String f = tmp.getData();
	tmp.setData(d);
	return f;
	    }
	    
	    
	    public String remove(int i){
	Node x=head;
	Node tmp = head.getNext();
	for (int z=0;z<i;z++){
	x = tmp;
	tmp = tmp.getNext();
	}
	String f = tmp.getData();
	x.setNext(tmp.getNext());
	return f;
	    }
	    
	    
	    public int find(String f){
	Node tmp = head.getNext();
	int index = 0;
	while (tmp != null){
	if (tmp.getData().equals(f)){
	return index;
	}
	tmp = tmp.getNext();
	index++;
	}
	return -1;
	    
	      }
	    
	    
	    public int size(){
	int x = 0;
	Node tmp = head.getNext();
	while (tmp != null){
	tmp = tmp.getNext();
	x++;
	}
	return x;
	    }


	    public String toString(){
	String f = "";
	        Node tmp = head.getNext();
	while (tmp!=null){
	f += tmp + " ";
	tmp = tmp.getNext();
	}
	return f;
	    }
}
