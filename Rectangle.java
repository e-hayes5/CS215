import java.util.ArrayList;

public class Rectangle extends Polygon {
	public Rectangle(ArrayList<Double> sides) throws Exception{
		super(sides);
		if(sides.size() != 4)
			throw new Exception("A rectangle requires exactly 4 sides.");
	}

	@Override
	public double computeArea() {
		double area = sides.get(0)*sides.get(1);
		return area;
	}
}
