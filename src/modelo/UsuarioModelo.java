package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class UsuarioModelo extends Conector {
	PreparedStatement preparedSt;

	public void insertarUsuario(Usuario usuario) {
		try {
			PreparedStatement prt = conexion.prepareStatement("INSERT INTO usuarios(nombre_apellido, dni,codigo) VALUES (?,?,?)");

			prt.setString(1, usuario.getNombreApellido());
			prt.setString(2, usuario.getDni());
			prt.setString(3, usuario.getCodigo());

			prt.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void eliminarUsuario(String dni) {
	
	try {
	preparedSt = conexion.prepareStatement("DELETE FROM usuarios WHERE dni = ?");
	preparedSt.setString(1, dni);

	preparedSt.execute();
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
	
	public Usuario getUsuario (String dni) {
		Usuario usuario = new Usuario();

		try {
		Statement st = conexion.createStatement();

		String sentenciaSelect = "SELECT * FROM usuarios WHERE dni = ?";
		preparedSt.setString(1, usuario.getDni());
			
		ResultSet resultado = st.executeQuery(sentenciaSelect);
		resultado.next();
		usuario.setId(resultado.getInt("id"));
		usuario.setNombreApellido(resultado.getString("nombre_apellido"));
		usuario.setDni(resultado.getString("dni"));
		usuario.setCodigo(resultado.getString("codigo"));
			
		preparedSt.execute();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
		return usuario;
}
	public ArrayList<Usuario> mostrarUsuarios(){
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		Usuario usuario = new Usuario();
		try {
		Statement st = conexion.createStatement();
		
		String sentenciaSelect = "SELECT * FROM usuarios";
		ResultSet resultado = st.executeQuery(sentenciaSelect);
		
		while (resultado.next()) {
			
			usuario.setId(resultado.getInt("id"));
			usuario.setNombreApellido(resultado.getString("nombre_apellido"));
			usuario.setDni(resultado.getString("dni"));
			usuario.setCodigo(resultado.getString("codigo"));
			
			usuarios.add(usuario);
			
		}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return usuarios;

	}
	/*modificaaa*/
public void modificarUsuario(Usuario usuario, int id)  {
		
		try {
			
		preparedSt = conexion.prepareStatement("UPDATE usuarios SET nombre_apellido=?, dni=?, codigo=? WHERE id=?");
		
		preparedSt.setString(1, usuario.getNombreApellido());
		preparedSt.setString(2, usuario.getDni());
		preparedSt.setString(3, usuario.getCodigo());
		
		preparedSt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
}