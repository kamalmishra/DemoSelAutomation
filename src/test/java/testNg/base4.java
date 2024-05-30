package testNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class base4 {
	
@Test(enabled=false)
	
	public void cricketMens() {
	System.out.println("print cricketMens-base-4");	
	}

@org.testng.annotations.BeforeClass

public void BeforeClass() {
	System.out.println("executingbefore class base4");	
	}


@Test(groups={"smoke"})

public void cricketWom() {
System.out.println("print cricketWom");	
}

@Parameters({"URL"})

@Test

public void cricketStudent(String urlname) {
System.out.println("print cricketStudent");
System.out.println(urlname);	
}

@Test

public void cricketTeachers(){
System.out.println("print cricketTeachers");	
}
@org.testng.annotations.AfterClass
public void AfterClass() {
	System.out.println("executing agter class base4");	
	}

}
