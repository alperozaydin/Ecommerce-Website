/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author alper
 */
@Entity
@Table(name = "ORDERS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Orders.findAll", query = "SELECT o FROM Orders o"),
    @NamedQuery(name = "Orders.findById", query = "SELECT o FROM Orders o WHERE o.ordersPK.id = :id"),
    @NamedQuery(name = "Orders.findByPid", query = "SELECT o FROM Orders o WHERE o.ordersPK.pid = :pid"),
    @NamedQuery(name = "Orders.findByOdate", query = "SELECT o FROM Orders o WHERE o.odate = :odate")})
public class Orders implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected OrdersPK ordersPK;
    @Size(max = 50)
    @Column(name = "ODATE")
    private String odate;
    @JoinColumn(name = "PID", referencedColumnName = "ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Product product;
    @JoinColumn(name = "USERID", referencedColumnName = "ID")
    @ManyToOne
    private Users userid;

    public Orders() {
    }

    public Orders(OrdersPK ordersPK) {
        this.ordersPK = ordersPK;
    }

    public Orders(int id, int pid) {
        this.ordersPK = new OrdersPK(id, pid);
    }

    public OrdersPK getOrdersPK() {
        return ordersPK;
    }

    public void setOrdersPK(OrdersPK ordersPK) {
        this.ordersPK = ordersPK;
    }

    public String getOdate() {
        return odate;
    }

    public void setOdate(String odate) {
        this.odate = odate;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Users getUserid() {
        return userid;
    }

    public void setUserid(Users userid) {
        this.userid = userid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ordersPK != null ? ordersPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Orders)) {
            return false;
        }
        Orders other = (Orders) object;
        if ((this.ordersPK == null && other.ordersPK != null) || (this.ordersPK != null && !this.ordersPK.equals(other.ordersPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SQL.Orders[ ordersPK=" + ordersPK + " ]";
    }
    
}
