
import java.awt.*;
import java.awt.Font;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class TextEditor {
	public static void main(String[] args) {
		
		//Creating The Window -
		JFrame editor = new JFrame("Text Editor By Manash");
		editor.setSize(900, 600);
		editor.setLocation(200, 50);
		editor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Image icon = Toolkit.getDefaultToolkit().getImage("src\\ico.png");
		editor.setIconImage(icon);
		
		//Designing Font -
		//Font Size -
		Font font1 = new Font("HelvLight", Font.BOLD, 10);
		Font font2 = new Font("HelvLight", Font.BOLD, 20);
		Font font3 = new Font("HelvLight", Font.BOLD, 30);
		Font font4 = new Font("HelvLight", Font.BOLD, 40);
		Font font5 = new Font("HelvLight", Font.BOLD, 50);
		Font font6 = new Font("HelvLight", Font.BOLD, 60);		
		
		//Formatting -
		Font font7 = new Font("HelvLight", Font.BOLD, 30);
		Font font8 = new Font("HelvLight", Font.ITALIC, 30);
		
		//Creating Menubar -		
		JMenuBar menubar = new JMenuBar();
		editor.setJMenuBar(menubar);
		
		JMenu filemenu = new JMenu("File");
		menubar.add(filemenu);
		JMenuItem open = new JMenuItem("Open");
		JMenuItem saveas = new JMenuItem("Save As");
		JMenuItem exit = new JMenuItem("Exit");
		filemenu.add(open);
		filemenu.add(saveas);
		filemenu.add(exit);
		
		JMenu edit = new JMenu("Format");
		menubar.add(edit);

		JMenuItem bold = new JMenuItem("Bold");
		JMenuItem italic = new JMenuItem("Italic");
		edit.add(bold);
		edit.add(italic);
		
		JMenu fontsize = new JMenu("Font-size");
		menubar.add(fontsize);
		
		JMenuItem ten = new JMenuItem("10");
		JMenuItem twenty = new JMenuItem("20");
		JMenuItem thirty = new JMenuItem("30");
		JMenuItem forty = new JMenuItem("40");
		JMenuItem fifty = new JMenuItem("50");
		JMenuItem sixty = new JMenuItem("60");
		fontsize.add(ten);
		fontsize.add(twenty);
		fontsize.add(thirty);
		fontsize.add(forty);
		fontsize.add(fifty);
		fontsize.add(sixty);
		
		JMenu help = new JMenu("Help");
		menubar.add(help);
		JMenuItem about = new JMenuItem("About");
		help.add(about);
		
		//Creating The TextArea -		
		JTextArea txtbox = new JTextArea();
		txtbox.setSize(900, 600);
		txtbox.setFont(font3);
		txtbox.setSelectedTextColor(Color.GRAY);
		
		//Adding Action Listener In Menu Item -
		about.addActionListener(e->{
			
			try{
				JOptionPane.showMessageDialog(editor, "Text Editor by Manash, Developer : Manash Pratim Saikia");		
			}catch (Exception d) {
				
			}
		});
		
		ten.addActionListener(e->{
			
			try{
				txtbox.setFont(font1);	
			}catch (Exception d) {
				
			}
		});
		twenty.addActionListener(e->{
			
			try{
				txtbox.setFont(font2);	
			}catch (Exception d) {
				
			}
		});
		thirty.addActionListener(e->{
			
			try{
				txtbox.setFont(font3);	
			}catch (Exception d) {
				
			}
		});
		forty.addActionListener(e->{
			
			try{
				txtbox.setFont(font4);	
			}catch (Exception d) {
				
			}
		});
		fifty.addActionListener(e->{
			
			try{
				txtbox.setFont(font5);	
			}catch (Exception d) {
				
			}
		});
		sixty.addActionListener(e->{
			
			try{
				txtbox.setFont(font6);	
			}catch (Exception d) {
				
			}
		});
		
		bold.addActionListener(e->{
			
			try{
				txtbox.setFont(font7);	
			}catch (Exception d) {
				
			}
		});
		italic.addActionListener(e->{
			
			try{
				txtbox.setFont(font8);	
			}catch (Exception d) {
				
			}
		});
		open.addActionListener(e->{
			
			try{
				JFileChooser fileChooser=new JFileChooser();
				fileChooser.showOpenDialog(null);
				File selfile = fileChooser.getSelectedFile();
				
				Scanner sc = new Scanner(selfile);
				while(sc.hasNextLine()) {
					String txts = sc.nextLine();
					txtbox.setText(txts);
				}
				
				editor.setTitle(file.getName() + " -Text Editor By Manash");
				
			}catch (Exception d) {
				
			}
		});
		exit.addActionListener(e->{
			
			try{
				editor.dispose();				        
			}catch (Exception d) {
				
			}
		});
		saveas.addActionListener(e->{
					
			try{
				JFileChooser fc = new JFileChooser();
				int option = fc.showSaveDialog(editor);
				
				if (option == JFileChooser.APPROVE_OPTION) {
					File savedfile = fc.getSelectedFile();
					FileWriter fw = new FileWriter(savedfile);
					fw.write(txtbox.getText());
					fw.close();
					JOptionPane.showMessageDialog(editor, "Saved Succesfully");
				}
				
				
			}catch (Exception d) {
				
			}
		});
		
		//Creating ScrollBar
		JScrollPane scrollbar = new JScrollPane(txtbox, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		editor.add(scrollbar);
		editor.setVisible(true);		

	}

}
