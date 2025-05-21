package models;

import java.util.Date;

import javax.persistence.Entity;

import play.db.jpa.Model;

@Entity
public class Postagem extends Model {

    public String titulo;
    public String conteudo;
    public String autor;
    public Date data;

    public Postagem() {
        this.data = new Date();
    }

    public boolean eValido() {

        if (this.titulo == null || this.conteudo == null || this.autor == null) {
            return false;
        }

        return true;

    }

}
