import java.util.*; 
public class Greatest {
  public static void main(String[] args) {
System.out.println("Input is" );
    Scanner in = new Scanner(System.in);
    int x,y,z;
    x=in.nextInt();
    y=in.nextInt();
    z=in.nextInt();
if(x>y&&x>z){
    System.out.println("Output is: " + x);
}
else if(y>x&&y>z){
System.out.println("Output is: " + y);
}
else
System.out.println("Output is: " + z);

  }
}

