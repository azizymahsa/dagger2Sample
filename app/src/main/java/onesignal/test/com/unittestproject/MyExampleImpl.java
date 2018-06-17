package onesignal.test.com.unittestproject;

import java.util.Date;

class MyExampleImpl implements MyExample {

    private long mDate;

    MyExampleImpl() {
        mDate = new Date().getTime();
    }

    public long getDate() {
        return mDate;
    }

}