
public class Pedestrian implements IsMobile{
	public Pedestrian() {
}
	@Override
	public double travelFlat(double distkm) {
		return distkm/5;
	}
	@Override
	public double travelElevated(double distkm, double angDegrees) {
		double baseTime = distkm/5;
		return baseTime * (1 + angDegrees/15);
	}
}