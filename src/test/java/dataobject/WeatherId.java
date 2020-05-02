package dataobject;

public class WeatherId {
	
	private String weatherKey;
	
	public WeatherId(String weatherKey) {
		super();
		this.weatherKey = weatherKey;
	}

	public String getWeatherKey() {
		return weatherKey;
	}

	public void setWeatherKey(String weatherKey) {
		this.weatherKey = weatherKey;
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((weatherKey == null) ? 0 : weatherKey.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WeatherId other = (WeatherId) obj;
		if (weatherKey == null) {
			if (other.weatherKey != null)
				return false;
		} else if (!weatherKey.equals(other.weatherKey))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "[" + weatherKey + "]";
	}

}
