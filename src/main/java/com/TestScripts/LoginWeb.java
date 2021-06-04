package com.TestScripts;

import com.PageObjectModel.LoginPage;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.CommonLib.BaseLib;

public class LoginWeb extends BaseLib{

    @Test
    public void loginTest(String username,String password) throws InterruptedException
    {
        LoginPage login = new LoginPage(driver);
        login.webLogin(username,password);
        Thread.sleep(5000);

    }
}
