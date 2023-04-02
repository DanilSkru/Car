//import javax.imageio.ImageIO;
//import java.io.File;
//import java.io.IOException;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;
import java.awt.image.BufferedImage;

public class Car {
    public Car() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        GUIcar app = new GUIcar();
        app.setVisible(true);
    }
    public static void main(String[] arg) {
        new Car();
    }
}
class GUIcar extends JFrame {
    public GUIcar() {
        super("Car");
        /**
        try {
            setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("Car.png")))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        pack();
        setVisible(true);
        **/
        this.setBounds(5, 5, 1050, 550);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLayeredPane lp = getLayeredPane();
        BodyCar figure1 = new BodyCar();
        figure1.setBounds(5, 5, 1050, 550);
        lp.add(figure1, JLayeredPane.DEFAULT_LAYER);
        setVisible(true);
    }
}
class BodyCar extends JComponent {
    public void paintComponent(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;
        BufferedImage bi = new BufferedImage(getSize().width, getSize().height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D big = bi.createGraphics();
        AlphaComposite ac = AlphaComposite.getInstance(AlphaComposite.DST_OUT, 1.0f);

        big.setColor(new Color(232, 246, 65));
        big.setStroke(new BasicStroke(8f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
        big.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        Path2D.Double path1 = new Path2D.Double();
        path1.moveTo(500, 435);
        path1.lineTo(369, 435);
        path1.curveTo(378,276,155,276,160,435);
        path1.lineTo(76, 435);
        path1.quadTo(35,420,35,372);
        path1.quadTo(37,360,59, 340);
        path1.quadTo(58,286,117, 210);
        path1.curveTo(240, 0,635,-5,777, 210);
        path1.quadTo(985,220,990, 361);
        path1.quadTo(1010,400,971, 428);
        path1.lineTo(847, 428);
        path1.curveTo(847, 280,632,275,637, 435);
        path1.closePath();
        big.fill(path1);
        big.setPaint(Color.black);
        big.draw(path1);
        big.fillOval(176,332,177,177);
        big.fillOval(654,332,177,177);

        big.setColor(Color.white);
        big.setStroke(new BasicStroke(8f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
        big.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        big.setComposite(ac);
        Path2D.Double path2 = new Path2D.Double();
        path2.moveTo(435, 212);
        path2.lineTo(435, 88);
        path2.quadTo(620,87, 719, 212);
        path2.closePath();
        big.fill(path2);
        big.setPaint(Color.black);
        big.draw(path2);
        big.fillOval(226,382,78,78);
        big.fillOval(704,382,78,78);

        big.setColor(Color.white);
        big.setStroke(new BasicStroke(8f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
        big.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        big.setComposite(ac);
        Path2D.Double path3 = new Path2D.Double();
        path3.moveTo(399, 212);
        path3.lineTo(168, 212);
        path3.quadTo(225,115, 399, 90);
        path3.closePath();
        big.fill(path3);
        big.setPaint(Color.black);
        big.draw(path3);

        big.setColor(Color.white);
        big.setStroke(new BasicStroke(8f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_ROUND));
        big.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        big.setComposite(ac);
        Path2D.Double path4 = new Path2D.Double();
        path4.moveTo(865, 258);
        path4.quadTo(935,250,955, 311);
        path4.quadTo(880,315,865, 258);
        path4.closePath();
        big.fill(path4);
        big.setPaint(Color.black);
        big.draw(path4);

        g2d.drawImage(bi, null, 0, 0);

        g2d.setColor(Color.black);
        g2d.setStroke(new BasicStroke(8f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.drawLine(450,258,499,258);
        g2d.draw(path2);
        g2d.draw(path3);
        g2d.draw(path4);
    }
}