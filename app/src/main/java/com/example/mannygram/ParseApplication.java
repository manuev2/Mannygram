package com.example.mannygram;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("S6kt4mr1ex2YCG1AxYGKcbtOkWh0lM1h56y7qtaL")
                .clientKey("ktwqsvgPzVksb8uYev5QG0TDq6ZABJsLyCBmSU0J")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
