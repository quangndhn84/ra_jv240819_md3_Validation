package ra.com.service.imp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ra.com.model.User;
import ra.com.repository.UserRepository;
import ra.com.service.UserService;

@Service
public class UserServiceImp implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public boolean save(User user) {
        user.setStatus(true);
        return userRepository.save(user);
    }
}
