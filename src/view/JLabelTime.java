/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Calendar;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author Dell
 */
public class JLabelTime  extends JLabel{
    
    int hh,mm,ss,pmAm;
    Calendar hora;  
    DecimalFormat formato;   
    public JLabelTime(){
        setSize (150,155);
        new JLabel("");
        Timer time = new Timer(1000,ativar);
        time.start();
    }
    private void Horas(){
        hora = Calendar.getInstance();
        hh = hora.get(Calendar.HOUR_OF_DAY);  
        mm = hora.get(Calendar.MINUTE);  
        ss = hora.get(Calendar.SECOND);  
        pmAm = hora.get(Calendar.AM_PM);
        
        setText(formatar(hh)+":"+formatar(mm)+":" + formatar(ss) );
    }
    private String formatar(int num){  
        formato = new DecimalFormat("00");  
        return formato.format(num);  
    }  
      
    ActionListener ativar = (  
        new ActionListener(){  
            public void actionPerformed(ActionEvent e){  
                Horas();  
            }  
        }
      );      
 }
