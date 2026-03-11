package Object3DAbstract;

import AbstractGeometryClass.GeometryObject;

public class ExtensionOfGeometryObject extends GeometryObject{
	private double length;
	private double height;
	
	@Override
	public double getArea() {
		return length * height;
	}
	
	@Override
	public double getPerimeter() {
		return (2 * length) + (2 *height);
	}
}
