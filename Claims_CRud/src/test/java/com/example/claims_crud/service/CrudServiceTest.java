package com.example.claims_crud.service;


import org.junit.Before;
import org.junit.Assert;
import org.junit.Test;

public class CrudServiceTest {

    CrudService testCrudService;

    @Before
    public void setUpCrudService() {
        testCrudService = new CrudService();
    }

    @Test
    public void testOpen() {
        Assert.assertEquals("open value must be 1", 1, testCrudService.getClaims());
    }


}
