import javax.swing.*;
import javax.swing.JToolBar;
import java.awt.*;
import java.awt.event.*;

public class Ma_Calcu_Projet extends JFrame implements ActionListener, ItemListener
{
	JPanel pano = null;
	JTextField ecran = new JTextField (18);
	JButton rentr = new JButton("<==");
	JButton clrx = new JButton("C");
	JButton plux = new JButton("+");
	JButton moinx = new JButton("-");
	JButton foix = new JButton("x");
	JButton divixe = new JButton("/");
	JButton egalex = new JButton("=");
	JButton Mod = new JButton("Mod");
	JButton bttn_0 = new JButton("0");
	JButton bttn_1 = new JButton("1");
	JButton bttn_2 = new JButton("2");
	JButton bttn_3 = new JButton("3");
	JButton bttn_4 = new JButton("4");
	JButton bttn_5 = new JButton("5");
	JButton bttn_6 = new JButton("6");
	JButton bttn_7 = new JButton("7");
	JButton bttn_8 = new JButton("8");
	JButton bttn_9 = new JButton("9");
	JButton bttn_Virg = new JButton(".");
	
	JMenuBar barM= new JMenuBar();
	JMenu fich, edit , propos , etudiant , faculter , sport , filiere;
	JMenuItem nouveau,ancien , ajout1 , ajout2 , ajout3 , lister1 , lister2 , lister3, liste , nouveau1 , quitter1;
	JToolBar baroutil;
	//ON-OFF
	JRadioButton bOn= new JRadioButton("ON");
	JRadioButton bOff= new JRadioButton("OFF");
	
