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
@Table(name = "INFO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Info.findAll", query = "SELECT i FROM Info i"),
    @NamedQuery(name = "Info.findByPid", query = "SELECT i FROM Info i WHERE i.infoPK.pid = :pid"),
    @NamedQuery(name = "Info.findByCatid", query = "SELECT i FROM Info i WHERE i.infoPK.catid = :catid"),
    @NamedQuery(name = "Info.findBySizeof", query = "SELECT i FROM Info i WHERE i.sizeof = :sizeof"),
    @NamedQuery(name = "Info.findBySpeck", query = "SELECT i FROM Info i WHERE i.speck = :speck"),
    @NamedQuery(name = "Info.findByStock", query = "SELECT i FROM Info i WHERE i.stock = :stock")})
public class Info implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected InfoPK infoPK;
    @Size(max = 200)
    @Column(name = "SIZEOF")
    private String sizeof;
    @Size(max = 200)
    @Column(name = "SPECK")
    private String speck;
    @Column(name = "STOCK")
    private Integer stock;
    @JoinColumn(name = "CATID", referencedColumnName = "ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Category category;
    @JoinColumn(name = "COLORID", referencedColumnName = "ID")
    @ManyToOne
    private Color colorid;
    @JoinColumn(name = "PID", referencedColumnName = "ID", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Product product;

    public Info() {
    }

    public Info(InfoPK infoPK) {
        this.infoPK = infoPK;
    }

    public Info(int pid, int catid) {
        this.infoPK = new InfoPK(pid, catid);
    }

    public InfoPK getInfoPK() {
        return infoPK;
    }

    public void setInfoPK(InfoPK infoPK) {
        this.infoPK = infoPK;
    }

    public String getSizeof() {
        return sizeof;
    }

    public void setSizeof(String sizeof) {
        this.sizeof = sizeof;
    }

    public String getSpeck() {
        return speck;
    }

    public void setSpeck(String speck) {
        this.speck = speck;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Color getColorid() {
        return colorid;
    }

    public void setColorid(Color colorid) {
        this.colorid = colorid;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (infoPK != null ? infoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Info)) {
            return false;
        }
        Info other = (Info) object;
        if ((this.infoPK == null && other.infoPK != null) || (this.infoPK != null && !this.infoPK.equals(other.infoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "SQL.Info[ infoPK=" + infoPK + " ]";
    }
    
}
