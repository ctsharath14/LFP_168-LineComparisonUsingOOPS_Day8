import java.util.Scanner;

public class LineComparisonUsingOops {

    public double coordinatesForLine1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the X1 co-ordinate of Line 1");
        double x1 = sc.nextDouble();
        System.out.println("Enter the Y1 co-ordinate of Line 1");
        double y1 = sc.nextDouble();
        System.out.println("Enter the X2 co-ordinate of Line 1");
        double x2 = sc.nextDouble();
        System.out.println("Enter the Y2 co-ordinate of Line 1");
        double y2 = sc.nextDouble();
        double lengthOfLine1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("Length of line 1 : " + lengthOfLine1);
        return coordinatesForLine1();
    }



    public double coordinatesForLine2() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the X1 co-ordinate of Line 2");
        double a1 = s.nextDouble();
        System.out.println("Enter the Y1 co-ordinate of Line 2");
        double b1 = s.nextDouble();
        System.out.println("Enter the X2 co-ordinate of Line 2");
        double a2 = s.nextDouble();
        System.out.println("Enter the Y1 co-ordinate of Line 2");
        double b2 = s.nextDouble();
        double lengthOfLine2 = Math.sqrt(Math.pow((a2 - a1), 2) + Math.pow((b2 - b1), 2));
        System.out.println("Length of line 2 : " + lengthOfLine2);
        return coordinatesForLine2();
    }
    public void equalityOfLength() {
        double line1 = coordinatesForLine1();
        String s1 = Double.toString(line1);
        double line2 = coordinatesForLine2();
        String s2 = Double.toString(line2);
        if (s1.equals(s2))
            System.out.println("Both lines are same in length");
        else
            System.out.println("Both the lines are different in length");
    }

    public void compareLength() {
        double line1 = coordinatesForLine1();
        String s1 = Double.toString(line1);
        double line2 = coordinatesForLine2();
        String s2 = Double.toString(line2);
        if (s1.compareTo(s2) < 0) {
            System.out.println(s1 + " is less than the" + s2);
            System.out.println("s2 string is greater");
        } else {
            System.out.println(s1 + " is greater than the " + s2);
            System.out.println("s1 string is greater");
        }
    }

    public static void main (String[] args){
        System.out.println("Welcome to the Line Comparison Computation Program Using Oops Concept");
        LineComparisonUsingOops length = new LineComparisonUsingOops();
        length.coordinatesForLine1();
        length.coordinatesForLine2();
        length.equalityOfLength();
        length.compareLength();
    }
}
