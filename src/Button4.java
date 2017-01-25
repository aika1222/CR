import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Button4 extends JFrame implements ActionListener{

JLabel label;

JTextField text1;
JButton btnRed;
public Button4(){
Container ctnFoundation=getContentPane();
ctnFoundation.setLayout(new FlowLayout());
btnRed=new JButton("押す");
JPanel p=new JPanel();
ctnFoundation.add(btnRed);
btnRed.addActionListener(this);
label=new JLabel();


ctnFoundation.add(p, BorderLayout.CENTER);
ctnFoundation.add(label,BorderLayout.SOUTH);
text1 = new JTextField("moji", 20);

ctnFoundation.add(text1);

}
public void actionPerformed(ActionEvent e){

//String hikaku="おはよう";
String str=text1.getText();
if(str.equals("おはよう")){
label.setText("意外");
}else if(str.equals("こんばんは")){
label.setText("こんばんは");
}
else if(str.equals("こんにちは")){
label.setText("ちわー");
}

else if(str.equals("暑いですね")){
label.setText("夏ですね");
}

else if(str.equals("きれいですね")){
label.setText("そうですね");
}

else if(str.equals("悲しい")){
label.setText("テンション上げていこう");
}

else if(str.equals("あなたは教師ですか")){
label.setText("そうともいえる");
}

else if(str.equals("めんどくさいです")){
label.setText("わたしもです");
}

else if(str.equals("猫が平たい")){
label.setText("かわいいですね");
}

else if(str.equals("きびしいです")){
label.setText("がんばって");
}

else if(str.equals("ゲーム")){
label.setText("ジャスティス");
}

else{
label.setText("ジャスティス");
}



}
public static void main(String[] args){
Button4 button=new Button4();
button.setSize(300,300);
button.setTitle("Button");
button.setVisible(true);
button.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}