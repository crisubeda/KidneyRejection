/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.sql;

import static Interface.Doctor_FirstWindow.patient;
import static Interface.Patient_FirstWindow.patientManager;
import Utilities.ConnectionDatabase;
import db.interfaces.*;
import java.io.IOException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cristina
 */
public class SQLManager implements DBManager {

    private Connection c;

    public SQLManager() {
        super();
    }

    public Connection getConnection() {
        return c;
    }
   @Override
    public PatientManager getPatientManager() {
        return patientManager;
    }


    @Override
    public void connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //String ipFromConfigFile = "";
            try {
                String datos=ConnectionDatabase.getDataFromFile();
                System.out.println("password: " + datos);
                this.c = DriverManager.getConnection("jdbc:mysql://localhost:3306/kidneyrejection?user=root&password="+ datos);
            } catch (IOException ex) { 
                Logger.getLogger(SQLManager.class.getName()).log(Level.SEVERE, null, ex);
            }
            patientManager = new SQLPatientManager(c);
            //file = new SQLFilesManager(c);
        } catch (ClassNotFoundException exc) {
            exc.printStackTrace();

        } catch (SQLException ex) {
            Logger.getLogger(SQLManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void disconnect() {
        try {
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
