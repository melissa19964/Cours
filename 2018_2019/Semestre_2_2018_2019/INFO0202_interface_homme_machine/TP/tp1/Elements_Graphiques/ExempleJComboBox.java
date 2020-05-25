import javax.swing.JFrame;
import javax.swing.JComboBox;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Vector;

public class ExempleJComboBox
{
    public static void main(String[] args)
    {
	JFrame windows = new JFrame();

	Vector<String> couleurs = new Vector<String>();
	
	couleurs.add("Jaune");
	couleurs.add("Rouge");
	couleurs.add("Vert");
	
	JComboBox component = new JComboBox(couleurs);


	windows.getContentPane().add(component);
	windows.setSize(new Dimension(400,200));
	
	Dimension resolution=windows.getToolkit().getScreenSize();
	Dimension dimension=windows.getSize();

	windows.setLocation((int)(resolution.getWidth()/2-dimension.getWidth()/2),(int)(resolution.getHeight()/2-dimension.getHeight()/2));


	windows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	windows.setTitle("Exemple de "+component.getClass().getName());
	windows.setVisible(true);
    }
}

