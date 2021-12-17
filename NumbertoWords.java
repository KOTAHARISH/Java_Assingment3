package Assignment_3;

public class NumberToWords{
	
	static void NumberToWords(int num){
		String [] ones = {"","one","two","three","four","five","six","seven","eight","nine"};
		String [] elevenToNineteen = {"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String [] tens = {"twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
		String [] hundreds = {"hundred","thousand"};
		
		int digit1 = num%10;int num2 =num/10;
		int digit2 = num2%10;int num3 =num2/10;
		int digit3 = num3%10;int num4 =num3/10;
		int digit4 = num4%10;
		
//		System.out.println(digit1);
//		System.out.println(digit2);
//		System.out.println(digit3);
//		System.out.println(digit4);
		
		int x = num%100;
//		System.out.println("digit3 : "+ digit3 );
		
		String	nums =Integer.toString(num);
		//System.out.println("Number lenth is :"+nums.length());
		// 1 to 9
		if(nums.length()==1){
			System.out.println(ones[digit1]);
		}
		// 10 to 99
		else if(nums.length()==2){
			//10 to 19
			if(num>=10 && num <=19){
				System.out.println(elevenToNineteen[digit1]);
			}
			// 20 to 99
			else if (num>=20 && num<=99){
				System.out.println(tens[digit2-2]+" "+ones[digit1]);
			}
		}
		
		// 100 to 999
		else if(nums.length()==3){
			if(x>=10&&x<=19){
				
				System.out.println(ones[digit3]+" "+hundreds[0]+" and "+elevenToNineteen[digit1]);
			}
			//100 to 109 Nd 200 t0 209 -----
			else if(digit2==0){
				System.out.println(ones[digit3]+" "+hundreds[0]+" "+ones[digit1]);
			}
			else{
				System.out.println(ones[digit3]+" "+hundreds[0]+" "+tens[digit2-2]+"  "+ones[digit1]);
			}
		}
		// 1000 to 9999 
		else if(nums.length()==4){
			if(x>=10&&x<=19){
				
				System.out.println(ones[digit4]+" "+hundreds[1]+" "+ones[digit3]+" "+hundreds[0]+" and "+elevenToNineteen[digit1]);
			}
			//1006,1008,2008--- NUMBERS AND 1106 ,1206,13406,3609--- numbers
			else if (digit2==0 ||digit3==0){
				
				if(digit2==0 &&digit3!=0){
				    System.out.println(ones[digit4]+" "+hundreds[1]+" "+ones[digit3]+" "+hundreds[0]+" and "+ones[digit1]);
				 }
				else if (digit3==0&&digit2==0){
					
					
					System.out.println(ones[digit4]+" "+hundreds[1]+" "+ones[digit3]+" "+ones[digit1]);
				}
			}
			else{
				
				System.out.println(ones[digit4]+" "+hundreds[1]+" "+ones[digit3]+" "+hundreds[0]+" and "+tens[digit2-2]+" "+ones[digit1]);
			}
			
			
		}
		else{
			System.out.println("please enter valid number below 10,000");
		}
		
		
		}
		
	public static void main(String[] args){
		NumberToWords(1564);
		NumberToWords(9999);
		NumberToWords(125);
		NumberToWords(2005);
		NumberToWords(9);
		NumberToWords(25);
		
		
		
		
	}
}
