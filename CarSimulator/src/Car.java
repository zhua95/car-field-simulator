import java.util.Random;

class Car extends Vehicle {
    private String type = "CAR";

    public Car() {
        super();
    }
    
    public void move() {
    	Random rand = new Random();
    	int moveType = rand.nextInt(4);
    	
    	if (moveType == 0 ) {
    		this.x++;
    		this.y++;
    	}
    	else if(moveType == 1) {
    		this.x++;
    		this.y--;
    	}
    	else if(moveType == 2) {
    		this.x--;
    		this.y++;
    	}
    	else if (moveType == 3) {
    		this.x--;
    		this.y--;
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
