import java.util.*;

class Maximum
{
	public int SecondMax(int arr[])
	{
		int max1=0,max2=0,i=0;
		max1=arr[0];
		max2=arr[0];

		for(i=0;i<arr.length;i++)
		{
			if(arr[i]>max1)
			{
				max2=max1;
				max1=arr[i];
			}
			else if((arr[i]>max2)&&(arr[i]!=max1))
			{
				max2=arr[i];
			}
			else if(max2==max1)
			{
				max2=arr[i];
			}
		}
		return max2;
	}
}

class max
{
	public static void main(String args[])
	{
		int iret=0;
		Scanner sob=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int isize=sob.nextInt();
		int arr[]=new int[isize];
		System.out.println("Enter the elements of array");
		for(int i=0;i<isize;i++)
		{
			arr[i]=sob.nextInt();
		}

		Maximum mobj=new Maximum();
		iret=mobj.SecondMax(arr);
		System.out.println("The second maximum element from the array is "+iret);
	}
}

