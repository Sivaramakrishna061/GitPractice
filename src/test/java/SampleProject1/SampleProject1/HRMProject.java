package SampleProject1.SampleProject1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class HRMProject {
@Test(dataProvider="dataDriven")
	public static void hrmProject(String username, String Password, String Wishes, String Wish) throws InterruptedException {
	
	System.out.println(username + Password + Wishes + Wish);
		
	}

@DataProvider(name="dataDriven")
public Object[][] dataDriven()
{
	return new Object[][] {{"admin", "Admin123","Hello", "world"}, {"Admin", "admin123", "Hello", "world"}};
}


}

