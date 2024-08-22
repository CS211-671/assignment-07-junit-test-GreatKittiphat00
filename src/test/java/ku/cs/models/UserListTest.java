package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        User u1 = new User("John", "Doe");
        User u2 = new User("Jane", "Doe");
        User u3 = new User("Jack", "Doe");
        userList.addUser("John", "plain-p@ssw0rd");
        userList.addUser("Jane", "plain-p@ssw0rd");
        userList.addUser("Jack", "plain-p@ssw0rd");

        // TODO: find one of them
        User foundUser = userList.findUserByUsername("John");

        // TODO: assert that UserList found User
        String expected = "John Jane";
        String actual = foundUser.getUsername();
        assertEquals(expected, actual);
        // String expected = "<one of username>";
        // String actual = user.getUsername();
        // assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        User u1 = new User("John", "Doe");
        User u2 = new User("Jane", "Doe");
        User u3 = new User("Jack", "Doe");

        // TODO: change password of one user


        // TODO: assert that user can change password

        // assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        User u1 = new User("John", "plain-p@ssw0rd");
        User u2 = new User("Jane", "plain-p@ssw0rd");
        User u3 = new User("Jack", "plain-p@ssw0rd");

        // TODO: call login() with correct username and password

        // TODO: assert that User object is found
        // assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        User u1 = new User("John", "plain-p@ssw0rd");
        User u2 = new User("Jane", "plain-p@ssw0rd");
        User u3 = new User("Jack", "plain-p@ssw0rd");

        // TODO: call login() with incorrect username or incorrect password

        // TODO: assert that the method return null
        // assertNull(actual);
    }

}