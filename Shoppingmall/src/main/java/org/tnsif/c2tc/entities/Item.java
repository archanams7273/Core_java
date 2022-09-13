package org.tnsif.c2tc.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;
@Component
@Entity
public class Item {
@Id
  private long id;
  private String itemName;
  private double price;
  private LocalDate manufacturingDate;
  private LocalDate expiry;
  private enum category{CLOTHING,MOBILES,ACCESSIORIES
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getItemName() {
	return itemName;
}
public void setItemName(String itemName) {
	this.itemName = itemName;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public LocalDate getManufacturingDate() {
	return manufacturingDate;
}
public void setManufacturingDate(LocalDate manufacturingDate) {
	this.manufacturingDate = manufacturingDate;
}
public LocalDate getExpiry() {
	return expiry;
}
public void setExpiry(LocalDate expiry) {
	this.expiry = expiry;
}

}
