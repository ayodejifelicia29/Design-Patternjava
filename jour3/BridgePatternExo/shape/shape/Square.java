package shape;

import draw.DrawAPI;

public class Square extends Shape {

	private int side;
	
	public Square(int side, DrawAPI drawAPI) {
		super(drawAPI);
		this.side = side;
	}
	
	@Override
    public String draw() {
        return drawAPI.drawSquare(side);
    }
	
}
