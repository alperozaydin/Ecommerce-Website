/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author alper
 */
@Embeddable
public class OrdersPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private int id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PID")
    private int pid;

    public OrdersPK() {
    }

    public OrdersPK(int id, int pid) {
        this.id = id;
        this.pid = pid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        hash += (int) pid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OrdersPK)) {
            return false;
        }
        OrdersPK other = (OrdersPK) object;
        if (this.id != other.id) {
            return false;
        }
        if (this.pid != other.pid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SQL.OrdersPK[ id=" + id + ", pid=" + pid + " ]";
    }
    
}
