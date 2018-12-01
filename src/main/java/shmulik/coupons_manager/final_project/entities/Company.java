/**
 * 
 */
package shmulik.coupons_manager.final_project.entities;

import javax.persistence.*;

/**
 * @author Android
 *
 */
@Entity
@Table(name = "company" )
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @Column(name = "compName" , unique=true)
    private String compName;

    @Column(name = "password")
    private String password;

    @Column(name = "email" , unique=true)
    private String email;

    private String error;

    public Company() {
    }

    public Company (String errorMsg) {
        this.error = errorMsg;
    }

    public String getError() {
        return error;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCompName() {
        return compName;
    }

    public void setCompName(String compName) {
        this.compName = compName;
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
}
