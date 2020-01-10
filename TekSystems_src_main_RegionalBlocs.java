package main;

public class RegionalBlocs
{
    private String[] otherNames;

    private String acronym;

    private String name;

    private String[] otherAcronyms;

    public String[] getOtherNames ()
    {
        return otherNames;
    }

    public void setOtherNames (String[] otherNames)
    {
        this.otherNames = otherNames;
    }

    public String getAcronym ()
    {
        return acronym;
    }

    public void setAcronym (String acronym)
    {
        this.acronym = acronym;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String[] getOtherAcronyms ()
    {
        return otherAcronyms;
    }

    public void setOtherAcronyms (String[] otherAcronyms)
    {
        this.otherAcronyms = otherAcronyms;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [otherNames = "+otherNames+", acronym = "+acronym+", name = "+name+", otherAcronyms = "+otherAcronyms+"]";
    }
}
