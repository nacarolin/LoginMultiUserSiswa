/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author RPL-40
 */
public class koneksi {
    Connection koneksi;
    public static Connection koneksi(){
        try{
          Class.forName("com.mysql.jdbc.Driver");
          Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/crudjava","root","");
          
          return koneksi;
      } catch (Exception e){
          JOptionPane.showMessageDialog(null, e);
          
          return null;
      }
    }
}
