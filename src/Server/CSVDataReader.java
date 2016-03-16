package Server;

import java.util.List;

public class CSVDataReader
{
	String csvFilePath;
	List<Person> persons;

	public CSVDataReader(String csvFilePath)
	{
		this.csvFilePath = csvFilePath;
	}

	public List<Person> getPersons()
	{
		return persons;
	}

}
