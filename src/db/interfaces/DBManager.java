/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db.interfaces;

/**
 *
 * @author Cristina
 */
public interface DBManager {
    public void connect();
    public void disconnect();
    public PatientManager getPatientManager(); 
}
