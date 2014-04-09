
public class RPNcalc {
	private MyStack calc;
	private final String operations = "+-*/^";
	
	public RPNcalc(){
		calc = new myStack();
	}
	
	public int calc(String z){
		for(int a = 0; a < z.length(); a++){
			String f = z.substring(a,a+1);
			int s = operations.indexOf(f);
			if(s == -1){
				calc.push(Integer.parseInt(f));
			}
			else if(s == 0){
				calc.push(calc.pop() + calc.pop());
			}
			else if (s == 1){
				calc.push(0 - calc.pop() + calc.pop());
			}
			else if(s == 2){
				calc.push(asd.pop() * asd.pop());
			}
			else if(s == 3){
				calc.push(1 / asd.pop() * asd.pop());
			}
			else if(s == 4){
				int pow = asd.pop();
				asd.push((int)Math.pow(asd.pop(), pow));
			}
		}
		return asd.pop();
		
			
			}
}
