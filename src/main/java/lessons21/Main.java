package lessons21;

import lessons21.Connection.LessonDao;
import lessons21.dataClass.Lesson;

public class Main {
    public static void main(String[] args) {
        LessonDao lessonDao = new LessonDao();

        Lesson lesson1 = new Lesson(1, "History", 101);
        lessonDao.addLesson(lesson1);

        lessonDao.deleteLesson(2);

        System.out.println("All lessons list: ");
        for (Lesson lesson : lessonDao.getAllLessons()){
            System.out.println(lesson);
        }
        int id = 51;
        System.out.println("num lesson №"+id+"----->" +lessonDao.getLessonById(51));

        lessonDao.closeConnection();

    }
}
