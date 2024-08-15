import java.util.Random;

class SportsCar extends Vehicle {
    private String type = "SPORTSCAR";

    public SportsCar() {
        super();
    }

    
    @Override
    	 public void move() {
         	Random rand = new Random();
         	int moveType = rand.nextInt(4);
         	
         	if (moveType == 0 ) {
         		this.x = x + 3;
         		this.y= y + 3;
         	}
         	else if(moveType == 1) {
         		this.x = x + 3;
         		this.y = y - 3;
         	}
         	else if(moveType == 2) {
         		this.x = x - 3;
         		this.y = y + 3;
         	}
         	else if (moveType == 3) {
         		this.x = x - 3;
         		this.y = y - 3;
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