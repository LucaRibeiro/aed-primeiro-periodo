package com.ti2cc;

import javax.xml.transform.Result;
import java.sql.*;

public class DAO {
    private Connection conexao;

    public boolean conectar() {
        String driverName = "org.postgresql.Driver";
        String serverName = "localhost";
        String database = "exercicio02";
        int porta = 5432;
        String url = "jdbc:postgresql://" + serverName + ":" + porta + "/" + database;
        String username = "postgres";
        String password = "postgres";
        boolean status = false;

        try {
            Class.forName(driverName);
            conexao = DriverManager.getConnection(url, username, password);
            status = (conexao == null);
            System.out.println("Conexão efetuada com o postgres!");
        } catch (ClassNotFoundException e) {
            System.err.println("Conexão NÃO efetuada com o postgres ---" + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Conexão NÃO efetuada com o postgres ---" + e.getMessage());
        }

        return status;
    }

    public boolean close() {
        boolean status = false;

        try {
            conexao.close();
            status = true;
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return status;
    }

    public boolean inserirUsuario(Usuario usuario) {
        boolean status = false;
        PreparedStatement pdstm = null;
        try {
            pdstm = conexao.prepareStatement("INSERT INTO usuario.usuario (id, login, senha, sexo) VALUES (?, ?, ?, ?)");

            pdstm.setInt(1, usuario.getCodigo());
            pdstm.setString(2, usuario.getLogin());
            pdstm.setString(3, usuario.getSenha());
            pdstm.setString(4, String.valueOf(usuario.getSexo()));

            pdstm.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (pdstm != null) {
                    pdstm.close();
                    status = true;
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }

        return status;
    }

    public boolean atualizarUsuario(Usuario usuario) {
        boolean status = false;
        PreparedStatement pdstm = null;
        try {
            pdstm = conexao.prepareStatement("UPDATE usuario.usuario SET login = ?, senha = ?, sexo = ? WHERE usuario.id = ?");

            pdstm.setString(1, usuario.getLogin());
            pdstm.setString(2, usuario.getSenha());
            pdstm.setString(3, String.valueOf(usuario.getSexo()));
            pdstm.setInt(4, usuario.getCodigo());

            pdstm.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (pdstm != null) {
                    pdstm.close();
                    status = true;
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }

        return status;
    }

    public boolean excluirUsuario(int codigo) {
        boolean status = false;
        PreparedStatement pdstm = null;
        try {
            pdstm = conexao.prepareStatement("DELETE FROM usuario.usuario WHERE usuario.id = ?");
            pdstm.setInt(1, codigo);

            pdstm.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (pdstm != null) {
                    pdstm.close();
                    status = true;
                }
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }

        return status;
    }

    public Usuario[] getUsuarios() {
        Usuario[] usuarios = null;

        try {
            Statement st = conexao.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = st.executeQuery("SELECT * FROM usuario.usuario");
            if (rs.next()) {
                rs.last();
                usuarios = new Usuario[rs.getRow()];
                rs.beforeFirst();

                for (int i = 0; rs.next(); i++) {
                    usuarios[i] = new Usuario(rs.getInt("id"), rs.getString("login"), rs.getString("senha"), rs.getString("sexo").charAt(0));
                }
            }
            st.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return usuarios;
    }

    public Usuario[] getUsuariosMasculinos() {
        Usuario[] usuarios = null;

        try {
            Statement st = conexao.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = st.executeQuery("SELECT * FROM usuario.usuario WHERE usuario.sexo = 'M'");
            if (rs.next()) {
                rs.last();
                usuarios = new Usuario[rs.getRow()];
                rs.beforeFirst();

                for (int i = 0; rs.next(); i++) {
                    usuarios[i] = new Usuario(rs.getInt("id"), rs.getString("login"), rs.getString("senha"), rs.getString("sexo").charAt(0));
                }
            }
            st.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        return usuarios;
    }
}
