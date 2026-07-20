import java.util.*; 
public class Input {
  public static void main(String[] args) {
System.out.println("Input is" );
    Scanner in = new Scanner(System.in);
    int x,y;
    x=in.nextInt();
 y=in.nextInt();
if(x>y){
    System.out.println("Output is: " + x);
}
else{
System.out.println("Output is: " + y);
}
  }
}

