package com.xfactor.lably.entity;

public class Admin {

    private String Id;

    private String name;

    private String username;

    private String password;

    private String department;



	public void setId(String Id) {
		this.Id = Id;
	}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}