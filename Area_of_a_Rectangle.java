import java.util.Scanner;

class Area_of_a_Rectangle {
  public static void main(String[] args) {
    Scanner Objective = new Scanner(System.in);
    System.out.println("Enter Width and Length of a Rectangle");

    System.out.println("Enter Width");
    double width = Objective.nextDouble();

    System.out.println("Enter Length");
    double length = Objective.nextDouble();

    while (width < 0 || length < 0) {
      if (width < 0 && length >= 0) {
        System.out.println("Width cannot be negative!");
        System.out.println("Enter Width");
        width = Objective.nextDouble();
      } else if (width >= 0 && length < 0) {
        System.out.println("Length cannot be negative!");
        System.out.println("Enter Length");
        length = Objective.nextDouble();
      } else if (width < 0 && length < 0) {
        System.out.println("Length and Width cannot be negative!");
        System.out.println("Enter Width");
        width = Objective.nextDouble();

        System.out.println("Enter Length");
        length = Objective.nextDouble();
      }
    }
    double result = width * length;
    System.out.println("Area of the Rectangle is: " + result);

  }
}