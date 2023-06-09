package com.kie_pract.incentivetest;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class IncentiveTest implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private double incen;
	private java.lang.String incentTypes;
	private java.lang.String incentiveEligible;
	private double payment;

	public IncentiveTest() {
	}

	public java.lang.String getIncentTypes() {
		return this.incentTypes;
	}

	public void setIncentTypes(java.lang.String incentTypes) {
		this.incentTypes = incentTypes;
	}

	public java.lang.String getIncentiveEligible() {
		return this.incentiveEligible;
	}

	public void setIncentiveEligible(java.lang.String incentiveEligible) {
		this.incentiveEligible = incentiveEligible;
	}

	public double getIncen() {
		return this.incen;
	}

	public void setIncen(double incen) {
		this.incen = incen;
	}

	public double getPayment() {
		return this.payment;
	}

	public void setPayment(double payment) {
		this.payment = payment;
	}

	public IncentiveTest(double incen, java.lang.String incentTypes,
			java.lang.String incentiveEligible, double payment) {
		this.incen = incen;
		this.incentTypes = incentTypes;
		this.incentiveEligible = incentiveEligible;
		this.payment = payment;
	}

}