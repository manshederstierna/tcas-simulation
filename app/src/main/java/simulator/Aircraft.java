package simulator;

public class Aircraft {
    private String name;
    private Vector3 position;
    private Vector3 direction;
    private double speed;

    public Aircraft(
        String name,
        Vector3 position,
        Vector3 direction,
        double speed
    ) {
        this.name = name;
        this.position = position;
        this.direction = direction;
        this.speed = speed;
    }

    public Vector3 getPosition() {
        return position;
    }

    public Vector3 getDirection() {
        return direction;
    }

    public double getSpeed() {
        return speed;
    }
	public void update(double dt) {
		position.addScaled(direction, speed * dt);
	}
	

}