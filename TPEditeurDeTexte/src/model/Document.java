package model;


	public abstract class Document{
	    protected StringBuilder content;

	    public Document() {
	        content = new StringBuilder();
	    }

	    public void appendText(String text) {
	        content.append(text);
	    }

	    public void deleteText(int startIndex, int endIndex) {
	        if (startIndex >= 0 && endIndex < content.length()) {
	            content.delete(startIndex, endIndex);
	        }
	    }

	    public void replaceText(int startIndex, int endIndex, String newText) {
	        if (startIndex >= 0 && endIndex < content.length()) {
	            content.replace(startIndex, endIndex, newText);
	        }
	    }

	    public abstract StringBuilder getContent();

	}

