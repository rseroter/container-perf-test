var builder = WebApplication.CreateBuilder(args);

// Add services to the container.
// Learn more about configuring Swagger/OpenAPI at https://aka.ms/aspnetcore/swashbuckle
builder.Services.AddEndpointsApiExplorer();
builder.Services.AddSwaggerGen();

var app = builder.Build();

//added
var port = Environment.GetEnvironmentVariable("PORT") ?? "8080";
var url = $"http://0.0.0.0:{port}";

// Configure the HTTP request pipeline.
if (app.Environment.IsDevelopment())
{
    app.UseSwagger();
    app.UseSwaggerUI();
}

//app.UseHttpsRedirection();


app.MapGet("/employees", () =>
{
        List<Employee> emps = new List<Employee>();
        emps.Add(new Employee("100", "Bob Belcher", "SAN", "Head Chef"));
        emps.Add(new Employee("101", "Philip Frond", "SAN", "Counselor"));

        return emps;
})
.WithName("GetEmployees");

app.Run(url);

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
