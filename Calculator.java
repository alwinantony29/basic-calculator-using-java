package calc;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {
	
	JFrame jf;
	JLabel displayLabel;
	JButton sevenButton,signButton, eightButton, nineButton, fourButton,
	fiveButton, sixButton, oneButton,twoButton,
	threeButton, dotButton, equalButton, zeroButton, divButton,
	 mulButton,minusButton,clearButton,plusButton;
	
	float num,ans;
	int calculation;
	public Calculator() {
	    jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(510, 540);
		jf.setLocation(300, 150);
		
		displayLabel=new JLabel();
		displayLabel.setBounds(30, 50, 440, 40);
		displayLabel.setBackground(Color.gray);
		displayLabel.setOpaque(true);
		displayLabel.setBorder(new RoundedBorder(10));
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.white);
		displayLabel.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(displayLabel);
	
	    sevenButton=new JButton("7");
		sevenButton.setBounds(30, 120, 80, 80);
		sevenButton.setBorder(new RoundedBorder(10));
		sevenButton.setForeground(Color.BLACK);
		sevenButton.setBackground(Color.white);
		sevenButton.addActionListener(this);
		sevenButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(sevenButton);
		
		eightButton=new JButton("8");
		eightButton.setBounds(120, 120, 80, 80);
		eightButton.addActionListener(this);
		eightButton.setBorder(new RoundedBorder(10));
		eightButton.setForeground(Color.BLACK);
		eightButton.setBackground(Color.white);
		eightButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(eightButton);
		
		nineButton=new JButton("9");
		nineButton.setBounds(210, 120, 80, 80);
		nineButton.addActionListener(this);
		nineButton.setBorder(new RoundedBorder(10));
		nineButton.setForeground(Color.BLACK);
		nineButton.setBackground(Color.white);
		nineButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(nineButton);
		
		fourButton=new JButton("4");
		fourButton.setBorder(new RoundedBorder(10));
		fourButton.setForeground(Color.BLACK);
		fourButton.setBackground(Color.white);
		fourButton.setBounds(30, 210, 80, 80);
		fourButton.addActionListener(this);
		fourButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(fourButton);
		
		fiveButton=new JButton("5");
		fiveButton.setBounds(120, 210, 80, 80);
		fiveButton.setBorder(new RoundedBorder(10));
		fiveButton.setForeground(Color.BLACK);
		fiveButton.setBackground(Color.white);
		fiveButton.addActionListener(this);
		fiveButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(fiveButton);
		
		sixButton=new JButton("6");
		sixButton.setBounds(210, 210, 80, 80);
		sixButton.setBorder(new RoundedBorder(10));
		sixButton.setForeground(Color.BLACK);
		sixButton.setBackground(Color.white);
		sixButton.addActionListener(this);
		sixButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(sixButton);
		
		 oneButton=new JButton("1");
		oneButton.setBounds(30, 300, 80, 80);
		oneButton.addActionListener(this);
		oneButton.setBorder(new RoundedBorder(10));
		oneButton.setForeground(Color.BLACK);
		oneButton.setBackground(Color.white);
		oneButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(oneButton);
		
		 twoButton=new JButton("2");
		twoButton.setBounds(120, 300, 80, 80);
		twoButton.setBorder(new RoundedBorder(10));
		twoButton.setForeground(Color.BLACK);
		twoButton.setBackground(Color.white);
		twoButton.addActionListener(this);
		twoButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(twoButton);
		
		 threeButton=new JButton("3");
		threeButton.setBounds(210, 300, 80, 80);
		threeButton.setBorder(new RoundedBorder(10));
		threeButton.setForeground(Color.BLACK);
		threeButton.setBackground(Color.white);
		threeButton.addActionListener(this);
		threeButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(threeButton);
		
		 dotButton=new JButton(".");
		dotButton.setBounds(30, 390, 80, 80);
		dotButton.setBackground(Color.gray);
		dotButton.addActionListener(this);
		dotButton.setBorder(new RoundedBorder(10));
		dotButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(dotButton);
		
		zeroButton=new JButton("0");
		zeroButton.setBounds(120, 390, 80, 80);
		zeroButton.addActionListener(this);
		zeroButton.setBorder(new RoundedBorder(10));
		zeroButton.setForeground(Color.BLACK);
		zeroButton.setBackground(Color.white);
		zeroButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(zeroButton);
		
		 equalButton=new JButton("=");
		equalButton.setBounds(390, 300, 80, 170);
		equalButton.addActionListener(this);
		equalButton.setBackground(Color.white);
		equalButton.setBorder(new RoundedBorder(10));
		equalButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(equalButton);
	
		
		divButton=new JButton("/");
		divButton.setBackground(Color.gray);
		divButton.setBounds(300, 120, 80, 80);
		divButton.setBorder(new RoundedBorder(10));
		divButton.addActionListener(this);
		divButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(divButton);
		
		
		 mulButton=new JButton("*");
		mulButton.setBounds(300, 210, 80, 80);
		mulButton.setBackground(Color.gray);
		mulButton.addActionListener(this);
		mulButton.setBorder(new RoundedBorder(10));
		mulButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(mulButton);
		
		
		minusButton=new JButton("-");
		minusButton.setBounds(300, 300, 80, 170);
		minusButton.setBackground(Color.gray);
		minusButton.addActionListener(this);
		minusButton.setBorder(new RoundedBorder(10));
		minusButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(minusButton);
		
		 plusButton=new JButton("+");
		plusButton.setBounds(390, 120, 80, 170);
		plusButton.addActionListener(this);
		plusButton.setBackground(Color.gray);
		plusButton.setBorder(new RoundedBorder(10));
		plusButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(plusButton);
		
		 clearButton=new JButton("C");
			clearButton.setBounds(210, 390, 80, 80);
			clearButton.addActionListener(this);
			clearButton.setBackground(Color.gray);
			clearButton.setBorder(new RoundedBorder(10));
			clearButton.setFont(new Font("Arial",Font.PLAIN,40));
			jf.add(clearButton);

		
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}
	
    void ao() {
    	switch(calculation) {
    	case 1:ans=num + Float.parseFloat(displayLabel.getText());
    	break;
    	case 2:ans=num-Float.parseFloat(displayLabel.getText());
    	break;
    	case 3:ans=num*Float.parseFloat(displayLabel.getText());
    	break;
    	case 4:ans=num/Float.parseFloat(displayLabel.getText());
    	break;
    	}
    }
	public static void main(String[] args) {
		new Calculator();
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	if(e.getSource()==sevenButton) {
		displayLabel.setText(displayLabel.getText()+"7");
	
	}else if(e.getSource()==eightButton) {
		displayLabel.setText(displayLabel.getText()+"8");
		
	}else if(e.getSource()==nineButton) {
		displayLabel.setText(displayLabel.getText()+"9");
	}else if(e.getSource()==fourButton) {
		displayLabel.setText(displayLabel.getText()+"4");
	}else if(e.getSource()==fiveButton) {
		displayLabel.setText(displayLabel.getText()+"5");
	}else if(e.getSource()==sixButton) {
		displayLabel.setText(displayLabel.getText()+"6");
	}else if(e.getSource()==oneButton) {
		displayLabel.setText(displayLabel.getText()+"1");
	}else if(e.getSource()==twoButton) {
		displayLabel.setText(displayLabel.getText()+"2");
	}else if(e.getSource()==threeButton) {
		displayLabel.setText(displayLabel.getText()+"3");
	}else if(e.getSource()==dotButton) {
		displayLabel.setText(displayLabel.getText()+".");
	}else if(e.getSource()==zeroButton) {
		displayLabel.setText(displayLabel.getText()+"0");
	}else if(e.getSource()==equalButton) {
		ao();
		displayLabel.setText(String.valueOf(ans));
	
		
		
	}else if(e.getSource()==divButton) {
		num=Float.parseFloat(displayLabel.getText());
		calculation=4;
		displayLabel.setText("");
		
		
	}else if(e.getSource()==mulButton) {
		num=Float.parseFloat(displayLabel.getText());
		calculation=3;
		displayLabel.setText("");
		
		
	}else if(e.getSource()==minusButton) {
		num=Float.parseFloat(displayLabel.getText());
		calculation=2;
		displayLabel.setText("");
		
	}else if(e.getSource()==plusButton) {
		num=Float.parseFloat(displayLabel.getText());
		calculation=1;
		displayLabel.setText("");
			
		
	}else if(e.getSource()==clearButton) {
		displayLabel.setText("");
	}
	
	

	}
}







