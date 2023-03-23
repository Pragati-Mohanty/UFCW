package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
	
	public static WebDriver d;

	public Properties prop;

	public WebDriver initializeDriver() throws IOException {
		prop = new Properties();
		FileInputStream fi = new FileInputStream("C:\\Users\\dell\\nex\\src\\main\\java\\resources\\data.properties");
		prop.load(fi);

		String browsername = prop.getProperty("browser");

		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"D:\\New Pragati\\Automation\\Selenium Soft\\chromedriver.exe");
			ChromeOptions co = new ChromeOptions();    
			co.addArguments("--remote-allow-origins=*");
			d = new ChromeDriver(co);
		} else if (browsername.equals("firefox")) {
			System.setProperty("webdriver.firefox.driver",
					"C:\\Users\\Pragati\\Documents\\selenium soft\\Gecko1\\geckodriver.exe");
			d = new FirefoxDriver();
		} else if (browsername.equals("IE")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Pragati\\Documents\\selenium soft\\Gecko1\\geckodriver.exe");
			d = new InternetExplorerDriver();
		}
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return d;
	}

//    public void screenShotsp(final String tkss) throws IOException, DocumentException {
//        final Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Base.d);
//        final Date myDate = new Date();
//        String date = new SimpleDateFormat("dd-MM-yyyy-HH:mm:ss").format(myDate);
//        date = date.replace(':', '-');
//        final Document document = new Document();
//        final String ob1 = "C:\\Users\\Pragati\\Desktop\\tt\\" + tkss + date + ".png";
//        ImageIO.write(screenshot.getImage(), "PNG", new File(ob1));
//        final String ob2 = "C:\\Users\\Pragati\\Desktop\\tt\\" + tkss + date + ".pdf";
//        final FileOutputStream fos = new FileOutputStream(ob2);
//        final PdfWriter writer = PdfWriter.getInstance(document, (OutputStream)fos);
//        writer.open();
//        Document.open();
//        final Image img = Image.getInstance(ob1);
//        img.scalePercent(40.0f);
//        document.add((Element)img);
//        document.close();
//        writer.close();
//    }

}
