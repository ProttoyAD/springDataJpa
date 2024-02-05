package com.prottoy.springDataJpa;

import com.prottoy.springDataJpa.entity.User;
import com.prottoy.springDataJpa.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.stream.Stream;

@SpringBootTest
class SpringDataJpaApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Test
	void saveUser() {
		User user=new User();
		user.setUsername("prottoy");
		user.setEmail("protoyadhusher@gmail.com");

		User user2=new User();
		user2.setUsername("dhusher");
		user2.setEmail("dhusher@gmail.com");

		User savedUpser=userRepository.save(user);
		userRepository.save(user2);
		System.out.println("Results -----------------------");
		System.out.println(savedUpser.getId());
		System.out.println(user.toString());

		System.out.println("Update--------------------------");

		User getUser=userRepository.findById(1L).get();
		System.out.println(getUser.toString());


		System.out.println("Save All----------------------");

		User user3=new User();
		user3.setUsername("prottoy001");
		user3.setEmail("protoyadhusher@gmail.com");

		User user4=new User();
		user4.setUsername("dhusher001");
		user4.setEmail("dhusher@gmail.com");


		userRepository.saveAll(List.of(user3,user4));


//		List<User> allUser=userRepository.findAll();
//		System.out.println("All names--------------");
//		allUser.forEach(System.out::println);
//		long count=userRepository.count();



//		allUser.forEach(s->{
////			System.out.println("Username:");
//			System.out.println("Username: "+s.getUsername());
//		});
//
////		To delete specified object
//		userRepository.deleteAll(List.of(user3,user4));
////		To delete all
//		userRepository.deleteAll();
//		userRepository.delete(user3);
//		userRepository.deleteById(1L);
	}

}
