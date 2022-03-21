package hu.tichss.database.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = (User.TABLE_NAME))
public class User {

    public static final String TABLE_NAME = "users";
    @Id
    private Long id;

}
