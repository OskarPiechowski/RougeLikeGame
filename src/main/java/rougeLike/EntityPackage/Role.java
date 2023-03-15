package rougeLike.EntityPackage;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private int roleId;
    @ManyToMany(mappedBy = "roles")
    private List<User> users;


    @Column(name = "role_name")
    private String roleName;

    public Role() {
    }

    public Role(String roleName) {
        this.roleName = roleName;
    }

    public int getRoleId() {
        return roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                '}';
    }
}
