public class arrayDemo{
	public static void printArray(int[]ary){
		System.out.println(toString(ary));
	}
	public static void printArray(int[][]ary){
		for(int i = 0;i < ary.length;i++){
			System.out.println(toString(ary[i]));
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
	public static int countZeros2D(int[][] nums){
		int ans = 0;
		for(int i = 0;i < nums.length;i++){
			for(int j = 0;j < nums[i].length;j++){
				if(nums[i][j] == 0){
					ans++;
				}
			}
		}
		return ans;
	}
	public static void fill2D(int[][] vals){
		for(int i=0;i<vals.length;i++){
			for(int j=0;j<vals[i].length;j++){
				if(i==j){
					vals[i][j]=3;
				}
				else vals[i][j]=1;
			}
		}
	}
	public static int[][] fill2DCopy(int[][] vals){
		int[][] ans = new int[vals.length][];
		for(int i=0;i<vals.length;i++){
			ans[i] = new int[vals[i].length];
		}
		for(int i=0;i<ans.length;i++){
			for(int j=0;j<ans.length;j++){
				if(vals[i][j]<0){
					ans[i][j]=3;
				}
				else ans[i][j]=1;
			}
		}
	}
	public static void main(String[] args) {
		/*
		int[] ary = {1,2,3};
		printArray(ary);
		int[][] ary2 = {{1,0,3},{0,5,6,0,0}};
		fill2D(ary2);
		printArray(ary2);
		*/
	}
}
