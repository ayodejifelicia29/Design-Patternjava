package model;

public class DocumentPdf extends Document {
	@Override
	public StringBuilder getContent() {
		// TODO Auto-generated method stub
		return content.append("[pdf]");
	}
}
