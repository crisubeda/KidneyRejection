/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;


import db.interfaces.DBManager;
import db.interfaces.PatientManager;
import db.sql.SQLPatientManager;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import pojosKidney.Donor;
import pojosKidney.DonorsCreatinine;
import pojosKidney.FibrinoidNecrosis;
import pojosKidney.HLAIncompatibility;
import pojosKidney.IL10andTNF;
import pojosKidney.Patient;
import pojosKidney.PatientSimple;
import pojosKidney.TimeFromTransplant;
import pojosKidney.TimeOutOrganism;


/**
 *
 * @author carmen
 */
public class Utilities {

    //public static PatientManager patientManager;
    //public static DBManager dbManager;
    //dbManager = new SQLManager();
    //dbManager.connect();

    //Patient p = new Patient();
    public static Patient introd(boolean[] ans) {

        KieServices ks = KieServices.Factory.get();
        KieContainer kc = ks.getKieClasspathContainer();

        Patient p = new Patient();
        boolean t = true;

        if (ans[0]) {
            p.setDonor(Donor.ALIVE);
        }
        if (ans[1]) {
            p.setTimeOutOrganism(TimeOutOrganism.MORE19);
        }
        if (ans[2]) {
            p.setTimeFromTransplant(TimeFromTransplant.MORE2WEEKS);
        }
        if (ans[3]) {
            p.setDonorsCreatinine(DonorsCreatinine.MORE2_5);
        }
        if (ans[4]) {
            p.setHlaIncompatibility(HLAIncompatibility.YES_HLA);
        }
        if (ans[5]) {
            p.setFibrinoidNecrosis(FibrinoidNecrosis.YES_FibrinoidNecrosis);
        }
        if (ans[6]) {
            p.setIl10andTNF(IL10andTNF.YES_IL10andTNF);
        }

        System.out.println("Patient:" + p);

        execute(ks, kc, p);
        return p;
    }

    public static void execute(KieServices ks, KieContainer kc, Patient p) {

        KieSession ksession = kc.newKieSession("KidneyKS");
        System.out.println("Patient with the following caracteristics: " + p + "\nHas probability of " + p.getProb() * 100 + "% to reject the kidney ");

        ksession.insert(p);

        ksession.fireAllRules();

        System.out.println("Patient with the following caracteristics: " + p + "\nHas probability of " + p.getProb() * 100 + "% to reject the kidney ");

        ksession.dispose();

    }

    public static boolean checkEmail(String email) {
        boolean isEmail = false;

        String regx = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regx);
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            isEmail = true;
        }
        return isEmail;
    }

    public static boolean checkInt(String integer) {
        boolean isInt = true;
        try {
            int a = Integer.parseInt(integer);
        } catch (NumberFormatException ex) {
            isInt = false;
        }
        return isInt;
    }

    public static int convertInt(String integer) {
        int isInt = 0;
        try {
            isInt = Integer.parseInt(integer);
        } catch (NumberFormatException ex) {
        }
        return isInt;
    }

    public static int getPatientSimpleID(PatientSimple p) {
        return p.getID();
    }

    public static String[] AssignementsOptions(Patient p) {
        String[] parameters = new String[7];
        parameters[0] = p.donorString(p.getDonor());
        parameters[1] = p.timeOutOrganismString(p.getTimeOutOrganism());
        parameters[2] = p.timeFromTransplantString(p.getTimeFromTransplant());
        parameters[3] = p.donorsCreatinineString(p.getDonorsCreatinine());
        parameters[4] = p.hlaIncompatibilityString(p.getHlaIncompatibility());
        parameters[5] = p.fibrinoidNecrosisString(p.getFibrinoidNecrosis());
        parameters[6] = p.IL10andTNFString(p.getIl10andTNF());
        return parameters;
    }

    public static int[] IDsOptionsCollection(String[] options, PatientManager patientManager) {
        System.out.println("Java opstions" + options[0]);
        int[] IDs = new int[7];
        int i;
        for (i = 0; i < 7; i++) {
            IDs[i] = patientManager.ReturnIDoptions(options[i]);
        }
        return IDs;
    }

    public static int[] IDsParametersCollection(PatientManager patientManager) {

        String[] parameterList = new String[]{"Donor", "TimeOutOrganism", "TimeFromTransplant", "DonorsCreatinine",
            "HLAIncompatibility", "FibrinoidNecrosis", "IL10andTNF"};
        int[] IDs = new int[7];
        int i;
        for (i = 0; i < 7; i++) {
            IDs[i] = patientManager.ReturnIDparameter(parameterList[i]);
        }
        return IDs;
    }

    public static void insertIDs(int idPatient, int[] idOptions, int[] idParameters, PatientManager patientManager) {
        for (int i = 0; i < idOptions.length; i++) {
            patientManager.createPatientParameters(idPatient, idOptions[i], idParameters[i]);
        }
    }
}
