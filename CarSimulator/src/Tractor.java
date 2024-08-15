import java.util.Random;
class Tractor extends Vehicle {
    private String type = "TRACTOR";

    public Tractor() {
        super();
    }
    @Override
    public void move() {
    	Random rand = new Random();
    	int moveType = rand.nextInt(4);
    	
    	if (moveType == 0 ) {
    		this.x = x + 2;
    		this.y= y + 2;
    	}
    	else if(moveType == 1) {
    		this.x = x + 2;
    		this.y = y - 2;
    	}
    	else if(moveType == 2) {
    		this.x = x - 2;
    		this.y = y + 2;
    	}
    	else if (moveType == 3) {
    		this.x = x - 2;
    		this.y = y - 2;
    	}
    	else {
    		this.x = x;
    		this.y = y;
    	}
    }

    @Override
    public String toString() {
        return type + " " + super.toString();
    }
}