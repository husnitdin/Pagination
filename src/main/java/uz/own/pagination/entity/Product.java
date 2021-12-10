package uz.own.pagination.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "paging")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue
    private Long id;
    @io.swagger.annotations.ApiModelProperty(value = "name of the product")
    private String name;
    private Integer quantity;
    @io.swagger.annotations.ApiModelProperty(value = "1_000, 5_000, 10_000, 20_000, 50_000")
    private Long price;

    public Product(String name, int quantity, long price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
}
