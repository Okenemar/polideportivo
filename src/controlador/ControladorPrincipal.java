package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.Principal;

public class ControladorPrincipal implements ActionListener{
	private Principal frmPrincipal;
	
	public ControladorPrincipal(Principal principal) {
		frmPrincipal = principal;
		frmPrincipal.btnGestionarProductos.addActionListener(this);
	}

	public void inicializar() {
		frmPrincipal.setTitle("Desktop");
		frmPrincipal.setLocationRelativeTo(null);
		frmPrincipal.setVisible(false);
	}
	@Override
	public void actionPerfomed(ActionEvent e) {
		if (e.getSource() == frmPrincipal.btnGestionarProductos) {
			
		}
	}
}
