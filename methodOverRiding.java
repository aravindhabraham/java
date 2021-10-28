 //Method OVERRIDING

class vehicle {
    String run(){
       return ("BMW Top Speed");
    }
}

class Mseries extends vehicle{
    String run(){
        return ("280KMPH");
    };
}

class S1000RR extends vehicle{
    String run(){
        return ("300KMPH");
    };
}

class Advseries extends vehicle{
    String run(){
        return ("200KMPH");
    };
}


public class auto{
    
    auto(){
        System.out.println("Calling Constructor");
    }
    
   
     public static void main(String[] args){
         Mseries M3 = new Mseries();
         S1000RR B4 = new S1000RR();
         Advseries G5 = new Advseries();
         
         System.out.println(M3.run());
         System.out.println(B4.run());
         System.out.println(G5.run());
        
     }
} 
