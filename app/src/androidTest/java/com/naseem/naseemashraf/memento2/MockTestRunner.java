package com.naseem.naseemashraf.memento2;

import android.app.Application;
import android.content.Context;

import androidx.test.runner.AndroidJUnitRunner;

public class MockTestRunner extends AndroidJUnitRunner {
    @Override
    public Application newApplication(ClassLoader cl, String className, Context context)
            throws InstantiationException, IllegalAccessException, ClassNotFoundException {
        return super.newApplication(cl, MyMockApplication.class.getName(), context);
    }
}