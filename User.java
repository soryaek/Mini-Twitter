import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class User extends Component {
    
    private Set<User> following;
    private ArrayList<Tweet> tweets;
    
    public User(String name, GroupComponent parent) {
        this.name = name;
        this.parentComponent = parent;
        following = new HashSet<User>();
        tweets = new ArrayList<Tweet>();
    }
    
    // Used to display it in the JList in user frame
    public List<User> getFollowing() {
        return new ArrayList<User>(this.following);
    }
    
    public void addFollowing(String username) throws Exception {
        if (username.equals(this.name)) {
            throw new UnsupportedOperationException("Cannot follow yourself");
        }
        GroupComponent root = this.getRoot();
        User newFollowing = searchForUser(username, root);  
        if (newFollowing != null) {
            boolean added = this.following.add(newFollowing);
            if (added) {
                System.out.println(this.name + " just followed " + newFollowing.getName());              
            }
            else {
                throw new UnsupportedOperationException(this.name + " is already following " + newFollowing.getName());
            }
        }
        else {
            throw new UnsupportedOperationException("Username cannot be found");
        }
    }
    
    public Tweet postTweet(String message) {
        Tweet tweet = new Tweet(message);
        tweets.add(tweet);
        System.out.println(this.name + " posted a tweet");
        return tweet;
    }
    
    public ArrayList<Tweet> getTweets() {
        return tweets;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("User: " + this.name);
    }
    
    //Use depth-first search to traverse tree and find correct user component 
    public static User searchForUser(String username, Component node) {        
        if (node instanceof User && node.getName().equals(username)) {
            return (User) node;
        }
        User correctNode = null;
        if (!node.isLeaf()) {            
            for (Component c : node.children) {
                if (correctNode != null) 
                    break;
                correctNode = searchForUser(username, c);
            }
        }
        return correctNode;
    }
    
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    
    
    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(this.name, user.getName());
    }
    
    
    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + this.name.hashCode();
        result = 31 * result + this.parentComponent.hashCode();
        return result;
    }

}

