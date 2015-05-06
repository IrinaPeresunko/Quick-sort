package quickSortWithRecursion;

import java.util.Arrays;

public class QuickSortWithRecursion {
	private int[] ODarray;
	private int[][] TDarray;
	private int first;
	private int last;
	private int middle;
	
	public int[] getODArray(){
		return ODarray;
	}
	public int[][] getTDarray(){
		return TDarray;
	}
	private int[] createOneDimensionalArray(int N){
		ODarray = new int[N];
		for(int i=0;i<N;i++){
			ODarray[i] = (int) Math.random()%10;
		}
		return ODarray;
	}
	private int[][] createTwoDimensionalArray(int N){
		TDarray = new int[N][N];
		for(int i=0;i<N;i++){
			TDarray[i] = new int[N];
		}
		for(int i=0;i<N;i++){
			for(int j=0;j<N;j++){
				TDarray[i][j]  = (int) Math.random();
			}
		}
		return TDarray;
		
	}
	public QuickSortWithRecursion(int[] array,int first,int last){
		this.ODarray=array;
		if(first>=0 && last>=0){
			this.first=first;
			this.last = last;
			this.middle=(first+last)/2;
		}
		else{
			System.out.println("The input numbers are not correct for this program");
			this.first=this.last = this.middle=0;
		}
	}
	public QuickSortWithRecursion(int dimension,int countOfElements){
		if(dimension==1){
			createOneDimensionalArray(countOfElements);
		}
		else{
			createTwoDimensionalArray(countOfElements);
		}
	}
	public static void main(String[] args){
		QuickSortWithRecursion qswr = new QuickSortWithRecursion(1,20);
		System.out.println(qswr.getODArray().toString());
		System.out.println(Arrays.toString(qswr.getODArray()));
		
	}

}
