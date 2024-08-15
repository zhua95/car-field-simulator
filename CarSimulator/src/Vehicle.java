
abstract class Vehicle {
    protected int x;
    protected int y;
    protected boolean alive;

    public Vehicle() {
        this.x = 0;
        this.y = 0;
        this.alive = true;
    }

     

	abstract public void move();
     
    

    public void kill() {
        this.alive = false;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isAlive() {
        return alive;
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}