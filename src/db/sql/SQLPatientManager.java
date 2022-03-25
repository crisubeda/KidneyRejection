/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.sql;

import pojosKidney.Patient;
import db.interfaces.PatientManager;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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
    
    @Override
   public void initializeParameters(String parameter){
    String sqlpatient = "INSERT INTO Parameters (information)"
                + "VALUES (?)";
        try {
            PreparedStatement stm = c.prepareStatement(sqlpatient);
            stm.setString(1, parameter);
            stm.executeUpdate();
            stm.close();
        } catch (SQLException ex) {
            Logger.getLogger(SQLManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    @Override
    public void initializeOptionsWeights(String option, float weight){
     String sqlpatient = "INSERT INTO OptionsWeights (opt, weight)"
                + "VALUES (?,?)";
        try {
            PreparedStatement stm = c.prepareStatement(sqlpatient);
            stm.setString(1, option);
            stm.setFloat(2, weight);
            stm.executeUpdate();
            stm.close();
        } catch (SQLException ex) {
            Logger.getLogger(SQLManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public Integer checkPassword(String email, byte[] password) throws NoSuchAlgorithmException{
  
        Integer patID = 0;
        String sqlpatient = "SELECT id FROM patients WHERE mail LIKE ? AND pas LIKE ?";
        try {
            PreparedStatement stm = c.prepareStatement(sqlpatient);
            stm.setString(1, email);
            stm.setBytes(2, password);
            ResultSet rs = stm.executeQuery();
            rs.next();
            patID = rs.getInt("id");         
            stm.close();
        } catch (SQLException ex) {
            //Logger.getLogger(SQLManager.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
        
        return patID; 
    }
    
    @Override
    public Integer ReturnIDparameter(String parameter){
        int IDparameter = 0;
        String sqlpatient = "SELECT id FROM parameters WHERE information LIKE ?";
        try {
            PreparedStatement stm = c.prepareStatement(sqlpatient);
            stm.setString(1, parameter);
            ResultSet rs = stm.executeQuery();
            rs.next();
            IDparameter = rs.getInt("id");         
            stm.close();
        } catch (SQLException ex) {
            //Logger.getLogger(SQLManager.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
        return IDparameter;
    }
    
    @Override
    public Integer ReturnIDoptions(String option){
        System.out.println("SQL option " + option);
        int IDoption = 0;
        String sqlpatient = "SELECT id FROM optionsweights WHERE opt LIKE ?";
        try {
            PreparedStatement stm = c.prepareStatement(sqlpatient);
            stm.setString(1, option);
            ResultSet rs = stm.executeQuery();
            rs.next();
            IDoption = rs.getInt("id");         
            stm.close();
        } catch (SQLException ex) {
            //Logger.getLogger(SQLManager.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
        return IDoption;
    }
    
   
    public void createPatientParameters(int idPatient, int idOptions, int idParameters) {
       
        String sqlpatient = "INSERT INTO patientparameters (id_patient, id_parameter, id_optionsWeights)"
                + "VALUES (?,?,?)";
        try {
            PreparedStatement stm = c.prepareStatement(sqlpatient);
            stm.setInt(1, idPatient);
            stm.setInt(2, idParameters);
            stm.setInt(3, idOptions);
            stm.executeUpdate();
            stm.close();

        } catch (SQLException ex) {
            Logger.getLogger(SQLPatientManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
   public void sendParameters(){
        initializeParameters("Donor");
        initializeParameters("TimeOutOrganism");
        initializeParameters("TimeFromTransplant");
        initializeParameters("DonorsCreatinine");
        initializeParameters("HLAIncompatibility");
        initializeParameters("FibrinoidNecrosis");
        initializeParameters("IL10andTNF");
    }
   
   public void sendOptions(){
       initializeOptionsWeights("ALIVE",0);
       initializeOptionsWeights("DEAD", (float) 0.1);
       initializeOptionsWeights("LESS19",0);
       initializeOptionsWeights("MORE19", (float) 0.9);
       initializeOptionsWeights("LESS2WEEKS",(float) 0.75);
       initializeOptionsWeights("MORE2WEEKS",(float) 0.1);
       initializeOptionsWeights("LESS2_5",0);
       initializeOptionsWeights("MORE2_5",(float) 0.3);
       initializeOptionsWeights("YES",(float) 0.11);//HLAIncompatibility
       initializeOptionsWeights("NO",0);
       initializeOptionsWeights("YES",(float) 0.4);//FibrinoidNecrosis
       initializeOptionsWeights("NO",0);
       initializeOptionsWeights("YES",(float) 0.9);//IL10andTNF
       initializeOptionsWeights("NO",0);
   }
}
