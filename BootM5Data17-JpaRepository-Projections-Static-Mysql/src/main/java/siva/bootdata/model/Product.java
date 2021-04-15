package siva.bootdata.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
public class Product {
	@Id
	@GeneratedValue
	private Integer productId;
	@NonNull
	private String productName;
	@NonNull
	private Double productCost;
	@NonNull
	private String productVendor;
}
