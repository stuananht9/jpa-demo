package assignmentspringjpa;

import config.SpringConfig;
import entity.BookEntity;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import repositories.CustomerRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

/**
 * Created by tuananh on 06/03/17.
 */
public class Main {
    public static final String UNIT_NAME = "bookUnit";

    public static void main(String[] args) {
//        EntityManagerFactory entityManagerFactory =
//                Persistence.createEntityManagerFactory(UNIT_NAME);
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//
//        entityManager.getTransaction().begin();

        ApplicationContext context =
                new AnnotationConfigApplicationContext(SpringConfig.class);
        CustomerRepository customerRepository =
                (CustomerRepository)context.getBean("customerRepository");

        BookEntity bookEntity = new BookEntity();
        bookEntity.setName("JAVA A-Z");
        bookEntity.setPrice(6.5);
        bookEntity.setAuthor("Roger");

        customerRepository.save(bookEntity);

        List<BookEntity> bookEntityList =
                (List<BookEntity>)customerRepository.findAll();

        for (BookEntity book : bookEntityList){
            System.out.println("=====================");
            System.out.println(book.getId());
            System.out.println(book.getName());
            System.out.println(book.getPrice());
            System.out.println(book.getAuthor());
        }
//        entityManager.persist(employee);
//        entityManager.getTransaction().commit();  Cái này chả biết
//        entityManager.close();

        // Update
        // buoc 1: tim entity co id = 1;
//        BookEntity bookEntity1 = customerRepository.findOne(1);
//        if (bookEntity1 != null){
//            bookEntity.setAuthor("Tuan Anh");
//            customerRepository.save(bookEntity1);
        }

    }

