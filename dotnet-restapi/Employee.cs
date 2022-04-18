namespace dotnet_restapi;

public class Employee {

    public Employee(string id, string fullname, string location, string jobtitle) {
        this.Id = id;
        this.FullName = fullname;
        this.Location = location;
        this.JobTitle = jobtitle;
    }

    public string Id {get; set;}
    public string FullName {get; set;}

    public string Location {get; set;}

    public string JobTitle {get; set;}

}