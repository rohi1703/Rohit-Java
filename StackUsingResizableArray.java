package algo.stack;

public class StackUsingResizableArray {
	private String arry[];
	private int num = 0;
	
	public StackUsingResizableArray()
	{
		arry = new String[1];
	}
	
	public boolean isStackEmpty()
	{
		if(num == 0 && arry[num] ==  null)
		{
			return true;
		}
		
		return false;
	}
	
	public void push(String item)
	{
		  //if()
		  arry[num]= item;
		  num++;
	}
	
	public String pop()
	{
		num--;
		String popedValue = arry[num];
		arry[num] = null;
		return popedValue;
	}

}
