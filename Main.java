import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    String str = "Object-oriented"; 
    Scanner myObj = new Scanner(System.in);
      System.out.println("Enter a word:");
    String word = myObj.nextLine();
   if(str.length()>0){
     System.out.println("String is not empty and length is:" +str.length() );
   }
    str = "";
    if(str.length()==0){
      System.out.println("String is empty:" +str.length());
    }
  }      
    //Your code will return the length of the entered String
}
