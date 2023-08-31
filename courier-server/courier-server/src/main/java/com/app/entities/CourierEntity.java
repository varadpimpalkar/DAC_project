package com.app.entities;


import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "courier")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
//@ToString
public class CourierEntity extends BaseEntity{
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="customer_id")
	private CustomerEntity customerCouriers;
	
	@Column(length = 100)
	private String sendersAddress;
	@Column(length = 6)
	private String sendersPincode;
	
	@Column(length = 15)
	private String receiversName;
	@Column(length = 100)
	private String receiversAddress;
	@Column(length = 6)
	private String receiversPincode;
	
	@ManyToOne(cascade = CascadeType.ALL) //or persist
	@JoinColumn(name = "employee_id")
	private EmployeeEntity allotedToDeliveryBoy;
	
//	@Temporal(TemporalType.DATE)
//	@DateTimeFormat(pattern = "yyyy-MM-dd")
//	private Date dateOfAdmission;
	
	//to be confirmed
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date bookedDate;
	
	@Enumerated(EnumType.STRING)
	@Column
	private StatusEnum status ;
	
	@Enumerated(EnumType.STRING)
	@Column
	private CategoryEnum category;
	
	@Column
	private double weight;
	
	@Column
	private double amount;

	public CustomerEntity getCustomerCouriers() {
		return customerCouriers;
	}

	public void setCustomerCouriers(CustomerEntity customerCouriers) {
		this.customerCouriers = customerCouriers;
	}

	public String getSendersAddress() {
		return sendersAddress;
	}

	public void setSendersAddress(String sendersAddress) {
		this.sendersAddress = sendersAddress;
	}

	public String getSendersPincode() {
		return sendersPincode;
	}

	public void setSendersPincode(String sendersPincode) {
		this.sendersPincode = sendersPincode;
	}

	public String getReceiversName() {
		return receiversName;
	}

	public void setReceiversName(String receiversName) {
		this.receiversName = receiversName;
	}

	public String getReceiversAddress() {
		return receiversAddress;
	}

	public void setReceiversAddress(String receiversAddress) {
		this.receiversAddress = receiversAddress;
	}

	public String getReceiversPincode() {
		return receiversPincode;
	}

	public void setReceiversPincode(String receiversPincode) {
		this.receiversPincode = receiversPincode;
	}

	public EmployeeEntity getAllotedToDeliveryBoy() {
		return allotedToDeliveryBoy;
	}

	public void setAllotedToDeliveryBoy(EmployeeEntity allotedToDeliveryBoy) {
		this.allotedToDeliveryBoy = allotedToDeliveryBoy;
	}

	public Date getBookedDate() {
		return bookedDate;
	}

	public void setBookedDate(Date bookedDate) {
		this.bookedDate = bookedDate;
	}

	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}

	public CategoryEnum getCategory() {
		return category;
	}

	public void setCategory(CategoryEnum category) {
		this.category = category;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "CourierEntity [customerCouriers=" + customerCouriers + ", sendersAddress=" + sendersAddress
				+ ", sendersPincode=" + sendersPincode + ", receiversName=" + receiversName + ", receiversAddress="
				+ receiversAddress + ", receiversPincode=" + receiversPincode + ", allotedToDeliveryBoy="
				+ allotedToDeliveryBoy + ", bookedDate=" + bookedDate + ", status=" + status + ", category=" + category
				+ ", weight=" + weight + ", amount=" + amount + "]";
	}
	
	
	
	
}
