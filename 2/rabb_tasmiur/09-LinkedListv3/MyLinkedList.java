import java.io.*;
import java.util.*;

public class MyLinkedList {
	    
	    private Node head;
	    private Node tail;
	    
	    public MyLinkedList(){
		head = null;
	    }
	    
	    
	
	    public void add(String d){
		Node tmp = new Node(d);
		if(head == null){
			tmp.setNext(tail);
			head = tmp;
		}
		if(head.getNext()== null){
			head.setNext(tmp);
			tail = tmp;
		}
		
		else{
			tail.setNext(tmp);
			tail = tmp;
		}
	    }
	    	
	    
	    
	    public void addV2(int i, String d){
	    	Node tmp = head;
	    	for(int z = 0; z < i - 1; z++){
	    		tmp = tmp.getNext();
	    	}
	    	Node f = new Node(d);
	    	f.setNext(tmp.getNext());
	    	tmp.setNext(f);
	    	if(tmp == tail){
	    		tail = f;
	    	}
	    }
	    	
	    public void addTail(String d){
	    	int z = this.length();
	    	addV2(z, d);
	    }
	    
	    public String get(int i){
	    	Node tmp = head;
	    	for ( int z = 0; z < i; z ++){
	    		tmp = tmp.getNext();
	    	}
	    	return tmp.getData();
	    }
	    
	    public String set(int i, String d){
	    	Node tmp = head;
	    	for(int z = 0; z < i; z++){
	    		tmp = tmp.getNext();
	    	}
	    	String f = tmp.getData();
	    	tmp.setData(d);
	    	return f;
	    }
	    
	    public String remove(int i){
	    	Node tmp = head;
	    	for(int z = 0; z < i - 1; z++){
	    		tmp = tmp.getNext();
	    	}
	    	String f = tmp.getNext().getData();
	    	tmp.setNext(tmp.getNext().getNext());
	    	return f;
	    }
	    
	    
	    
	    public String toString(){
		  String z = "";
		  Node c = head;
		  while (c != null){
		      z = z + c + " " ;
		      c = c.getNext();
		  }
		  return z;
	      }
	    
	    public int length(){
		int count = 0;
		Node c = head;
		while(c != null){
		    count++;
		    c = c.getNext();
		}
		return count;
	    }
	    	
	    public int find(String d){
	    	int z = 0;
	    	Node tmp = head;
	    	while(tmp != null){
	    		tmp = tmp.getNext();
	    		z++;
	    	}
	    	return z;
	    }
	
}


