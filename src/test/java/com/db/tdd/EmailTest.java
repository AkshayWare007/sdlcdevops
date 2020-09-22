package com.db.tdd;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

class EmailTest {

    private static Email email;

    @BeforeClass
    public static void createEmailObjectForTest() {
        String emailId = "akshay.ware@gmail.com";
        String emailSubject = "Testing Email Client";
        String emailBody = "dfvbdgfvdhfugf/";
        List<Character> emailAttachment = Arrays.asList('A', 'B');

        email = new Email(emailId, emailSubject, emailBody, emailAttachment);
    }

    @AfterClass
    public static void deleteEmailObject() {
        email = null;
        System.gc();
    }

    @Test
    public void testValidEmailID() {
        assertTrue(email.getEmailId().contains("@gmail.com"));
    }

    //max 25 and not 0
    @Test
    public void testEmailSubjectLegth() {
        int length = email.getEmailSubject().length();
        assertTrue(length <= 25 && length!=0);
        assertNotNull(email.getEmailSubject());
    }

    @Test
    public void testSpecialCharInEmailSubject() {
        String specialChar = "[-/*&#_]";
        assertTrue(!email.getEmailSubject().matches(specialChar));
    }

    @Test
    public void testEmailBody() {
        //TODO
        //didn't understood what to do
    }

    @Test
    public void testEmailAttachmentLength() {
        assertTrue(email.getEmailAttachment().size() <= 100);
    }

    @Test(timeout = 1000)
    public void testSendMailMethod() {
        email.sendMail();
    }


}