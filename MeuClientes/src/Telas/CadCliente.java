package Telas;

import javax.swing.JOptionPane;

import Conectividades.Conexao;
import meusclientes.*;

public class CadCliente extends javax.swing.JFrame {
	
	public CadCliente() {
	initComponents();
	}
	
	
	@SuppressWarnings("unchecked")
	private void initComponents() {
		
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		campo_nome = new javax.swing.JTextField();
		campo_telefone = new javax.swing.JTextField();
		campo_celular = new javax.swing.JTextField();
		campo_email = new javax.swing.JTextField();
		botao_cadastrar = new javax.swing.JButton();
		botao_limpar = new javax.swing.JButton();
		botao_fechar = new javax.swing.JButton();
		
		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		
		jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); 
		jLabel1.setText("Cadastro de Clientes");
		
		jLabel2.setText("Nome");
		
		jLabel3.setText("Telefone");
	
		jLabel4.setText("Celular");
		
		jLabel5.setText("E-mail");
		
		campo_nome.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				campo_nomeActionPerformed(evt);
			}
		});
		
		botao_cadastrar.setText("Cadastrar");
		botao_cadastrar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				botao_cadastrarActionPerformed(evt);
			}
		});
		
		botao_limpar.setText("Limpar");
		botao_limpar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				botao_limparActionPerformed(evt);
			}
		});
		
		botao_fechar.setText("Fechar");
		botao_fechar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				botao_fecharActionPerformed(evt);
			}
		});
		
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.
										createSequentialGroup()
										.addGap(0, 107, Short.MAX_VALUE)
										.addComponent(jLabel1)
										.addGap(99, 99, 99))
								.addGroup(layout.createSequentialGroup()
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.
												LEADING)
												.addComponent(jLabel2)
												.addComponent(jLabel3)
												.addComponent(jLabel4)
												.addComponent(jLabel5))
										.addGap(34, 34, 34)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.
												TRAILING, false)
												.addComponent(campo_celular, javax.swing.GroupLayout.Alignment.
														LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
												.addComponent(campo_nome, javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(campo_telefone, javax.swing.GroupLayout.Alignment.
														LEADING)
												.addComponent(campo_email))
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.
												LEADING, false)
												.addComponent(botao_cadastrar, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(botao_limpar, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(botao_fechar, javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
										.addGap(22, 22, 22))))
	
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addGap(31, 31, 31)
						.addComponent(jLabel1)
						.addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel2)
								.addComponent(campo_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.
										swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(botao_cadastrar))
						.addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel3)
								.addComponent(campo_telefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.
										swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(botao_limpar))
						.addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(jLabel4)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.
										BASELINE)
										.addComponent(campo_celular, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.
												PREFERRED_SIZE)
										.addComponent(botao_fechar)))
						.addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel5)
								.addComponent(campo_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.
										swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addContainerGap(86, Short.MAX_VALUE))
	
				);
	
		pack();
	}
	private void botao_cadastrarActionPerformed(java.awt.event.ActionEvent evt) {
		int id = 0;
		String nome = campo_nome.getText();
		String telefone = campo_telefone.getText();
		String celular = campo_celular.getText();
		String email = campo_email.getText();
	try{
		Clientes clientes = new Clientes(id, nome, telefone, celular, email);
		Conexao conecta_cliente = new Conexao();
		conecta_cliente.CadastrarCliente(clientes);
		JOptionPane.showMessageDialog(null,"Dados gragados com sucesso!","Aviso",JOptionPane.
				INFORMATION_MESSAGE);
		}
	catch(Exception ex){
		JOptionPane.showMessageDialog(null, "Erro no banco de dados!"+ex.getMessage(),"Aviso",
				JOptionPane.ERROR_MESSAGE);
				ex.printStackTrace();
		}
	}
	private void botao_limparActionPerformed(java.awt.event.ActionEvent evt) {
	
	campo_nome.setText("");
	campo_telefone.setText("");
	campo_celular.setText("");
	campo_email.setText("");
	}
	
	private void botao_fecharActionPerformed(java.awt.event.ActionEvent evt) {
		dispose();
	}
	
	private void campo_nomeActionPerformed(java.awt.event.ActionEvent evt) {
	}
	
	public static void main(String args[]) {
	
	try {
		for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.
				getInstalledLookAndFeels()) {
			if ("Nimbus".equals(info.getName())) {
				javax.swing.UIManager.setLookAndFeel(info.getClassName());
				break;
			}
		}
	} catch (ClassNotFoundException ex) {
		java.util.logging.Logger.getLogger(CadCliente.class.getName()).log(java.util.logging
		.Level.SEVERE, null, ex);
		
	} catch (InstantiationException ex) {
		java.util.logging.Logger.getLogger(CadCliente.class.getName()).log(java.util.logging
		.Level.SEVERE, null, ex);
		
	} catch (IllegalAccessException ex) {
	java.util.logging.Logger.getLogger(CadCliente.class.getName()).log(java.util.logging
	.Level.SEVERE, null, ex);
	
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
		java.util.logging.Logger.getLogger(CadCliente.class.getName()).log(java.util.logging
		.Level.SEVERE, null, ex);
	}
	
	java.awt.EventQueue.invokeLater(new Runnable() {
		
		public void run() {
			new CadCliente().setVisible(true);
		}
	});
}
	
		private javax.swing.JButton botao_cadastrar;
		private javax.swing.JButton botao_fechar;
		private javax.swing.JButton botao_limpar;
		private javax.swing.JTextField campo_celular;
		private javax.swing.JTextField campo_email;
		private javax.swing.JTextField campo_nome;
		private javax.swing.JTextField campo_telefone;
		private javax.swing.JLabel jLabel1;
		private javax.swing.JLabel jLabel2;
		private javax.swing.JLabel jLabel3;
		private javax.swing.JLabel jLabel4;
		private javax.swing.JLabel jLabel5;
		
	}
	
