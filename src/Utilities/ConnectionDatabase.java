/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilities;

import java.io.*;


public class ConnectionDatabase{

    public static String getDataFromFile() throws IOException {
        File file2 = new File(".");
        String path = file2.getAbsolutePath();
        String goodpath = file2.getAbsolutePath().substring(0, path.length() - 2).concat("/files/DataConnection.txt");
        BufferedReader br = null;
        String file_password = null;
        try {            
            br = new BufferedReader(new FileReader(goodpath));
            file_password = br.readLine();
           if(file_password != null)
           {
               System.out.println("Correct password");
           }else{
               System.out.println("Look if the password is correctly writen in the file!!");
           }
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: File not found");
            System.out.println(e.getMessage());
        }
        catch(Exception e) {
            System.out.println("Error reading the file");
            System.out.println(e.getMessage());
        }
        finally {
            try {
                if(br != null)
                    br.close();
            }
            catch (Exception e) {
                System.out.println("Error closing the file");
                System.out.println(e.getMessage());
            }
        }
        return file_password;
    }
}
        


   