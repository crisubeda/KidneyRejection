/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojosKidney;

import java.util.Objects;

/**
 *
 * @author alberto.gildelafuent
 */


public class Patient {
    
    private Donor donor; 
    private TimeOutOrganism timeOutOrganism;
    private TimeFromTransplant timeFromTransplant;
    private DonorsCreatinine donorsCreatinine;
    private HLAIncompatibility hlaIncompatibility;
    private FibrinoidNecrosis fibrinoidNecrosis;
    private IL10andTNF il10andTNF;
    public double prob;

    public Patient(Donor donor, TimeOutOrganism timeOutOrganism, TimeFromTransplant timeFromTransplant, DonorsCreatinine donorsCreatinine, HLAIncompatibility hlaIncompatibility, FibrinoidNecrosis fibrinoidNecrosis, IL10andTNF il10andTNF, double prob) {
        this.donor = donor;
        this.timeOutOrganism = timeOutOrganism;
        this.timeFromTransplant = timeFromTransplant;
        this.donorsCreatinine = donorsCreatinine;
        this.hlaIncompatibility = hlaIncompatibility;
        this.fibrinoidNecrosis = fibrinoidNecrosis;
        this.il10andTNF = il10andTNF;
        this.prob = prob;
    }

    public Patient() {
        this.donor = Donor.DEAD;
        this.timeOutOrganism = TimeOutOrganism.LESS19;
        this.timeFromTransplant = TimeFromTransplant.LESS2WEEKS;
        this.donorsCreatinine = DonorsCreatinine.LESS2_5;
        this.hlaIncompatibility = HLAIncompatibility.NO;
        this.fibrinoidNecrosis = FibrinoidNecrosis.NO;
        this.il10andTNF = IL10andTNF.NO;
        this.prob=0.25F;
    }

   
        /**
     *
     * @param id_operation
     * @param verified
     * @param date_expired
     * @param pin
     * @param tries
     * @param balance
     * @param price
     * @param limit
     */

    public Donor getDonor() {
        return donor;
    }

    public TimeOutOrganism getTimeOutOrganism() {
        return timeOutOrganism;
    }

    public TimeFromTransplant getTimeFromTransplant() {
        return timeFromTransplant;
    }

    public DonorsCreatinine getDonorsCreatinine() {
        return donorsCreatinine;
    }

    public HLAIncompatibility getHlaIncompatibility() {
        return hlaIncompatibility;
    }

    public FibrinoidNecrosis getFibrinoidNecrosis() {
        return fibrinoidNecrosis;
    }

    public IL10andTNF getIl10andTNF() {
        return il10andTNF;
    }

     public double getProb() {
        return prob;
    }
     
    public void setProb(double prob) {
        this.prob = prob;
    }
     
    public void setDonor(Donor donor) {
        this.donor = donor;
    }

    public void setTimeOutOrganism(TimeOutOrganism timeOutOrganism) {
        this.timeOutOrganism = timeOutOrganism;
    }

    public void setTimeFromTransplant(TimeFromTransplant timeFromTransplant) {
        this.timeFromTransplant = timeFromTransplant;
    }

    public void setDonorsCreatinine(DonorsCreatinine donorsCreatinine) {
        this.donorsCreatinine = donorsCreatinine;
    }

    public void setHlaIncompatibility(HLAIncompatibility hlaIncompatibility) {
        this.hlaIncompatibility = hlaIncompatibility;
    }

    public void setFibrinoidNecrosis(FibrinoidNecrosis fibrinoidNecrosis) {
        this.fibrinoidNecrosis = fibrinoidNecrosis;
    }

    public void setIl10andTNF(IL10andTNF il10andTNF) {
        this.il10andTNF = il10andTNF;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.donor);
        hash = 29 * hash + Objects.hashCode(this.timeOutOrganism);
        hash = 29 * hash + Objects.hashCode(this.timeFromTransplant);
        hash = 29 * hash + Objects.hashCode(this.donorsCreatinine);
        hash = 29 * hash + Objects.hashCode(this.hlaIncompatibility);
        hash = 29 * hash + Objects.hashCode(this.fibrinoidNecrosis);
        hash = 29 * hash + Objects.hashCode(this.il10andTNF);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Patient other = (Patient) obj;
        if (this.donor != other.donor) {
            return false;
        }
        if (this.timeOutOrganism != other.timeOutOrganism) {
            return false;
        }
        if (this.timeFromTransplant != other.timeFromTransplant) {
            return false;
        }
        if (this.donorsCreatinine != other.donorsCreatinine) {
            return false;
        }
        if (this.hlaIncompatibility != other.hlaIncompatibility) {
            return false;
        }
        if (this.fibrinoidNecrosis != other.fibrinoidNecrosis) {
            return false;
        }
        return this.il10andTNF == other.il10andTNF;
    }

    @Override
    public String toString() {
        return "Patient{" + "donor=" + donor + ", timeOutOrganism=" + timeOutOrganism + ", timeFromTransplant=" + timeFromTransplant + ", donorsCreatinine=" + donorsCreatinine + ", hlaIncompatibility=" + hlaIncompatibility + ", fibrinoidNecrosis=" + fibrinoidNecrosis + ", il10andTNF=" + il10andTNF + ", prob=" + prob + '}';
    }
    public String donorString(Donor donor){
        return "" + donor ;
    }
    public String timeOutOrganismString(TimeOutOrganism timeOutOrganism){
        return "" + timeOutOrganism ;
    }
    public String timeFromTransplantString(TimeFromTransplant timeFromTransplant){
        return "" + timeFromTransplant ;
    }
    public String donorsCreatinineString(DonorsCreatinine donorsCreatinine){
        return "" + donorsCreatinine;
    }
    public String hlaIncompatibilityString(HLAIncompatibility hlaIncompatibility){
        return "" + hlaIncompatibility ;
    }
    
    public String fibrinoidNecrosisString(FibrinoidNecrosis fibrinoidNecrosis){
        return "" + fibrinoidNecrosis ;
    }
    public String IL10andTNFString(IL10andTNF il10andTNF){
        return "" + il10andTNF ;
    }
    
    
    
}
