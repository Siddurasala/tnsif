package com.tnsif.siddu.assignment.utilites;
import com.tnsif.siddu.assignment.employes.*;


public class Emputilities {
	 public void printEmployeeRole(Employee emp) {
	        System.out.println("Employee Role: " + emp.role); // public → accessible
	        // Cannot access emp.salary directly here (protected, diff package, not subclass)
	        // Cannot access emp.employeeId (default → package-private)
	        // Cannot access emp.name (private)
	    }

	    public void printManagerInfo(Managers mgr) {
	        mgr.showManagerDetails(); // allowed, accessing subclass method
	    }

	    public void printDeveloperInfo(Developers dev) {
	        dev.showDeveloperDetails(); // allowed
	    }

}
