import java.util.Arrays;


public class ArrayMethods {
	private int[] values;
	public ArrayMethods(int[] initialValues){
		values=initialValues;
	}	
	public void swapFirstAndLast(){
		int aa=values[0];
		int bb=values[values.length-1];
		values[0]=bb;
		values[values.length-1]=aa;
	}
	public void shiftRight(){
		int y=values[values.length-1];
		int z=values[values.length-2];
		for(int n=values.length-2;n>0;n--)
			{
			values[n]=values[n-1];	
			}
		values[values.length-1]=z;
		values[0]=y;
				
	}
	public void replaceEvens(){
		for(int m=0;m<values.length;m++)
		{
			if (values[m]%2==0)
			{
			values[m]=0;	
			}
		}
	}
	public void replaceByLargerElement(){
		for(int j=1;j<values.length-1;j++)
		{
			if(values[j-1]>=values[j+1])
			{
			values[j]=values[j-1];	
			}
			if(values[j+1]>values[j-1])
			{
			values[j]=values[j+1];	
			}
		}
	}
	public void replaceMiddleElements(){
		if(values.length%2==0)
		{
			values[values.length/2]=0;
			values[values.length/2-1]=0;
		}
		else{values[(values.length/2)]=0;}
	}
	public void moveEvenToFront(){//broken
		for(int p=0;p<values.length;p++)
		{
			if(values[p]%2==0)
			{
			values[0]=values[p];
			values[p]=values[0];
			}
		}
	}
	public int returnSecondLargest(){//slightly broken because it also sorts the array
		Arrays.sort(values);
		int aaa=values[values.length-2];
		return aaa;
	}
	public boolean returnIncreasingOrder(){//assumes that typing the same number two times in a row is increasing
		boolean fact=true;
		for(int r=0;r<values.length-1;r++)
		{
			if(values[r+1]<values[r])
			{
			fact=false;
			break;
			}
		}
		return fact;
	}
	public boolean returnAdjacentDuplicates(){
		boolean fact1=false;
		for(int s=0;s<values.length-1;s++)
		{
			if(values[s]==values[s+1])
			{
			fact1=true;
			break;
			}
			if(values[s]!=values[s+1])
			{
			fact1=false;	
			}
		}
		return fact1;
	}
	public boolean returnDuplicates(){
		boolean fact2=false;
		for(int t=0;t<values.length;t++)
		{
			for(int u=1;u<values.length-t;u++)
			{
				System.out.println(u);
				if(values[t]==values[t+u])
				{
				fact2=true;
				break;
				}
			}
			if(fact2==true)
			{
			break;	
			}
		}
		return fact2;
	}
	public void returnArray(){
		for(int x=0;x<values.length;x++)
		{
			System.out.print(values[x]+"\t");
		}
	}

}
