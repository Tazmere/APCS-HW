
public class MyStack {
	private String[] z;
	private int top;
	private int numElts;
	
	public MyStack(){
		z = new String[10];
		top = -1;
		numElts = 0;
	}
	
	public void grow(){
		String[] f = new String[z.length + 10];
		for(int a = 0; a < z.length; a++){
			f[a] = z[a];
		}
		z = f;
	}
	
	public void push(String s){
		top++;
		while(top >= z.length){
			grow();
		}
		z[top] = s;
		numElts++;
		
	}
	
	public String pop(){
		String tmp = new String(z[top]);
		top = top--;
		numElts--;
		return tmp;
	}
	
	public String peek(){
		return z[top];
	}
	
	public int size(){
		return numElts;
	}
	
	
	public String toString(){
		String ret = new String();
		for(int a = top; a >= 0; a--){
			ret = ret + String.format("%s\n",z[a]);
			//with anmolpreet's help i got the formatting right
		}
		return ret;
	}
}

