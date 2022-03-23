/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.sql;

import pojosKidney.Patient;
import db.interfaces.PatientManager;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import pojosKidney.PatientSimple;

/**
 *
 * @author Cristina
 */
public class SQLPatientManager implements PatientManager {

    private Connection c;

    public SQLPatientManager(Connection c) {
        this.c = c;
    }

    @Override
    public void createPatientSimple(PatientSimple pat) {
        String sqlpatient = "INSERT INTO Patients (namePatient, age, gender, mail, pas, Ntest)"
                + "VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement stm = c.prepareStatement(sqlpatient);
            stm.setString(1, pat.getName());
            stm.setInt(2, pat.getAge());
            stm.setString(3, pat.getSex().toString());
            stm.setString(4, pat.getEmail());
            stm.setBytes(5, pat.getPas());
            stm.setInt(6, pat.getNtest());
            stm.executeUpdate();
            stm.close();

        } catch (SQLException ex) {
            Logger.getLogger(SQLPatientManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   
}
