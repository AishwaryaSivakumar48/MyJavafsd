 /* 2.1.1 Writing a program in Java to verify implementations of methods and ways of calling a method    

      2.1.2 Executing the program and verifying working of methods 

      2.1.3Pushing the code to your GitHub repositories*/


class Methods {

  public void display1() {
    System.out.println("functional block 1");
  }

  
  public void display2() {
    System.out.println("functional block 2");
  }

  public static void main(String[] args) {
    
   
    Methods obj = new Methods();

    obj.display1();// function calling
    
    obj.display2();// function calling
  }
}



