import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class MTS {
    public WebDriver driver;

    public MTS(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(css = "div.cookie.show button.cookie__cancel")
    private WebElement cookieCancelBtn;

    @FindBy(css = "section.pay h2")
    private WebElement paySectionTitle;

    @FindBy(xpath = "//section[@class='pay']//a[contains(text(),'Подробнее о сервисе')]")
    private WebElement link;

    @FindBy(xpath = "//*[@id='connection-phone']")
    private WebElement phoneField;

    @FindBy(xpath = "//*[@id='connection-sum']")
    private WebElement sumField;

    @FindBy(css = "section.pay button[type='submit']")
    private WebElement payBtn;

    @FindBy(css = "iframe.bepaid-iframe")
    private WebElement payFrame;

    @FindBy(xpath = "//section[@class='pay']//img")
    private List<WebElement> payImages;

    public String getPaySectionTitle() {
        return paySectionTitle.getText().replaceAll("\n|\r\n", " ");
    }

    public void clickCookieCancelBtn() {
        cookieCancelBtn.click();
    }

    public String getLinkUrl() throws NoSuchElementException {
        return link.getAttribute("href");
    }

    public int getRespCode(String urlLink) throws MalformedURLException, IOException {
        URL url = new URL(urlLink);
        HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();
        httpURLConnect.setConnectTimeout(5000);
        httpURLConnect.connect();
        return httpURLConnect.getResponseCode();
    }

    public void setPhoneField(String phoneNumber) throws NoSuchElementException {
        phoneField.sendKeys(phoneNumber);
    }

    public void setSumField(String sum) throws NoSuchElementException {
        sumField.sendKeys(sum);
    }

    public void clickPayBtn() throws NoSuchElementException {
        payBtn.click();
    }

    public String getFrameLink() throws NoSuchElementException {
        return payFrame.getAttribute("src");
    }

    public boolean isDisplayedImg(String scr) {
        for (WebElement payImage : payImages) {
            if (payImage.getAttribute("src").contains(scr)) {
                return payImage.isDisplayed();
            }
        }
        return false;
    }
}