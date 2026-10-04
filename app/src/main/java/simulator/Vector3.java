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
	
	public double length(){
		return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z); 
	}
	
	public Vector3 normalize(){
		double len = this.length();
		double x = this.getX();
		double y = this.getY();
		double z = this.getZ();
		
		return new Vector3(x/len,y/len,z/len);
	}
	
	public Vector3 add(Vector3 other){
		return new Vector3(this.x + other.x, this.y + other.y, this.z + other.z);
	}
	
	public Vector3 subtract(Vector3 other){
		return new Vector3(this.x - other.x, this.y - other.y, this.z - other.z);
	}
	
	public double dot(Vector3 other){
		return this.x * other.x + this.y * other.y + this.z * other.z;
	}
	
	public void addScaled(Vector3 other, double scale) {
		x += other.getX() * scale;
		y += other.getY() * scale;
		z += other.getZ() * scale;
	}
	
	public Vector3 scale(double scale){
		double a = this.x*scale;
		double b = this.y*scale;
		double c = this.z*scale;
		return new Vector3(a,b,c);
	}
}