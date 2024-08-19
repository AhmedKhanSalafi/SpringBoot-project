package springBoot.Dto.dto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springBoot.Dto.dto.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User,Integer> {


}

