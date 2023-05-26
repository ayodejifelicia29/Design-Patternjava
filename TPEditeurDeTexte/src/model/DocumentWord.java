package model;

public class DocumentWord extends Document {

	@Override
	public StringBuilder getContent() {
		// TODO Auto-generated method stub
		return content.append("[word]");
	}

}
