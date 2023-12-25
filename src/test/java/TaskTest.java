import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void testTask() {
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
    public void testTaskEpic1() {
        Epic epic = new Epic(55, new String[]{"13%№№№%:%:?:**?*"});

        boolean actual = epic.matches("13%№№№%:%:?:**?*");
        Assertions.assertTrue(actual);
    }

    @Test
    public void testTaskEpic2() {
        Epic epic = new Epic(55, new String[]{"Яйца"});

        boolean actual = epic.matches("Eggs");
        Assertions.assertFalse(actual);
    }
    @Test
    public void testTaskEpic9() {
        Epic epic = new Epic(55, new String[]{"                 "});

        boolean actual = epic.matches("               ");
        Assertions.assertTrue(actual) ;
    }
    @Test
    public void testTaskMeeting () {
        Meeting meeting = new Meeting(  555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда") ;

        boolean actual= meeting.matches( "приложения");
        boolean expected = true ;
         Assertions.assertEquals(expected ,actual ) ;
    }
    @Test
    public void testTaskMeeting2 () {
        Meeting meeting = new Meeting(  555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда") ;

        boolean actual= meeting.matches( "Приложение ВтбБанка");
        boolean expected = false  ;
        Assertions.assertEquals(expected ,actual ) ;
    }
    @Test
    public void testTaskMeeting3 () {
        Meeting meeting = new Meeting(  555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда") ;

        boolean actual= meeting.matches( "Prilochenie NetoBanka");
        boolean expected = false ;
        Assertions.assertEquals(expected ,actual ) ;
    }
    @Test
    public void testTaskMeeting4 () {
        Meeting meeting = new Meeting(  555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда") ;

        boolean actual= meeting.matches( "84гругар&897ujk.../");
        boolean expected = false ;
        Assertions.assertEquals(expected ,actual ) ;
    }
    @Test
    public void testTaskMeeting5 () {
        Meeting meeting = new Meeting(  555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда") ;

        boolean actual= meeting.matches( "ВО ВТОРНИК ПОСЛЕ ОБЕДА ");
        boolean expected = false  ;
        Assertions.assertEquals(expected ,actual ) ;
    }
    @Test
    public void testTaskMeeting6 () {
        Meeting meeting = new Meeting(  555,
                "Жанна Д`арк",
                "Приложение НетоБанка",
                "Во вторник после обеда") ;

        boolean actual= meeting.matches( "Жанна Д`арк");
        boolean expected = true  ;
        Assertions.assertEquals(expected ,actual ) ;
    }
    @Test
    public void testTaskEpic7() {
        Epic epic = new Epic(55, new String[]{"Алена"});

        boolean actual = epic.matches("Алёна");
        Assertions.assertFalse(actual) ;
    }
    @Test
    public void testTaskEpic8() {
        Epic epic = new Epic(55, new String[]{"Иосиф- Йося"});

        boolean actual = epic.matches("Иосиф- Йося");
        Assertions.assertTrue(actual) ;
    }
}

