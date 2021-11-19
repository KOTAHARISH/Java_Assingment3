package Assignment_3;

public class NumbertoWords {

	static void convertTowords(char[] num){
		int len = num.length;
		
		if (len == 0){
			System.out.println("empty string");
			return;
		}
		if(len>4){
		   System.out.println("Length more than 4 is not supported");
		   return;
		}
		String [] single_digits = new String[]{
				"zero","one","two","three","four","five","six","seven","eight","nine"	};
		
		String [] two_digits = new String[]{
				"","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		
		String [] ten_multiple = new String[]{
				"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety",	};
		
		String [] tens_power = new String[]{
				"hundreds","thousands",	};
		if (len == 1)
		{
			System.out.println(single_digits[num[0]-'0']);
			return;
		}
		
		int x=0;
		while(x < num.length)
		{
			if (len >=3)
			{
				if(num[x] -'0' !=0)
				{
					System.out.println(single_digits[num[x]-'0'] + " ");
					System.out.println(tens_power[len - 3] + " ");
				}
				--len;
			}
			else
			{
				if(num[x] - '0' == 1)
				{
					int sum = num[x] - '0'+ num[x+1] - '0';
					System.out.println(two_digits[sum]);
					return;
				}
				
			 
			    else if (num[x] - '0' == 2 && num[x +1] - '0' == 0  )
			      {
					System.out.println("twenty");
					return;
			     }
				
			    else
			   {
					int i = (num[x] - '0');
					if(i>0)
					{
						System.out.println(ten_multiple[i] + " ");
			        }
					else 
					
						System.out.println(" ");
					++x;
					
					if (num[x] - '0' != 0)
					{
						System.out.println(single_digits[num[x]-'0']);
					}
				}
				++x;
			}
		}
	}
	
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		convertTowords("1000".toCharArray());

	}

}
