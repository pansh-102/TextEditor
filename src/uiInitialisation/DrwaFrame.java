package uiInitialisation;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.*;
public class DrwaFrame extends JFrame{

	JMenu file,view,edit,format,help ;
	public DrwaFrame(){
		this.setSize(800,700);
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension dim = tk.getScreenSize();
		int xpos = (dim.width/2) - (this.getWidth()/2);
		int ypos = (dim.height/2) - (this.getHeight()/2);
		this.setLocation(xpos,ypos);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Pansh Editor");
		
		JMenuBar menubar = new JMenuBar();
		this.setJMenuBar(menubar);
		file = new JMenu("File");
		menubar.add(file);
		JMenuItem openFile = new JMenuItem("Open File..");
		file.add(openFile);
		JMenuItem newFile = new JMenuItem("New File..");
		file.add(newFile);
		JMenuItem saveAs = new JMenuItem("Save As..");
		file.add(saveAs);
		JMenuItem exit = new JMenuItem("Exit");
		file.add(exit);
		//ListenForButton lb = new ListenForButton();
		//ListenForKeys lForKeys = new ListenForKeys();
		//file.addKeyListener(lForKeys);
		
		edit = new JMenu("Edit");
		menubar.add(edit);
		JMenuItem cut = new JMenuItem("Cut");
		edit.add(cut);
		JMenuItem copy = new JMenuItem("Copy");
		edit.add(copy);
		JMenuItem paste = new JMenuItem("Paste");
		edit.add(paste);
		JMenuItem fAndD = new JMenuItem("Find/Replace");
		edit.add(fAndD);
		
		format = new JMenu("Format");
		menubar.add(format);
		JMenuItem font = new JMenuItem("Font..");
		format.add(font);
		
		view = new JMenu("View"); 
		menubar.add(view);
		JMenuItem statusBar = new JMenuItem("Status Bar");
		view.add(statusBar);
		
		help = new JMenu("Help");
		menubar.add(help);
		JMenuItem about = new JMenuItem("About Pansh Editor");
		help.add(about);
		
		//GoBoard jboard = new GoBoard();
		//jboard.setLayout(new BorderLayout());
		
		JPanel panel1 = new JPanel();
		panel1.setBorder(BorderFactory.createLineBorder(Color.blue));
		add(panel1,BorderLayout.CENTER);
		JLabel label1 = new JLabel();
		label1.setToolTipText("Testing UI");
		panel1.setBackground(Color.white);
		panel1.add(label1);
		
		
//		JButton button1 = new JButton("File");
//		button1.setBorderPainted(true);
//		button1.setContentAreaFilled(true);
//		button1.setToolTipText("File settings");
//		panel1.add(button1);
//		JTextField text1 = new JTextField("Search ?",15);
//		text1.setToolTipText("Search a word");
//		panel1.add(text1);
		JTextArea ta1 = new JTextArea(40,70);
//		ta1.setText("Type Here...");
//		JScrollPane scroll = new JScrollPane(ta1);
		ta1.setLineWrap(true);
		ta1.setWrapStyleWord(true);
		JScrollPane scrollbar1 = new JScrollPane(ta1, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		panel1.add(scrollbar1);
		this.add(panel1,BorderLayout.CENTER);
		this.pack();
		this.setVisible(true);
	}
	public static void main(String args[]){
		new DrwaFrame();
	}
	private class ListenForButton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Inside Action Listner");
			if(e.getSource() instanceof JMenu) {
				if(e.getSource()==file){
					JMenuItem openFile = new JMenuItem("Open File..");
					file.add(openFile);
					JMenuItem newFile = new JMenuItem("New File..");
					file.add(newFile);
					JMenuItem saveAs = new JMenuItem("Save As..");
					file.add(saveAs);
					JMenuItem exit = new JMenuItem("Exit");
					file.add(exit);
				}
			}
			
		}
		
	}
	private class ListenForKeys implements KeyListener{

		@Override
		public void keyPressed(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	private class ListenForWindow implements WindowListener{

		@Override
		public void windowActivated(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosed(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosing(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeactivated(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeiconified(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowIconified(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowOpened(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
		
	}
	
	private class ListenForMouse implements MouseListener{

		@Override
		public void mouseClicked(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
}
