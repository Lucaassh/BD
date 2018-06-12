/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Usuário
 */
@Entity
@Table(name = "colaboradoraspreferencial3", catalog = "cliente", schema = "")
@NamedQueries({
    @NamedQuery(name = "Colaboradoraspreferencial3.findAll", query = "SELECT c FROM Colaboradoraspreferencial3 c")
    , @NamedQuery(name = "Colaboradoraspreferencial3.findById", query = "SELECT c FROM Colaboradoraspreferencial3 c WHERE c.id = :id")
    , @NamedQuery(name = "Colaboradoraspreferencial3.findByNome", query = "SELECT c FROM Colaboradoraspreferencial3 c WHERE c.nome = :nome")
    , @NamedQuery(name = "Colaboradoraspreferencial3.findByIdade", query = "SELECT c FROM Colaboradoraspreferencial3 c WHERE c.idade = :idade")
    , @NamedQuery(name = "Colaboradoraspreferencial3.findByCpf", query = "SELECT c FROM Colaboradoraspreferencial3 c WHERE c.cpf = :cpf")
    , @NamedQuery(name = "Colaboradoraspreferencial3.findByPreferencia3", query = "SELECT c FROM Colaboradoraspreferencial3 c WHERE c.preferencia3 = :preferencia3")
    , @NamedQuery(name = "Colaboradoraspreferencial3.findBySexo", query = "SELECT c FROM Colaboradoraspreferencial3 c WHERE c.sexo = :sexo")})
public class Colaboradoraspreferencial3 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "idade")
    private int idade;
    @Basic(optional = false)
    @Column(name = "CPF")
    private String cpf;
    @Column(name = "preferencia3")
    private String preferencia3;
    @Basic(optional = false)
    @Column(name = "sexo")
    private String sexo;

    public Colaboradoraspreferencial3() {
    }

    public Colaboradoraspreferencial3(Integer id) {
        this.id = id;
    }

    public Colaboradoraspreferencial3(Integer id, String nome, int idade, String cpf, String sexo) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.sexo = sexo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        int oldIdade = this.idade;
        this.idade = idade;
        changeSupport.firePropertyChange("idade", oldIdade, idade);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        String oldCpf = this.cpf;
        this.cpf = cpf;
        changeSupport.firePropertyChange("cpf", oldCpf, cpf);
    }

    public String getPreferencia3() {
        return preferencia3;
    }

    public void setPreferencia3(String preferencia3) {
        String oldPreferencia3 = this.preferencia3;
        this.preferencia3 = preferencia3;
        changeSupport.firePropertyChange("preferencia3", oldPreferencia3, preferencia3);
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        String oldSexo = this.sexo;
        this.sexo = sexo;
        changeSupport.firePropertyChange("sexo", oldSexo, sexo);
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
        if (!(object instanceof Colaboradoraspreferencial3)) {
            return false;
        }
        Colaboradoraspreferencial3 other = (Colaboradoraspreferencial3) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "p69.Colaboradoraspreferencial3[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
