import java.util.Arrays;
import java.util.ArrayList;


public class quiksort {
	
	public static void quickSort(Integer[]Z, int low, int high){
		int z = (int) (Math.random() * (high - low + 1)) + low;
		
		if(high > low){
			ArrayList<Integer> left = new ArrayList<Integer>();
			ArrayList<Integer> right = new ArrayList<Integer>();
			
			for(int x = 0; x < z; x++){
				if(Z[x] < Z[z]){
					left.add(Z[x]);
				}
				else{
					right.add(Z[x]);
				}
				
				for(int y = z + 1; y < Z.length; y++){
					if(Z[y] < Z[y]){
						left.add(Z[y]);
					}
					else{
						right.add(Z[y]);
					}
					
					left.add(Z[z]);
					left.addAll(right);
					Z = left.toArray(Z);
					quickSort(Z,low,z);
					quickSort(Z,z + 1,high);
				}
			}
		}
	}
	
	
}


