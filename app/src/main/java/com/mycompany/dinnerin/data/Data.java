package com.mycompany.dinnerin.data;

/**
 * Created by anders on 22-Feb-16.
 */
public class Data {

    public static boolean TEST = true;

    private static Data ourInstance = new Data();

    public static Data getInstance() {
        return ourInstance;
    }

    private Data() {
    }
}
