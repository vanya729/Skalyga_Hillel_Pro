package lessons21.Connection;

import lessons21.dataClass.Lesson;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class LessonDao {

    private Connection connection;

    public LessonDao() {
        try {
            connection = DataBaseConnection.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addLesson(Lesson lesson) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "INSERT INTO lesson (name, homework_id) VALUES (?, ?)"
            );
            preparedStatement.setString(1, lesson.getName());
            preparedStatement.setInt(2, lesson.getHomework_id());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public boolean deleteLesson(int id) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "DELETE FROM lesson WHERE id = ?"
            );
            preparedStatement.setInt(1, id);
            int numRowsDeleted = preparedStatement.executeUpdate();
            return numRowsDeleted > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Lesson> getAllLessons() {
        List<Lesson> lessonList = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM lesson");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int homeworkId = resultSet.getInt("homework_id");
                lessonList.add(new Lesson(id, name, homeworkId));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lessonList;
    }

    public Lesson getLessonById(int id) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "SELECT * FROM lesson WHERE id = ?"
            );
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                String name = resultSet.getString("name");
                int homeworkId = resultSet.getInt("homework_id");
                return new Lesson(id, name, homeworkId);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void closeConnection() {
        DataBaseConnection.close(connection);
    }
}
