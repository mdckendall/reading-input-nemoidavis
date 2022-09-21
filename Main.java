class Main {
  public static void main(String[] args) {
    String str = "Object-oriented";
    if(str.length()>0) {
      System.out.println("String is not empty and length is:" +str.length());
    }
    str = "";
    if(str.length()==0) {
      System.out.println("String is empty;" +str.length());
    }
  }
}