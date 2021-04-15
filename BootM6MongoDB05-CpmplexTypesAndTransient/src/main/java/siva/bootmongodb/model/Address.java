package siva.bootmongodb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {

	private String houseNumber;
	private String streetName;
	private Integer pincode;
	private String cityName;
	private String districtName;
	private String stateName;

}
