import javax.swing.*;
import java.awt.event.*;
public class a8
{
JLabel l1,l2;
JFrame f;
JButton b;
JTextArea area;
a8()
{
f=new JFrame();
l1=new JLabel();
l1.setBounds(50,25,100,30);
l2=new JLabel();
l2.setBounds(160,25,100,30);
area=new JTextArea();
area.setBounds(20,75,250,200);
b=new JButton("count words");
b.setBounds(100,300,120,30);
f.add(l1);
f.add(l2);
f.add(area);
f.add(b);
f.setSize(450,450);
f.setLayout(null);
f.setVisible(true);
b.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
String text=area.getText();
String words[]=text.split("\\s");
l1.setText("words:"+words.length);
l2.setText("Characters:"+text.length());
}
});
}
public static void main(String[] args)
{
new a8();
}
}