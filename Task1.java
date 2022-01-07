package class1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task1 {
@BeforeMethod
    public void BeforeMethod (){
    System.out.println("Url provided");
}
   @AfterMethod
public void AfterMethod(){
       System.out.println("Page closed");
   }

    @Test
public void LogIn(){
    System.out.println(" You are successfully logged In");
}
@Test
public void MenuSelection(){
    System.out.println("The right Menu of the day selected");
}

@Test
public void WeatherForecast(){
    System.out.println(" The weather is snowy");
}
@Test
public void Addition(){
    System.out.println(10/0);

}

}
