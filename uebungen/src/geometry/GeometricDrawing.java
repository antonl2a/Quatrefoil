package geometry;
import javafx.scene.shape.Shape;
import java.awt.Polygon;

public interface GeometricDrawing {
	Shape createShape(int scale);
	boolean contains(double x, double y);

}