	public Ma_Calcu_Projet() {
		pano = new JPanel();
		
		//Bar d'outil
		JToolBar baroutil=new JToolBar();
	    Icon vert=new ImageIcon("./facebook.png");
	    Icon rouge=new ImageIcon("./flickr.png");
	    Icon bleu=new ImageIcon("./vimeo.png");
	   JButton brouge=new JButton("",rouge);
	   JButton bvert=new JButton("",vert);
	   JButton bbleu=new JButton("",bleu);
	  /* 


.setBackground(Color.red);
	   bvert.setBackground(Color.green);
	   bbleu.setBackground(Color.yellow);*/

	    /*getContentPane().setLayout(new BorderLayout());
	    getConte(baroutil,BorderLayout.NORTH);*/
	    
	    baroutil.add(brouge);
	    baroutil.add(bvert);
	    baroutil.add(bbleu);
	    baroutil.setFloatable(false);
	    
		//Barmenu
	    barM=new JMenuBar();
	    fich=new JMenu("Fichier");
	    edit=new JMenu("Edition");
	    propos=new JMenu("A Propos");
	    faculter=new JMenu("Falculter");
	    filiere=new JMenu("Filiere");
	    etudiant=new JMenu("Etudiant");
	    sport=new JMenu("Sport");
	    
	    nouveau1=new JMenuItem("Nouveau");
	    quitter1=new JMenuItem("Quitter");
	    ajout1=new JMenuItem("Ajouter");
	    lister1=new JMenuItem("Lister");
	    ajout2=new JMenuItem("Ajouter");
	    lister2=new JMenuItem("Lister");
	    nouveau=new JMenuItem("Nouveau");
	    ancien=new JMenuItem("Ancien");
	    liste=new JMenuItem("Listes");
	    ajout3=new JMenuItem("Ajouter");
	    lister3=new JMenuItem("Lister");
	    
	    fich.add(nouveau1);
	    fich.add(quitter1);
	    
	    faculter.add(ajout1);
	    faculter.add(lister1);
	    filiere.add(ajout2);
	    filiere.add(lister2);
	    etudiant.add(nouveau);
	    etudiant.add(ancien);
	    etudiant.add(liste);
	    sport.add(ajout3);
	    sport.add(lister3);
	    
	    edit.add(faculter);
	    barM.add(fich);
	    barM.add(edit);
	    barM.add(propos);
		this.setJMenuBar(barM);
		//les composant de la calculatrice
		
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		//champ de texte
		JPanel pan_Chpfield = new JPanel();
		pan_Chpfield.setLayout(new FlowLayout(FlowLayout.CENTER));
		pan_Chpfield.add(ecran);
		ecran.setHorizontalAlignment(ecran.RIGHT);
		/*Font police = new Font("Arial",Font.BOLD,20);
		ecran.setFont(police);*/
		
		//calc on ou off
		
		ButtonGroup etat_Calc = new ButtonGroup();
		etat_Calc.add(bOn);
		etat_Calc.add(bOff);
		bOff.setSelected(true); // calc off
		
		//operators
		
		
		// pan directe sous ecran
		JPanel pan_Secran = new JPanel();
		pan_Secran.setLayout(new FlowLayout());
		 Box bVert = Box.createVerticalBox();
		 pan_Secran.add(bVert);
		 bVert.add(bOn);
		 bVert.add(bOff);
	  //creation du panneau alum calc 43-45
		pan_Secran.add(rentr);
		pan_Secran.add(plux);
		pan_Secran.add(moinx);
		
		//pan operator
		JPanel pan_Oper = new JPanel();
		pan_Oper.setLayout(new GridLayout(4,1,8,8) );
		pan_Oper.add(foix);
		pan_Oper.add(divixe);
		pan_Oper.add(Mod);
		pan_Oper.add(egalex);
		
		
		//operande
		JPanel pan_Num = new JPanel();
		pan_Num.setLayout(new GridLayout(4,3,8,8));
		
		pan_Num.add(bttn_7);
		pan_Num.add(bttn_8);
		pan_Num.add(bttn_9);
		pan_Num.add(bttn_4);		
		pan_Num.add(bttn_5);
		pan_Num.add(bttn_6);
		pan_Num.add(bttn_1);
		pan_Num.add(bttn_2);
		pan_Num.add(bttn_3);
		pan_Num.add(bttn_0);
		pan_Num.add(bttn_Virg);
		pan_Num.add(clrx);
		//ecouteur
		bttn_0.addActionListener(this);
		bttn_1.addActionListener(this);
		bttn_2.addActionListener(this);
		bttn_3.addActionListener(this);
		bttn_4.addActionListener(this);
		bttn_5.addActionListener(this);
		bttn_6.addActionListener(this);
		bttn_7.addActionListener(this);
		bttn_8.addActionListener(this);
		bttn_9.addActionListener(this);
		plux.addActionListener(this);
		moinx.addActionListener(this);
		foix.addActionListener(this);
		divixe.addActionListener(this);
	egalex.addActionListener(this);
		Mod.addActionListener(this);
		clrx.addActionListener(this);
		bttn_Virg.addActionListener(this);
		rentr.addActionListener(this);
		//on - off
		bOn.addActionListener(this);
		bOff.addActionListener(this);
		bOn.addItemListener(this);
		bOff.addItemListener(this);
		
		
		// pan numopre
		JPanel pan_Numopre = new JPanel();
		pan_Numopre.setLayout(new FlowLayout());
		pan_Numopre.add(pan_Num);
		pan_Numopre.add(pan_Oper);
		
		//Ajout a la calc des composant
		 Box bVert_Calc = Box.createVerticalBox();
		 pano.add(bVert_Calc);
		 bVert_Calc.add(pan_Chpfield);
		 bVert_Calc.add(pan_Secran);
		 bVert_Calc.add(pan_Numopre);
		 bVert_Calc.add(baroutil);
		getContentPane().add(pano);
		
		
		
		
		}
	
	
	public void enable()
	{
		ecran.setEnabled(true);
		rentr.setEnabled(true);
		clrx.setEnabled(true);
		plux.setEnabled(true);
		moinx.setEnabled(true);
		foix.setEnabled(true);
		divixe.setEnabled(true);
		egalex.setEnabled(true);
		Mod.setEnabled(true);
		bttn_0.setEnabled(true);
		bttn_1.setEnabled(true);
		bttn_2.setEnabled(true);
		bttn_3.setEnabled(true);
		bttn_4.setEnabled(true);
		bttn_5.setEnabled(true);
		bttn_6.setEnabled(true);
		bttn_7.setEnabled(true);
		bttn_8.setEnabled(true);
		bttn_9.setEnabled(true);
		bttn_Virg.setEnabled(true);
	} 
	
