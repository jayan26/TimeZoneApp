package com.fantastic4.timezone.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TimeZoneControllerTest {

    @Mock
    private TimeZoneController timeZoneController;

    @Before
    public void setUp(){
        when(timeZoneController.timeZoneController()).thenReturn("jayan");
    }

    @Test
    public void timeZoneController(){
        assertEquals(timeZoneController.timeZoneController(),"jayan");
    }

}
