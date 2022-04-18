using Microsoft.AspNetCore.Mvc;

namespace dotnet_restapi.Controllers;

[ApiController]
[Route("[controller]")]
public class EmployeesController : ControllerBase
{

    private readonly ILogger<EmployeesController> _logger;

    public EmployeesController(ILogger<EmployeesController> logger)
    {
        _logger = logger;
    }

    [HttpGet(Name = "GetEmployees")]
    public IEnumerable<Employee> Get()
    {
        List<Employee> emps = new List<Employee>();
        emps.Add(new Employee("100", "Bob Belcher", "SAN", "Head Chef"));
        emps.Add(new Employee("101", "Philip Frond", "SAN", "Counselor"));

        return emps;
    }
}
