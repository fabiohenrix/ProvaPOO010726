package dao;

import model.Equipamento;
import model.Laboratorio;
import util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GerenciarDao {


    public void inserirLaboratorio (Laboratorio laboratorio) {
        String sql = "insert into tabelalabs(nome) values (?)";

        try (
                Connection conn = Conexao.getConnection();
                PreparedStatement statement = conn.prepareStatement(sql);
        ) {
            statement.setString(1, laboratorio.getNome());
            statement.executeUpdate();
            System.out.printf("Laboratório cadastrado!");
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public void inserirEquipamento (Equipamento equipamento) {
        String sql = "insert into tabelaequips(descricao) values (?)";

        try (
                Connection conn = Conexao.getConnection();
                PreparedStatement statement = conn.prepareStatement(sql);
        ) {
            statement.setString(1, equipamento.getDescricao());
            statement.executeUpdate();
            System.out.printf("Laboratório cadastrado!");
        } catch (SQLException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }


    public void deletarLaboratorio(int id){

        String sql = "DELETE FROM tabelalabs WHERE id = ?";

        try(
                Connection conn = Conexao.getConnection();
                PreparedStatement statement = conn.prepareStatement(sql);
        ){
            statement.setInt(1, id);
            int linhas = statement.executeUpdate();

            if (linhas > 0 )
                System.out.println("Laboratório removido!");
            else
                System.out.println("Laboratório não encontrado.");
        } catch (SQLException e){
            System.out.println("Erro: "+ e.getMessage());
        }

    }


    public void deletarEquipamento(int id, String laboratorio){

        String sql = "DELETE FROM tabelaequips WHERE id = ?";

        try(
                Connection conn = Conexao.getConnection();
                PreparedStatement statement = conn.prepareStatement(sql);
        ){
            statement.setInt(1, id);
            int linhas = statement.executeUpdate();

            if (linhas > 0 )
                System.out.println("Equipamento removido!");
            else
                System.out.println("Equipamento não encontrado.");
        } catch (SQLException e){
            System.out.println("Erro: "+ e.getMessage());
        }

    }




}