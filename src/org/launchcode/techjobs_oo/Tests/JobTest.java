package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    Job job1;
    Job job2;

    @Before
    public void createJobObjects() {
        job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void testSettingJobOneId() {
        assertTrue(job2.getId() - job1.getId() == 1);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertTrue(job1.getName() == "Product tester");
        assertTrue(job1.getEmployer() instanceof Employer);
        assertTrue(job1.getEmployer().getValue() == "ACME");
        assertTrue(job1.getLocation() instanceof Location);
        assertTrue(job1.getLocation().getValue() == "Desert");
        assertTrue(job1.getPositionType() instanceof PositionType);
        assertTrue(job1.getPositionType().getValue() == "Quality control");
        assertTrue(job1.getCoreCompetency() instanceof CoreCompetency);
        assertTrue(job1.getCoreCompetency().getValue() == "Persistence");
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(job1.equals(job2));
    }

    @Test
    public void testBlankLineAtStartAndEndOfToString() {
        assertTrue(job1.toString().startsWith("\n"));
        assertTrue(job1.toString().endsWith("\n"));

    }
}
