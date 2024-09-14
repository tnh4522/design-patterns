package org.example;

import org.example.Singleton.DatabaseConnection;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection db = DatabaseConnection.getInstance();

        System.out.println("Cập nhật thông tin sinh viên:");
        int rowsAffected = db.update("UPDATE students\n" +
                "SET email = 'newemail@example.com', phone = '01234567890'\n" +
                "WHERE student_id = 1;\n");

        if(rowsAffected > 0) {
            System.out.println("Cập nhật sinh viên thành công. Số hàng bị ảnh hưởng: " + rowsAffected);
        } else {
            System.out.println("Cập nhật sinh viên thất bại.");
        }

        System.out.println("Danh sách sinh viên:");
        db.query("SELECT * FROM students;");

        db.close();
    }
}