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
@Table(name = "colaboradoras", catalog = "cliente", schema = "")
@NamedQueries({
    @NamedQuery(name = "Colaboradoras.findAll", query = "SELECT c FROM Colaboradoras c")
    , @NamedQuery(name = "Colaboradoras.findById", query = "SELECT c FROM Colaboradoras c WHERE c.id = :id")
    , @NamedQuery(name = "Colaboradoras.findByNome", query = "SELECT c FROM Colaboradoras c WHERE c.nome = :nome")
    , @NamedQuery(name = "Colaboradoras.findByIdade", query = "SELECT c FROM Colaboradoras c WHERE c.idade = :idade")
    , @NamedQuery(name = "Colaboradoras.findByCpf", query = "SELECT c FROM Colaboradoras c WHERE c.cpf = :cpf")
    , @NamedQuery(name = "Colaboradoras.findByPreferencia1", query = "SELECT c FROM Colaboradoras c WHERE c.preferencia1 = :preferencia1")
    , @NamedQuery(name = "Colaboradoras.findByPreferencia2", query = "SELECT c FROM Colaboradoras c WHERE c.preferencia2 = :preferencia2")
    , @NamedQuery(name = "Colaboradoras.findByPreferencia3", query = "SELECT c FROM Colaboradoras c WHERE c.preferencia3 = :preferencia3")
    , @NamedQuery(name = "Colaboradoras.findBySexo", query = "SELECT c FROM Colaboradoras c WHERE c.sexo = :sexo")})
public class Colaboradoras implements Serializable {

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
    @Column(name = "preferencia1")
    private String preferencia1;
    @Column(name = "preferencia2")
    private String preferencia2;
    @Column(name = "preferencia3")
    private String preferencia3;
    @Basic(optional = false)
    @Column(name = "sexo")
    private String sexo;

    public Colaboradoras() {
    }

    public Colaboradoras(Integer id) {
        this.id = id;
    }

    public Colaboradoras(Integer id, String nome, int idade, String cpf, String sexo) {
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

    public String getPreferencia1() {
        return preferencia1;
    }

    public void setPreferencia1(String preferencia1) {
        String oldPreferencia1 = this.preferencia1;
        this.preferencia1 = preferencia1;
        changeSupport.firePropertyChange("preferencia1", oldPreferencia1, preferencia1);
    }

    public String getPreferencia2() {
        return preferencia2;
    }

    public void setPreferencia2(String preferencia2) {
        String oldPreferencia2 = this.preferencia2;
        this.preferencia2 = preferencia2;
        changeSupport.firePropertyChange("preferencia2", oldPreferencia2, preferencia2);
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
        if (!(object instanceof Colaboradoras)) {
            return false;
        }
        Colaboradoras other = (Colaboradoras) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "p69.Colaboradoras[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
