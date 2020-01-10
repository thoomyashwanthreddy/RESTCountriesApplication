package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.codehaus.jackson.map.*;

public class Controller {

	private static final String URL = "https://restcountries.eu/rest/v2/alpha/";

	public String fetchCapitalCityBasedOnCode(String code) {

		try {

			StringBuffer sb = new StringBuffer();
			sb.append(URL);
			sb.append(code);

			URL obj = new URL(sb.toString());
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			con.setRequestMethod("GET");

			int responseCode = con.getResponseCode();
			//System.out.println("GET Response Code :: " + responseCode);

			if (responseCode == HttpURLConnection.HTTP_OK) { // success
				BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
				String inputLine;
				StringBuffer response = new StringBuffer();

				while ((inputLine = in.readLine()) != null) {
					response.append(inputLine);
				}
				in.close();

				ObjectMapper mapper = new ObjectMapper();
				String jsonInString = response.toString();

				//JSON from String to Object
				Response rs = mapper.readValue(jsonInString, Response.class);	
				return rs.getCapital();
			} else {
				//System.out.println("GET request not worked");
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}
}