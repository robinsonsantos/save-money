package com.example.robinson.save_money.data;

import android.provider.BaseColumns;

/**
 * Created by robinson on 22/03/17.
 */

public class SaveMoneyContract {

    public static final class SaveMoneyEntry implements BaseColumns {

        public static final String TABLE_NAME = "saveMoney";

        public static final String COLUMN_SPENT_DESCRIPTION = "spentDescription";

        public static final String COLUMN_TIMESTAMP = "timestamp";

        public static final String COLUMN_SPENT_VALUE = "spentValue";



    }
}
