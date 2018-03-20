package algo.stack;

public class MergeSort {
	/*public MergeSort(){};
	public void sort(Comparable[] a , Comparable[] aux, int low, int high)
	{
		if(high <= low) 
		{
			System.out.println("return called................................................");
			return;
		}
		int mid = low+(high-low)/2;
		//System.out.println("low = "+low+" mid = "+mid + " high = "+high);
		//System.out.println("calling 1st sort for "+" low= "+low+", "+" mid= "+mid);
		sort(a,aux, low, mid);
		//System.out.println("calling 2nd sort for "+" mid+1= "+(mid+1)+", "+" high= "+high);
		sort(a,aux, mid+1, high);
		merge(a,aux, low, mid, high);
		
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
	
	public void sort(Comparable[] a)
	{
		Comparable[] aux = new Comparable[a.length];
		sort(a,aux,0,a.length-1);
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]);
		}
	}
*/
	
	
	interface Lamp{

	    public void OnOff(boolean on);

	}

	abstract class Switch{

	    protected Lamp lamp;

	    public Switch(Lamp lamp) {
	        this.lamp = lamp;
	    }

	    public void OnOff(boolean on){
	        lamp.OnOff(on);
	    }

	}

	class LampA implements Lamp{


	    @Override
	    public void OnOff(boolean on) {
	        if (on)
	        System.out.println(" Lamp A on ");
	        else
	            System.out.println(" Lamp A off ");
	    }
	}

	class LampB implements Lamp{


	    @Override
	    public void OnOff(boolean on) {
	        if (on)
	            System.out.println(" Lamp B on ");
	        else
	            System.out.println(" Lamp B off ");
	    }
	}

	class SwitchA extends Switch{



	    public SwitchA(Lamp lamp) {
	        super(lamp);
	    }

	    public void OnOff(boolean on){
	        if (on)
	        System.out.println(" Switch A on ");
	        else
	            System.out.println(" Switch A off ");
	        lamp.OnOff(on);
	    }
	}


	class SwitchB extends Switch{



	    public SwitchB(Lamp lamp) {
	        super(lamp);
	    }

	    public void OnOff(boolean on){
	        if (on)
	            System.out.println(" Switch B on ");
	        else
	            System.out.println(" Switch B off ");
	        lamp.OnOff(on);
	    }
	}
}
