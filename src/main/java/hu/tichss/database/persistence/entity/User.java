package hu.tichss.database.persistence.entity;

import javax.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = (User.TABLE_NAME))
public class User {

    public static final String TABLE_NAME = "users";
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

}
