package org.company;

public class CompanyInfo {

	private void companyName() {
		System.out.println("companyName: M&M company");

	}

	private void companyId() {
		System.out.println("companyId: 158687");

	}

	private void companyAddress() {
		System.out.println("companyAddress : 17/18, Pattullous Road, Royapettah");

	}

	private void companyBranches() {
		System.out.println("companyBranches:Chennai,Coimbatore");
	}

	public static void main(String[] args) {
		// className objectRefName = new ClassName;
		CompanyInfo v = new CompanyInfo();
		// objectRefName.methodName;
		v.companyName();
		v.companyAddress();
		v.companyId();
		v.companyBranches();
	}

}
