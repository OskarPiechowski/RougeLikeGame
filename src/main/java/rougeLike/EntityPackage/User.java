package rougeLike.EntityPackage;

import rougeLike.PlayerPackage.AccountGender;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private int userId;
    @Column
    private String email;
    @Column(name = "user_password")
    private String password;
    @Column(name = "role_id")
    private int roleId;

    @Column
    @Enumerated(EnumType.STRING)
    private AccountGender gender;

    @OneToMany(mappedBy = "user")
    private List<UserCharacter> Characters;
    @ManyToMany
    @JoinTable(
            name = "user_role",
            joinColumns = {@JoinColumn (name = "user_id") },
            inverseJoinColumns = {@JoinColumn (name = "role_id")}
    )
    private List<Role> roles;

    public User() {
    }

    public User(String email, String password, AccountGender gender) {
        this.email = email;
        this.password = password;
        this.gender = gender;
    }

    public User(String email, String password, int roleId, AccountGender gender, List<Role> roles) {
        this.email = email;
        this.password = password;
        this.roleId = roleId;
        this.gender = gender;
        this.roles = roles;
    }

    public int getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public AccountGender getGender() {
        return gender;
    }

    public void setGender(AccountGender gender) {
        this.gender = gender;
    }


    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", roleId=" + roleId +
                ", gender=" + gender +
                ", character=" +
                ", roles=" + roles +
                '}';
    }
}
