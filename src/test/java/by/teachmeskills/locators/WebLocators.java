package by.teachmeskills.locators;
/*
    Создать новый Java-класс, в нем для ресурса https://www.saucedemo.com/  составить список локаторов, можно искать на
    ВСЕХ страницах приложения (driver.findWebElement(<локатор>)) для КАЖДОГО из примеров локаторов ниже:
        - id
        - name
        - classname
        - tagname
        - linktext
        - partiallinktext
    xpath
        - Поиск по атрибуту, например By.xpath("//tag[@attribute='value']");
        - Поиск по тексту, например By.xpath("//tag[text()='text']");
        - Поиск по частичному совпадению атрибута, например By.xpath("//tag[contains(@attribute,'text')]");
        - Поиск по частичному совпадению текста, например By.xpath("//tag[contains(text(),'text')]");

    XPath Axes https://www.w3schools.com/xml/xpath_axes.asp
        - ancestor, например //*[text()='Enterprise Testing']//ancestor::div
        - descendant
        - following
        - parent
        - preceding
        - поиск элемента с условием AND, например "//span[@class=\"title\" and text()=\"Products\"]"
    css selectors https://www.w3schools.com/cssref/css_selectors.asp
        - .class
        - .class1.class2
        - .class1 .class2
        - #id
        - tagname
        - tagname.class
        - [attribute=value]
        - [attribute~=value]
        - [attribute|=value]
        - [attribute^=value]
        - [attribute$=value]
        - [attribute*=value]
 */

public class WebLocators {
    final String ID_SELECTOR = "root";
    final String NAME_SELECTOR = "add-to-cart-sauce-labs-backpack";
    final String CLASS_NAME_SELECTOR = "social_facebook";
    final String TAG_NAME_SELECTOR = "ul";
    final String LINK_SELECTOR = "Facebook";
    final String PARTIAL_LINK_SELECTOR = "Reset";
    final String XPATH_ATTRIBUTE_SELECTOR = "//a[@id='item_5_img_link']";
    final String XPATH_TEXT_SELECTOR = "//a[text()='Reset App State']";
    final String XPATH_PARTIAL_SELECTOR = "//select[contains(@class,'product')]";
    final String XPATH_PARTIAL_TEXT_SELECTOR = "//option[contains(text(),'A to Z')]";
    final String XPATH_ANCESTOR_SELECTOR = "//*[text()='Name (A to Z)']//ancestor::select";
    final String XPATH_DESCENDANT_SELECTOR = "//span/descendant::select";
    final String XPATH_FOLLOWING_SELECTOR = "//div[text()='Sauce Labs Bike Light']/following::div[contains(text(),'$')]";
    final String XPATH_PARENT_SELECTOR = "//option[@value='za']/parent::select";
    final String XPATH_PRECEDING_SELECTOR = "//div[text()='Sauce Labs Bike Light']/preceding::img[@alt='Sauce Labs Bike Light']";
    final String XPATH_AND_SELECTOR = "//a[@id='about_sidebar_link'][text()='About']";
    final String CSS_CLASS_SELECTOR = ".bm-burger-button";
    final String CSS_CLASS2_SELECTOR = ".error-message-container.error";
    final String CSS_CLASS3_SELECTOR = ".primary_header .bm-burger-button";
    final String CSS_ID_SELECTOR = "#root";
    final String CSS_TAG_NAME_SELECTOR = "span";
    final String CSS_TAG_NAME_CLASS_SELECTOR = "span.title";
    final String CSS_ATTRIBUTE_SELECTOR = "[class='right_component']";
    final String CSS_ATTRIBUTE1_SELECTOR = "[id~=reset_sidebar_link]";
    final String CSS_ATTRIBUTE2_SELECTOR = "[class|='footer']";
    final String CSS_ATTRIBUTE3_SELECTOR = "div[id^='shopping']";
    final String CSS_ATTRIBUTE4_SELECTOR = "div[class$='component']";
    final String CSS_ATTRIBUTE5_SELECTOR = "a[id*='bout_si']";
}