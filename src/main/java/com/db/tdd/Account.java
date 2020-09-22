package com.db.tdd;

import java.util.Random;

/**
 * Created by Akshay on 22-09-2020.
 */
public class Account {
    private long accountId;

    public Account() {
        //TODO create another logic for account id creation
        this.accountId = new Random().nextInt();
    }

    public long getAccountId() {
        return accountId;
    }
}
