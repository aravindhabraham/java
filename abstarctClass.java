
                                         //ABSTRACT CLASS

  abstract class start{
   abstract void key();
}  

 class stroke2 extends start{
void key(){
	System.out.println("Kick Start");
}
}

class  stroke4 extends start{
void key(){
	System.out.println("Kick Start and E-Start");
}
}

class  Sports extends start{
void key(){
	System.out.println("E-Start");
}
}

public class auto{
public static void main(String[] args){

	start RX100 = new stroke2();
    start Unicorn = new stroke4();
	start RC390 = new Sports();
	
	RX100.key();
	Unicorn.key();
	RC390.key();
	
}
}
