package projectAssiment;

public class pattern56 {

	public static void main(String[] args) 
	{
		for(int i=0;i<5;i++)
		{
			int k=1;
			for(int j=0;j<5;j++)
			{
				if(j+i>=4) 
					System.out.print(k+++" ");
				else
					System.out.print("-");
			}
			System.out.println();
			k++;

		}
	}

}
