package main;

public class Response {

	private String area;

	private String nativeName;

	private String capital;

	private String demonym;

	private String flag;

	private String alpha2Code;

	private Languages[] languages;

	private String[] borders;

	private String subregion;

	private String[] callingCodes;

	private RegionalBlocs[] regionalBlocs;

	private String gini;

	private String population;

	private String numericCode;

	private String alpha3Code;

	private String[] topLevelDomain;

	private String[] timezones;

	private String cioc;

	private Translations translations;

	private String name;

	private String[] altSpellings;

	private String region;

	private String[] latlng;

	private Currencies[] currencies;

	public String getArea ()
	{
		return area;
	}

	public void setArea (String area)
	{
		this.area = area;
	}

	public String getNativeName ()
	{
		return nativeName;
	}

	public void setNativeName (String nativeName)
	{
		this.nativeName = nativeName;
	}

	public String getCapital ()
	{
		return capital;
	}

	public void setCapital (String capital)
	{
		this.capital = capital;
	}

	public String getDemonym ()
	{
		return demonym;
	}

	public void setDemonym (String demonym)
	{
		this.demonym = demonym;
	}

	public String getFlag ()
	{
		return flag;
	}

	public void setFlag (String flag)
	{
		this.flag = flag;
	}

	public String getAlpha2Code ()
	{
		return alpha2Code;
	}

	public void setAlpha2Code (String alpha2Code)
	{
		this.alpha2Code = alpha2Code;
	}

	public Languages[] getLanguages ()
	{
		return languages;
	}

	public void setLanguages (Languages[] languages)
	{
		this.languages = languages;
	}

	public String[] getBorders ()
	{
		return borders;
	}

	public void setBorders (String[] borders)
	{
		this.borders = borders;
	}

	public String getSubregion ()
	{
		return subregion;
	}

	public void setSubregion (String subregion)
	{
		this.subregion = subregion;
	}

	public String[] getCallingCodes ()
	{
		return callingCodes;
	}

	public void setCallingCodes (String[] callingCodes)
	{
		this.callingCodes = callingCodes;
	}

	public RegionalBlocs[] getRegionalBlocs ()
	{
		return regionalBlocs;
	}

	public void setRegionalBlocs (RegionalBlocs[] regionalBlocs)
	{
		this.regionalBlocs = regionalBlocs;
	}

	public String getGini ()
	{
		return gini;
	}

	public void setGini (String gini)
	{
		this.gini = gini;
	}

	public String getPopulation ()
	{
		return population;
	}

	public void setPopulation (String population)
	{
		this.population = population;
	}

	public String getNumericCode ()
	{
		return numericCode;
	}

	public void setNumericCode (String numericCode)
	{
		this.numericCode = numericCode;
	}

	public String getAlpha3Code ()
	{
		return alpha3Code;
	}

	public void setAlpha3Code (String alpha3Code)
	{
		this.alpha3Code = alpha3Code;
	}

	public String[] getTopLevelDomain ()
	{
		return topLevelDomain;
	}

	public void setTopLevelDomain (String[] topLevelDomain)
	{
		this.topLevelDomain = topLevelDomain;
	}

	public String[] getTimezones ()
	{
		return timezones;
	}

	public void setTimezones (String[] timezones)
	{
		this.timezones = timezones;
	}

	public String getCioc ()
	{
		return cioc;
	}

	public void setCioc (String cioc)
	{
		this.cioc = cioc;
	}

	public Translations getTranslations ()
	{
		return translations;
	}

	public void setTranslations (Translations translations)
	{
		this.translations = translations;
	}

	public String getName ()
	{
		return name;
	}

	public void setName (String name)
	{
		this.name = name;
	}

	public String[] getAltSpellings ()
	{
		return altSpellings;
	}

	public void setAltSpellings (String[] altSpellings)
	{
		this.altSpellings = altSpellings;
	}

	public String getRegion ()
	{
		return region;
	}

	public void setRegion (String region)
	{
		this.region = region;
	}

	public String[] getLatlng ()
	{
		return latlng;
	}

	public void setLatlng (String[] latlng)
	{
		this.latlng = latlng;
	}

	public Currencies[] getCurrencies ()
	{
		return currencies;
	}

	public void setCurrencies (Currencies[] currencies)
	{
		this.currencies = currencies;
	}

	@Override
	public String toString()
	{
		return "ClassPojo [area = "+area+", nativeName = "+nativeName+", capital = "+capital+", demonym = "+demonym+", flag = "+flag+", alpha2Code = "+alpha2Code+", languages = "+languages+", borders = "+borders+", subregion = "+subregion+", callingCodes = "+callingCodes+", regionalBlocs = "+regionalBlocs+", gini = "+gini+", population = "+population+", numericCode = "+numericCode+", alpha3Code = "+alpha3Code+", topLevelDomain = "+topLevelDomain+", timezones = "+timezones+", cioc = "+cioc+", translations = "+translations+", name = "+name+", altSpellings = "+altSpellings+", region = "+region+", latlng = "+latlng+", currencies = "+currencies+"]";
	}
}