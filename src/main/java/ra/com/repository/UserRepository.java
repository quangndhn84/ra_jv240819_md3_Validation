package ra.com.repository;

import ra.com.model.User;

public interface UserRepository {
    boolean save(User user);
}
