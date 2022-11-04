import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class DisplayImage {
 public void DisplayImg(String file) {
  var frame = new JFrame();
  var icon = new ImageIcon(file);
  var label = new JLabel(icon);
  
  frame.add(label);
  
  frame.setDefaultCloseOperation
         (JFrame.EXIT_ON_CLOSE);
  frame.pack();
  frame.setVisible(true);
 }
 

}