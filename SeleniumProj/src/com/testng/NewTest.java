package com.testng;

import org.testng.annotations.Test;

public class NewTest {
  @Test(dataProvider="dp")
  public void login (String n,String s ) {
	  
  }
  @DataProvider
  public Object[][] {
	  new Object[] { "sds","asasasf"}
  };  
	  
  }
}
