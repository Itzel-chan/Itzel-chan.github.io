package controllers;

import java.util.List;

import models.Postagem;
import play.mvc.Controller;

public class Postagens extends Controller {

    public static void form(String mensagem) {
        render(mensagem);
    }

    public static void salvar(Postagem postagem) {

        String mensagem = "";

        if (!postagem.eValido()) {
            mensagem = "Erro ao registrar!";
            form(mensagem);
        }

        mensagem = "Postagem registrada!";
        postagem.save();
        listar(mensagem);

    }

    public static void detalhar(long id) {
        Postagem postagem = Postagem.findById(id);
        render(postagem);
    }

    public static void listar(String mensagem) {
        List<Postagem> postagens = Postagem.findAll();
        render(mensagem, postagens);
    }

    public static void remover(long id) {
        String mensagem = "Postagem removida!";
        Postagem postagem = Postagem.findById(id);
        postagem.delete();
        listar(mensagem);
        
    }

}
