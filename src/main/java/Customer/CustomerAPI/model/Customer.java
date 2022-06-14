package Customer.CustomerAPI.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Customer")
@Getter
@Setter
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "name")
    private String Name;
    @Column(name = "description")
    private String Description;

    @CreationTimestamp
    private Date createdAt;
    @CreationTimestamp
    private Date updatedDate;


}
