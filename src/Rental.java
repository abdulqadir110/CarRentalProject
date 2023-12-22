import javax.swing.*;
import java.awt.*;


public class Rental {

  private static final int WIDTH = 600;
  private static final int HEIGHT = 500;

  ////////////////////////////////////////////////////////// MAIN//////////////////////////////////////////
  public static void main(String[] args) {

    JFrame frame = new RentalView();
    ImageIcon img = new ImageIcon("C:/Users/abdul/OneDrive/Desktop/Java project/Basic-Java-Car-Rental-System-master/Basic-Java-Car-Rental-System-master/Romy Car Rental/images/logo.GIF");
    
    frame.setIconImage(img.getImage());
    frame.setTitle("JNU Brother's Car Rental");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(WIDTH, HEIGHT);
    frame.setVisible(true);
    frame.setResizable(true);
  }
}
