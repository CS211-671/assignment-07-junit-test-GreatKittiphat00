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
        userList.addUser("user01", "pass01");
        userList.addUser("user02", "pass02");
        userList.addUser("user03", "pass03");


        // TODO: find one of them
        User user = userList.findUserByUsername("user02");


        // TODO: assert that UserList found User
        assertNotNull(user);
        assertEquals("user02", user.getUsername());

        // String expected = "<one of username>";
        // String actual = user.getUsername();
        // assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("user01", "pass01");
        userList.addUser("user02", "pass02");
        userList.addUser("user03", "pass03");


        // TODO: change password of one user
        boolean actual = userList.changePassword("user02", "pass02", "newPass02");


        // TODO: assert that user can change password
        assertTrue(actual);

        // assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("user01", "pass01");
        userList.addUser("user02", "pass02");
        userList.addUser("user03", "pass03");


        // TODO: call login() with correct username and password
        User user = userList.login("user02", "pass02");


        // TODO: assert that User object is found
        assertNotNull(user);
        assertEquals("user02", user.getUsername());

        // assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("user01", "pass01");
        userList.addUser("user02", "pass02");
        userList.addUser("user03", "pass03");


        // TODO: call login() with incorrect username or incorrect password
        User user = userList.login("user02", "wrongPassword");



        // TODO: assert that the method return null
        assertNull(user);

        // assertNull(actual);
    }

}