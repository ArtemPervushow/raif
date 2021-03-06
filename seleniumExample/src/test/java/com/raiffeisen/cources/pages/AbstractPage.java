package com.raiffeisen.cources.pages;

import com.raiffeisen.cources.pages.strategy.SearchElementByIdStrategy;
import com.raiffeisen.cources.pages.strategy.SearchElementStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class AbstractPage {
    protected WebDriver driver;
    private SearchElementStrategy searchElementStrategy;

    public abstract void init(final WebDriver webDriver);

    public String getTitle(){
        return driver.getTitle();
    }

    public void setSearchElementStrategy(SearchElementStrategy searchElementStrategy) {
        this.searchElementStrategy = searchElementStrategy;
    }

    public WebElement searchElement(String locator){
        if(searchElementStrategy == null) {
            searchElementStrategy = new SearchElementByIdStrategy(driver);
        }
        return searchElementStrategy.searchElementByLocator(locator);
    }
}