	public void disable()
	{
		ecran.setEnabled(false);
		rentr.setEnabled(false);
		clrx.setEnabled(false);
		plux.setEnabled(false);
		moinx.setEnabled(false);
		foix.setEnabled(false);
		divixe.setEnabled(false);
		egalex.setEnabled(false);
		Mod.setEnabled(false);
		bttn_0.setEnabled(false);
		bttn_1.setEnabled(false);
		bttn_2.setEnabled(false);
		bttn_3.setEnabled(false);
		bttn_4.setEnabled(false);
		bttn_5.setEnabled(false);
		bttn_6.setEnabled(false);
		bttn_7.setEnabled(false);
		bttn_8.setEnabled(false);
		bttn_9.setEnabled(false);
		bttn_Virg.setEnabled(false);
	} 
	// ACTION SUR LES BOUTTONS D'OPERANDES
	String operat = "";
	String anc1 ="";
	String anc2 ="";
	@Override
	public void actionPerformed(ActionEvent ev) {
		if(ev.getSource() == bttn_0 || ev.getSource() == bttn_1 || ev.getSource() == bttn_2 || ev.getSource() == bttn_3 || ev.getSource() == bttn_4 || ev.getSource() == bttn_5 || ev.getSource() == bttn_6 || ev.getSource() == bttn_7 || ev.getSource() == bttn_8 || ev.getSource() == bttn_9)
		{
			String nom = ev.getActionCommand();
			ecran.setText(ecran.getText()+nom);
		}
		if(ev.getSource() == plux || ev.getSource() == moinx || ev.getSource() == foix || ev.getSource() == divixe || ev.getSource() == Mod) {
			 anc1 = ecran.getText();
			ecran.setText("");
			operat = ev.getActionCommand();
			}
		if(ev.getSource() == rentr) {
			int tail_Chain_ecran= ecran.getText().length();
			int retr_taille=ecran.getText().length() - 1;
			String sauvegarde;
			if (tail_Chain_ecran>0) {
				StringBuilder back = new StringBuilder(ecran.getText()); //StringBuilder cree un string builder utiliser pour garder une chaine , le contenu de ecran est mis dans back
				back.deleteCharAt(retr_taille); // deleCharAt nous permet de suprimer un caractere a une position donner ici retr_taille
				sauvegarde = back.toString(); //converti notre StringBuilder en string qui est mis dan notre ecran ki est de type string
				ecran.setText(sauvegarde);
			}
		}
		if(ev.getSource() == egalex) {
			anc2 = ecran.getText();
			ecran.setText("");
			float fanc1=Float.parseFloat(anc1);
			float fanc2=Float.parseFloat(anc2);
			float s;
			String afiche;
			if(operat == "+") {
				s= fanc1+fanc2;
				afiche=String.valueOf(s);
				ecran.setText(afiche);
				}
			if (operat == "-") {
				s= fanc1-fanc2;
				afiche=String.valueOf(s);
				ecran.setText(afiche);
			}
			if (operat == "x") {
				s= fanc1*fanc2;
				afiche=String.valueOf(s);
				ecran.setText(afiche);
			}
			if (operat =="/") {
				s= fanc1/fanc2;
				afiche=String.valueOf(s);
				ecran.setText(afiche);
			}
			if (operat == "Mod") {
				s= fanc1%fanc2;
				afiche=String.valueOf(s);
				ecran.setText(afiche);
			}
		}
		if (ev.getSource() == clrx ) {
			ecran.setText("");
		}
		if(ev.getSource() == bttn_Virg) {
			//**** en attente de modification
			String nom = ev.getActionCommand();
			ecran.setText(ecran.getText()+nom);
		}
		if (ev.getSource() == bOn && !(bOff.isSelected())) {
			bOn.setEnabled(false);
			enable();
			
		}
		if (ev.getSource() == bOff) {
			bOn.setEnabled(true);
			disable();
		}
			
	}
	//bouton radio
	
	  public void itemStateChanged(ItemEvent ev) {
		if (ev.getSource() == bOn && !(bOff.isSelected())) {
			bOn.setEnabled(false);
			enable();
		 
		}
		
	}
	
	
	public static void main(String[] args) {
		Ma_Calcu_Projet Calculatrice = new Ma_Calcu_Projet() ;
		Calculatrice.setTitle("CALCULATRCE");
		Calculatrice.setSize(250,320);
		Calculatrice.setResizable(false);
		Calculatrice.setLocationRelativeTo(null);
		Calculatrice.setVisible(true);
	}


	

}
