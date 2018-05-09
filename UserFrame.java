import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;



public class UserFrame extends javax.swing.JFrame {

    private User user;
    private static String message2="";
    private String username;
    static String s2 = "";
    static CopyOnWriteArrayList<String> s4 = new CopyOnWriteArrayList<String>();
    
    
    public UserFrame(User user) {
        this.user = user;
        
        initComponents();
        setVisible(true);
         setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);        
        userLabel.setText(user.getName());
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        model = new DefaultListModel();
        userLabel = new javax.swing.JLabel();
        followButton = new javax.swing.JButton();
        postMsgButton = new javax.swing.JButton();
        messageTextArea = new javax.swing.JScrollPane();
        tweetTextArea = new javax.swing.JTextArea();
        usernameTextField = new javax.swing.JTextField();
        lMessage = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        followingList = new javax.swing.JList<>();
        tweetsList = new javax.swing.JList<>();
        tweetModel = new DefaultListModel();
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		//Update the Tweet message for the new User
        if(s4.size()==0)
        {}
        else{
        	Iterator<String> itr = s4.iterator();
            while(itr.hasNext()){
            String s = itr.next();
            tweetModel.addElement(s);}
        }
        tweetsList.setToolTipText(s2);
        for(User u : user.getFollowing()) {
            model.addElement(u.getName());
        }
        
        userLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        userLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        userLabel.setText("User");

        followButton.setText("Button - Follow User");
        followButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                followButtonActionPerformed(evt);
            }
        });

        postMsgButton.setText("Button - Post Tweet");
        postMsgButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postMsgButtonActionPerformed(evt);
            }
        });

        tweetTextArea.setColumns(20);
        tweetTextArea.setRows(5);
        messageTextArea.setViewportView(tweetTextArea);

        lMessage.setForeground(new java.awt.Color(255, 0, 51));
        for(Tweet t : user.getTweets()) {
            tweetModel.addElement(t.getMessage());
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(22)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addGroup(layout.createSequentialGroup()
        									.addComponent(messageTextArea, GroupLayout.PREFERRED_SIZE, 274, GroupLayout.PREFERRED_SIZE)
        									.addGap(26)
        									.addComponent(postMsgButton))
        								.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE))
        							.addGap(280))
        						.addComponent(userLabel, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE)
        						.addGroup(layout.createSequentialGroup()
        							.addGap(22)
        							.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        								.addGroup(layout.createSequentialGroup()
        									.addComponent(usernameTextField, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
        									.addPreferredGap(ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
        									.addComponent(followButton, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE))
        								.addComponent(jScrollPane2, GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE))
        							.addGap(567))))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(0, 647, Short.MAX_VALUE)
        					.addComponent(lMessage, GroupLayout.PREFERRED_SIZE, 286, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(followButton, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
        				.addGroup(layout.createSequentialGroup()
        					.addComponent(userLabel)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(usernameTextField, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jScrollPane2, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE)
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(postMsgButton, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        				.addComponent(messageTextArea, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        			.addGap(4)
        			.addComponent(lMessage, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(19, Short.MAX_VALUE))
        );
      
        jScrollPane2.setViewportView(followingList);
        
        //JOptionPane.showMessageDialog(null, s4.size());
        followingList.setModel(model);
       
        jScrollPane1.setViewportView(tweetsList);
        
        
         tweetsList.setModel(tweetModel);
        getContentPane().setLayout(layout);

        pack();
    }


	// follow  user 
    private void followButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_followButtonActionPerformed
        DefaultListModel model = (DefaultListModel) followingList.getModel();
        username = usernameTextField.getText().trim();  
        try {
            lMessage.setText("");
            if (!username.equals("")) {
                user.addFollowing(username);
                model.addElement(username);
            }
        }
        catch (Exception e) {
            lMessage.setText(e.getMessage());
        }
    }
	
	// add new post message in the tweet
    private void postMsgButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postMsgButtonActionPerformed
        DefaultListModel model = (DefaultListModel) tweetsList.getModel();
        message2 = tweetTextArea.getText().trim();
        if (!message2.equals("")) {
            Tweet tweet = user.postTweet(message2);
            //TODO notify observers
            s2 = s2+user.getName()+"-"+tweet.getMessage();
            s4.add(s2);
            model.clear();
            model.addElement(s4);
                      s2="";
            }
        
    }

    private javax.swing.JButton followButton;
    private javax.swing.JList<String> followingList;
    private DefaultListModel model;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lMessage;
    private javax.swing.JScrollPane messageTextArea;
    private javax.swing.JButton postMsgButton;
    private javax.swing.JTextArea tweetTextArea;
    private javax.swing.JList<String> tweetsList;
    private DefaultListModel tweetModel;
    private javax.swing.JLabel userLabel;
    private javax.swing.JTextField usernameTextField;
    // End of variables declaration//GEN-END:variables

}
