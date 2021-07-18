/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myPackage;

import java.util.*;
import java.io.*;

/**
 *
 * @author Viki
 */
class Temp implements Serializable
{
	private String user,password;
        
        Temp(String a,String b)
        {
            user=a;
            password=b;
        }

    Temp() {
        
    }
        
        public String getUser()
        {
            return user;
        }
        
        public String getPassword()
        {
            return password;
        }
}
public class AdminLogin 
{
    public static void main(String args[])
    {
        Temp A = new Temp("admin","admin");
        ArrayList<Temp> array=new ArrayList<Temp>();
        array.add(A);

        try{
            FileOutputStream fi=new FileOutputStream(new File("Admin.tmp"));
            ObjectOutputStream o=new ObjectOutputStream(fi);
            
            o.writeObject(array);
            o.close();
            fi.close();
        }
        catch (Exception e){
        
        }
    }
}
