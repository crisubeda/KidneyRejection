/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.interfaces;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import pojosKidney.Patient;
import pojosKidney.PatientSimple;

/**
 *
 * @author Cristina
 */
public interface PatientManager {

    public void createPatientSimple(PatientSimple pat);
    public void initializeParameters(String p);
    public void sendParameters();
    public void initializeOptionsWeights(String option, float weight);
    public void sendOptions();
    public Integer checkPassword(String email, byte[] password)throws NoSuchAlgorithmException;
    public Integer ReturnIDoptions(String option);
    public Integer ReturnIDparameter(String parameter);
    public void createPatientParameters(int idPatient, int idOptions, int idParameters, int Ntest);
    public void modifyNtest(int id_patient);
    public int takeNtest(int id_patient);
    public ArrayList<PatientSimple> patientsList();
    public PatientSimple searchPatientSimpleByID(int idPatient);
    public String takeOptions(int id);
    public int[] takeSelectedTest(int idPatient, int Ntest);
    
 //   public Patient getPatientById(int id);

  //  public Patient getPatientByUsername(String Username);

   // public void modifyDiagnosis(Patient pat);

}
