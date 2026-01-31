// Package removed to match directory structure

// NOTE: Requires Mockito (org.mockito:mockito-core) and JUnit 5
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

// 1. Dependency (The thing we want to fake)
interface Database {
    boolean save(String data);
}

// 2. Service (The thing we want to test)
class UserService {
    private Database database;

    public UserService(Database database) {
        this.database = database;
    }

    public String registerUser(String username) {
        if (database.save(username)) {
            return "Success";
        } else {
            return "Failure";
        }
    }
}

/**
 * Mockito Example.
 * Concept: We want to test 'UserService' WITHOUT relying on a real 'Database'.
 */
@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @Mock
    Database mockDatabase; // Creates a fake database object

    @InjectMocks
    UserService userService; // Injects the fake DB into the Service

    @Test
    void testRegisterUserSuccess() {
        // TEACH the mock what to do:
        // "When I call save("Alice"), return true."
        when(mockDatabase.save("Alice")).thenReturn(true);

        String result = userService.registerUser("Alice");

        assertEquals("Success", result);
        // Verify that the save method was actually called once
        verify(mockDatabase, times(1)).save("Alice");
    }
}
