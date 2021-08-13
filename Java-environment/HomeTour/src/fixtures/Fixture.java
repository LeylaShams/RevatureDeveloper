package fixtures;

public abstract class  Fixture{
	
	protected String name;
	protected String shortDescription;
	protected String longDescription;
	
	public abstract String getName();
	public abstract void setName(String name);
	
	public abstract String getShortDescription();
	public abstract void setShortDescription(String shortDescription);
	
	public abstract String getLongDescription();
	public abstract void setLongDescription(String shortDescription);
}
