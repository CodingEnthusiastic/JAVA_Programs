import java.io.*;

class Char_Reverse
{
	static void CharReverse(char[] str)
	{
		int i=0,j=str.length-1;
		while(i<j)

		{
			if(((str[i]>='a')&&(str[i]<='z'))&&((str[j]>='a')&&(str[j]<='z')))
			{
				
						char temp=str[i];
						str[i]=str[j];
						str[j]=temp;
						i++;
						j--;
					

					
			}
			else if (!((str[i]>='a')&&(str[i]<='z')))
			{
				i++;
			}

			else if (!((str[j]>='a')&&(str[j]<='z')))
                        {
                                j--;
                        }
		
			
			else
			{      i++;
				j--;
			}

					
		

		}	
		for(int k=0;k<=(str.length)-1;k++)
		{
			System.out.println(str[k]);
		}
	
	}

			
public static void main(String args[])
{
	char arr[]=new char[]{'a','b','$','c','d','#'};
	CharReverse(arr);
}
}
