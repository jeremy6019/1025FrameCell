package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DaumLogin {

	public static void main(String[] args) {
		try {
			//드라이버 위치 등록 
			System.setProperty("webdriver.chrome.driver", 
					"/Users/a503-22/Downloads/chromedriver");
			//크롬 실행 
			WebDriver driver =
					new ChromeDriver(); 
			//다음 로그인 페이지 접속 
			driver.get(
					"https://logins.daum.net/accounts/signinform.do?url=https%3A%2F%2Fwww.daum.net%2F");
			Thread.sleep(1000);
			//id	란에 입력하기 
		    driver.findElement(
		    		By.xpath("//*[@id=\"id\"]"))
		    		.sendKeys("jeremy6019");
			//패스워드 란에 입력하기 
		    driver.findElement(
		    		By.xpath("//*[@id=\"inputPwd\"]"))
		    		.sendKeys("kkbb0513!!");
		    //로그인 버튼 클릭 
		    driver.findElement(
		    		By.xpath("//*[@id=\"loginBtn\"]"))
		    		.click();
		    //까페에 접속 
		    Thread.sleep(1000);
		    driver.get("//*[@id=\"mArticle\"]/div[1]/div[2]/div[2]/div/ul/li[1]/a/span");
		    
		    Thread.sleep(1000);
		    //프레임 전환 
		    driver.switchTo().frame(
		    		driver.findElement(
		    				By.id("down")));
		     
		    Thread.sleep(1000);
		    driver.findElement(
		    		By.xpath("//*[@id=\\\"mArticle\\\"]/div[1]/div[2]/div[2]/div/ul/li[1]/a/span"))
		            .sendKeys("맥에서는 시간이 걸리는 것 같음");
		    driver.findElement(
		    		By.xpath("//*[@id=\\\"mArticle\\\"]/div[1]/div[2]/div[2]/div/ul/li[1]/a/span"))
		            .click();
		    
		    
		    
		}catch(Exception e) {
			System.out.printf("%s\n", 
					e.getMessage());
		}

	}

}
