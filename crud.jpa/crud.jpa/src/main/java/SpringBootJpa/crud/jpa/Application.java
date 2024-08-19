package SpringBootJpa.crud.jpa;

import SpringBootJpa.crud.jpa.dao.UserRepo;
import SpringBootJpa.crud.jpa.entity.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Application.class, args);

	UserRepo userRepo = context.getBean(UserRepo.class);


		//save users
//		User user = new User();
//		user.setName("ahmed");
//		user.setCity("hyderabad");
//		user.setStatus("online");
//
//User user1 = userRepo.save(user);
//		System.out.println(user1);
//
//		//update users

//		Optional<User> user2= userRepo.findById(1);
//		User user3 = user2.get();
//		System.out.println(user3);
//
//		user3.setName("mosli");
//
//		userRepo.save(user3);
//		System.out.println(user3);

		//how to get data
		//findbyId or findbyAll

//		Iterable<User> itr = userRepo.findAll();
//
//		itr.forEach(user -> System.out.println(user) );

		//delete users
//
//		userRepo.deleteById(52);
//		System.out.println("delete ");

//		//custom finder method
//List<User> users= userRepo.findByName("mosli");
//users.forEach(e -> System.out.println(e));

		List<User> users= userRepo.findByNameAndCity("mosli","hyderabad");
users.forEach(e -> System.out.println(e));



	}

}
