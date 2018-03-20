package algo.stack;

public class MergeSortMain {

	public static void main(String[] args) {
		Integer[] a = {5,4,3,6,1,8,9,10};//,67,13,15,17,0,2,11,14};
		System.out.println("array length is " + a.length);
		//MergeSort ms = new MergeSort();
		MergeWithoutRecursion ms = new MergeWithoutRecursion();
		ms.sort(a);
		

	}

}
