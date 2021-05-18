package JobTest;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobsTests {

        public Job frontEndJobOfYourDreams;
        public Job serverManager;

        @Before
        public void initialize() {
            frontEndJobOfYourDreams = new Job("Ice cream taster", new Employer(""),
                    new Location("Home"), new PositionType("UX"), new CoreCompetency("Taste"));
            serverManager = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                    new PositionType("Quality control"), new CoreCompetency("Persistence"));
        }

        @Test
        public void testSettingJobId() {
        assertEquals(frontEndJobOfYourDreams.getId() + 1, serverManager.getId());
        }

        @Test
        public void testJobConstructorSetsAllFields() {
                Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                        new PositionType("Quality Control"), new CoreCompetency("Persistence"));
                assertEquals("Product tester", job.getName());
                assertTrue(job.getEmployer() instanceof Employer);
                assertEquals("ACME", job.getEmployer().toString());
                assertTrue(job.getLocation() instanceof Location);
                assertEquals("Desert", job.getLocation().toString());
                assertTrue(job.getPositionType() instanceof PositionType);
                assertEquals("Quality Control", job.getPositionType().toString());
                assertTrue(job.getCoreCompetency() instanceof CoreCompetency);
                assertEquals("Persistence", job.getCoreCompetency().toString());
        }
        @Test
        public void testJobsForEquality() {
                assertFalse(frontEndJobOfYourDreams.equals(serverManager));
        }




}
