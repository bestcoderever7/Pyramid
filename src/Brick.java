import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Brick {
	JFrame f = new JFrame();
	public static void main(String[] args) {
		new Brick().run();
	}

	private void run() {
		// TODO Auto-generated method stub
		int width = 10;
		int height = 5;
		int base = 14;
		//System.out.println(width * (base - 1) + " " + height * base);
		f.setTitle("Pyramid");
		BufferedImage image = new BufferedImage(width * base + width, height * base + height * 2,
				BufferedImage.TYPE_INT_ARGB);
		Graphics2D boxGraphic = image.createGraphics();
		boxGraphic.setPaint(Color.BLACK);
		boxGraphic = fillBoxes(boxGraphic, width, height, base);
		ImageIcon icon = new ImageIcon(image);
		JLabel boxLabel = new JLabel(icon);
		f.setContentPane(boxLabel);
		f.getContentPane();
		f.requestFocusInWindow();
		f.pack();
		f.setResizable(false);
		f.setVisible(true);
	}

	private Graphics2D fillBoxes(Graphics2D boxGraphic, int width, int height,
			int base) {
		// TODO Auto-generated method stub
		double border = 0;
		int w = 0;
		int h = base;
		//System.out.println(width * base + " " + height * base);
		for (double j = 0; j < base; j++) {
			for (double i = h; i > 0; i--) {
				boxGraphic.draw(new Rectangle2D.Double(border + (width * w),
						height * h, width, height));
				System.out.println((border + (width * w)));
				w++;
			}
			//System.out.println(w + " " + h);
			w = 0;
			h--;
			border = border + (width * 0.5);
		}
		return null;
	}
}
