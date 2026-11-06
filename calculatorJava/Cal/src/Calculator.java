import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;



public class Calculator implements ActionListener {

    String oldValue;
    boolean isOperatorClicked=false;
    JFrame jf;
    JLabel dispalyLabel;
    JButton sevenButton;
    JButton eightButton;
    JButton nineButton;
    JButton fourButton;
    JButton fiveButton;
    JButton sixButton;
    JButton oneButton;
    JButton twoButton;
    JButton threeButton;
    JButton dotButton;
    JButton zeroButton;
    JButton equalButton;
    JButton divButton;
    JButton mulButton;
    JButton addButton;
    JButton subButton;
    JButton clearButton;
    public Calculator()
    {
        jf=new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(600,600);
        jf.setLocation(300,130);

        dispalyLabel = new JLabel("");
        dispalyLabel.setBounds(30,50,540,40);
        dispalyLabel.setBackground(Color.gray);
        dispalyLabel.setOpaque(true);
        dispalyLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        dispalyLabel.setForeground(Color.white);
        jf.add(dispalyLabel);


        sevenButton=new JButton("7");
        sevenButton.setBounds(30,130,80,80);
        sevenButton.addActionListener(this);
        jf.add(sevenButton);
        
        eightButton=new JButton("8");
        eightButton.setBounds(130,130,80,80);
        eightButton.addActionListener(this);
        jf.add(eightButton);

        nineButton=new JButton("9");
        nineButton.setBounds(220,130,80,80);
        nineButton.addActionListener(this);
        jf.add(nineButton);

        fourButton=new JButton("4");
        fourButton.setBounds(30,230,80,80);
        fourButton.addActionListener(this);
        jf.add(fourButton);
        
        fiveButton=new JButton("5");
        fiveButton.setBounds(130,230,80,80);
        fiveButton.addActionListener(this);
        jf.add(fiveButton);

        sixButton=new JButton("6");
        sixButton.setBounds(220,230,80,80);
        sixButton.addActionListener(this);
        jf.add(sixButton);

        
        oneButton=new JButton("1");
        oneButton.setBounds(30,330,80,80);
        oneButton.addActionListener(this);
        jf.add(oneButton);
        
        twoButton=new JButton("2");
        twoButton.setBounds(130,330,80,80);
        twoButton.addActionListener(this);
        jf.add(twoButton);

        threeButton=new JButton("3");
        threeButton.setBounds(220,330,80,80);
        threeButton.addActionListener(this);
        jf.add(threeButton);

        dotButton=new JButton(".");
        dotButton.setBounds(30,430,80,80);
        dotButton.addActionListener(this);
        jf.add(dotButton);
        
        zeroButton=new JButton("0");
        zeroButton.setBounds(130,430,80,80);
        zeroButton.addActionListener(this);
        jf.add(zeroButton);

        equalButton=new JButton("=");
        equalButton.setBounds(220,430,80,80);
        equalButton.addActionListener(this);
        jf.add(equalButton);

        divButton=new JButton("/");
        divButton.setBounds(320,130,80,80);
        divButton.addActionListener(this);
        jf.add(divButton);
        
        mulButton=new JButton("*");
        mulButton.setBounds(320,230,80,80);
        mulButton.addActionListener(this);
        jf.add(mulButton);

        addButton=new JButton("+");
        addButton.setBounds(320,330,80,80);
        addButton.addActionListener(this);
        jf.add(addButton);

        subButton=new JButton("-");
        subButton.setBounds(320,430,80,80);
        subButton.addActionListener(this);
        jf.add(subButton);

        clearButton=new JButton("Clear");
        clearButton.setBounds(430,430,80,80);
        clearButton.addActionListener(this);
        jf.add(clearButton);

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource()==sevenButton)
      {
        if(isOperatorClicked)
        {
             dispalyLabel.setText("7");
             isOperatorClicked=false;
        }else{
 dispalyLabel.setText(dispalyLabel.getText()+"7");
        }
       
      }else if(e.getSource()==eightButton){
         if(isOperatorClicked)
        {
             dispalyLabel.setText("8");
             isOperatorClicked=false;
        }else{
 dispalyLabel.setText(dispalyLabel.getText()+"8");
        }
      }else if(e.getSource()==nineButton){
         if(isOperatorClicked)
        {
             dispalyLabel.setText("9");
             isOperatorClicked=false;
        }else{
 dispalyLabel.setText(dispalyLabel.getText()+"9");
        }
      }
      else if(e.getSource()==fourButton){
         if(isOperatorClicked)
        {
             dispalyLabel.setText("4");
             isOperatorClicked=false;
        }else{
 dispalyLabel.setText(dispalyLabel.getText()+"4");
        }
      }else if(e.getSource()==fiveButton){
          if(isOperatorClicked)
        {
             dispalyLabel.setText("5");
             isOperatorClicked=false;
        }else{
 dispalyLabel.setText(dispalyLabel.getText()+"5");
        }
      }
      else if(e.getSource()==sixButton){
        
          if(isOperatorClicked)
        {
             dispalyLabel.setText("6");
             isOperatorClicked=false;
        }else{
 dispalyLabel.setText(dispalyLabel.getText()+"6");
        }
      }else if(e.getSource()==oneButton){
         
          if(isOperatorClicked)
        {
             dispalyLabel.setText("1");
             isOperatorClicked=false;
        }else{
 dispalyLabel.setText(dispalyLabel.getText()+"1");
        }
      }
      else if(e.getSource()==twoButton){
          if(isOperatorClicked)
        {
             dispalyLabel.setText("2");
             isOperatorClicked=false;
        }else{
 dispalyLabel.setText(dispalyLabel.getText()+"2");
        }
      }else if(e.getSource()==threeButton){
           if(isOperatorClicked)
        {
             dispalyLabel.setText("3");
             isOperatorClicked=false;
        }else{
 dispalyLabel.setText(dispalyLabel.getText()+"3");
        }
      }
      else if(e.getSource()==dotButton){
        dispalyLabel.setText(dispalyLabel.getText()+".");
      }
      else if(e.getSource()==zeroButton){
        dispalyLabel.setText(dispalyLabel.getText()+"0");
      }
      else if(e.getSource()==equalButton){
        String newValue=dispalyLabel.getText();
        float oldValueF=Float.parseFloat(oldValue);
        float newValueF=Float.parseFloat(newValue);
        float result = oldValueF+newValueF;
        dispalyLabel.setText(result+"");
      }
       else if(e.getSource()==equalButton){
        String newValue=dispalyLabel.getText();
        float oldValueF=Float.parseFloat(oldValue);
        float newValueF=Float.parseFloat(newValue);
        float result = oldValueF-newValueF;
        dispalyLabel.setText(result+"");
      }
      else if(e.getSource()==divButton){
        dispalyLabel.setText(dispalyLabel.getText()+"/");
      }
      else if(e.getSource()==mulButton){
        dispalyLabel.setText(dispalyLabel.getText()+"*");
      }
      else if(e.getSource()==addButton){
        isOperatorClicked=true;
        oldValue=dispalyLabel.getText();
      }else if(e.getSource()==subButton){
        isOperatorClicked=true;
        oldValue=dispalyLabel.getText();
      }
      else if(e.getSource()==clearButton){
        dispalyLabel.setText(" ");
      }
    }
}
