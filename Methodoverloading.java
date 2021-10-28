
	 //METHOD OVERLOADING - by return type
	 
	 
	 public class addition{
    
    static int add(int a, int b){return a+b;}
    static String add(String a, String b,String c){return a+b+c;}

     public static void main(String []args){
         System.out.println(addition.add(1,1));
         System.out.println(addition.add("B","M","W"));
     }
}


//  static int add (int a, int b)
// 	 static long add (int a, int b)  => compile time error
	  
// 	 add(int a, long b)
// 	 add (long a, long b)  => no error , Method overloading with type promotion
	 
// 	  add(int a, int b)
// 	 add (long a, long b)    =>  no error , Method overloading with type promotion
