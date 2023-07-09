/* 
 * Ladder.java 
 * 
 * Computes the ladder length needed to reach a certain height  
 * based on that height and the angle at which the ladder is 
 * positioned. 
 * 
 * completed by: Nathan Van Zandt (nvz@bu.edu)
 */ 
import java.util.*;
public class Ladder {

public static void main(String[] args){ 
    Scanner scan = new Scanner(System.in);

    System.out.println("Please enter the height of the point you want the ladder to reach (to the nearest foot)");
    int height = scan.nextInt();
    System.out.println("Please enter the angle at which you want the ladder to be positioned (to the nearest degree)");
    int angle = scan.nextInt();

    double radians = angle * Math.PI / 180; 
    double length = height / Math.sin(radians); 
    double lengthY = length / 3;

    System.out.println("The required length is: ");
    System.out.println(length + " feet");
    System.out.println(lengthY + " yards");
    System.out.println((int) lengthY + " yards and " + ((lengthY - (int) lengthY) * 3 )+ " feet");

}   
    
}
