package repository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.ClienteModel;

public class Cliente {
	
	//precisa colocar a class de cnexão com o banco
	
	//insert 
	
	public void insert(ClienteModel cliente) {
		String sql = "insert into cliente (id, nome, rg, cpf, data_nascimento, telefone, email) values (?, ?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setLong(1, cliente.getIdCliente());
			stmt.setString(2, cliente.getNomeCliente());
			stmt.setString(3, cliente.getRgCliente());
			stmt.setInt(4, cliente.getCpfcliente());
			stmt.setDate(5, cliente.getDataNascimento());
			stmt.setString(6, cliente.getEmailCliente());
			stmt.setString(7, cliente.getTelefoneCliente());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//selectAll
	
	public List<ClienteModel> selectAll() {
		List<ClienteModel> clientes = new ArrayList<>();
		String sql = "select * from cliente";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				ClienteModel cliente = new ClienteModel();
				cliente.setIdCliente(rs.getLong("id"));
				cliente.setNomeCliente(rs.getString("nome"));
				cliente.setRgCliente(rs.getLong("rg"));
				cliente.setCpfCliente(rs.getLong("cpf"));
				cliente.setDataNascimento(rs.getDate("data_nascimento"));
				cliente.setEmailCliente(rs.getString("ds_email"));
				cliente.setTelefoneCliente(rs.getString("telefone"));
				clientes.add(cliente);
			}

			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return clientes;
	}
	
	//selectById
	
	public ClienteModel selectById(long id) {
		ClienteModel cliente = null;
		String sql = "select * from cliente where id = ?";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setLong(1, nr_cpf);
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				cliente = new ClienteModel();
				cliente.setIdCliente(rs.getLong("id"));
				cliente.setNomeCliente(rs.getString("nome"));
				cliente.setRgCliente(rs.getLong("rg"));
				cliente.setCpfCliente(rs.getLong("cpf"));
				cliente.setDataNascimento(rs.getDate("data_nascimento"));
				cliente.setEmailCliente(rs.getString("ds_email"));
				cliente.setTelefoneCliente(rs.getString("telefone"));
			}

			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cliente;
	}

}
