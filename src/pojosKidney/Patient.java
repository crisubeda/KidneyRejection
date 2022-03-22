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
    
    public String name;
    
    public String email;
    public int edad;
    public Sex sex;
    public byte[] pas;
    private Donor donor; 
    private TimeOutOrganism timeOutOrganism;
    private TimeFromTransplant timeFromTransplant;
    private DonorsCreatinine donorsCreatinine;
    private HLAIncompatibility hlaIncompatibility;
    private FibrinoidNecrosis fibrinoidNecrosis;
    private IL10andTNF il10andTNF;
    public double prob;

    public Patient(String name, String email, int edad, Sex sex, Donor donor, TimeOutOrganism timeOutOrganism, TimeFromTransplant timeFromTransplant, DonorsCreatinine donorsCreatinine, HLAIncompatibility hlaIncompatibility, FibrinoidNecrosis fibrinoidNecrosis, IL10andTNF il10andTNF, double prob) {
        this.name = name;
        this.email = email;
        this.edad = edad;
        this.sex = sex;
        this.donor = donor;
        this.timeOutOrganism = timeOutOrganism;
        this.timeFromTransplant = timeFromTransplant;
        this.donorsCreatinine = donorsCreatinine;
        this.hlaIncompatibility = hlaIncompatibility;
        this.fibrinoidNecrosis = fibrinoidNecrosis;
        this.il10andTNF = il10andTNF;
        this.prob = prob;
    }

    public Patient(String name, byte[] pas, String email, int edad, Sex sex) {
        this.name = name;
        this.email = email;
        this.edad = edad;
        this.sex = sex;
    }


    public Patient() {
        this.name="";
        this.email="";
        this.edad=10;
        this.sex= Sex.MAN;
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
    
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getEdad() {
        return edad;
    }


    public Sex getSex() {
        return sex;
    }

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

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
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

    public byte[] getPas() {
        return pas;
    }

    public void setPas(byte[] pas) {
        this.pas = pas;
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
        return "Patient{" + "name=" + name + ", email=" + email + ", edad=" + edad + ", sex=" + sex + ", pas=" + pas + ", donor=" + donor + ", timeOutOrganism=" + timeOutOrganism + ", timeFromTransplant=" + timeFromTransplant + ", donorsCreatinine=" + donorsCreatinine + ", hlaIncompatibility=" + hlaIncompatibility + ", fibrinoidNecrosis=" + fibrinoidNecrosis + ", il10andTNF=" + il10andTNF + ", prob=" + prob + '}';
    }

    

    
}