package siva.bootjparepo.multipledb.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "multipledb_product")
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "product_id")
	private Integer prodcutId;

	@Column(name = "product_name")
	private String productName;

	@Column(name = "product_cost")
	private Double productCost;

	@Column(name = "product_colour")
	private String productColour;

	public Product() {
		super();
	}

	public Product(Integer prodcutId, String productName, Double productCost, String productColour) {
		super();
		this.prodcutId = prodcutId;
		this.productName = productName;
		this.productCost = productCost;
		this.productColour = productColour;
	}

	public Integer getProdcutId() {
		return prodcutId;
	}

	public void setProdcutId(Integer prodcutId) {
		this.prodcutId = prodcutId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getProductCost() {
		return productCost;
	}

	public void setProductCost(Double productCost) {
		this.productCost = productCost;
	}

	public String getProductColour() {
		return productColour;
	}

	public void setProductColour(String productColour) {
		this.productColour = productColour;
	}

	@Override
	public String toString() {
		return "Product [prodcutId=" + prodcutId + ", productName=" + productName + ", productCost=" + productCost
				+ ", productColour=" + productColour + "]";
	}

}
