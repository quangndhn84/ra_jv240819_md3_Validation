package ra.com.repository.imp;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ra.com.model.User;
import ra.com.repository.UserRepository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class UserRepositoryImp implements UserRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public boolean save(User user) {
        try {
            entityManager.persist(user);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
