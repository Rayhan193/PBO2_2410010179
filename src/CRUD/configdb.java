/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD;
    import java.sql.Connection;
    import java.sql.Driver;
    import java.sql.DriverManager;
    import java.sql.PrepareStatement;
    import java.sql.SQLException;
    import javax.swing.JOptionPane;
/**
 *
 * @author ACER
 */
public class configdb {
private String user="root";
    private String pass="";
    private String urldb="jdbc:mysql://localhost/db_diagnosa_penyakit";
    private Connection Koneksi;
    
    public configdb(){
        try {
            Driver dbDriver =new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(dbDriver);
            this.Koneksi = DriverManager.getConnection(urldb,user,pass);
            System.out.print("Database berhasil di koneksikan");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
     }
 }
