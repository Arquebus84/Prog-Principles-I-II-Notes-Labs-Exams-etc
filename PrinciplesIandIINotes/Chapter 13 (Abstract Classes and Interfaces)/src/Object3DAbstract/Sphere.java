package Object3DAbstract;

public class Sphere extends Object3D{
    private double radius;

    public Sphere(String material, String color, double radius){
    	super(material, color);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    @Override
    public double calculateVolume(){
        return ((4 * Math.PI * getRadius() * getRadius() * getRadius()) / 3);
    }

    @Override
    public double calculateSurfaceArea(){
        return (4 * Math.PI * getRadius() * getRadius());
    }
}
