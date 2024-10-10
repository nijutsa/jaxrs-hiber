package gr.aueb.cf.schoolapp.authentication;


import gr.aueb.cf.schoolapp.dao.IUserDAO;
import gr.aueb.cf.schoolapp.dto.UserLogInDTO;
import gr.aueb.cf.schoolapp.service.IUserService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import lombok.RequiredArgsConstructor;

@ApplicationScoped
@RequiredArgsConstructor(onConstructor = @__(@Inject) )
public class AuthenticationProvider {

    private final IUserService userService;

    public boolean authenticate(UserLogInDTO logInDTO) {
        return userService.isUserValid(logInDTO.getUsername(), logInDTO.getPassword());
    }


}
