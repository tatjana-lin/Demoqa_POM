package com.demoqa.tests.alertsFrameWindows;

import com.demoqa.pages.AlertsFrameWindowsPage;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import com.demoqa.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserWindowsTest extends TestBase {

    @BeforeMethod
    public void precondition(){
       new HomePage(driver).getAlertsFrameWindows();
       new SidePanel(driver).selectBrowserWindows().hideIframes();

    }

    @Test
    public void handleNewTabTest(){
        new AlertsFrameWindowsPage(driver).switchToNewTab(1)
                .verifyNewTabTitle("sample");
    }

}
