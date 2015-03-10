package ArrayPractice;

public class TestEquals {

	public static void main(String[] args) {
		
		int[]a = new int[3], b = new int[3];
		TestEquals.setArray(a);
		setArray(b);
		
		System.out.println("Are a and b equal?"+equals(a,b));

	}
	
	public static boolean equals(int[]a, int[] b){
		boolean elementsMatch= true;
		if(a.length != b.length){
			elementsMatch = false;
		}else{
			int i = 0;
			while(elementsMatch && (i<a.length)){
				if(a[i] != b[i]){
					elementsMatch = false;
				}
				i++;
			}
		}
		
		return elementsMatch;
	}
	
	public static void setArray(int[]a){
		for(int i = 0; i<a.length; i++){
			a[i] = i;
		}
	}

}
