package com.pritamCode;
import jakarta.persistence.Entity;

import javax.annotation.processing.Generated;
import java.util.Objects;

@Entity
public class Customer {
    private  Integer id;
    private  String name;
    private  String email;
    private  Integer age;

    @Id
    @sequenceGenerator(
            name = "customer_id_sequence",
            sequenceName = "Customer_id_sequence"
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "customer_id_sequence"
    )
    public  Customer(
    Integer id,
    String name,
    String email,
    Integer age
    )
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public Customer()
    {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id) && Objects.equals(name, customer.name) && Objects.equals(email, customer.email) && Objects.equals(age, customer.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, age);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                '}';
    }
}
