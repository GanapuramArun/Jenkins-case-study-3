package TestCasewithinGroups;

import org.testng.annotations.Test;

public class EastCartLogin {
	
	@Test
	public void EasyCalculateLoging() {
		System.out.println("Easy Calculate  user can also login");
	}
	
	@Test(groups = {"Smoke Test"})
	public void EasyCalculateAdminLoging() {
		System.out.println("Easy Calculate  Admin Can Also able to login");
	}
	
	@Test
	public void EasyCalculateEmployeeLoging() {
		System.out.println("Easy Calculate employee Can Also able to login");
	}
	

}
