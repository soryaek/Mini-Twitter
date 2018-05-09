import java.util.ArrayList;
public class TweetVisitor implements Visitor {

    private int tweets = 0;
    private int positiveTweets = 0;
    
    public int getTotalTweets(){
        return tweets;
    }
    
    public int getPercentageOfPositiveTweets() throws IllegalArgumentException {
        if (tweets == 0) {
            throw new IllegalArgumentException("Field 'tweets' is 0");
        }
        return (int)Math.ceil(((double)positiveTweets / tweets) * 100);
    }
    
    @Override
    public void visit(User user) {
        ArrayList<Tweet> userTweets = user.getTweets();
        tweets += userTweets.size();
        
        for (Tweet t : userTweets) {
            if (t.isPositive()) {
                this.positiveTweets += 1;
            }
        }
    }

    @Override
    public void visit(GroupComponent group) {
    }
    
}
