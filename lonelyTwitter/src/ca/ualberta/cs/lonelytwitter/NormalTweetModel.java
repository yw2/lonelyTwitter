package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class NormalTweetModel extends LonelyTweetModel {
	
	public NormalTweetModel(String text, Date timestamp) {
		super(text, timestamp);
	}
	
	public NormalTweetModel(String text) {
		super(text);
	}

	@Override
	public Date getTimestamp() {
		return timestamp;
	}
	
	/*public String getText() {
		return "Normal! " + super.getText();
	}*/

	@Override
	public boolean equals(Object other) {
		return super.equals(other) && (other instanceof NormalTweetModel);
	}

}
