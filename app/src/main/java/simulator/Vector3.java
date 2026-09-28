package simulator;

public class Vector3 {
    private double x;
    private double y;
    private double z;

    public Vector3(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }
	
	public Vector3 add(Vector3 other){
		return new Vector3(this.x + other.x, this.y + other.y, this.z + other.z);
	}
	
	public void addScaled(Vector3 other, double scale) {
		x += other.getX() * scale;
		y += other.getY() * scale;
		z += other.getZ() * scale;
	}
}