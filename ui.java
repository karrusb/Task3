package WOTS;

import java.awt.*;

import javax.swing.*;


public class ui {
	
	final static String BUTTONPANEL = "Customer Orders";
	final static String TEXTPANEL = "Purchase Orders";
	final static int windowWidth = 600;
	final static int windowHeight = 600;
	
	public void addComponentToPane(Container pane)
	{
		JTabbedPane tabbedPane = new JTabbedPane();
		
		JPanel card1 = new JPanel()
		{
			public Dimension getPreferredSize()
			{
				Dimension size = super.getPreferredSize();
				size.width += windowWidth;
				size.height += windowHeight;
				return size;
			}
		};
		card1.add(new JButton("Order1"));
        card1.add(new JButton("Order2"));
        card1.add(new JButton("Order3"));
        
        JPanel card2 = new JPanel();
        card2.add(new JTextField("TextField", 20));

        tabbedPane.addTab(BUTTONPANEL, card1);
        tabbedPane.addTab(TEXTPANEL, card2);

        pane.add(tabbedPane, BorderLayout.CENTER);
	}
	
	private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("NB Gardens Inventory Management");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        ui demo = new ui();
        demo.addComponentToPane(frame.getContentPane());

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (UnsupportedLookAndFeelException ex) {
            ex.printStackTrace();
        } catch (IllegalAccessException ex) {
            ex.printStackTrace();
        } catch (InstantiationException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        /* Turn off metal's use of bold fonts */
        UIManager.put("swing.boldMetal", Boolean.FALSE);
        
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
	}


