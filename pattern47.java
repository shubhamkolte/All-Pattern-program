package projectAssiment;

public class pattern47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<9;i++)
		{
			for(int j=0;j<9;j++)
			{
				if(j-i<=0 ) 
					System.out.print(9-j);
				else
					System.out.print(" ");
			}
			System.out.println();

		}

	}

}
