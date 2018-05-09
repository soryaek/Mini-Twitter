public class ComponentVisitor implements Visitor {

    private int totalUsers = 0;
    private int totalGroups = 0;
    
    public int getTotalUsers() {
        return totalUsers;
    }
    
    public int getTotalGroups() {
        return totalGroups;
    }

    @Override
    public void visit(User user) {
        totalUsers += 1;
    }

    @Override
    public void visit(GroupComponent group) {
        totalGroups += 1;
    }
    
}
