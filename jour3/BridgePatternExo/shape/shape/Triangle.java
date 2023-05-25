package shape;

import draw.DrawAPI;

public class Triangle extends Shape {

	private int A;
	
	private int B;
	
	private int C;
	
	public Triangle(int A, int B, int C, DrawAPI drawAPI) {
		super(drawAPI);
		this.A = A;
		this.B = B;
		this.C = C;
	}
	
	@Override
    public String draw() {
        return drawAPI.drawTriangle(A,B,C);
    }
}
