package example;        
 
import org.openqa.selenium.By;      
import org.openqa.selenium.WebDriver;       
import org.openqa.selenium.firefox.FirefoxDriver;       
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.Assert;       
import org.testng.annotations.Test; 
import org.testng.annotations.BeforeTest;   
import org.testng.annotations.AfterTest;        
public class NewTest {      
            
        @Test              
        public void testEasy() {  
        	
        	
            System.out.println("https://www.myhcl.com");  
            
        }   
}