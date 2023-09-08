package repository;



import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.ClienteModel;
import model.FuncionarioModel;
// insert

public class Funcionario {

public void insert(FuncionarioModel funcionario) {
			String sql = "insert into funcionario (id, nome, rg, cpf, data_nascimento, telefone, email, cargo, cep, endereco, cidade, bairro, complemento) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			try {
				PreparedStatement stmt = conexao.prepareStatement(sql);
				stmt.setLong(1, funcionario.getIdFuncionario());
				stmt.setString(2, funcionario.getNomeFuncionario());
				stmt.setString(3, funcionario.getRgFuncionario());
				stmt.setInt(4, funcionario.getCpfFuncionario());
				stmt.setDate(5, funcionario.getDataNascimento());
				stmt.setString(6, funcionario.getEmailFuncionario());
				stmt.setString(7, funcionario.getTelefoneFuncionario());
				stmt.setString(8, funcionario.getCargo());
				stmt.setString(9, funcionario.getCep());
				stmt.setString(10, funcionario.getEndereco());
				stmt.setString(11, funcionario.getCidade());
				stmt.setString(12, funcionario.getBairro());
				stmt.setString(13, funcionario.getComplemento());
				stmt.execute();
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
}

	// selectAll

	public List<FuncionarioModel> selectAll() {
		List<FuncionarioModel> funcionarios = new ArrayList<>();
		String sql = "select * from funcionario";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				FuncionarioModel funcionario = new FuncionarioModel();
				funcionario.setIdCliente(rs.getLong("id"));
				funcionario.setNomeCliente(rs.getString("nome"));
				funcionario.setRgCliente(rs.getLong("rg"));
				funcionario.setCpfCliente(rs.getLong("cpf"));
				funcionario.setDataNascimento(rs.getDate("data_nascimento"));
				funcionario.setEmailCliente(rs.getString("email"));
				funcionario.setTelefoneCliente(rs.getString("telefone"));
				funcionario.setCargo(rs.getString("cargo"));
				funcionario.setCep(rs.getString("cep"));
				funcionario.setEndereco(rs.getString("endereco"));
				funcionario.setBairro(rs.getString("bairro"));
				funcionario.setComplemento(rs.getString("complemento"));
				funcionarios.add(funcionario);
			}

			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return funcionarios;
	}

	// selectById

	public FuncionarioModel selectById(long id) {
		FuncionarioModel funcionario = null;
		String sql = "select * from funcionario where id = ?";
		try {
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setLong(1, id);
			ResultSet rs = stmt.executeQuery();

			if (rs.next()) {
				funcionario = new FuncionarioModel();
				funcionario.setIdCliente(rs.getLong("id"));
				funcionario.setNomeCliente(rs.getString("nome"));
				funcionario.setRgCliente(rs.getLong("rg"));
				funcionario.setCpfCliente(rs.getLong("cpf"));
				funcionario.setDataNascimento(rs.getDate("data_nascimento"));
				funcionario.setEmailCliente(rs.getString("email"));
				funcionario.setTelefoneCliente(rs.getString("telefone"));
				funcionario.setCargo(rs.getString("cargo"));
				funcionario.setCep(rs.getString("cep"));
				funcionario.setEndereco(rs.getString("endereco"));
				funcionario.setBairro(rs.getString("bairro"));
				funcionario.setComplemento(rs.getString("complemento"));
				
			}

			rs.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return funcionario;
	}

}


