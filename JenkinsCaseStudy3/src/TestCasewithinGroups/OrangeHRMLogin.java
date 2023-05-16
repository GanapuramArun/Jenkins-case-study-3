package TestCasewithinGroups;

import org.testng.annotations.Test;

public class OrangeHRMLogin {
	
	@Test(groups = {"Smoke Test"})
	public void OrangeLogin() {
		System.out.println("Orange HRM  user can also login");
	}
	
	@Test
	public void OrangeAdminLogin() {
		System.out.println("Orange HRM Admin  Admin Can Also able to login");
	}
	
	@Test
	public void OrangeEmployeLogin() {
		System.out.println("Orange HRM Employe employee Can Also able to login");
	}
	


}
