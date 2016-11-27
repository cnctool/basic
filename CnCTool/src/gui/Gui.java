package gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JScrollBar;

public class Gui extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui frame = new Gui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Gui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(459, 109, 300, 353);
		contentPane.add(editorPane);
		
		JLabel lblAusgabe = new JLabel("Ausgabe:");
		lblAusgabe.setBounds(459, 84, 82, 14);
		contentPane.add(lblAusgabe);
		
		JLabel lblInformationen = new JLabel("Informationen Werkzeug:");
		lblInformationen.setBounds(10, 11, 237, 14);
		contentPane.add(lblInformationen);
		
		textField = new JTextField();
		textField.setBounds(160, 44, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent arg0) {
				if(arg0.getKeyCode()==KeyEvent.VK_ENTER){
					if(textField.getText().length()<=0){
						JOptionPane.showMessageDialog(editorPane, "Bitte geben sie den Fraeser Durchmesser ein!","Error", 0);
					}else if(textField.getText().length()>0){
					textField_1.grabFocus();
					
					}
				}
			}
		});
		
		JLabel lblFraeserDurchmesser = new JLabel("Fraeser Durchmesser:");
		lblFraeserDurchmesser.setBounds(10, 47, 140, 14);
		contentPane.add(lblFraeserDurchmesser);
		
		JLabel lblStufentiefeMm = new JLabel("Stufentiefe in MM:");
		lblStufentiefeMm.setBounds(10, 72, 140, 14);
		contentPane.add(lblStufentiefeMm);
		
		textField_1 = new JTextField();
		textField_1.setBounds(160, 69, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		textField_1.addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent arg0) {
				if(arg0.getKeyCode()==KeyEvent.VK_ENTER){
					if(textField_1.getText().length()<=0){
						JOptionPane.showMessageDialog(editorPane, "Bitte geben sie den Stufentiefe ein!","Error", 0);
					}else if(textField.getText().length()>0){
					textField_2.grabFocus();
					
					}
				}
			}
		});
		
		JLabel lblInformationenSchraege = new JLabel("Informationen Schraege:");
		lblInformationenSchraege.setBounds(10, 109, 355, 14);
		contentPane.add(lblInformationenSchraege);
		
		textField_2 = new JTextField();
		
		textField_2.addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent arg0) {
				if(arg0.getKeyCode()==KeyEvent.VK_ENTER){
					textField_3.grabFocus();
				}
			}
		});
		textField_2.setBounds(160, 134, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblLaenge = new JLabel("Laenge");
		lblLaenge.setBounds(10, 137, 65, 14);
		contentPane.add(lblLaenge);
		
		textField_3 = new JTextField();
		textField_3.setBounds(160, 165, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		textField_3.addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent arg0) {
				if(arg0.getKeyCode()==KeyEvent.VK_ENTER){
					
					if(textField_2.getText().length()!=0 && textField_3.getText().length()!=0){
						float laenge = Float.parseFloat(textField_2.getText());
						float tiefe = Float.parseFloat(textField_3.getText());
						float winkel =0f;
						float tan= laenge/tiefe;
						System.out.println(""+tan);
						
						tan=(float) Math.atan(tan);
						System.out.println(""+tan);
						tan = (float) Math.toDegrees(tan);
						System.out.println(""+tan);
						
						
						winkel = tan;
						textField_4.setText(""+winkel);
						
						
						
					}else if (textField_2.getText().length()==0 && textField_3.getText().length() !=0){
						textField_4.grabFocus();
					}else if (textField_3.getText().length()==0 && textField_2.getText().length() !=0){
						textField_4.grabFocus();
					}
					
					
				}
			}
		});
		
		JLabel lblTiefe = new JLabel("Tiefe");
		lblTiefe.setBounds(10, 168, 46, 14);
		contentPane.add(lblTiefe);
		
		textField_4 = new JTextField();
		textField_4.setBounds(160, 196, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		textField_4.addKeyListener(new KeyAdapter(){
			public void keyPressed(KeyEvent arg0) {
				if(arg0.getKeyCode()==KeyEvent.VK_ENTER){
					
					if(textField_2.getText().length()!=0 && textField_3.getText().length()==0){
						float laenge = Float.parseFloat(textField_2.getText());
						float winkel = Float.parseFloat(textField_4.getText());
						float tiefe =0f;
						float tan=0f;
						System.out.println(""+winkel);
						tan = (float) Math.tan(Math.toRadians(winkel));
						System.out.println(""+tan);
						
						
						tan= laenge/tan;
						
						tiefe = tan;
						textField_3.setText(""+tiefe);
						
						
						
					}else if (textField_2.getText().length()==0 && textField_3.getText().length() !=0){
						float laenge=0f;
						float tiefe= Float.parseFloat(textField_3.getText());
						float winkel= Float.parseFloat(textField_4.getText());
						float tan = 0f;
						
						tan = (float) Math.tan(Math.toRadians(winkel));
						System.out.println(""+tan);
						
						laenge = tan*tiefe;
						textField_2.setText(""+laenge);
						
						
					}
					
					
				}
			}
		});
		
		JLabel lblWinkel = new JLabel("Winkel");
		lblWinkel.setBounds(10, 199, 46, 14);
		contentPane.add(lblWinkel);
		
		JRadioButton rdbtnUnten = new JRadioButton("Unten");
		rdbtnUnten.setBounds(6, 256, 109, 23);
		contentPane.add(rdbtnUnten);
		
		JLabel lblLageDerSchraege = new JLabel("Lage der schraege:");
		lblLageDerSchraege.setBounds(6, 235, 241, 14);
		contentPane.add(lblLageDerSchraege);
		
		JRadioButton rdbtnRechts = new JRadioButton("Rechts");
		rdbtnRechts.setBounds(6, 282, 109, 23);
		contentPane.add(rdbtnRechts);
		
		JRadioButton rdbtnOben = new JRadioButton("Oben");
		rdbtnOben.setBounds(6, 308, 109, 23);
		contentPane.add(rdbtnOben);
		
		JRadioButton rdbtnLinks = new JRadioButton("Links");
		rdbtnLinks.setBounds(6, 334, 109, 23);
		contentPane.add(rdbtnLinks);
		
		JButton btnErzeugen = new JButton("Erzeugen");
		btnErzeugen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//System.out.println("Jude");
				calc();
				
			}

			
			private String calc() {
			
				int radius=Integer.parseInt(textField.getText());
				radius=radius/2;
				ArrayList<String> text = new ArrayList<String>();
				
				//Hier Logik
				String ausgabe="";
				text.add("G0 X-"+(radius+20)+" Y-"+(radius+20));
				text.add("Z50");
				text.add("Z10");
				text.add("G1 ");
			
				
				//Ausgabe
				for(int i=0;i<text.size();i++){
					ausgabe=ausgabe+text.get(i)+"\n";
				}
				editorPane.setText(ausgabe);
				
				
				
				return null;
				
				
			}
		});
		btnErzeugen.setBounds(158, 393, 89, 23);
		contentPane.add(btnErzeugen);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
				textField_1.setText("");
				textField_2.setText("");
				textField_3.setText("");
				textField_4.setText("");
				textField.grabFocus();
			    editorPane.setText("");
				
			}
		});
		btnClear.setBounds(264, 393, 89, 23);
		contentPane.add(btnClear);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Gui.class.getResource("/gui/Unbenannt-1.png")));
		label.setBounds(256, 134, 180, 82);
		contentPane.add(label);
		
		
		
		
		setTitle("CnC Tool v0.1");
		
	}
}
