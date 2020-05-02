package dataobject;

import java.util.Map;

public class Weather {

	private String region;
	private String country;
	private String timezone_id;
	private String name;
	private String temperature;
	
	public Weather() {
		super();
	}

	public Weather(String region, String country, String timezone_id, String name, String temperature) {
		super();
		this.region = region;
		this.country = country;
		this.timezone_id = timezone_id;
		this.name = name;
		this.temperature = temperature;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getTimezone_id() {
		return timezone_id;
	}

	public void setTimezone_id(String timezone_id) {
		this.timezone_id = timezone_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public static Weather createWeather(Map<String, String> entry) {
		Weather weather = new Weather();
		weather.setName(entry.get("name"));
		weather.setCountry(entry.get("country"));
		weather.setTimezone_id(entry.get("timezone_id"));
		weather.setRegion(entry.get("region"));
		weather.setTemperature(entry.get("temperature"));
		return weather;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", country=" + country + ", timezone_id=" 
	+ timezone_id + ", region=" + region +", region=" + temperature + "]";
	}
}
