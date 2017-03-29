package com.example.robinson.save_money.data;

import android.provider.BaseColumns;

/**
 * Created by robinson on 22/03/17.
 */

public final class SaveMoneyContract {

    // To prevent someone from accidentally instantiating the contract class,
    // make the constructor private.
    private SaveMoneyContract() {}

    /* Inner class that defines the table contents */
    public static final class SaveMoneyEntry implements BaseColumns {

        public static final String TABLE_NAME = "saveMoney";
        public static final String COLUMN_SPENT_DESCRIPTION = "spentDescription";
        public static final String COLUMN_TIMESTAMP = "timestamp";
        public static final String COLUMN_SPENT_VALUE = "spentValue";

    }
}
