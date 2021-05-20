package JobTest;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobsTests {

        public Job frontEndJobOfYourDreams;
        public Job serverManager;
        public Job codeMonkey;
        public Job nothingInFields;

        @Before
        public void testJobsConstructor() {
                frontEndJobOfYourDreams= new Job("Web Developer", new Employer("LaunchCode"),
                        new Location("St. Louis"), new PositionType("Front-end developer"),
                        new CoreCompetency("JavaScript"));
                serverManager = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                        new PositionType("Quality control"), new CoreCompetency("Persistence"));
                codeMonkey = new Job("Ice cream taster", new Employer(""),
                        new Location("Home"), new PositionType("UX"), new CoreCompetency("Taste"));
                nothingInFields = new Job("", new Employer(""), new Location(""),
                        new PositionType(""), new CoreCompetency(""));
        }

        @Test
        public void testSettingJobId() {
        assertEquals(frontEndJobOfYourDreams.getId() + 1, serverManager.getId());
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
        public void testToStringForBlankLines() {
                Job job = frontEndJobOfYourDreams;
                assertEquals('\n', job.toString().charAt(0));
                assertEquals('\n', job.toString().charAt(job.toString().length() - 1));
        }

        @Test
        public void testToStringWithBlankLinesAndLabelsAndInfo() {
                Job job = frontEndJobOfYourDreams;
                assertEquals("\nID: " + job.getId()+ "\nName: Web Developer\nEmployer: LaunchCode\n" +
                        "Location: St. Louis\nPosition Type: Front-end developer\nCore Competency: JavaScript\n"
                        , job.toString());
        }

        @Test
        public void testEmployerForEmptyString() {
                Job job = codeMonkey;
                assertEquals("\nID: " + job.getId()+ "\nName: Ice cream taster\nEmployer: Data not " +
                        "available\nLocation: Home\nPosition Type: UX\nCore Competency: " +
                        "Taste\n", job.toString());
        }

        @Test
        public void testForIdIsOnly() {
                Job job = nothingInFields;
                assertEquals("OOPS! This job does not seem to exist.", job.toString());
        }


}
