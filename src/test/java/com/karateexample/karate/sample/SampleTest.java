package com.karateexample.karate.sample;

import com.intuit.karate.junit5.Karate;

public class SampleTest {
    @Karate.Test
    Karate test() {
        return Karate.run("sample").relativeTo(getClass());
    }
}
