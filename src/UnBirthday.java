import javax.swing.JOptionPane;

public class UnBirthday {
public static void main(String[] args) {
 String rob = JOptionPane.showInputDialog("What is your birthday?");
if (rob.equals("5-10-18")) {
	JOptionPane.showMessageDialog(null, "I wish you a happy birthday"); 
	

	
}
else {
	JOptionPane.showMessageDialog(null,"I wish you a very merry UNbirthday!");
}
}
}
