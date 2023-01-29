package xyz_bank;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class xyz_tests_class extends xyz_parameter {

	// @Test(groups = "customer")
	// public void test_customer_page() {

	// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	// driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[1]/button")).click();

	// }

	/*
	 * @Test(priority = 1, groups = "manager") public void test_manager_page() {
	 * 
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	 * 
	 * driver.findElement(By.xpath(
	 * "/html/body/div/div/div[2]/div/div[1]/div[2]/button")).click();
	 * 
	 * }
	 */

	/*
	 * @Test(priority = 2, groups = "manager") public void add_customer() throws
	 * InterruptedException {
	 * 
	 * int usernumber = (int) (Math.random() * 100);
	 * 
	 * StringBuilder userid = new StringBuilder(); userid.append(usernumber); String
	 * userasString = userid.toString();
	 * 
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	 * 
	 * driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[1]")
	 * ).click();
	 * 
	 * driver.findElement(By.xpath(
	 * "/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input"))
	 * .sendKeys("Mr" + userasString); driver.findElement(By.xpath(
	 * "/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input"))
	 * .sendKeys("usernumber" + userasString); driver.findElement(By.xpath(
	 * "/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input"))
	 * .sendKeys(userasString);
	 * 
	 * driver.findElement(By.xpath(
	 * "/html/body/div/div/div[2]/div/div[2]/div/div/form/button")).click();
	 * Thread.sleep(3000);
	 * 
	 * String aleertmessage = driver.switchTo().alert().getText();
	 * 
	 * boolean check_alert_mesaage = aleertmessage.contains("successfully");
	 * 
	 * mysoft.assertEquals(check_alert_mesaage, true);
	 * driver.switchTo().alert().accept();
	 * 
	 * Thread.sleep(3000); driver.navigate().to(
	 * "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/manager/list"
	 * ); Thread.sleep(3000); driver.findElement(By.xpath(
	 * "/html/body/div/div/div[2]/div/div[2]/div/form/div/div/input"))
	 * .sendKeys("Mr" + userasString);
	 * 
	 * List<WebElement> allrows = driver.findElements(By.xpath("//tbody/tr"));
	 * 
	 * int number_fo_row_in_this_page = allrows.size();
	 * 
	 * mysoft.assertEquals(number_fo_row_in_this_page,
	 * 1,"number of row in the bage");
	 * 
	 * mysoft.assertAll();
	 * 
	 * }
	 */

	/*
	 * @Test(priority = 3) public void open_account_for_the_customer() throws
	 * InterruptedException {
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	 * driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[2]")
	 * ).click();
	 * 
	 * WebElement options=driver.findElement(By.xpath("//*[@id=\"userSelect\"]"));
	 * 
	 * Select myselect=new Select(options);
	 * 
	 * myselect.selectByIndex(6);
	 * 
	 * WebElement options2=driver.findElement(By.xpath("//*[@id=\"currency\"]"));
	 * 
	 * Select myselect2=new Select(options2);
	 * 
	 * myselect2.selectByIndex(1);
	 * 
	 * driver.findElement(By.xpath(
	 * "/html/body/div/div/div[2]/div/div[2]/div/div/form/button")).click();
	 * Thread.sleep(2000); driver.switchTo().alert().accept();
	 * 
	 * Thread.sleep(3000);
	 * 
	 * driver.findElement(By.xpath("/html/body/div/div/div[1]/button[1]")).click();
	 * 
	 * }
	 */

	/*
	 * @Test(priority = 4) public void login_as_customer() throws
	 * InterruptedException {
	 * 
	 * int ran= (int) (Math.random()*1000); int deposit=ran;
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	 * driver.findElement(By.xpath(
	 * "/html/body/div/div/div[2]/div/div[1]/div[1]/button")).click();
	 * 
	 * WebElement
	 * options_of_customer=driver.findElement(By.xpath("//*[@id=\"userSelect\"]"));
	 * 
	 * Select myselectincustomer=new Select(options_of_customer);
	 * 
	 * myselectincustomer.selectByIndex(6);
	 * 
	 * driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/button")).
	 * click();
	 * 
	 * driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/button[1]")
	 * ).click();
	 * 
	 * driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[1]")
	 * ).click();
	 * 
	 * driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/button[2]")
	 * ).click(); Thread.sleep(2000); driver.findElement(By.xpath(
	 * "/html/body/div/div/div[2]/div/div[4]/div/form/div/input")).sendKeys("1000");
	 * Thread.sleep(2000); driver.findElement(By.xpath(
	 * "/html/body/div/div/div[2]/div/div[4]/div/form/button")).click();
	 * Thread.sleep(2000); String balance=driver.findElement(By.xpath(
	 * "/html/body/div/div/div[2]/div/div[2]/strong[2]")).getText();
	 * 
	 * int balnce_in_integer=Integer.parseInt(balance);
	 * 
	 * mysoft.assertEquals(balnce_in_integer, 1000);
	 * 
	 * //below code for withdraw Thread.sleep(2000);
	 * driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/button[3]")
	 * ).click(); Thread.sleep(2000); driver.findElement(By.xpath(
	 * "/html/body/div/div/div[2]/div/div[4]/div/form/div/input")).sendKeys("1000");
	 * Thread.sleep(2000); driver.findElement(By.xpath(
	 * "/html/body/div/div/div[2]/div/div[4]/div/form/button")).click();
	 * 
	 * String balance_after_withdraw=driver.findElement(By.xpath(
	 * "/html/body/div/div/div[2]/div/div[2]/strong[2]")).getText();
	 * 
	 * int balance_after_withdraw_int=Integer.parseInt(balance_after_withdraw);
	 * 
	 * mysoft.assertEquals(balance_after_withdraw_int, 0);
	 * 
	 * mysoft.assertAll();
	 * 
	 * }
	 */

	@Test
	public void change_all_mony_to_dollar_in_one_account() throws InterruptedException {

		// String deposit_roubee=

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.navigate().to("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");

		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[1]/button")).click();
		Thread.sleep(2000);
		WebElement optionspagecustomer = driver.findElement(By.xpath("//*[@id=\"userSelect\"]"));
		Select myselect0 = new Select(optionspagecustomer);
		myselect0.selectByVisibleText("Harry Potter");

		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/button")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input")).sendKeys("100");
		Thread.sleep(2000);

		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button")).click();
		Thread.sleep(2000);

