package org.test;

import org.testng.annotations.DataProvider;
import org.utilities.FbAccPojo;

public class DataProviderSampleFb extends FbAccPojo {
		
	@DataProvider(name="login")
	  public Object[][] data()
	  {
		FbAccPojo f=new FbAccPojo();

		  return new Object[][] { {"sun","day","222222","1234","10",2,"1990",f.getMale()},
			  {"mon","day","3333","5555","25",4,"2000",f.getCustom()}
	  };

	}

}
