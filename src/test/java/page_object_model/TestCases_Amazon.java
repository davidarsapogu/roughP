package page_object_model;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import testNGSuper.Base_Test;

public class TestCases_Amazon extends Base_Test {
  @Test
  public void searcPage() throws InterruptedException {
	  
	  homepageobj.setSearchBox("Jesus");
	  homepageobj.getSearchBox().sendKeys(Keys.ENTER);
	  homepageobj.getSearchBox().clear();
	  
	  homepageobj.setSearchBox("David");
	  homepageobj.getSearchBox().sendKeys(Keys.ENTER);
	  homepageobj.getSearchBox().clear();
	  
	  homepageobj.setSearchBox("Mobile");
	  homepageobj.getSearchBox().sendKeys(Keys.ENTER);
	  homepageobj.getSearchBox().clear();
	  
	  
  }
  

  
  
}