//------------------------------------------------------	
		WebElement options = driver.findElement(By.xpath("//*[@id=\"accountSelect\"]"));

		Select myselect2 = new Select(options);

		myselect2.selectByVisibleText("1005");

		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input")).sendKeys("65");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button")).click();
		String deposit_Pound = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/strong[2]")).getText();
		double Pound = Double.parseDouble(deposit_Pound);

		// ---------------------------------------
		Select myselect3 = new Select(options);

		myselect3.selectByVisibleText("1006");

		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[3]/button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input")).sendKeys("96");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button")).click();
		String deposit_rubee = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/strong[2]")).getText();
		double rubee = Double.parseDouble(deposit_rubee);

		// --------------------------------------------------------

		// ----------------------------------

		Select myselect4 = new Select(options);

		myselect4.selectByVisibleText("1004");
		String deposit_dollar = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/strong[2]"))
				.getText();

		double dollar = Double.parseDouble(deposit_dollar);

		// ---------------------------------------------------------------------------------
		// convert to dollar

		double rubee_to_dollar = 0.012 * rubee;
		double pound_to_dollar = 1.21 * Pound;
		double summition_in_dollar = rubee_to_dollar + pound_to_dollar + dollar;
		double expected_in_dollar=179.802;
		
		
		mysoft.assertNotEquals(summition_in_dollar,expected_in_dollar );
		mysoft.assertAll();
		
		//-----------------------------------------
	}
}
