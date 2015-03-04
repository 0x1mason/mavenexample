package com.google.mavenproject1;

import io.appium.java_client.android.AndroidDriver;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","Android Emulator");
        capabilities.setCapability("platformVersion", "4.4");
        //capabilities.setCapability("app", app.getAbsolutePath());
        capabilities.setCapability("appPackage", "io.appium.android.apis");
        capabilities.setCapability("appActivity", ".ApiDemos");
        try{
        AndroidDriver d = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        }catch(Exception e){}
        System.out.println( "Hello World!" );
    }
}
