import java.util.*;

class MilesPerGallon
{
  public static void main( String[] args ) 
  {
    Scanner scan = new Scanner(System.in);

    System.out.println("New car odometer reading: " ); 
    double startMiles = scan.nextDouble();

    Car car = new Car(startMiles);
    car.fillUp();
    car.fillUp();
    car.fillUp();
  }
}