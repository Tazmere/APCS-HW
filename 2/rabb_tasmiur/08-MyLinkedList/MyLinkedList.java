import java.io.*;
import java.util.*;

public class MyLinkedList {
	    
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
		tmp.setNext(head);
		head = tmp;
	    }
	    
	    public void addV2(int i, String d){
	    	Node tmp = head;
	    	for(int z = 0; z < i - 1; z++){
	    		tmp = tmp.getNext();
	    	}
	    	Node f = new Node(d);
	    	f.setNext(tmp.getNext());
	    	tmp.setNext(f);
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
	
}


