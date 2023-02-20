package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private final static UserService userService = new UserServiceImpl();

    public static void main(String[] args) {
        userService.createUsersTable();
        System.out.println("������� ����");

        userService.saveUser("������������ 1", "�1", (byte) 22);
        userService.saveUser("������������ 2", "�2", (byte) 35);
        userService.saveUser("������������ 3", "�3", (byte) 85);
        userService.saveUser("������������ 4", "�4", (byte) 54);
        userService.removeUserById(2);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}