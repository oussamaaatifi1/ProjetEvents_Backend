package coma;

import com.banksystem.projeteventbackend.model.User;
import com.banksystem.projeteventbackend.repository.UserRepository;
import com.banksystem.projeteventbackend.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.mockito.Mockito.*;

public class UserServiceTest {

	@Mock
	private UserRepository userRepository;

	@InjectMocks
	private UserService userService;

	@BeforeEach
	public void setUp() {
		MockitoAnnotations.openMocks(this);
	}

	@Test
	public void testDeleteUser() {

		Long userId = 1L;
		User user = new User();
		user.setId(Math.toIntExact(userId));

		when(userRepository.findById(userId)).thenReturn(Optional.of(user));

		userService.deleteUser(userId);


		verify(userRepository, times(1)).deleteById(userId);
	}
}
