/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstsd;

/**
 *
 * @author
 */
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int Salary;
    public Employee(int id,String firstName,String lastName,int Salary){
        this.id=id;
        this.firstName=firstName;
        this.lastName=lastName;
        this.Salary=Salary;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the Salary
     */
    public int getSalary() {
        return Salary;
    }

    /**
     * @param Salary the Salary to set
     */
    public void setSalary(int Salary) {
        this.Salary = Salary;
    }
    public int annualSalary() {
        return this.Salary *12;
    }
    public int raiseSalary(int percent) {
        return this.Salary +percent * this.Salary;
    }
    public String tostring() {
        String s="\"Employee [id"+this.getId()+"name"+this.getFirstName()+"lastname"+this.getLastName()+"salary"+this.getSalary()+" ]" ;
        
        return s;
    
    }
    
    
    
    
}
