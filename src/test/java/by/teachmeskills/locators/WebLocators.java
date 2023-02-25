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
        - Поиск по тексту, например By.xpath("//tag[text()='text']");Поиск по частичному совпадению атрибута,
        например By.xpath("//tag[contains(@attribute,'text')]");
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

public class WebLocators{
   final String ID_SELECTOR = "";


}
