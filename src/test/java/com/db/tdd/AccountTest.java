package com.db.tdd;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by Akshay on 22-09-2020.
 */
public class AccountTest {
    @BeforeClass
    public static void beforeAllTests() {
//        global cleanup
        //database script and create testing data
        System.out.println("Runs once before all tests");
    }

    @AfterClass
    public static void afterAllTests() {
        //global cleanup
        //remove all testing data
        System.out.println("Runs once after all tests");
    }

    @Before
    public void beforeTest() {
        //Start hook
        System.out.println("This will execute before every single test");
    }

    @After
    public void afterTest() {
        //end hook
        //cleanup
        //deletion
        //or remove your test footprint i.e delete all the duplicate account that u have created for the testing purpose
        System.out.println("This will execute after every single test");
    }

    @Test
    public void testCreateAccount() {
        Account account = new Account();
        assertNotNull(account);
    }

    @Test
    @Ignore
    public void testAccountIDNotNull() {
        Account account = new Account();
        Object expected = account.getAccountId();
        assertNotNull(expected);

    }

    @Test
    public void testAccountIDLength() {
        Account account = new Account();
        int expectedLength = 10;
        int actualLength = 0;
        long actualAccountid = account.getAccountId();
        System.out.println(actualAccountid);
        while (actualAccountid != 0) {
            actualAccountid /= 10;
            actualLength++;
        }
        assertEquals(expectedLength, actualLength);
    }

    @Test(expected = Exception.class)
    public void testAccountIDShorterLength() {
        fail();
    }

    @Test
    public void testAccountNonNegative() {
        Account account = new Account();
        assertTrue(account.getAccountId() > 0);
    }

    @Test
    public void testAccountStartWith9() {
        Account account = new Account();
        assertTrue((account.getAccountId() + "").startsWith("9"));
    }

    @Test
    public void testAccountIDAsImmutable() {
        Account account = new Account();
        long originalId = account.getAccountId();
        long anotherAccountID = account.getAccountId();
        assertEquals(originalId, anotherAccountID);
    }
}

