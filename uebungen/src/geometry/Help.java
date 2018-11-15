package geometry;
import java.util.Scanner;
public class Help {
	public static final Scanner Input= new Scanner(System.in);
	public static final double razlika=0.0001;
	
	public static boolean equal(double x, double y) {
		return Math.abs(x-y)<razlika;
	}
	public static double calculateDistance(Point point1, Point point2) {
		double differenceX = point2.x - point1.x;
		double differenceY = point2.y - point1.y;
		return Math.sqrt((differenceX*differenceX) + differenceY*differenceY);
	}
	public static boolean areCollinear(Point point1, Point point2, Point point3) {
		double result1 = point1.x *(point2.y -point3.y);
		double result2 = point2.x *(point3.y - point1.y);
		double result3 = point3.x * (point1.y - point2.y);
		return equal(result1+result2+result3,0);
	}
	public static double calculateAngle(double b, double c, double a) {
		double sum = (b*b +c*c - a*a)/(2*b*c);
		return Math.acos(sum);
	}

}
