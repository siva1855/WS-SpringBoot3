package siva.bootmongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Document
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class Product {

	@Id
	private String productId;
	@NonNull
	private String productName;
	@NonNull
	private String productCode;
	@NonNull
	private Double productCost;
	@NonNull
	private String productVendor;
}
