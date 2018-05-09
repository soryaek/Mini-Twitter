import javax.swing.JTree;
import javax.swing.tree.TreeNode;


public class RootTreeSeeder {
    
    private JTree tree;
    private TreeNode root;
    
    public RootTreeSeeder() {
       
        Component root = new GroupComponent("Tree View"+"\n  "+" Root", null);
        this.root = root;
        
        
        Component user1Node = new User("Watson", (GroupComponent) root);
        Component user2Node = new User("Jonshon", (GroupComponent) root);
 
        
        root.insert(user1Node);
        root.insert(user2Node);
         
        GroupComponent folder2 = new GroupComponent("Folder2", (GroupComponent) root);
        root.insert(folder2);
        
        folder2.insert(new User("David", (GroupComponent) folder2));
        folder2.insert(new User("Joe", (GroupComponent) folder2));
        
      
        tree = new JTree(root);
    }

    public JTree getTree() {        
        return tree;
    }
    
    public TreeNode getRoot() {
        return root;
    }
    
}
