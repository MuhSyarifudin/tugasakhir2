package com.juaracoding.DBLaundry.configuration;/*
IntelliJ IDEA 2022.3.2 (Ultimate Edition)
Build #IU-223.8617.56, built on January 26, 2023
@Author User a.k.a. Safril Efendi Lubis
Java Developer
Created on 2/16/2023 7:31 PM
@Last Modified 2/16/2023 7:31 PM
Version 1.1
*/
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:other.properties")
public class OtherConfig {
    private static String flagLogging;//additionForLogging


    private static String flagTestDebug;

    private static String flagBcrypt;

    private static String flagMaxCounter;

    private static String flagSMTPActive;

    private static String flagSessionValidation;

    private static String urlEndPointVerify;

    private static String urlPathVerifyEmail;

    public static String getUrlPathVerifyEmail() {
        return urlPathVerifyEmail;
    }

    @Value("${url.path.verify.email}")
    private void setUrlPathVerifyEmail(String urlPathVerifyEmail) {
        OtherConfig.urlPathVerifyEmail = urlPathVerifyEmail;
    }

    @Value("${url.end.point.verify}")
    public static String getUrlEndPointVerify() {
        return urlEndPointVerify;
    }

    private void setUrlEndPointVerify(String urlEndPointVerify) {
        OtherConfig.urlEndPointVerify = urlEndPointVerify;
    }

    public static String getFlagSessionValidation() {
        return flagSessionValidation;
    }

    @Value("${flag.session.validation}")
    private void setFlagSessionValidation(String flagSessionValidation) {
        OtherConfig.flagSessionValidation = flagSessionValidation;
    }

    public static String getFlagSMTPActive() {
        return flagSMTPActive;
    }

    @Value("${flag.smtp.active}")
    private void setFlagSMTPActive(String flagSMTPActive) {
        OtherConfig.flagSMTPActive = flagSMTPActive;
    }

    public static String getFlagMaxCounter() {
        return flagMaxCounter;
    }

    @Value("${flag.max.counter.login}")
    private void setFlagMaxCounter(String flagMaxCounter) {
        OtherConfig.flagMaxCounter = flagMaxCounter;
    }

    public static String getFlagBcrypt() {
        return flagBcrypt;
    }

    @Value("${flag.bcrypts}")
    private void setFlagBcrypt(String flagBcrypt) {
        OtherConfig.flagBcrypt = flagBcrypt;
    }

    public static String getFlagTestDebug() {
        return flagTestDebug;
    }

    @Value("${flag.test.debug}")
    private void setFlagTestDebug(String flagTestDebug) {
        OtherConfig.flagTestDebug = flagTestDebug;
    }

    public static String getFlagLogging() {
        return flagLogging;
    }

    @Value("${flag.logging}")
    private void setFlagLogging(String flagLogging) {
        this.flagLogging = flagLogging;
    }

}