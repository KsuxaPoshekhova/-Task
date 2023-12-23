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

        boolean actual = simpleTask.matches("бабушке");
        Assertions.assertFalse(actual);
    }

    @Test
    public void testTaskEpic1() {
        Epic epic = new Epic(55, new String[]{"Яйца"});

        boolean actual = epic.matches("Яйца");
        Assertions.assertTrue(actual);
    }

    @Test
    public void testTaskEpic2() {
        Epic epic = new Epic(55, new String[]{"Молоко"});

        boolean actual = epic.matches("Горчица");
        Assertions.assertFalse(actual);
    }
    @Test
    public void testTaskMeeting () {
        Meeting meeting = new Meeting(557,"Обновление приложения",  "Новое фитнес приложение","После завтрака") ;

        boolean actual= meeting.matches( "Обновление приложения");
        boolean expected = true ;
         Assertions.assertEquals(expected ,actual ) ;
    }
    @Test
    public void testTaskMeeting2 () {
        Meeting meeting = new Meeting(557,"Обновление приложения",  "Новое фитнес приложение","После завтрака") ;

        boolean actual= meeting.matches( "Приложение НетоБанка");
        boolean expected = false  ;
        Assertions.assertEquals(expected ,actual ) ;
    }
    @Test
    public void testTaskMeeting3 () {
        Meeting meeting = new Meeting(557,"Обновление приложения",  "Новое фитнес приложение","После завтрака") ;

        boolean actual= meeting.matches( "После завтрака");
        boolean expected = false    ;
        Assertions.assertEquals(expected ,actual ) ;
    }
}
