package TP2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.math.BigInteger;
import java.awt.event.ActionEvent;

public class ExtEcluGUI {

	private JFrame frmTpcrypto;
	private static JTextField input1;
	private static JTextField input2;
	private JTextField input4;
	private JTextField input3;
	private static JTextArea textArea;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExtEcluGUI window = new ExtEcluGUI();
					window.frmTpcrypto.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public ExtEcluGUI() {
		initialize();
	}

	private void initialize() {
		
		
		
		frmTpcrypto = new JFrame();
		frmTpcrypto.setBackground(Color.DARK_GRAY);
		frmTpcrypto.getContentPane().setBackground(Color.GRAY);
		frmTpcrypto.getContentPane().setForeground(new Color(0, 0, 0));
		frmTpcrypto.setForeground(Color.CYAN);
		frmTpcrypto.setTitle("TP_02_CRYPTO");
		frmTpcrypto.setBounds(100, 100, 880, 489);
		frmTpcrypto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTpcrypto.getContentPane().setLayout(null);
		
		
		
		JLabel lblThisForSolving = new JLabel("1. This for solving the GCD of two numbers using the");
		lblThisForSolving.setForeground(Color.CYAN);
		lblThisForSolving.setBounds(30, 25, 390, 38);
		frmTpcrypto.getContentPane().add(lblThisForSolving);
		
		JLabel lblExtendedEcludianAlgorithm = new JLabel("Extended Ecludian Algorithm. GCD(a,n) = a*x+n*y=1");
		lblExtendedEcludianAlgorithm.setForeground(Color.CYAN);
		lblExtendedEcludianAlgorithm.setBounds(30, 48, 390, 38);
		frmTpcrypto.getContentPane().add(lblExtendedEcludianAlgorithm);
		
		JLabel lblValueOfA = new JLabel("Value of a =");
		lblValueOfA.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		lblValueOfA.setForeground(Color.CYAN);
		lblValueOfA.setBounds(65, 101, 113, 38);
		frmTpcrypto.getContentPane().add(lblValueOfA);
		
		input1 = new JTextField();
		input1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		input1.setHorizontalAlignment(SwingConstants.CENTER);
		input1.setBounds(178, 101, 78, 38);
		frmTpcrypto.getContentPane().add(input1);
		input1.setColumns(10);
		
		JLabel lblValueOfN = new JLabel("Value of b =");
		lblValueOfN.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		lblValueOfN.setForeground(Color.CYAN);
		lblValueOfN.setBounds(65, 156, 113, 38);
		frmTpcrypto.getContentPane().add(lblValueOfN);
		
		input2 = new JTextField();
		input2.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		input2.setHorizontalAlignment(SwingConstants.CENTER);
		input2.setColumns(10);
		input2.setBounds(178, 156, 78, 38);
		frmTpcrypto.getContentPane().add(input2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 225, 836, 201);
		frmTpcrypto.getContentPane().add(scrollPane);
		
		textArea = new JTextArea();
		textArea.setForeground(new Color(0, 204, 51));
		textArea.setBackground(SystemColor.windowText);
		scrollPane.setViewportView(textArea);
		
		JButton btnNewButton = new JButton(" Find r,u,v");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				EuclideEtendu(Integer. parseInt(input1.getText()),Integer. parseInt(input2.getText()));
				
				
			}
		});
		btnNewButton.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		btnNewButton.setBackground(SystemColor.info);
		btnNewButton.setBounds(280, 156, 140, 38);
		frmTpcrypto.getContentPane().add(btnNewButton);
		
		JLabel lblValueOfA_1 = new JLabel("Value of a =");
		lblValueOfA_1.setForeground(Color.CYAN);
		lblValueOfA_1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		lblValueOfA_1.setBounds(486, 101, 113, 38);
		frmTpcrypto.getContentPane().add(lblValueOfA_1);
		
		JLabel lblValueOfN_1 = new JLabel("MOD n =");
		lblValueOfN_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblValueOfN_1.setForeground(Color.CYAN);
		lblValueOfN_1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		lblValueOfN_1.setBounds(486, 156, 113, 38);
		frmTpcrypto.getContentPane().add(lblValueOfN_1);
		
		input4 = new JTextField();
		input4.setHorizontalAlignment(SwingConstants.CENTER);
		input4.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		input4.setColumns(10);
		input4.setBounds(599, 156, 78, 38);
		frmTpcrypto.getContentPane().add(input4);
		
		input3 = new JTextField();
		input3.setHorizontalAlignment(SwingConstants.CENTER);
		input3.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		input3.setColumns(10);
		input3.setBounds(599, 101, 78, 38);
		frmTpcrypto.getContentPane().add(input3);
		
		JButton btnNewButton_1 = new JButton(" Find invesre");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int comparevalue =	InverseMod( Integer. parseInt(input3.getText()), Integer. parseInt(input4.getText()));
				textArea.append("The GCD is = to 1.\nAn inverse exists and its value is = " + comparevalue);
				
			}
		});
		btnNewButton_1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		btnNewButton_1.setBackground(SystemColor.info);
		btnNewButton_1.setBounds(701, 156, 140, 38);
		frmTpcrypto.getContentPane().add(btnNewButton_1);
		
		JLabel lblExtendedEcludianAlgorithm_1 = new JLabel("from GCD(a,n) = a*x+n*y=1, value of x is the inverse");
		lblExtendedEcludianAlgorithm_1.setForeground(Color.CYAN);
		lblExtendedEcludianAlgorithm_1.setBounds(451, 48, 390, 38);
		frmTpcrypto.getContentPane().add(lblExtendedEcludianAlgorithm_1);
		
		JLabel lblThisForSolving_1 = new JLabel("find modular inverse of a under modulo n");
		lblThisForSolving_1.setForeground(Color.CYAN);
		lblThisForSolving_1.setBounds(451, 25, 390, 38);
		frmTpcrypto.getContentPane().add(lblThisForSolving_1);
	}
	
	
	
	
	
	
	
	
	
	static void EuclideEtendu(int a, int b){

		BigInteger R = BigInteger.valueOf(a),Rr = BigInteger.valueOf(b), U = BigInteger.ONE, V = BigInteger.ZERO, Vv = BigInteger.ONE, Uu = BigInteger.ZERO;
    	
        while (Rr != BigInteger.ZERO)

        {
        		        	
        	
        	BigInteger q = R.divide(Rr);

        	BigInteger rs = R;

        	BigInteger us = U;
        	
        	BigInteger vs = V;

            R = Rr;

            U = Uu;
            
            V = Vv;
           
            Rr = rs.subtract(q.multiply(Rr));;

            Uu = us.subtract(q.multiply(Uu));
            
            Vv = vs.subtract(q.multiply(Vv));
                      

        }

        //System.out.println("Rest  r : "+ R +"\nRoot1 u = " + U + "\nRoot2 v = " + V);
        textArea.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
        textArea.append("The gcd of " + input1.getText() + " and " + input2.getText() + " is = " + R + "\nRest  r : "+ R +"\nRoot1 u = "+ U + "\nRoot2 v = " + V + "\n\n");
						
		
		
	}
	
	

    public static int[] egcd(int a, int b) {
        if (b == 0)
            return new int[] { a, 1, 0 };
        else {
            int[] arr = egcd(b, a % b);

            int gcd = arr[0];
            int X = arr[2];
            int Y = arr[1] - (a / b) * arr[2];

            return new int[] { gcd, X, Y };
        }
    }
	
	
	
	
	static int InverseMod(int a, int modulo) {
		
		int[] egcdValues = egcd(a, modulo);

        if (egcdValues[0] != 1)
            return 0;
        if (egcdValues[1] > 0)
            return egcdValues[1];
        else
            return egcdValues[1] + modulo;
    }
	
		
	}
	
	
	

