package TestCasewithinGroups;

import org.testng.annotations.Test;

public class DemoOpenCartlog {
	
	
	@Test
	public void Demologin() {
		System.out.println("Demo  cart user can also login");
	}
	
	@Test
	public void DemoOpenAdminLogin() {
		System.out.println("Demo cart Admin Can Also able to login");
	}
	
	
	@Test(groups = {"Smoke Test"})
	public void DemoOpenEmployeeLogin() {
		System.out.println("Demo cart employee Can Also able to login");
	}

}
