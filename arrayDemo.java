public class arrayDemo{
	public static void printArray(int[]ary){
		System.out.print(toString(ary));
	}
	public static void printArray(int[][]ary){
		for(int i = 0;i < ary.length;i++){
			System.out.println(toString(ary));
		}
	}
	public static String toString(int[]ary){
		String ans = "{";
		for(int i = 0;i < ary.length;i++){
			ans += ary[i];
			if (i < ary.length-1){
				ans += ", ";
			}
		}
		return ans+"}";
	}
	public static void main(String[] args) {
		int[] ary = {1,2,3};
		printArray(ary);
	}
}
