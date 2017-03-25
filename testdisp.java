

import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*; 
import static com.codeborne.selenide.Selectors.*; 
public class testdisp {
	
	@Test
	public void searchDisplayed(){
		open("http://blog.csssr.ru/qa-engineer/");
		$(byText("мюундхрэ меянбепьемярбю")).click();
		$(byText("мюундхрэ меянбепьемярбю")).click();
		sleep(2000);
		$(byCssSelector("div.info-errors")).shouldBe(visible);
		
		
	}

}