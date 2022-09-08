package cis1500_project3_alexanderhunt;

import org.junit.Test;
import static org.junit.Assert.*;

public class PlaneTest {

    public PlaneTest() {
    }
    
    @Test
    public void testConstructor() {
        //AAA
        //Arrange
        String expectedMake = "Boeing";
        String expectedModel = "747";
        int expectedNumber = 17842365;
        int expectedMaxAltitude = 12000;
        int expectedCurrentAltitude = 0;
        boolean expectedLandingGear = true;
        
        //Act
        Plane testPlane = new Plane(0, true);
        
        //Assert
        assertEquals(expectedMake, testPlane.getMake());
        assertEquals(expectedModel, testPlane.getModel());
        assertEquals(expectedNumber, testPlane.getNumber());
        assertEquals(expectedMaxAltitude, testPlane.getMaxAltitude());
        assertEquals(expectedCurrentAltitude, testPlane.getCurrentAltitude());
        assertEquals(expectedLandingGear, testPlane.isLandingGear());
    }

    @Test
    public void test1SetCurrentAltitudeBelow100SuccessWhileLandingGearEnabled() {
        //AAA
        //Arrange - Set up all the variables we need to test
        int changeInAltitude = 20;
        int expectedCurrentAltitude = 20;
        boolean expectedChangeAltitudeSuccess = true;
        Plane testPlane = new Plane(0, true);

        //Act - call the code we are testing
        assertEquals(expectedChangeAltitudeSuccess, testPlane.setCurrentAltitude(changeInAltitude));

        //Assert - did we get what we expect
        assertEquals(expectedCurrentAltitude, testPlane.getCurrentAltitude());

    }

    @Test
    public void test2SetCurrentAltitudeSuccessat100WhileLandingGearEnabled() {
        //AAA
        //Arrange - Set up all the variables we need to test
        int changeInAltitude = 100;
        int expectedCurrentAltitude = 100;
        boolean expectedChangeAltitudeSuccess = true;
        Plane testPlane = new Plane(0, true);

        //Act - call the code we are testing
        assertEquals(expectedChangeAltitudeSuccess, testPlane.setCurrentAltitude(changeInAltitude));

        //Assert - did we get what we expect
        assertEquals(expectedCurrentAltitude, testPlane.getCurrentAltitude());
    }

    @Test
    public void test3SetCurrentAltitudeSucessat100WhileLandingGearDisabled() {
        //AAA
        //Arrange - Set up all the variables we need to test
        int changeInAltitude = -100;
        int expectedCurrentAltitude = 100;
        boolean expectedChangeAltitudeSuccess = true;
        Plane testPlane = new Plane(200, false);

        //Act - call the code we are testing
        assertEquals(expectedChangeAltitudeSuccess, testPlane.setCurrentAltitude(changeInAltitude));

        //Assert - did we get what we expect
        assertEquals(expectedCurrentAltitude, testPlane.getCurrentAltitude());
    }

    @Test
    public void test4SetCurrentAltitudeSuccessAbove100WhileLandingGearDisabled() {
        //AAA
        //Arrange - Set up all the variables we need to test
        int changeInAltitude = 100;
        int expectedCurrentAltitude = 200;
        boolean expectedChangeAltitudeSuccess = true;
        Plane testPlane = new Plane(100, false);

        //Act - call the code we are testing
        assertEquals(expectedChangeAltitudeSuccess, testPlane.setCurrentAltitude(changeInAltitude));

        //Assert - did we get what we expect
        assertEquals(expectedCurrentAltitude, testPlane.getCurrentAltitude());
    }

    @Test
    public void test5SetCurrentAltitudeFailAbove100WhileLandingGearDisabled() {
        //AAA
        //Arrange - Set up all the variables we need to test
        int changeInAltitude = 100;
        int expectedCurrentAltitude = 100;
        boolean expectedChangeAltitudeSuccess = false;
        Plane testPlane = new Plane(50, false);

        //Act - call the code we are testing
        assertEquals(expectedChangeAltitudeSuccess, testPlane.setCurrentAltitude(changeInAltitude));

        //Assert - did we get what we expect
        assertEquals(expectedCurrentAltitude, testPlane.getCurrentAltitude());
    }

    @Test
    public void test6SetCurrentAltitudeFailBelow100WhileLandingGearDisabled() {
        //AAA
        //Arrange - Set up all the variables we need to test
        int changeInAltitude = -150;
        int expectedCurrentAltitude = 100;
        boolean expectedChangeAltitudeSuccess = false;
        Plane testPlane = new Plane(200, false);

        //Act - call the code we are testing
        assertEquals(expectedChangeAltitudeSuccess, testPlane.setCurrentAltitude(changeInAltitude));

        //Assert - did we get what we expect
        assertEquals(expectedCurrentAltitude, testPlane.getCurrentAltitude());
    }

