package repository;

import com.example.demo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long>, JpaSpecificationExecutor<User> {

    List<User> findAll();
}
