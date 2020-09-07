package lab6;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Main extends JFrame {
    JButton button = new JButton("Проверить");
    JTextArea textArea = new JTextArea();
    int counter=0;
    public int val;
    public Main(){
        setLayout(null);
        button.setBounds(50,80,100,20);
        textArea.setBounds(50,30,100,20);
        add(button);
        add(textArea);
        Random random =new Random();
        val=random.nextInt(21);
        System.out.println(val);
        setSize(200,200);
        button.addActionListener(new
            ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    char s[]=textArea.getText().toCharArray();
                    int getVal=0;
                    for(int i=0;i<s.length;++i) getVal = (getVal * 10) + s[i]-'0';
                    if(getVal==val) {
                        remove(button);
                        remove(textArea);
                        JOptionPane.showMessageDialog(null, "Правильно");
                    }
                    else if(getVal<val){
                        textArea.setText("");
                        JOptionPane.showMessageDialog(null,"Больше чем "+getVal);
                    }
                    else{
                        textArea.setText("");
                        JOptionPane.showMessageDialog(null,"Меньше чем "+getVal);
                    }
                    ++counter;
                    if (counter==3){
                        remove(button);
                        remove(textArea);
                    }
                }
            });
    }

    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}
