package projectAssiment;

public class pattern105 {

	public static void main(String[] args) {
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<5;j++)
			{
				if(j%2==0 && i%2!=0 )
					System.out.print("0");
				else if(j%2!=0 && i%2==0 )
					System.out.print("0");
				else
					System.out.print("1");
			}
			System.out.println();
		}
	}

}
