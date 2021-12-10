package uz.own.pagination.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import uz.own.pagination.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
