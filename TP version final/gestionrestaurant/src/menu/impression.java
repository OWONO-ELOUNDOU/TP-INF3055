/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package menu;

import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Koummand Justin
 */
public class impression {
    public static void imprimer(JTable table, String title){
        MessageFormat entete = new MessageFormat(title);
        MessageFormat pied = new MessageFormat("page{0, number, integer}");
        
        try{
            table.print(JTable.PrintMode.FIT_WIDTH,entete,pied);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"erreur :\n"+e,"i,pression",JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
