import java.util.Scanner;
public class LinearEquationsRunner {
    public static void main(String[] args) {
        System.out.println("Welcome!");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter coordinate 1: ");
        String coordinate1 = scan.nextLine();
        System.out.print("Enter coordinate 2: ");
        String coordinate2 = scan.nextLine();

        int x1 = Integer.parseInt(coordinate1.substring(1, coordinate1.indexOf(",")));
        int y1 = Integer.parseInt(coordinate1.substring(coordinate1.indexOf(",") + 2, coordinate1.length()-1));
        int x2 = Integer.parseInt(coordinate2.substring(1, coordinate2.indexOf(",")));
        int y2 = Integer.parseInt(coordinate2.substring(coordinate2.indexOf(",") + 2, coordinate2.length()-1));

        if (x1 == x2) {
            System.out.println("These points are on a vertical line x = "+x1);
        } else {
            LinearEquations orig = new LinearEquations(x1, y1, x2, y2);
            System.out.println(orig.lineInfo());
            System.out.print("Enter a value for x: ");
            double x = scan.nextDouble();
            System.out.println(orig.coordinateForX(x));
        }
    }
}
