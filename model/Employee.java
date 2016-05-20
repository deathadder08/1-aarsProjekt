/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import view.GUI;

/**
 *
 * @author pdyst
 */
public class Employee {
    private int employeeID;
    private String username;
    private String password;
    private String name;
    private int phone;
    private String email;
    private boolean admin;
    private boolean partTime;
    private ArrayList<Case> myCases;

    public Employee(int employeeID, String username, String password, String name, int phone, String email, boolean admin, boolean partTime, ArrayList<Case> myCases) {
        this.employeeID = employeeID;
        this.username = username;
        this.password = password;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.admin = admin;
        this.partTime = partTime;
        this.myCases = myCases;
    }
    
    public boolean checkAddedMyCases(Case c) {
        boolean added = false;
        for (Case myCase :  myCases) {
            if (c.getCaseID() == myCase.getCaseID()) {
                added = true;
                System.out.println("already added");
            }
        }
        return added;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public ArrayList<Case> getMyCases() {
        return myCases;
    }

    public boolean isAdmin() {
        return admin;
    }

    public boolean isPartTime() {
        return partTime;
    }

    public void setMyCases(ArrayList<Case> myCases) {
        this.myCases = myCases;
    }
    
    
    
}
