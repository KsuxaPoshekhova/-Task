import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TodosTest {
    @Test
    public void shouldAddThreeTasksOfDifferentType() {
        SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        Todos todos = new Todos();

        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);

        Task[] expected = {simpleTask, epic, meeting};
        Task[] actual = todos.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testTodos() {
        SimpleTask simpleTask = new SimpleTask(5, "Незабыть Молоко");

        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        Todos todos = new Todos();

        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);

        Task[] actual = todos.search("Молоко") ;
        Task[] expected = {simpleTask, epic};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testTodos0() {
        SimpleTask simpleTask = new SimpleTask(5, "Незабыть Молоко");

        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        Todos todos = new Todos();

        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);

        Task[] actual = todos.search("Незабыть") ;
        Task[] expected = {simpleTask};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testTodos3() {
        SimpleTask simpleTask = new SimpleTask(5,"В СРЕДУ ПОСЛЕ ОБЕДА" );

        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        Todos todos = new Todos();

        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);

        Task[] actual = todos.search("СРЕДУ") ;
        Task[] expected = { simpleTask  };

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testTodos4() {
        SimpleTask simpleTask = new SimpleTask(5,"Zaregistrirovatca v ankete" );

        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        Todos todos = new Todos();

        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);

        Task[] actual = todos.search("Zaregistrirovatca v ankete") ;
        Task[] expected = { simpleTask };

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testTodos5() {
        SimpleTask simpleTask = new SimpleTask(5,"Купить Соль"  ) ;

        String[] subtasks = {"Salt", "Eggs", "Bread"};
        Epic epic = new Epic(55, subtasks);

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        Todos todos = new Todos();

        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);

        Task[] actual = todos.search("Eggs") ;
        Task[] expected = { epic };

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testTodos7() {
        SimpleTask simpleTask = new SimpleTask(5,"  83773272323 Соль"  ) ;

        String[] subtasks = {"Соль", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        Todos todos = new Todos();

        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);

        Task[] actual = todos.search("83773272323 Соль") ;
        Task[] expected = { simpleTask  };

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testTodos6() {
        SimpleTask simpleTask = new SimpleTask(5,":?%:?;;;5"  ) ;

        String[] subtasks = {"Мука", "568779", ":?%:?;;;5"};
        Epic epic = new Epic(55, subtasks);

        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда"
        );

        Todos todos = new Todos();

        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);

        Task[] actual = todos.search(":?%:?;;;5") ;
        Task[] expected = { simpleTask ,epic  };

        Assertions.assertArrayEquals(expected, actual);
    }
}


