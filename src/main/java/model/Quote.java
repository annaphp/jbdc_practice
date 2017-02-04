package model;

public class Quote {
	
	private String quote;
	private String attributedTo;
	
	public Quote() {
	}

	public Quote(String quote, String attributedTo) {
		this.quote = quote;
		this.attributedTo = attributedTo;
	}

	public String getQuote() {
		return quote;
	}

	public void setQuote(String quote) {
		this.quote = quote;
	}

	public String getAttributedTo() {
		return attributedTo;
	}

	public void setAttributedTo(String attributedTo) {
		this.attributedTo = attributedTo;
	}

	@Override
	public String toString() {
		return "Quote [quote=" + quote + ", attributedTo=" + attributedTo + "]";
	}
	
	

}
