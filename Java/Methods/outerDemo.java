class OuterDemo{
    public static void main(String args[]){  
          Outer obj=new Outer();  
         Outer.Inner in=obj.new Inner();  
          in.msg();  
    }  
}  
class Outer{  
	private int data_o=30;  
  	class Inner{  
		private int data_i=70;  
  		void msg(){
			System.out.println("Outer class data "+data_o);
			System.out.println("Inner class data "+data_i);
		}  
	} 
}

