/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import database.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import model.Produto;

/**
 *
 * @author Márcio Pedro Schiehl
 */
public class ProdutoDao implements AcaoDao<Produto>{
 
 
    @Override
    public ArrayList<Produto> retornaTodos() {
        ArrayList<Produto> produtos = new ArrayList<>();
        String sql = "SELECT * FROM sorvetes;";
        Connection conexao = Conexao.conectar();
        if(conexao!=null){
            try{
                Statement statement = conexao.createStatement();
                statement.execute(sql);
                ResultSet resultado = statement.getResultSet();
                while (resultado.next()){
                    Produto produto = new Produto();
                    produto.setId(resultado.getInt("id"));
                    produto.setGrupo(resultado.getString("grupo"));
                    produto.setCusto(resultado.getFloat("custo"));
                    produto.setAtacadista(resultado.getBoolean("atacadista"));
                    produto.setAtacado(resultado.getFloat("atacado"));
                    produto.setVarejo(resultado.getFloat("varejo"));
                    produto.setNome(resultado.getString("nome"));
                    produto.setMarca(resultado.getString("marca"));
                    produto.setQuantidade(resultado.getInt("quantidade"));
                    produto.setUnidade(resultado.getString("unidade"));
                    produto.setCapacidade(resultado.getString("capacidade"));
                    produto.setLocal(resultado.getString("local"));
                    produtos.add(produto);
                }
            }catch (SQLException e){
                e.printStackTrace();
            }finally{
                Conexao.desconectar();
            }
        }
        return produtos;
    }

    @Override
    public int inserir(Produto objeto) {
        String sql = "INSERT INTO sorvetes"
                + "\n(codigo,grupo,custo,atacadista,atacado,varejo,nome,marca,"
                + "quantidade,unidade,capacidade,local)"
                +"\nValues(?,?,?,?,?,?,?,?,?,?,?,?);";
        Connection conexao = Conexao.conectar();
        if(conexao != null){
            try{
                PreparedStatement substituido = conexao.prepareStatement
        (sql,PreparedStatement.RETURN_GENERATED_KEYS);
                substituido.setInt(1, objeto.getCodigo());
                substituido.setString(2, objeto.getGrupo());
                substituido.setFloat(3, objeto.getCusto());
                substituido.setBoolean(4, objeto.isAtacadista());
                substituido.setFloat(5, objeto.getAtacado());
                substituido.setFloat(6, objeto.getVarejo());
                substituido.setString(7, objeto.getNome());
                substituido.setString(8, objeto.getMarca());
                substituido.setInt(9, objeto.getQuantidade());
                substituido.setString(10, objeto.getUnidade());
                substituido.setString(11, objeto.getCapacidade());
                substituido.setString(12, objeto.getLocal());
                substituido.execute();
                ResultSet resultado = substituido.getGeneratedKeys();
                if(resultado.next()){
                    return resultado.getInt(1);
                }
            }catch (SQLException e){
                e.printStackTrace();
            }finally{
               Conexao.desconectar();
            }
        }
        return 0;
    }

    @Override
    public int alterar(Produto objeto) {
        String sql = "UPDATE sorvetes SET"
                + "\ncodigo=?,"
                +"\ngrupo=?,"
                +"\ncusto=?,"
                +"\natacadista=?,"
                +"\natacado=?,"
                +"\nvarejo=?,"
                +"\nnome=?,"
                +"\nquantidade=?,"
                +"\nunidade=?,"
                +"\ncapacidade=?,"
                +"\nlocal=?,"
                +"\nWHERE id=?";
        Connection conexao = Conexao.conectar();
            if(conexao != null){
                try{
                    PreparedStatement alterador = conexao.prepareCall(sql);
                    alterador.setInt(1, objeto.getCodigo());
                    alterador.setString(2, objeto.getGrupo());
                    alterador.setFloat(3, objeto.getCusto());
                    alterador.setBoolean(4, objeto.isAtacadista());
                    alterador.setFloat(5, objeto.getAtacado());
                    alterador.setFloat(6, objeto.getVarejo());
                    alterador.setString(7, objeto.getNome());
                    alterador.setInt(8, objeto.getQuantidade());
                    alterador.setString(9, objeto.getUnidade());
                    alterador.setString(10, objeto.getCapacidade());
                    alterador.setString(11, objeto.getLocal());
                    alterador.setInt(12, objeto.getId());
                    alterador.executeUpdate();
                }catch (SQLException e){ e.printStackTrace();
                }finally{
                    Conexao.desconectar();
                }
            }
            return 0;
    }

    @Override
    public int excluir(int id) {
        String sql ="DELETE FROM sorvetes WHERE id = ?";
        Connection conexao = Conexao.conectar();
        try{
            PreparedStatement ps = conexao.prepareStatement(sql);
            ps.setInt(1,id);
            return ps.executeUpdate();
        }catch (SQLException e) {
            e.printStackTrace();
        }finally{
            Conexao.desconectar();
        }
        return 0;
    }

    @Override
    public Produto buscarPorid(int id) {
       Produto produto = null;
       String sql= "SELECT * sorvetes WHERE id = ?";
       Connection conexao = Conexao.conectar();
       if (conexao != null){
           try{
               PreparedStatement colocador = conexao.prepareStatement(sql);
               colocador.setInt(1, id);
               colocador.execute();
               ResultSet resultado = colocador.getResultSet();
               if (resultado.next()){
                   produto = new Produto();
                   produto.setId(resultado.getInt("id"));
                   produto.setGrupo(resultado.getString("grupo"));
                   produto.setCusto(resultado.getFloat("custo"));
                   produto.setAtacadista(resultado.getBoolean("atacadista"));
                   produto.setAtacado(resultado.getFloat("atacado"));
                   produto.setVarejo(resultado.getFloat("varejo"));
                   produto.setNome(resultado.getString("nome"));
                   produto.setMarca(resultado.getString("marca"));
                   produto.setQuantidade(resultado.getInt("quantidade"));
                   produto.setUnidade(resultado.getString("unidade"));
                   produto.setCapacidade(resultado.getString("capacidade"));
                   produto.setLocal(resultado.getString("local"));
                }
           }catch (SQLException e){
               e.printStackTrace();
           }finally {
               Conexao.desconectar();
           }
       }
           return produto;
    }

    
   
    
    
}
