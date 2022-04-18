package com.seroter.springrestapi;

public class Employee {

    private String Id;
    private String FullName;
    private String Location;
    private String JobTitle;
    
    public Employee(String id, String fullName, String location, String jobTitle) {
        Id = id;
        FullName = fullName;
        Location = location;
        JobTitle = jobTitle;
    }
    public String getId() {
        return Id;
    }
    public String getJobTitle() {
        return JobTitle;
    }
    public void setJobTitle(String jobTitle) {
        this.JobTitle = jobTitle;
    }
    public String getLocation() {
        return Location;
    }
    public void setLocation(String location) {
        this.Location = location;
    }
    public String getFullName() {
        return FullName;
    }
    public void setFullName(String fullName) {
        this.FullName = fullName;
    }
    public void setId(String id) {
        this.Id = id;
    }

    
    
}
