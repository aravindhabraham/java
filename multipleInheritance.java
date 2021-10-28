//Solution to Diamond Problem - Multiple Inheritance by INTERFACE and DEFAULT METHOD
 
 
 interface emergency1{
    public default void stop(){
        System.out.println("Panic Brake");
    }
}

interface emergency2{
    public default void stop(){
        System.out.println("Hand Brake");
    }
}

interface emergency3{
    public default void stop(){
        System.out.println("Downshifts");
    }
}

public class Stopper implements emergency1,emergency2,emergency3{
    
    public void stop(){
        emergency1.super.stop();
        emergency2.super.stop();
        emergency3.super.stop();
    }

     public static void main(String []args){
        System.out.println("Hello World");
        
        Stopper stp = new Stopper();
        stp.stop();
     }
}
