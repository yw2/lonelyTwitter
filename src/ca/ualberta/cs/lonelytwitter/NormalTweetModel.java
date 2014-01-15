package ca.ualberta.cs.lonelytwitter;


public class NormalTweetModel extends LonelyTweetModel
{
	public NormalTweetModel(String text){
		super(text);
	}
	
	@Override
	public void setText(String text)
	{

		// TODO Auto-generated method stub

	}
	
	@Override
	public void setImportant(boolean important) throws Exception
	{
		if (important) {
			throw new IllegalArgumentException();
		}
		this.important = important;
	}

}
