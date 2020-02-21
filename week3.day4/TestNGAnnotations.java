import org.testng.annotations.Test;

public class TestNGAnnotations{

	@Test(groups = {"smoke"})
	public void test1() {
		System.out.println("Test case 1");
		throw new RuntimeException();
	}

	@Test(dependsOnGroups = "smoke")
	public void test2() {
		System.out.println("Test case 2");
	}
	
	@Test()
	public void test3() {
		System.out.println("Test case 3");
	}
	
	@Test
	public void test4() {
		System.out.println("Test case 4");
	}
	
}
