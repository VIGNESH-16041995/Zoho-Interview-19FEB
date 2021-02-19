
public class PrintLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="WATER";
		int curr =0;
		int len=input.length();
		
		for(int i=0;i<input.length();i++)
		{
			int mid=len/2;
			for(int k=0;k<len-i-1;k++)
				System.out.print(" ");
				
			for(int j=0;j<=i;j++)
			{
				if(mid>=len)
				{
				mid=0;
				
				}
				System.out.print(input.charAt(mid));
				mid++;
			}
			System.out.println("");
		}

	}

}
