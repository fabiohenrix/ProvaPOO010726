package dao;

import model.Equipamento;
import model.Laboratorio;
import util.Conexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GerenciarDao {

    public void salvarLaboratorio(Laboratorio laboratorio){

        String sql = "INSERT INTO tabelalabs(nome, bloco, capacidade) VALUES (?,?,?)";

        try(Connection conexao = Conexao.getConnection();
            PreparedStatement statement = conexao.prepareStatement(sql)){

            statement.setString(1, laboratorio.getNome());
            statement.setString(2, laboratorio.getBloco());
            statement.setInt(3, laboratorio.getCapacidade());

            statement.executeUpdate();

        }catch(SQLException e){
            System.out.println("Erro: " + e.getMessage());
        }

    }

    public void salvarEquipamento(Equipamento equipamento){

        String sql = "INSERT INTO tabelaequips(patrimonio, descricao, fabricante, laboratorio_id) VALUES (?,?,?,?)";

        try(Connection conexao = Conexao.getConnection();
            PreparedStatement statement = conexao.prepareStatement(sql)){

            statement.setString(1, equipamento.getPatrimonio());
            statement.setString(2, equipamento.getDescricao());
            statement.setString(3, equipamento.getFabricante());
            statement.setInt(4, equipamento.getLaboratorioId());

            statement.executeUpdate();

        }catch(SQLException e){
            System.out.println("Erro: " + e.getMessage());
        }

    }

    public void deletarLaboratorio(int id){

        String sql = "DELETE FROM tabelalabs WHERE id = ?";

        try(Connection conexao = Conexao.getConnection();
            PreparedStatement statement = conexao.prepareStatement(sql)){

            statement.setInt(1, id);

            statement.executeUpdate();

        }catch(SQLException e){
            System.out.println("Erro: " + e.getMessage());
        }

    }

    public void deletarEquipamento(int id){

        String sql = "DELETE FROM tabelaequips WHERE id = ?";

        try(Connection conexao = Conexao.getConnection();
            PreparedStatement statement = conexao.prepareStatement(sql)){

            statement.setInt(1, id);

            statement.executeUpdate();

        }catch(SQLException e){
            System.out.println("Erro: " + e.getMessage());
        }

    }

    public boolean patrimonioExiste(String patrimonio){

        String sql = "SELECT * FROM tabelaequips WHERE patrimonio = ?";

        try(Connection conexao = Conexao.getConnection();
            PreparedStatement statement = conexao.prepareStatement(sql)){

            statement.setString(1, patrimonio);

            ResultSet rs = statement.executeQuery();

            return rs.next();

        }catch(SQLException e){
            System.out.println("Erro: " + e.getMessage());
        }

        return false;
    }

    public boolean laboratorioTemEquipamentos(int id){

        String sql = "SELECT * FROM tabelaequips WHERE laboratorio_id = ?";

        try(Connection conexao = Conexao.getConnection();
            PreparedStatement statement = conexao.prepareStatement(sql)){

            statement.setInt(1, id);

            ResultSet rs = statement.executeQuery();

            return rs.next();

        }catch(SQLException e){
            System.out.println("Erro: " + e.getMessage());
        }

        return false;
    }

    public ArrayList<Laboratorio> listarLaboratorios(){

        ArrayList<Laboratorio> lista = new ArrayList<>();

        String sql = "SELECT * FROM tabelalabs";

        try(Connection conexao = Conexao.getConnection();
            PreparedStatement statement = conexao.prepareStatement(sql);
            ResultSet rs = statement.executeQuery()){

            while(rs.next()){

                Laboratorio laboratorio = new Laboratorio();

                laboratorio.setId(rs.getInt("id"));
                laboratorio.setNome(rs.getString("nome"));
                laboratorio.setBloco(rs.getString("bloco"));
                laboratorio.setCapacidade(rs.getInt("capacidade"));

                lista.add(laboratorio);
            }

        }catch(SQLException e){
            System.out.println("Erro: " + e.getMessage());
        }

        return lista;
    }

}