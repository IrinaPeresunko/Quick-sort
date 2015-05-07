package quickSortWithRecursion;

import java.util.Arrays;

public class QuickSortWithRecursion {
	private int[] ODarray;
	private int[][] TDarray;
//	private int first;
//	private int last;
	private int middle;
	
	public int getMiddleElement(){
		return middle;
	}
	private int getMin(){
		int min;
		if(ODarray!=null){
			min=ODarray[0];
			for(int i=0;i<ODarray.length;i++){
				if(min>ODarray[i]){
					min = ODarray[i];
				}
			}
		}
		else{
			min = TDarray[0][0];
			for(int i=0;i<TDarray.length;i++){
				for(int j=0;j<TDarray[i].length;j++){
					if(min>TDarray[i][j]){
						min = TDarray[i][j];
					}
				}
			}
		}
		return min;
	}
	private int getMax(){
		int max=0;
		if(ODarray!=null){
			max=ODarray[0];
			for(int i=0;i<ODarray.length;i++){
				if(max<ODarray[i]){
					max = ODarray[i];
				}
			}
		}
		else{
			max = TDarray[0][0];
			for(int i=0;i<TDarray.length;i++){
				for(int j=0;j<TDarray[i].length;j++){
					if(max<TDarray[i][j]){
						max = TDarray[i][j];
					}
				}
			}
		}
		return max;
	}
	private int calculateMiddleElement(){
		return (getMax()+getMin())/2;
	}
	public void print(){
		if(ODarray!=null){
			System.out.println(Arrays.toString(ODarray));
		}
		else{
			for(int i=0;i<TDarray.length;i++){
				for(int j=0;j<TDarray[i].length;j++){
					System.out.print(TDarray[i][j]+" ");
				}
				System.out.println();
			}		
		}
	}
	public Object getArray(){
		if(ODarray!=null){
			return ODarray;
		}
		return TDarray;
	}
	public int[] getODArray(){
		return ODarray;
	}
	public int[][] getTDarray(){
		return TDarray;
	}
	private int[] createOneDimensionalArray(int N){
		ODarray = new int[N];
		for(int i=0;i<N;i++){
			ODarray[i] = (int) (Math.random()*20);
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
				TDarray[i][j]  = (int) (Math.random()*20);
			}
		}
		return TDarray;
		
	}
	public QuickSortWithRecursion(int[] array){
		this.ODarray=array;
		this.middle=calculateMiddleElement();
	}
	public QuickSortWithRecursion(int[][] array){
		this.TDarray=array;
		this.middle=calculateMiddleElement();
	}
	public QuickSortWithRecursion(int dimension,int countOfElements){
		if(dimension==1){
			createOneDimensionalArray(countOfElements);
			this.middle=calculateMiddleElement();
		}
		else{
			createTwoDimensionalArray(countOfElements);
			this.middle=calculateMiddleElement();
		}
	}
	public static void main(String[] args){
		QuickSortWithRecursion qswr = new QuickSortWithRecursion(1,20);
		//System.out.println(Arrays.toString((int[]) qswr.getArray()));
		
		QuickSortWithRecursion qswr1 = new QuickSortWithRecursion(2,5);
		qswr.print();
		System.out.println("middle = "+qswr.getMiddleElement());
		qswr1.print();
		System.out.println("middle = "+qswr1.getMiddleElement());
	}

}
