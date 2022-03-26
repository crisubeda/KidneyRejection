/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojosKidney;

/**
 *
 * @author Cristina
 */
public class PatientSimple {
    private int ID;
    public String name;
    public String email;
    public int age;
    public Sex sex;
    public byte[] pas;
    public int Ntest;

    public PatientSimple(int ID, String name, String email, int age, Sex sex, int Ntest) {
        this.ID = ID;
        this.name = name;
        this.email = email;
        this.age = age;
        this.sex = sex;
        this.Ntest = Ntest;
    }
    
 public PatientSimple(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }
    public PatientSimple(int ID, String name, String email, int age, Sex sex, byte[] pas, int Ntest) {
        this.ID = ID;
        this.name = name;
        this.email = email;
        this.age = age;
        this.sex = sex;
        this.pas = pas;
        this.Ntest = Ntest;
    }

  public PatientSimple() {
        this.ID = 0;
        this.name = "";
        this.email = "";
        this.age = 10;
        this.sex = Sex.MAN;
        this.pas = null;
        this.Ntest = 0; 
  }

    public int getNtest() {
        return Ntest;
    }

    public void setNtest(int Ntest) {
        this.Ntest = Ntest;
    }
  
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public byte[] getPas() {
        return pas;
    }

    public void setPas(byte[] pas) {
        this.pas = pas;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "PatientSimple{" + "name=" + name + ", email=" + email + ", age=" + age + ", sex=" + sex + ", pas=" + pas + ", Ntest=" + Ntest + '}';
    }

   
    
}
