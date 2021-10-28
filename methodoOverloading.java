//METHOD OVERLOADING - by args
	
	public class addition{
    
    static int add(int a, int b){return a+b;}
    static int add(int a, int b,int c){return a+b+c;}

     public static void main(String []args){
         System.out.println(addition.add(1,1));
         System.out.println(addition.add(1,1,1));
     }
}
