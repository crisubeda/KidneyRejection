/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.interfaces;

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
 //   public Patient getPatientById(int id);

  //  public Patient getPatientByUsername(String Username);

   // public void modifyDiagnosis(Patient pat);

}
