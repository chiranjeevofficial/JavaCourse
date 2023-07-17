import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Frame extends JFrame implements ActionListener{
    JLabel fnum,snum;
    JTextField fnamefield,snumfield;
    JButton addbtn;

    frame(){
        super("Addition application");

        Font font=new Font("verdana",Font.ITALIC,12);
        Cursor cursor=new Cursor(Cursor.HAND_CURSOR);

        fnum=new JLabel("Number 1");
        fnum.setFont(font);
        fnum.setBounds(200,105,120,20);
        fnamefield=new JTextField();
        fnamefield.setBounds(300,100,160,30);
        
        snum=new JLabel("Number 2");
        snum.setFont(font);
        snum.setBounds(200,155,120,20);
        snumfield=new JTextField();
        snumfield.setBounds(300,150,160,30);

      
        addbtn=new JButton("Add");
        addbtn.setFont(font);
        addbtn.setCursor(cursor);
        addbtn.setBounds(300,200,150,30);
        addbtn.addActionListener(this);
       
        
        add(fnum);
        add(fnamefield);
        add(snum);
        add(snumfield);
        add(addbtn);
    }

    public void actionPerformed(ActionEvent e){
        int a=Integer.parseInt(fnamefield.getText());
        int b=Integer.parseInt(snumfield.getText());
        int c=a+b;
        addbtn.setText("Answere = "+c);
    }
}

public class Main{
    public static void main(String[] args){
        frame mf=new frame();
        mf.setLayout(null);
        mf.setBounds(400,400,700,400);
        mf.setVisible(true);
        mf.setResizable(false);
        mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}