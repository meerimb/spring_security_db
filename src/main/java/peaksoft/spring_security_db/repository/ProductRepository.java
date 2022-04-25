package peaksoft.spring_security_db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import peaksoft.spring_security_db.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}