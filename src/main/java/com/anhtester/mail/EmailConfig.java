/*
 * Copyright (c) 2022.
 * Automation Framework Selenium - Anh Tester
 */

package com.anhtester.mail;

import com.anhtester.constants.FrameworkConstants;

/**
 * Data for Sending email after execution
 */
public class EmailConfig {

    //Nhớ tạo mật khẩu app (App Password) cho Gmail mới gửi được nhen
    //Nếu dùng mail của Hosting thì bình thường
    //Enable Override Report and Send mail in config file => src/test/resources/config/config.properties
    //OVERRIDE_REPORTS=yes
    //send_email_to_users=yes

    //public static final String SERVER = "smtp.gmail.com"; //smtp.mail.yahoo.com
    public static final String SERVER = "smtp.mail.yahoo.com"; //smtp.mail.yahoo.com
    public static final String PORT = "587";//465 587

    public static final String FROM = "engineer_sumit@yahoo.com";//engineer_sumit@yahoo.com
    public static final String PASSWORD = ""; //use ur own email passkey

    public static final String[] TO = {"Sumit.engineer@gmail.com"};
    public static final String SUBJECT = FrameworkConstants.PROJECT_NAME;
}
