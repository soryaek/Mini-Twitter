public class Tweet {
    
    private String message;
    private boolean isPositive = false;
    
    public Tweet(String message) {
        this.message = message;
        checkIfPositive();
    }
    
    public String getMessage() {
        return this.message;
    }
    
    public boolean isPositive() {
        return isPositive;
    }
    
    // positive words, mark it as a positive tweet 
    private void checkIfPositive() {
        String[] positiveWords = { "good", "great", "excellent", "fantastic", "awesome", "wonderful", "amazing", "magnificent", "positive","beautiful" };
        for (String word : positiveWords) {
            if (message.toLowerCase().contains(word)) {
                this.isPositive = true;
                return;
            }
        }
    }
    
}
