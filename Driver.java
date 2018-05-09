public class Driver {

    public static void main(String args[]) {
        
        start();
    }
    
    public static void start() {
     
                AdminPanel adminPanel = AdminPanel.getInstance();                
                adminPanel.setVisible(true);
           
    }
}
