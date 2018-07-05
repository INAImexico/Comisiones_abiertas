/*
 * Copyright (C) 2016 jmcortes
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package mx.org.inai.viajesclaros.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author jmcortes
 */
@Embeddable
public class GastosCamposConfigPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "id_gasto_campo_config")
    private int idGastoCampoConfig;
    @Basic(optional = false)
    @Column(name = "tabla")
    private String tabla;
    @Basic(optional = false)
    @Column(name = "campo")
    private String campo;

    public GastosCamposConfigPK() {
    }

    public GastosCamposConfigPK(int idGastoCampoConfig, String tabla, String campo) {
        this.idGastoCampoConfig = idGastoCampoConfig;
        this.tabla = tabla;
        this.campo = campo;
    }

    public int getIdGastoCampoConfig() {
        return idGastoCampoConfig;
    }

    public void setIdGastoCampoConfig(int idGastoCampoConfig) {
        this.idGastoCampoConfig = idGastoCampoConfig;
    }

    public String getTabla() {
        return tabla;
    }

    public void setTabla(String tabla) {
        this.tabla = tabla;
    }

    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idGastoCampoConfig;
        hash += (tabla != null ? tabla.hashCode() : 0);
        hash += (campo != null ? campo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GastosCamposConfigPK)) {
            return false;
        }
        GastosCamposConfigPK other = (GastosCamposConfigPK) object;
        if (this.idGastoCampoConfig != other.idGastoCampoConfig) {
            return false;
        }
        if ((this.tabla == null && other.tabla != null) || (this.tabla != null && !this.tabla.equals(other.tabla))) {
            return false;
        }
        if ((this.campo == null && other.campo != null) || (this.campo != null && !this.campo.equals(other.campo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.org.inai.viajesclaros.entities.GastosCamposConfigPK[ idGastoCampoConfig=" + idGastoCampoConfig + ", tabla=" + tabla + ", campo=" + campo + " ]";
    }
    
}
