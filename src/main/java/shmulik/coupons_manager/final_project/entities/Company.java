/**
 * 
 */
package shmulik.coupons_manager.final_project.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Android
 *
 */
@Entity
@Table(name = "company" )
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "compName" , unique=true)
    private String compName;

    @Column(name = "password")
    private String password;

    @Column(name = "email" , unique=true)
    private String email;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "COMPANY_COUPON",
            joinColumns = @JoinColumn(name = "COMPANY_ID"),
            inverseJoinColumns = @JoinColumn(name = "COUPON_ID"))
//    private Set<Coupon> coupons = new HashSet<>();
    private Set<Coupon> coupons = new HashSet<>();


//    @OneToMany(cascade = CascadeType.ALL,
//            fetch = FetchType.LAZY,
//            mappedBy = "company")
//    private Set<Coupon> coupons = new HashSet<>();

//    @OneToMany
//    @JoinTable(name = "MY_JOIN_TABLE",
//            joinColumns = {@JoinColumn(name = "MY_ENTITY_A_FK")},
//            inverseJoinColumns = {@JoinColumn(name = "MY_ENTITY_B_FK")}
//    )
//    private List<EntityB> entityBList;
//
//    public List<EntityB> getEntityBList() {
//        return entityBList;
//    }

//    @ManyToMany(fetch = FetchType.EAGER)
//    @JoinTable(name = "CUSTOMER_COUPON",
//            joinColumns = @JoinColumn(name = "CUSTOMER_ID"),
//            inverseJoinColumns = @JoinColumn(name = "COUPON_ID"))
//    private Set<Coupon> coupons = new HashSet<>();

    public Company() {
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

    public Set<Coupon> getCoupons() {
        return coupons;
    }

    public void setCoupons(Set<Coupon> coupons) {
        this.coupons = coupons;
    }
//    public void setCoupons(Set<Coupon> coupons) {
//        this.coupons = coupons;
//    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", compName='" + compName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
