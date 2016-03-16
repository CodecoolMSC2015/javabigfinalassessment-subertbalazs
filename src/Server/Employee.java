package Server;

public class Employee
{
	int Salary;
	String jobTitle;

	public int getSalary()
	{
		return Salary;
	}

	public void setSalary(int salary)
	{
		Salary = salary;
	}

	public String getJobTitle()
	{
		return jobTitle;
	}

	public void setJobTitle(String jobTitle)
	{
		this.jobTitle = jobTitle;
	}

	@Override
	public String toString()
	{
		return "Employee salary: " + Salary + "\njobTitle: " + jobTitle;
	}

}
