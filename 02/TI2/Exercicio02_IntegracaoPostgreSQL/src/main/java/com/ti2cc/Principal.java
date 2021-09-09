package com.ti2cc;

public class Principal {
    public static void main(String[] args) {
        DAO dao = new DAO();

        dao.conectar();

        // Inserir um elemento na tabela
        Usuario usuario = new Usuario(1001, "Lorem", "Ipsum", 'M');
        if (dao.inserirUsuario(usuario))
            System.out.println("Inserção com sucesso! \n" + usuario.toString());

        // Mostrar usuários do sexo masculino
        System.out.println("--- Mostrar usuários do sexo masculino ---");
        Usuario[] usuarios = dao.getUsuariosMasculinos();
        for (int i = 0; i < usuarios.length; i++)
            System.out.println(usuarios[i].toString());

        // Atualizar usuário
        usuario.setSenha("nova senha");
        dao.atualizarUsuario(usuario);

        // Mostrar usuarios
        System.out.println("--- Mostrar usuários ---");
        usuarios = dao.getUsuarios();
        for (int i = 0; i < usuarios.length; i++)
            System.out.println(usuarios[i].toString());

        //Excluir Usuário
        dao.excluirUsuario(usuario.getCodigo());

        // Mostrar usuarios
        System.out.println("--- Mostrar usuários ---");
        usuarios = dao.getUsuarios();
        for (int i = 0; i < usuarios.length; i++)
            System.out.println(usuarios[i].toString());

        dao.close();
    }
}
