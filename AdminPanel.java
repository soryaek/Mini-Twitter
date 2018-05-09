import java.awt.Frame;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class AdminPanel extends javax.swing.JFrame {

    public static AdminPanel instance;

    public AdminPanel() {
    	setResizable(false);
        initComponents();
    }

    // Singleton Pattern, create only one Object of that class
     public static AdminPanel getInstance() {
        if (instance == null) {
            synchronized (AdminPanel.class) {
                if (instance == null) {
                    instance = new AdminPanel();
                }
            }
        }
        return instance;           
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        createUserButton = new javax.swing.JButton();
        createGroupButton = new javax.swing.JButton();
        lMessage = new javax.swing.JLabel();
        userTextField = new javax.swing.JTextField();
        groupTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        seeder = new RootTreeSeeder();
        componentTree = new javax.swing.JTree();
        totalUsersButton = new javax.swing.JButton();
        totalTweetsButton = new javax.swing.JButton();
        positiveTweetsButton = new javax.swing.JButton();
        totalGroupsButton = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        createUserButton.setText("Button - Add User");
        createUserButton.setToolTipText("");
        createUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createUserButtonActionPerformed(evt);
            }
        });

        createGroupButton.setText("Button - Add Group");
        createGroupButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createGroupButtonActionPerformed(evt);
            }
        });

        lMessage.setForeground(new java.awt.Color(255, 0, 0));
        lMessage.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        // Call RootTreeSeeder to seed initial data to app
        javax.swing.tree.TreeNode rootNode = seeder.getRoot();
        componentTree.setModel(new javax.swing.tree.DefaultTreeModel(rootNode));
        jScrollPane1.setRowHeaderView(componentTree);

        componentTree.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mouseClickedActionPerformed(evt);
            }
        });

        totalUsersButton.setText("Button - Show Total Users");
        totalUsersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalUsersButtonActionPerformed(evt);
            }
        });

        totalTweetsButton.setText("Button - Show Total Message");
        totalTweetsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalTweetsButtonActionPerformed(evt);
            }
        });

        positiveTweetsButton.setText("Button - Show Positive Percentage");
        positiveTweetsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positiveTweetsButtonActionPerformed(evt);
            }
        });

        totalGroupsButton.setText("Button - Show Total Group");
        totalGroupsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalGroupsButtonActionPerformed(evt);
            }
        });
        
        JButton btnNewButton = new JButton("Button - Open User View");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		 Component node = (Component) componentTree.getLastSelectedPathComponent();
                 if (node != null && node instanceof User) {
                     // Open user frame
                     Frame userFrame = new UserFrame((User) node);   
                 }
        	}
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(8)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(lMessage, GroupLayout.PREFERRED_SIZE, 365, GroupLayout.PREFERRED_SIZE))
        						.addGroup(layout.createSequentialGroup()
        							.addGap(60)
        							.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        								.addComponent(btnNewButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        								.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        									.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        										.addComponent(groupTextField, Alignment.LEADING)
        										.addComponent(userTextField, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
        									.addPreferredGap(ComponentPlacement.RELATED)
        									.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        										.addComponent(createGroupButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        										.addComponent(createUserButton, GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))))))
        					.addPreferredGap(ComponentPlacement.RELATED, 35, Short.MAX_VALUE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(56)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(totalUsersButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(totalGroupsButton, GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(positiveTweetsButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(totalTweetsButton, GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))))
        			.addGap(450))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(45)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(userTextField, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
        				.addComponent(createUserButton, GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(groupTextField, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
        				.addComponent(createGroupButton, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
        			.addGap(90)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(totalGroupsButton, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        				.addComponent(totalTweetsButton, GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(totalUsersButton, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
        				.addComponent(positiveTweetsButton, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
        			.addGap(213)
        			.addComponent(lMessage, GroupLayout.PREFERRED_SIZE, 46, GroupLayout.PREFERRED_SIZE)
        			.addGap(19))
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 414, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(271, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
    }
	private void mouseClickedActionPerformed(java.awt.event.MouseEvent evt) {
        if (evt.getClickCount() == 2) {
            Component node = (Component) componentTree.getLastSelectedPathComponent();
            if (node != null && node instanceof User) {
                // Open user frame
                Frame userFrame = new UserFrame((User) node);   
            }
        }
    }
    
    private void createUserButtonActionPerformed(java.awt.event.ActionEvent evt) {
        lMessage.setText("");        
        DefaultTreeModel model = (DefaultTreeModel) componentTree.getModel();
        Component root = (GroupComponent) model.getRoot();
        Component selectedNode = (Component) componentTree.getLastSelectedPathComponent();
        String username = userTextField.getText().trim();
        
        if (username.equals("")) {
            lMessage.setText("You must enter an user name");
        }
        else {
            if (selectedNode != null) {
                if (selectedNode instanceof GroupComponent) {
                    Component newUser = new User(username, (GroupComponent) selectedNode);      
                    System.out.println("New user created: " + username);
            
                    lMessage.setText(""); 
                    model.insertNodeInto(newUser, selectedNode, selectedNode.getChildCount());
                    model.reload(newUser);
                }
                else {
                    lMessage.setText("User can only be added to a group");
                }
            }
            else {
                Component newUser = new User(username, (GroupComponent) root);  
                System.out.println("New user created: " + username);
                root.insert(newUser);     
                model.reload();
            }            
        }
    }
	private void createGroupButtonActionPerformed(java.awt.event.ActionEvent evt) {
        lMessage.setText("");
        DefaultTreeModel model = (DefaultTreeModel) componentTree.getModel();
        Component root = (GroupComponent) model.getRoot();
        Component selectedNode = (Component) componentTree.getLastSelectedPathComponent();
        String groupName = groupTextField.getText();
        
        if (groupName.trim().equals("")) {
            lMessage.setText("You must enter a group name");
        }
        else {
            if (selectedNode != null) {
                if (selectedNode instanceof GroupComponent) {
                    Component newGroup = new GroupComponent(groupName, (GroupComponent) selectedNode);      
                    System.out.println("New group created: " + groupName);
                        
                    lMessage.setText(""); 
                    model.insertNodeInto(newGroup, selectedNode, selectedNode.getChildCount());
                    model.reload(newGroup);
                }
                else {
                    lMessage.setText("Group can only be added inside a group");
                }
            }
            else {                     
                Component newGroup = new GroupComponent(groupName, (GroupComponent) root);
                System.out.println("New group created: " + groupName);
                root.insert(newGroup);
                model.reload();
            }
        }        
    }
	private void positiveTweetsButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            lMessage.setText("");
            TweetVisitor tweetVisitor = (TweetVisitor) letVisitorTraverseTree(new TweetVisitor());
            JOptionPane.showMessageDialog(null,"Postive Percentage of Tweet Message = "+String.valueOf(tweetVisitor.getPercentageOfPositiveTweets()));
        }
        catch (Exception e) {
            lMessage.setText(e.getMessage());
        }
    }
	private void totalUsersButtonActionPerformed(java.awt.event.ActionEvent evt) {
        ComponentVisitor componentVisitor = (ComponentVisitor) letVisitorTraverseTree(new ComponentVisitor());
        JOptionPane.showMessageDialog(null, "Total User = "+String.valueOf(componentVisitor.getTotalUsers()));
    }
	private void totalGroupsButtonActionPerformed(java.awt.event.ActionEvent evt) {
        ComponentVisitor componentVisitor = (ComponentVisitor) letVisitorTraverseTree(new ComponentVisitor());
        JOptionPane.showMessageDialog(null,"Total Group = "+String.valueOf(componentVisitor.getTotalGroups()));
    }
	
	private void totalTweetsButtonActionPerformed(java.awt.event.ActionEvent evt) {
        TweetVisitor tweetVisitor = (TweetVisitor) letVisitorTraverseTree(new TweetVisitor());
        JOptionPane.showMessageDialog(null,"Total Tweet Messages = "+String.valueOf(tweetVisitor.getTotalTweets()));
    }

    private Visitor letVisitorTraverseTree(Visitor visitor) {
        DefaultTreeModel model = (DefaultTreeModel) componentTree.getModel();
        Component root = (GroupComponent) model.getRoot();
        Component.traverseTree(root, visitor);
        return visitor;
    }
    private javax.swing.JTree componentTree;
    private RootTreeSeeder seeder;
    private javax.swing.JButton createGroupButton;
    private javax.swing.JButton createUserButton;
    private javax.swing.JTextField groupTextField;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lMessage;
    private javax.swing.JButton positiveTweetsButton;
    private javax.swing.JButton totalGroupsButton;
    private javax.swing.JButton totalTweetsButton;
    private javax.swing.JButton totalUsersButton;
    private javax.swing.JTextField userTextField;
}
