/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myPackage;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Viki
 */
interface Functions
{
    public void setName(String a);
    public void setUserID(String a);
    public void setPwd(String a);
    public void setEmail(String a);
    public void setAddress(String a);
    public String getName();
    public String getUserID();
    public String getPwd();
    public String getEmail();
    public String getAddress();
    public void setCtype(String a);
    public void setPhno(String a);
    public String getCtype();
}

public class UserDetails implements Serializable,Functions
{
	private String name,userID,pwd,email,address;
	private int card_num;
        private String phone_no,c_type;
	private double preread,curread;
        ArrayList<Double> History;
        
	public void setName(String a)
	{
		name=a;
	}
	public void setUserID(String a)
	{
		userID=a;
	}
	public void setPwd(String a)
	{
		pwd=a;
	}
	public void setEmail(String a)
	{
		email=a;
	}
	public void setAddress(String a)
	{
		address=a;
	}
	public String getName()
	{
		return name;
	}
	public String getUserID()
	{
		return userID;
	}
	public String getPwd()
	{
		return pwd;
	}
	public String getEmail()
	{
		return email;
	}
	public String getAddress()
	{
		return address;
	}
	public void setCtype(String a)
	{
		c_type=a;
	}
	public void setPhno(String a)
	{
		phone_no=a;
	}
	public String getCtype()
	{
		return c_type;
	}
	public String getPhno()
	{
		return phone_no;
	}
        
        public int getCard_num()
	{
		return card_num;
	}
        public void setCard_num(int n)
	{
		card_num=n;
	}
        public double getCur()
	{
		return curread;
	}
        public double getPre()
	{
		return preread;
	}
        public void setPre(Double n)
	{
		preread=n;
	}
        public void setCur(Double n)
	{
                curread=n;
	}
	public void billDomestic(double preread,double curread)
	{
		double Billamt;
		double units = curread-preread;
		if(units<=100)
			Billamt=units*1.0;
		else if(units<=200)
			Billamt=100*1+(units-100)*2.50;
		else if(units<=500)
			Billamt=100*1+100*2.50+(units-200)*4;
		else
			Billamt=100*1+100*2.50+500*4+(units-500)*6;
		System.out.println("the domestic bill amount is:"+Billamt);
	}
	public void billCommercial(double peread,double curread)
	{
		double Billamt;
		double units = curread-preread;
		if(units<=100)
			Billamt=units*2;
		else if(units<=200)
			Billamt=100*2+(units-100)*4.50;
		else if(units<=500)
			Billamt=100*2+100*4.50+(units-200)*6;
		else
			Billamt=100*2+100*4.50+500*6+(units-500)*7;
		System.out.println("the commercial bill amount is:"+Billamt);
	}
}

