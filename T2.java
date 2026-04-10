class A extends Thread{
    @Override
    public void run(){
        int sum = 0;

        for(int i = 1; i <= 10; i++) {
            sum = sum + i;
        }

        double average = sum / 10.0;

        // System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}

 class B extends Thread{
    @Override
    public void run(){
        
        int[] arr={1,20,50,15,30};
        for(int i=0;i<=arr.length-1;i++){
             int square = arr[i] * arr[i];
            System.out.println("Square of " + arr[i] + " = " + square);
        }
    
    }
 }

    

public class T2 {
    public static void main(String[] args) {
        A b1=new A();
        B b2=new B();
    //  try{   

    //     b1.start();
    //     b1.join();

    //     b2.start();
    //     b2.join();
    //  }catch(Exception e){
    //     System.out.println(e);
    //  }

    // b1.run();
    // b2.run();
    try{   

        b1.start();
        

        b2.start();
        
     }catch(Exception e){
        System.out.println(e);
     }



        
    }
    
}
