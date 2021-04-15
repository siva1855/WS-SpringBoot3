package siva.bootmongodb.model;

import java.util.List;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
	@Id
	private Integer id;
	private String bookName;
	private Double bookCost;

	private String[] authors;
	private List<Double> versions;
	private Set<String> isbrands;

}
