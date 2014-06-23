package com.chrisjansen;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/**
 * Created by Chris on 6/23/2014.
 */
public class UniqueIdTest {

    UniqueId uniqueId=null;

    @BeforeMethod
    public void loadObjects(){
          uniqueId=new UniqueId();
    }

    @Test (invocationCount = 1000, threadPoolSize = 10)
    public void createUniqueIds() {
        String idAsString=uniqueId.getStringId();
        assertTrue(idAsString!=null);
    }
}
