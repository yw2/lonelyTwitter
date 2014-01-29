package ca.ualberta.cs.lonelytwitter.test;

import java.util.Date;

import android.test.ActivityInstrumentationTestCase2;
import ca.ualberta.cs.lonelytwitter.ImportantTweetModel;
import ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity;
import ca.ualberta.cs.lonelytwitter.NormalTweetModel;
import ca.ualberta.cs.lonelytwitter.TweetSetModel;


public class TweetSetModelTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity>
{

	public TweetSetModelTest()
	{

		super(LonelyTwitterActivity.class);
	}
	
	public void testImportantEquality(){
		TweetSetModel tweets = new TweetSetModel();
		Date date = new Date();
		ImportantTweetModel important = new ImportantTweetModel("text", date);
		NormalTweetModel normalTweetModel = new NormalTweetModel("text", date);
		assertEquals("Strings are equal", false, tweets.addTweet(normalTweetModel));
	}
	
	public void testAtTweet() {
		TweetSetModel tweets = new TweetSetModel();
		Date date = new Date();
		NormalTweetModel normalTweetModel = new NormalTweetModel("text", date);
		tweets.addTweet(normalTweetModel);
		try{
			tweets.addTweet(normalTweetModel);
			fail("failure");
		}
		catch (Exception e){
			e.printStackTrace();
			
		}
	}
	
	public void testCount() {
		TweetSetModel tweets = new TweetSetModel();
		
		assertEquals("tweet set should start empty", 0, tweets.countTweets());
		
		tweets.addTweet(new NormalTweetModel("test"));
		assertEquals("after adding a tweet the count should be 1", 1, tweets.countTweets());
	}

}
