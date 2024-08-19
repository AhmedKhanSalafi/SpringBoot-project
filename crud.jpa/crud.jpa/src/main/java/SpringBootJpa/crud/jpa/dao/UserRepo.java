package SpringBootJpa.crud.jpa.dao;

import SpringBootJpa.crud.jpa.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepo extends CrudRepository<User,Integer> {


    //custom finder method
public List<User> findByName(String name);

    public List<User> findByNameAndCity (String name,String city);





}

