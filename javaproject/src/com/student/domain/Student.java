package com.student.domain;

public class Student
{


    private int sid=10; // Access Modifier, Data type,Variable Name.//
    public String sName;
    public Integer getSid()
    {      // gets metdodes,which is get date and  returm  from obj,
        return this.sid;
    }
    public String returnName()
    {
        return this.sName;
    }
    //setmetdod methodes , which is helip to set the date to the object,
    public void setSid1(int sid,String sName)
    {
        this.sid=sid;
        this.sName=sName;
    }


}