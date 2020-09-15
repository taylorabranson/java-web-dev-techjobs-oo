package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    @Test
    public void testSettingJobOneId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertTrue(job2.getId() - job1.getId() == 1);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(job3.getName() == "Product tester");
        assertTrue(job3.getEmployer() instanceof Employer);
        assertTrue(job3.getEmployer().getValue() == "ACME");
        assertTrue(job3.getLocation() instanceof Location);
        assertTrue(job3.getLocation().getValue() == "Desert");
        assertTrue(job3.getPositionType() instanceof PositionType);
        assertTrue(job3.getPositionType().getValue() == "Quality control");
        assertTrue(job3.getCoreCompetency() instanceof CoreCompetency);
        assertTrue(job3.getCoreCompetency().getValue() == "Persistence");
    }

    @Test
    public void testJobsForEquality() {
        Job job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(job4.equals(job5));
    }
}
