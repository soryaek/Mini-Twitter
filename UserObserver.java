public class UserObserver implements Observer {

    private Subject user;
    
    public UserObserver(Subject subjectUser) {
        this.user = subjectUser;
        subjectUser.register(this);
    }
    
    @Override
    public void update(Component component) {
        this.user = component;
    }
    
}
