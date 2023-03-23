package resources;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class GenericMethods extends Base {
	
	
	public void SelectbyText(WebElement elementpath, String text)
	{
		Select st = new Select(elementpath);
		st.deselectByVisibleText(text);
	}
	
	public void selectByIndex(WebElement element , int index)
	{
		Select si = new Select(element);
		si.selectByIndex(index);
	}
	
	public void selectByValue(WebElement element , String String)
	{
		Select sv = new Select(element);
		sv.selectByValue(String);
	}
	
	
	
	public static void hover(WebElement Elementpath)
	{
		Actions act =  new Actions(d);
		act.moveToElement(Elementpath).click().build().perform();
	}
	
	public void scroll(int y)
	{
		JavascriptExecutor j = (JavascriptExecutor) d;
		j.executeScript("window.scrollBy(0,"+y+")", "");
	}
	
	
}
