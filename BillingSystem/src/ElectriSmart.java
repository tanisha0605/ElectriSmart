package BillingSystem;

import javax.swing.*;
import java.awt.*;

public class ElectriSmart extends JFrame {

    ElectriSmart(){
        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("BillingSystem/icon/logo.jpg"));
        Image imageOne=imageIcon.getImage().getScaledInstance(500,500,Image.SCALE_DEFAULT);
        ImageIcon imageIcon2=new ImageIcon(imageOne);
        JLabel imageLabel=new JLabel(imageIcon2);
        add(imageLabel);
        setSize(500,500);
        setVisible(true);
        setLocation(500,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        try{
            Thread.sleep(2000);
            setVisible(false);

            new Login();
        }
        catch(Exception e){
            e.printStackTrace();

        }
    }
    public static void main(String[] args) {
        new ElectriSmart();
    }
}
