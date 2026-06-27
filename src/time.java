import java.lang.*;
import java.text.DateFormat;
import java.util.logging.*;
import java.util.*;
import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Prince Giri
 */
public class time extends Thread {

    String time;
    public void run()
    {
        for(;;)
        {
            Thread t=new Thread();
            try 
            {
                t.sleep(1000);
            } 
            catch (InterruptedException ex) 
            {
                Logger.getLogger(time.class.getName()).log(Level.SEVERE, null, ex);
            }
            DateFormat d=DateFormat.getTimeInstance(DateFormat.LONG, new Locale("de","DE"));
            String time=d.format(new Date());
            System.out.println(time);
        }
    }
}

class b extends JFrame{
    public void b()
    {
        JFrame j= new JFrame();
        JButton b=new JButton("click");
        j.add(b);
    }
}

class a
{
    public static void main(String[] args)
    {
        b c=new b();
        time t=new time();
        t.start();
        

    }
}
