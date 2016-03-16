package Server;

public abstract class DataReader
{
	String SearchCriteria;
	SearchType searchType;

	public void setSearchCriteria(String searchCriteria)
	{
		SearchCriteria = searchCriteria;
	}

	public void setSearchType(SearchType searchType)
	{
		this.searchType = searchType;
	}
	

}
