
package lambdaexpressions;

public class Greeter1 {

    public void greet(Greeting greeting){
        greeting.greeting();
    }
    public static void main(String[] args) {
        
        
        HelloWorldJava object=new HelloWorldJava();          //Instance of a Class
        object.greeting();
        
          // 1: Two ways of creating an implementation of Interface.
        
        Greeting myLambda =()->System.out.println("Congratulations");       //Lambda Function
       
        myLambda.greeting();
        
        //2:  Inner class that is known as anoynymas class.         1&2 doing same.
        
        Greeting newInstanceOfInterface=new Greeting(){     //AnonymasInnerClass
           
            public void greeting(){
                System.out.println("hello");
            }

        };
        
        newInstanceOfInterface.greeting();
    }
    
}
