import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testTask1() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean actual = simpleTask.matches("родителям");
        Assertions.assertTrue(actual);
    }

    @Test
    public void testTask2() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        boolean actual = simpleTask.matches("4552");
        Assertions.assertFalse(actual);
    }

    @Test
    public void testTaskMeeting1 () {
        Meeting meeting = new Meeting(  555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда") ;

        boolean actual= meeting.matches( "ВО ВТОРНИК ПОСЛЕ ОБЕДА ");
        boolean expected = false  ;
        Assertions.assertEquals(expected ,actual ) ;
    }
    @Test
    public void testTaskEpic1() {
        Epic epic = new Epic(55, new String[]{"Алена"});

        boolean actual = epic.matches("Алёна");
        Assertions.assertFalse(actual) ;
    }
}

