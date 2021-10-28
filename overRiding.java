 //METHOD OVERRIDING

	 
	 class vehicle {
    void run(){
        System.out.println("BMW M Power ///");
    }
}


public class car extends vehicle{
    
     public static void main(String []args){
         car obj1 = new car();
         obj1.run();
     }
}
