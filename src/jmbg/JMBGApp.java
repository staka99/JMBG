package jmbg;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.ColorUIResource;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

public class JMBGApp extends JFrame {

	private JPanel contentPane;
	private JTextField input_Ime;
	private JTextField input_Prezime;
	private JTextField input_JMBG;
	private JTextField text_Ime;
	private JTextField text_Prezime;
	private JTextField text_JMBG;
	private JTextField text_datumRodjenja;
	private JTextField text_Drzava;
	private JTextField text_Pokrajina;
	private JTextField text_Region;

	private String ime;
	private String prezime;
	private String datumRodjenja;
	private String jmbg;
	private String drzava;
	private String pokrajina;
	private String region;
	private char pol;
	private boolean poll;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JMBGApp frame = new JMBGApp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// izgled aplikacije
	public JMBGApp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 363, 517);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		UIManager.put("textInactiveText", new ColorUIResource(Color.BLACK));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_Ime = new JLabel("Ime:");
		lbl_Ime.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_Ime.setBounds(48, 61, 74, 13);
		contentPane.add(lbl_Ime);
		
		JLabel lbl_Prezime = new JLabel("Prezime:");
		lbl_Prezime.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_Prezime.setBounds(48, 84, 74, 13);
		contentPane.add(lbl_Prezime);
		
		JLabel lbl_JMBG = new JLabel("JMBG:");
		lbl_JMBG.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_JMBG.setBounds(48, 107, 74, 13);
		contentPane.add(lbl_JMBG);
		
		input_Ime = new JTextField();
		input_Ime.setBounds(156, 60, 156, 19);
		contentPane.add(input_Ime);
		input_Ime.setColumns(10);
		
		input_Prezime = new JTextField();
		input_Prezime.setColumns(10);
		input_Prezime.setBounds(156, 83, 156, 19);
		contentPane.add(input_Prezime);
		
		input_JMBG = new JTextField();
		input_JMBG.setColumns(10);
		input_JMBG.setBounds(156, 106, 156, 19);
		contentPane.add(input_JMBG);
		
		JLabel lblNaslov = new JLabel("Unesite podatke građanina:");
		lblNaslov.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		lblNaslov.setBounds(48, 10, 171, 40);
		contentPane.add(lblNaslov);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(Color.LIGHT_GRAY);
		separator.setBounds(10, 193, 325, 2);
		contentPane.add(separator);
		
		JLabel lbl_Ime2 = new JLabel("Ime:");
		lbl_Ime2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_Ime2.setBounds(48, 248, 138, 13);
		contentPane.add(lbl_Ime2);
		
		JLabel lbl_Prezime2 = new JLabel("Prezime:");
		lbl_Prezime2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_Prezime2.setBounds(48, 271, 138, 13);
		contentPane.add(lbl_Prezime2);
		
		JLabel lblJMBG_1 = new JLabel("JMBG:");
		lblJMBG_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblJMBG_1.setBounds(48, 319, 138, 13);
		contentPane.add(lblJMBG_1);
		
		text_Ime = new JTextField();
		text_Ime.setColumns(10);
		text_Ime.setBounds(156, 247, 156, 19);
		text_Ime.setEnabled(false);
		contentPane.add(text_Ime);
		
		text_Prezime = new JTextField();
		text_Prezime.setColumns(10);
		text_Prezime.setBounds(156, 270, 156, 19);
		text_Prezime.setEnabled(false);
		contentPane.add(text_Prezime);
		
		text_JMBG = new JTextField();
		text_JMBG.setColumns(10);
		text_JMBG.setBounds(156, 318, 156, 19);
		text_JMBG.setEnabled(false);
		contentPane.add(text_JMBG);
		
		JLabel lbl_datumRodjenja = new JLabel("Datum rođenja:");
		lbl_datumRodjenja.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_datumRodjenja.setBounds(48, 343, 138, 13);
		contentPane.add(lbl_datumRodjenja);
		
		JLabel lblPrezime_1_1 = new JLabel("Država:");
		lblPrezime_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPrezime_1_1.setBounds(48, 366, 138, 13);
		contentPane.add(lblPrezime_1_1);
		
		JLabel lblJMBG_1_1 = new JLabel("Pokrajina:");
		lblJMBG_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblJMBG_1_1.setBounds(48, 386, 138, 18);
		contentPane.add(lblJMBG_1_1);
		
		text_datumRodjenja = new JTextField();
		text_datumRodjenja.setColumns(10);
		text_datumRodjenja.setBounds(156, 342, 156, 19);
		text_datumRodjenja.setEnabled(false);
		contentPane.add(text_datumRodjenja);
		
		text_Drzava = new JTextField();
		text_Drzava.setColumns(10);
		text_Drzava.setBounds(156, 365, 156, 19);
		text_Drzava.setEnabled(false);
		contentPane.add(text_Drzava);
		
		text_Pokrajina = new JTextField();
		text_Pokrajina.setColumns(10);
		text_Pokrajina.setBounds(156, 388, 156, 19);
		text_Pokrajina.setEnabled(false);
		contentPane.add(text_Pokrajina);
		
		text_Region = new JTextField();
		text_Region.setColumns(10);
		text_Region.setBounds(156, 412, 156, 19);
		text_Region.setEnabled(false);
		contentPane.add(text_Region);
		
		JLabel lblJMBG_1_1_1 = new JLabel("Region:");
		lblJMBG_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblJMBG_1_1_1.setBounds(48, 403, 138, 32);
		contentPane.add(lblJMBG_1_1_1);
		
		JRadioButton btn_M = new JRadioButton("M");
		btn_M.setBounds(183, 291, 36, 21);
		btn_M.setEnabled(false);
		contentPane.add(btn_M);
		
		JRadioButton btn_Z = new JRadioButton("Ž");
		btn_Z.setBounds(221, 291, 36, 21);
		btn_Z.setEnabled(false);
		contentPane.add(btn_Z);
		
		
		JLabel lbl_Pol = new JLabel("Pol:");
		lbl_Pol.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbl_Pol.setBounds(48, 295, 138, 13);
		contentPane.add(lbl_Pol);
		
		JLabel lblGraanin = new JLabel("GRAĐANIN:");
		lblGraanin.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblGraanin.setBounds(111, 198, 108, 40);
		contentPane.add(lblGraanin);
		
		JButton btn_Pretraga = new JButton("Pretraga");
		btn_Pretraga.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pretraga();
				btn_M.setSelected(poll);
				btn_Z.setSelected(!poll);
			}
		});
		btn_Pretraga.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn_Pretraga.setBounds(156, 148, 156, 21);
		contentPane.add(btn_Pretraga);
		
		
	}

	public void pretraga() {		
		ime = input_Ime.getText();
		prezime = input_Prezime.getText();
		jmbg = input_JMBG.getText();
		
		jmbgValidator(jmbg);
	}
	
	public void jmbgValidator(String jmbg) {

		
		if(jmbg.length() == 13) {
			if(datum()) {
				String kBroj = jmbg.substring(12,13);
				if(Integer.parseInt(kBroj) == kontrolniBroj(jmbg))
				{
					pol();
					drzava();
					region();
					
					text_Ime.setText(ime);
					text_Prezime.setText(prezime);
					text_JMBG.setText(jmbg);
					text_Drzava.setText(drzava);
					text_Pokrajina.setText(pokrajina);
					text_Region.setText(region);
					text_datumRodjenja.setText(datumRodjenja);
					
				} else {
					JOptionPane.showMessageDialog(null, "Uneseni JMBG nije ispravan!");
					setNull();
				}
			} else {
				JOptionPane.showMessageDialog(null, "Neispravan datum!");
			}
		} else {
			JOptionPane.showMessageDialog(null, "JMBG mora imati 13 cifara!");
		}
		
		//System.out.println("Dan: " + dd + "; Mjesec: " + mm + "; Godina: " + yyy + "; Region: " + politickiRegion + "; Pol:" + pol + "; Kontrolni:" + kBroj);
		

	}
	
	public int kontrolniBroj(String jmbg) {
		Integer a = Integer.parseInt(jmbg.substring(0, 1));
		Integer b = Integer.parseInt(jmbg.substring(1, 2));
		Integer v = Integer.parseInt(jmbg.substring(2, 3));
		Integer g = Integer.parseInt(jmbg.substring(3, 4));
		Integer d = Integer.parseInt(jmbg.substring(4, 5));
		Integer w = Integer.parseInt(jmbg.substring(5, 6));
		Integer e = Integer.parseInt(jmbg.substring(6, 7));
		Integer x = Integer.parseInt(jmbg.substring(7, 8));
		Integer z = Integer.parseInt(jmbg.substring(8, 9));
		Integer i = Integer.parseInt(jmbg.substring(9, 10));
		Integer j = Integer.parseInt(jmbg.substring(10, 11));
		Integer k = Integer.parseInt(jmbg.substring(11, 12));
		//Integer l = Integer.parseInt(jmbg.substring(12, 13));
		
		Integer l = 11-((7*(a+e) + 6*(b+x) + 5*(v+z) + 4*(g+i) + 3*(d+j) + 2*(w+k)) % 11);
		//System.out.println(a + " " + b + " " + v + " " + g + " " + d + " " + w + " " + e + " " + z + " " + x + " " + i + " " + j + " " + k);
		if(l > 9)
			l = 0;
		System.out.println("Kontrolni broj je: " + l);
		return l;
	}

	public void drzava() {
		String d = jmbg.substring(7,8);
		switch(d) {
		case "1":
			drzava = "Bosna i Hercegovina";
			pokrajina = null;
			break;
			
		case "2":
			drzava = "Crna Gora";
			pokrajina = null;
			break;

		case "3":
			drzava = "Hrvatska";
			pokrajina = null;
			break;
			
		case "4":
			drzava = "Sjeverna Makedonija";
			pokrajina = "Stranac";
			region = "Stranac";
			break;
			
		case "5":
			drzava = "Slovenija";
			pokrajina = null;
			break;
			
		case "7":
			drzava = "Srbija";
			pokrajina = null;
			region = "Stranac";
			break;
			
		case "8":
			drzava = "Srbija";
			pokrajina = "Vojvodina";
			break;
			
		case "9":
			drzava = "Srbija";
			pokrajina = "Kosovo i Metohija";
			break;

		case "6":
			JOptionPane.showMessageDialog(null, "Ne postoji JMBG sa oznakom države 6!");
			break;
		}
	}
	
	public void region() {
		String politickiRegion = jmbg.substring(7, 9);
		
		switch(politickiRegion) {
		case "01":
			drzava = "Bosna i Hercegovina";
			pokrajina = "Stranac";
			region = "Stranac";
			break;
			
		case "02":
			drzava = "Crna Gora";
			pokrajina = "Stranac";
			region = "Stranac";
			break;

		case "03":
			drzava = "Hrvatska";
			pokrajina = "Stranac";
			region = "Stranac";
			break;
			
		case "04":
			drzava = "Sjeverna Makedonija";
			pokrajina = "Stranac";
			region = "Stranac";
			break;
			
		case "05":
			drzava = "Slovenija";
			pokrajina = "Stranac";
			region = "Stranac";
			break;
			
		case "07":
			drzava = "Srbija";
			pokrajina = "Stranac";
			region = "Stranac";
			break;
			
		case "08":
			drzava = "Srbija";
			pokrajina = "Vojvodina";
			region = "Stranac";
			break;
			
		case "09":
			drzava = "Srbija";
			pokrajina = "Kosovo i Metohija";
			region = "Stranac";
			break;
			
		case "10":
			region = "Banja Luka";
			break;
			
		case "11":
			region = "Bihać";
			break;
			
		case "12":
			region = "Doboj";
			break;
			
		case "13":
			region = "Goražde";
			break;
			
		case "14":
			region = "Livno";
			break;
			
		case "15":
			region = "Mostar";
			break;
			
		case "16":
			region = "Prijedor";
			break;
			
		case "17":
			region = "Sarajevo";
			break;
			
		case "18":
			region = "Tuzla";
			break;
			
		case "19":
			region = "Zenica";
			break;
			
		case "20":
			region = "XXXXXXXXXXXXXXXXXXXXXXXXXXX";
			break;
			
		case "21":
			region = "Podgorica";
			break;
			
		case "22":
			region = "Bar | Ulcinj";
			break;
			
		case "23":
			region = "Budva | Kotor | Tivar";
			break;
			
		case "24":
			region = "Herceg Novi";
			break;
			
		case "25":
			region = "Cetinje";
			break;
			
		case "26":
			region = "Nikšić";
			break;
			
		case "27":
			region = "Berane | Andrijevica | Rožaje | Plav";
			break;
			
		case "28":
			region = "Bijelo Polje | Mojkovica";
			break;
			
		case "29":
			region = "Pljevlja | Žabljak";
			break;
			
		default:	    
			JOptionPane.showMessageDialog(null, "Ne postoji region sa unesenim brojem: " + politickiRegion + "!");
			break;
		}
	}
	
	public void pol() {
		String p = jmbg.substring(9, 12);
		if(Integer.parseInt(p) <= 499)
			{
				pol = 'M';
				poll = true;
			}
		else if(Integer.parseInt(p) >= 500)
			{ 
				pol = 'Ž';
				poll = false;
			}
	}
	
	public boolean datum() {
		int dd = Integer.parseInt(jmbg.substring(0, 2));
		int mm = Integer.parseInt(jmbg.substring(2, 4));
		int god = Integer.parseInt(jmbg.substring(4, 7));
		
		if( god > 500)
			god = god + 1000;
		else 
			god = god + 2000;
		
		/*if(dd >= 1 && dd <=31 && mm <= 12 && mm>=1) {
			datumRodjenja = dd + "." + mm + "." + god + ".";
			return true;
		} else {
			return false;
		}*/
		
		if(validanDatum(dd + "/" + mm + "/" + god)) {
			datumRodjenja = dd + "/" + mm + "/" + god;
			return true;
		} else 
			return false;
		
	}

	public static boolean validanDatum(String input) {
	    String formatString = "dd/MM/yyyy";
	    
	    try {
	        SimpleDateFormat format = new SimpleDateFormat(formatString);
	        format.setLenient(false);
	        format.parse(input);
	    } catch (ParseException | IllegalArgumentException e) {
	        return false;
	    }

	    return true;
	}

	public void setNull() {
		jmbg = null;
		ime = null;
		prezime = null;
		datumRodjenja = null;
		pokrajina = null;
		drzava = null;
		region = null;
	}
}
