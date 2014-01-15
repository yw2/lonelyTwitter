package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class lonelyTweetModel
{
	protected String text;
	protected Date timestamp;
	
	public String getText()
	{
	
		return text;
	}
	
	public abstract void setText(String text);
	
	public Date getTimestamp()
	{
	
		return timestamp;
	}
	
	public void setTimestamp(Date timestamp)
	{
	
		this.timestamp = timestamp;
	}

	public lonelyTweetModel(String text, Date timestamp)
	{

		super();
		this.text = text;
		this.timestamp = new Date();
	}
	public lonelyTweetModel(String text)
	{

		super();
		this.text = text;
		this.timestamp = new Date();
	}
	
}
