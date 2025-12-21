import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MTS {
    public WebDriver driver;

    public MTS(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//*[@class='btn btn_gray cookie__cancel']")
    private WebElement cookieButtonCancel;

    @FindBy(xpath = "//*[@id='connection-phone']")
    private WebElement connectionPhone;

    @FindBy(xpath = "//*[@id='connection-sum']")
    private WebElement connectionSum;

    @FindBy(xpath = "//*[@id='connection-email']")
    private WebElement connectionEmail;

    @FindBy(xpath = "//*[@id='internet-phone']")
    private WebElement internetPhone;

    @FindBy(xpath = "//*[@id='internet-sum']")
    private WebElement internetSum;

    @FindBy(xpath = "//*[@id='internet-email']")
    private WebElement internetEmail;

    @FindBy(xpath = "//*[@id='score-instalment']")
    private WebElement instalmentScore;

    @FindBy(xpath = "//*[@id='instalment-sum']")
    private WebElement instalmentSum;

    @FindBy(xpath = "//*[@id='instalment-email']")
    private WebElement instalmentEmail;

    @FindBy(xpath = "//*[@id='score-arrears']")
    private WebElement arrearsScore;

    @FindBy(xpath = "//*[@id='arrears-sum']")
    private WebElement arrearsSum;

    @FindBy(xpath = "//*[@id='arrears-email']")
    private WebElement arrearsEmail;

    @FindBy(xpath = "//*[@id='pay-connection']/button")
    private WebElement payButton;

    @FindBy(xpath = "//*[@class='bepaid-iframe']")
    public WebElement payFrame;

    public void clickCookieCancel(){
        cookieButtonCancel.click();
    }

    public String getConnectionPhonePlaceholder() throws NoSuchElementException {
        return connectionPhone.getAttribute("placeholder");
    }

    public String getConnectionSumPlaceholder() throws NoSuchElementException {
        return connectionSum.getAttribute("placeholder");
    }

    public String getConnectionEmailPlaceholder() throws NoSuchElementException {
        return connectionEmail.getAttribute("placeholder");
    }

    public String getInternetPhonePlaceholder() throws NoSuchElementException {
        return internetPhone.getAttribute("placeholder");
    }

    public String getInternetSumPlaceholder() throws NoSuchElementException {
        return internetSum.getAttribute("placeholder");
    }

    public String getInternetEmailPlaceholder() throws NoSuchElementException {
        return internetEmail.getAttribute("placeholder");
    }

    public String getInstalmentScorePlaceholder() throws NoSuchElementException {
        return instalmentScore.getAttribute("placeholder");
    }

    public String getInstalmentSumPlaceholder() throws NoSuchElementException {
        return instalmentSum.getAttribute("placeholder");
    }

    public String getInstalmentEmailPlaceholder() throws NoSuchElementException {
        return instalmentEmail.getAttribute("placeholder");
    }

    public String getArrearsScorePlaceholder() throws NoSuchElementException {
        return arrearsScore.getAttribute("placeholder");
    }

    public String getArrearsSumPlaceholder() throws NoSuchElementException {
        return arrearsSum.getAttribute("placeholder");
    }

    public String getArrearsEmailPlaceholder() throws NoSuchElementException {
        return arrearsEmail.getAttribute("placeholder");
    }

    public void setConnectionPhone(String phoneNumber) throws NoSuchElementException {
        connectionPhone.sendKeys(phoneNumber);
    }

    public void setConnectionSum(String sum) throws NoSuchElementException {
        connectionSum.sendKeys(sum);
    }

    public void clickButton() throws NoSuchElementException {
        payButton.click();
    }
}
