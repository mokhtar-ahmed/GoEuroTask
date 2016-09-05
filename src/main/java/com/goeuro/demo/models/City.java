package com.goeuro.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class City {

	@JsonProperty("_id")
	Integer id; 
	
	@JsonProperty("key")
	String key; 
	
	@JsonProperty("name")
	String name; 
	
	@JsonProperty("fullName")
	String fullName; 
	
	@JsonProperty("iata_airport_code")
	String iata_airport_code;
	
	@JsonProperty("type")
	String type; 
	
	@JsonProperty("country")
	String country;
	
	@JsonProperty("geo_position")
	GeoPosition geo_position;
	
	@JsonProperty("locationId")
	Integer location_id;
	
	@JsonProperty("inEurope")
	boolean inEurope;
	
	@JsonProperty("countryCode")
	String countryCode;
	
	@JsonProperty("countryId")
	String countryId;
	
	@JsonProperty("coreCountry")
	boolean coreCountry;
	
	@JsonProperty("distance")
	String distance;

	public City() {
		super();
	}

	public City(Integer id, String key, String name, String fullName,
			String iata_airport_code, String type, String country,
			GeoPosition geo_position, Integer location_id, boolean inEurope,
			String countryCode, boolean coreCountry, String distance) {
		super();
		this.id = id;
		this.key = key;
		this.name = name;
		this.fullName = fullName;
		this.iata_airport_code = iata_airport_code;
		this.type = type;
		this.country = country;
		this.geo_position = geo_position;
		this.location_id = location_id;
		this.inEurope = inEurope;
		this.countryCode = countryCode;
		this.coreCountry = coreCountry;
		this.distance = distance;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getIata_airport_code() {
		return iata_airport_code;
	}

	public void setIata_airport_code(String iata_airport_code) {
		this.iata_airport_code = iata_airport_code;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public GeoPosition getGeo_position() {
		return geo_position;
	}

	public void setGeo_position(GeoPosition geo_position) {
		this.geo_position = geo_position;
	}

	public Integer getLocation_id() {
		return location_id;
	}

	public void setLocation_id(Integer location_id) {
		this.location_id = location_id;
	}

	public boolean isInEurope() {
		return inEurope;
	}

	public void setInEurope(boolean inEurope) {
		this.inEurope = inEurope;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public boolean isCoreCountry() {
		return coreCountry;
	}

	public void setCoreCountry(boolean coreCountry) {
		this.coreCountry = coreCountry;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (coreCountry ? 1231 : 1237);
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result
				+ ((countryCode == null) ? 0 : countryCode.hashCode());
		result = prime * result
				+ ((distance == null) ? 0 : distance.hashCode());
		result = prime * result
				+ ((fullName == null) ? 0 : fullName.hashCode());
		result = prime * result
				+ ((geo_position == null) ? 0 : geo_position.hashCode());
		result = prime
				* result
				+ ((iata_airport_code == null) ? 0 : iata_airport_code
						.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + (inEurope ? 1231 : 1237);
		result = prime * result + ((key == null) ? 0 : key.hashCode());
		result = prime * result
				+ ((location_id == null) ? 0 : location_id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		City other = (City) obj;
		if (coreCountry != other.coreCountry)
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (countryCode == null) {
			if (other.countryCode != null)
				return false;
		} else if (!countryCode.equals(other.countryCode))
			return false;
		if (distance == null) {
			if (other.distance != null)
				return false;
		} else if (!distance.equals(other.distance))
			return false;
		if (fullName == null) {
			if (other.fullName != null)
				return false;
		} else if (!fullName.equals(other.fullName))
			return false;
		if (geo_position == null) {
			if (other.geo_position != null)
				return false;
		} else if (!geo_position.equals(other.geo_position))
			return false;
		if (iata_airport_code == null) {
			if (other.iata_airport_code != null)
				return false;
		} else if (!iata_airport_code.equals(other.iata_airport_code))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (inEurope != other.inEurope)
			return false;
		if (key == null) {
			if (other.key != null)
				return false;
		} else if (!key.equals(other.key))
			return false;
		if (location_id == null) {
			if (other.location_id != null)
				return false;
		} else if (!location_id.equals(other.location_id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "City [id=" + id + ", key=" + key + ", name=" + name
				+ ", fullName=" + fullName + ", iata_airport_code="
				+ iata_airport_code + ", type=" + type + ", country=" + country
				+ ", geo_position=" + geo_position + ", location_id="
				+ location_id + ", inEurope=" + inEurope + ", countryCode="
				+ countryCode + ", coreCountry=" + coreCountry + ", distance="
				+ distance + "]";
	}

}
