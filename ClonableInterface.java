package Assignment_3;

class A implements Cloneable{
	int i ;
	static String s;
	public A (int i,String s){
		this.i = i;
		this.s = s;
	}
	@Override
	protected Object clone ()
	throws CloneNotSupportedException
	{
		return super.clone();
	}
}
public class ClonableInterface {
	
	public static void main(String[] args) throws CloneNotSupportedException {
	    
          A x = new A (20 , "Helloworld");
          
          A b = (A)x.clone();
          
          System.out.println(b.i);
          System.out.println(b.s);
         
	}

}