    @Test
    public void test7SetCurrentAltitudeFailAboveMaximumAltitudeWhileLandingGearDisabled() {
        //AAA
        //Arrange - Set up all the variables we need to test
        int changeInAltitude = 500;
        int expectedCurrentAltitude = 1200;
        boolean expectedChangeAltitudeSuccess = false;
        Plane testPlane = new Plane(1000, false);

        //Act - call the code we are testing
        assertEquals(expectedChangeAltitudeSuccess, testPlane.setCurrentAltitude(changeInAltitude));

        //Assert - did we get what we expect
        assertEquals(expectedCurrentAltitude, testPlane.getCurrentAltitude());
    }

    @Test
    public void test8SetCurrentAltitudeFailBelowMinimumAltitudeWhileLandingGearEnabled() {
        //AAA
        //Arrange - Set up all the variables we need to test
        int changeInAltitude = -150;
        int expectedCurrentAltitude = 0;
        boolean expectedChangeAltitudeSuccess = false;
        Plane testPlane = new Plane(10, true);

        //Act - call the code we are testing
        assertEquals(expectedChangeAltitudeSuccess, testPlane.setCurrentAltitude(changeInAltitude));

        //Assert - did we get what we expect
        assertEquals(expectedCurrentAltitude, testPlane.getCurrentAltitude());
    }

    @Test
    public void test9SetCurrentAltitudeFailChangeBelow100WithLandingGearDisabled() {
        //AAA
        //Arrange - Set up all the variables we need to test
        int changeInAltitude = 10;
        int expectedCurrentAltitude = 100;
        boolean expectedChangeAltitudeSuccess = false;
        Plane testPlane = new Plane(10, false);

        //Act - call the code we are testing
        assertEquals(expectedChangeAltitudeSuccess, testPlane.setCurrentAltitude(changeInAltitude));

        //Assert - did we get what we expect
        assertEquals(expectedCurrentAltitude, testPlane.getCurrentAltitude());
    }

    @Test
    public void test10SetCurrentAltitudeFailChangeAbove100WithLandingGearEnabled() {
        //AAA
        //Arrange - Set up all the variables we need to test
        int changeInAltitude = 10;
        int expectedCurrentAltitude = 100;
        boolean expectedChangeAltitudeSuccess = false;
        Plane testPlane = new Plane(200, true);

        //Act - call the code we are testing
        assertEquals(expectedChangeAltitudeSuccess, testPlane.setCurrentAltitude(changeInAltitude));

        //Assert - did we get what we expect
        assertEquals(expectedCurrentAltitude, testPlane.getCurrentAltitude());
    }

    @Test
    public void test11SetLandingGearSucessFromTrueToFalse() {
        //AAA
        //Arrange -
        Plane testPlane = new Plane(100, true);
        boolean expectedLandingGear = false;
        boolean expectedLandingGearSuccess = true;

        //Act - 
        assertEquals(expectedLandingGearSuccess, testPlane.setLandingGear());

        //Assert - 
        assertEquals(expectedLandingGear, testPlane.isLandingGear());
    }

    @Test
    public void test12SetLandingGearSucessFromFalseToTrue() {
        //AAA
        //Arrange -
        Plane testPlane = new Plane(100, false);
        boolean expectedLandingGear = true;
        boolean expectedLandingGearSuccess = true;

        //Act - 
        assertEquals(expectedLandingGearSuccess, testPlane.setLandingGear());

        //Assert - 
        assertEquals(expectedLandingGear, testPlane.isLandingGear());
    }
    
    @Test
    public void test13SetLandingGearFailFromTrueToFalse() {
        //AAA
        //Arrange -
        Plane testPlane = new Plane(50, true);
        boolean expectedLandingGear = true;
        boolean expectedLandingGearSuccess = false;

        //Act - 
        assertEquals(expectedLandingGearSuccess, testPlane.setLandingGear());

        //Assert - 
        assertEquals(expectedLandingGear, testPlane.isLandingGear());
    }
    
    @Test
    public void test14SetLandingGearFailFromFalseToTrue() {
        //AAA
        //Arrange -
        Plane testPlane = new Plane(150, false);
        boolean expectedLandingGear = false;
        boolean expectedLandingGearSuccess = false;

        //Act - 
        assertEquals(expectedLandingGearSuccess, testPlane.setLandingGear());

        //Assert - 
        assertEquals(expectedLandingGear, testPlane.isLandingGear());
    }

}
