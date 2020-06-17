package kr.ac.hansung.cse.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import kr.ac.hansung.cse.model.Product;

// Dao라고 하지 않고 Repository라는 인터페이스를 상속 받아 구현하면 product operation에 관한 메소드가 생성된다.
public interface ProductRepository extends CrudRepository<Product, Integer> { // Customer => Model의 Customer
																			  // Integer => model의 id type
	List<Product> findByCategory(String category);
}