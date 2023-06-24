package org.maven.study;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        String json = new Gson().toJson(new User("Igor", "Petrenko"));
        System.out.println(json);
    }
}
