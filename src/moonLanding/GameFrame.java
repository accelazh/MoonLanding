package moonLanding;

import javax.swing.JFrame;

public class GameFrame extends JFrame
{
	public GameFrame()
	{
		GamePanel p=null;
		getContentPane().add(p=new GamePanel());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Moon Landing");
		pack();
		setLocationRelativeTo(null);
		p.requestFocusInWindow();
		
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new GameFrame();
		
	}

}
