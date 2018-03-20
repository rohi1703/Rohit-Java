package algo.stack;

public class MergeWithoutRecursion {
	
	public void sort(Comparable[] a)
	{
		Comparable[] aux = new Comparable[a.length];
		sort(a,aux);
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]);
		}
	}
	
	public void sort(Comparable[] a , Comparable[] aux)
	{
		int size = 2;
		int high;
		for(int i=0; i<=a.length; i=size)
		{
			high = size-1;
			for(int low=0; high< a.length; low=low+size,high=high+size)
			{
				int mid = low+(high - low)/2;
				merge(a,aux, low, mid,high);
				
			}
			size=size*2;
		}
	}
	
	public void merge(Comparable[] a , Comparable[] aux, int low, int mid, int high)
	{
		System.out.printf("merge called for"+"= "+ low +", " + mid +", " + high);
		System.out.println();
		//copy the array items from low to high in temp array
		for(int i=low; i<=high; i++)
		{
			aux[i] = a[i];
		}
		int j = mid+1;
		int ai = low;
		
		while(low < (mid+1) && j < high+1)
		{
			int i = aux[low].compareTo(aux[j]);
			
			if(i == 1)
			{//means aux[j] is smaller
				a[ai] = aux[j];
				j++;
				ai++;
			}
			//case1: when j is smaller
			//case2: when both are equal. To maintain stability, 
			//value from left array should be copied to the original array.
			else
			{//means aux[low] is smaller..move it to main array and increment low
				a[ai] = aux[low];
				low++;
				ai++;
			}
		}
		
		//left array is traversed.
		if(low == mid+1)
		{
			while(j < high+1)
			{
				a[ai] = aux[j];
				j++;
				ai++;
			}
		}
		
		if(j > high)
		{
			while(low < mid+1)
			{
				a[ai] = aux[low];
				low++;
				ai++;
			}
		}
		
	}

}
