/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author alper
 */
@Entity
@Table(name = "PRODUCT")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Product.findAll", query = "SELECT p FROM Product p"),
    @NamedQuery(name = "Product.findById", query = "SELECT p FROM Product p WHERE p.id = :id"),
    @NamedQuery(name = "Product.findByNameof", query = "SELECT p FROM Product p WHERE p.nameof = :nameof"),
    @NamedQuery(name = "Product.findByPrice", query = "SELECT p FROM Product p WHERE p.price = :price"),
    @NamedQuery(name = "Product.findByPhoto", query = "SELECT p FROM Product p WHERE p.photo = :photo")})
public class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Size(max = 200)
    @Column(name = "NAMEOF")
    private String nameof;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRICE")
    private Double price;
    @Size(max = 200)
    @Column(name = "PHOTO")
    private String photo;
    @JoinColumn(name = "MANUFID", referencedColumnName = "ID")
    @ManyToOne
    private Manuf manufid;
    @JoinColumn(name = "TYPEID", referencedColumnName = "ID")
    @ManyToOne
    private Typeof typeid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private Collection<Orders> ordersCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "product")
    private Collection<Info> infoCollection;

    public Product() {
    }

    public Product(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameof() {
        return nameof;
    }

    public void setNameof(String nameof) {
        this.nameof = nameof;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Manuf getManufid() {
        return manufid;
    }

    public void setManufid(Manuf manufid) {
        this.manufid = manufid;
    }

    public Typeof getTypeid() {
        return typeid;
    }

    public void setTypeid(Typeof typeid) {
        this.typeid = typeid;
    }

    @XmlTransient
    public Collection<Orders> getOrdersCollection() {
        return ordersCollection;
    }

    public void setOrdersCollection(Collection<Orders> ordersCollection) {
        this.ordersCollection = ordersCollection;
    }

    @XmlTransient
    public Collection<Info> getInfoCollection() {
        return infoCollection;
    }

    public void setInfoCollection(Collection<Info> infoCollection) {
        this.infoCollection = infoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Product)) {
            return false;
        }
        Product other = (Product) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SQL.Product[ id=" + id + " ]";
    }
    
}
