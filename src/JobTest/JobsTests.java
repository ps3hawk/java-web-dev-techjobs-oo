package JobTest;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobsTests {

        public Job frontEndJobOfYourDreams;
        public Job serverManager;
        public Job codeMonkey;

        @Before
        public void testJobsConstructor() {
            codeMonkey = new Job("Ice cream taster", new Employer(""),
                    new Location("Home"), new PositionType("UX"), new CoreCompetency("Taste"));
            serverManager = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                    new PositionType("Quality control"), new CoreCompetency("Persistence"));
                frontEndJobOfYourDreams= new Job("Web Developer", new Employer("LaunchCode"),
                        new Location("St. Louis"), new PositionType("Front-end developer"),
                        new CoreCompetency("JavaScript"));
        }

        @Test
        public void testSettingJobId() {
        assertEquals(codeMonkey.getId() + 1, serverManager.getId());
        }

        @Test
        public void testJobConstructorSetsAllFields() {
                Job job = serverManager;
                assertEquals("Product tester", job.getName());
                assertTrue(job.getEmployer() instanceof Employer);
                assertEquals("ACME", job.getEmployer().toString());
                assertTrue(job.getLocation() instanceof Location);
                assertEquals("Desert", job.getLocation().toString());
                assertTrue(job.getPositionType() instanceof PositionType);
                assertEquals("Quality control", job.getPositionType().toString());
                assertTrue(job.getCoreCompetency() instanceof CoreCompetency);
                assertEquals("Persistence", job.getCoreCompetency().toString());
        }

        @Test
        public void testJobsForEquality() {
                assertFalse(frontEndJobOfYourDreams.equals(serverManager));
        }

        @Test
        public void testToStringForLabelsAndFields() {
                Job job = frontEndJobOfYourDreams;
                assertEquals("\nID: " + job.getId()+ "\nName: Web Developer\nEmployer: LaunchCode\n" +
                        "Location: St. Louis\nPosition Type: Front-end developer\nCore Competency: JavaScript\n"
                        , job.toString());
        }





}
