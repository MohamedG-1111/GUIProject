/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app2;

/**
 *
 * @author dell
 */


import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class CircularImagePanel extends JPanel {
    private BufferedImage image;
    private Color borderColor = Color.black; // لون الإطار
    private int borderThickness = 5; // سمك الإطار
    private int shadowSize = 10; // حجم الظل
    private Color shadowColor = new Color(0, 0, 0, 50); // لون الظل (أسود شفاف)

    public CircularImagePanel(String imagePath) {
        try {
            // تحميل الصورة
            image = ImageIO.read(getClass().getResource(imagePath));
        } catch (Exception e) {
            e.printStackTrace();
        }
        // جعل اللوحة شفافة
        setOpaque(false);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (image != null) {
            Graphics2D g2d = (Graphics2D) g;

            // تحسين جودة الرسم
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            int width = getWidth();
            int height = getHeight();

            // رسم الظل
            Ellipse2D shadow = new Ellipse2D.Double(
                shadowSize / 2.0,
                shadowSize / 2.0,
                width - shadowSize,
                height - shadowSize
            );
            g2d.setColor(shadowColor);
            g2d.fill(shadow);

            // حساب الدائرة الداخلية (الصورة)
            Ellipse2D circle = new Ellipse2D.Double(
                borderThickness + shadowSize / 2.0,
                borderThickness + shadowSize / 2.0,
                width - 2 * borderThickness - shadowSize,
                height - 2 * borderThickness - shadowSize
            );

            // قص الصورة داخل الدائرة
            g2d.setClip(circle);
            g2d.drawImage(image, borderThickness + shadowSize / 2, borderThickness + shadowSize / 2, 
                          width - 2 * borderThickness - shadowSize, 
                          height - 2 * borderThickness - shadowSize, this);

            // إزالة القص
            g2d.setClip(null);

            // رسم الإطار الدائري
            g2d.setColor(borderColor);
            g2d.setStroke(new BasicStroke(borderThickness)); // سمك الإطار
            g2d.draw(new Ellipse2D.Double(
                borderThickness / 2.0 + shadowSize / 2.0,
                borderThickness / 2.0 + shadowSize / 2.0,
                width - borderThickness - shadowSize,
                height - borderThickness - shadowSize
            ));
        }
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(200, 200); // حجم اللوحة الافتراضي
    }

    // إعداد لون الإطار
    public void setBorderColor(Color color) {
        this.borderColor = color;
        repaint();
    }

    // إعداد سمك الإطار
    public void setBorderThickness(int thickness) {
        this.borderThickness = thickness;
        repaint();
    }

    // إعداد حجم الظل
    public void setShadowSize(int size) {
        this.shadowSize = size;
        repaint();
    }

    // إعداد لون الظل
    public void setShadowColor(Color color) {
        this.shadowColor = color;
        repaint();
    }
}




