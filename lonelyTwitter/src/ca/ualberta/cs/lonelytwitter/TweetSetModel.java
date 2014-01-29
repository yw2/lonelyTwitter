package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;


public class TweetSetModel
{
	int count = 0;
	ArrayList<NormalTweetModel> tweet = new ArrayList<NormalTweetModel>();

	
	public int countTweets()
	{

		// TODO Auto-generated method stub
		return count;
	}
	
	public ArrayList<NormalTweetModel> getTweets() {
		
		return tweet;
	}

	public boolean addTweet(NormalTweetModel normalTweetModel)
	{
		count++;
		// TODO Auto-generated method stub
		
		if (tweet.contains(normalTweetModel)) {
			return true;
		} else {
			tweet.add(normalTweetModel);
			return false;
		}
	}

}
