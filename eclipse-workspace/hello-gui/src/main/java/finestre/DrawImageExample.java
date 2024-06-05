package finestre;

import java.awt.*;
import javax.swing.*;

public class DrawImageExample extends JComponent  {
  private Image image;

  public DrawImageExample(String location) {
    image = Toolkit.getDefaultToolkit().getImage(location);
  }

  public void paintComponent(Graphics g) {
    Dimension size = getSize();
    g.drawImage(image, 0, 0, size.width,size.height,this);
  }

  public static void main(String argv[]) {
//    if(argv.length != 1)
//      throw new IllegalArgumentException("Use: java PaintImageExample <image>");
    JFrame f = new JFrame("DrawImageExample");
    f.setSize(600, 500);
    f.getContentPane().add(new DrawImageExample("W:\\FSD_23-25\\docente\\Bogliaccino\\ITS2024_Fintech\\kubfu.jpg"));
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setVisible(true);
  }
}
