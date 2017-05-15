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
public class InfoPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "PID")
    private int pid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CATID")
    private int catid;

    public InfoPK() {
    }

    public InfoPK(int pid, int catid) {
        this.pid = pid;
        this.catid = catid;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getCatid() {
        return catid;
    }

    public void setCatid(int catid) {
        this.catid = catid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) pid;
        hash += (int) catid;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof InfoPK)) {
            return false;
        }
        InfoPK other = (InfoPK) object;
        if (this.pid != other.pid) {
            return false;
        }
        if (this.catid != other.catid) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SQL.InfoPK[ pid=" + pid + ", catid=" + catid + " ]";
    }
    
}
