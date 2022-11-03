package Telas;

import javax.swing.JOptionPane;

import Conectividades.*;
import meusclientes.*;

public class AtuCliente extends javax.swing.JFrame {

	public AtuCliente() {
	initComponents();
	}
	
	@SuppressWarnings("unchecked")
	
	private void initComponents() {
		
	
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		campo_codigo = new javax.swing.JTextField();
		botao_buscar = new javax.swing.JButton();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		campo_nome = new javax.swing.JTextField();
		campo_telefone = new javax.swing.JTextField();
		campo_celular = new javax.swing.JTextField();
		campo_email = new javax.swing.JTextField();
		botao_atualizar = new javax.swing.JButton();
		botao_excluir = new javax.swing.JButton();
		botao_fechar = new javax.swing.JButton();
		
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); 
		jLabel1.setText("Atulazar Clientes");
		jLabel2.setText("Código");
		
		botao_buscar.setText("Busca...");
		botao_buscar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				botao_buscarActionPerformed(evt);
			}
		});
		
		jLabel3.setText("Nome");
		
		jLabel4.setText("Telefone");
			
		jLabel5.setText("Email");
		
		jLabel6.setText("Celular");
		
		botao_atualizar.setText("Atualizar");
		botao_atualizar.setEnabled(false);
		botao_atualizar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				botao_atualizarActionPerformed(evt);
			}
		});
		botao_excluir.setText("Excluir");
		botao_excluir.setEnabled(false);
		botao_excluir.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				botao_excluirActionPerformed(evt);
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
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup()
										.addGap(119, 119, 119)
										.addComponent(jLabel1))
								.addGroup(layout.createSequentialGroup()
										.addGap(23, 23, 23)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.
										LEADING)
								.addGroup(layout.createSequentialGroup()
										.addComponent(jLabel2)
										.addGap(18, 18, 18)
										.addComponent(campo_codigo, javax.swing.GroupLayout.
												PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.
												RELATED)
										.addComponent(botao_buscar))
								.addGroup(layout.createSequentialGroup()
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.
												Alignment.LEADING)
												.addComponent(jLabel3)
												.addComponent(jLabel4)
												.addComponent(jLabel6)
												.addComponent(jLabel5))
										.addGap(30, 30, 30)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.
												Alignment.LEADING, false)
												.addComponent(campo_email, javax.swing.GroupLayout.
														DEFAULT_SIZE, 189, Short.MAX_VALUE)
												.addComponent(campo_celular)
												.addComponent(campo_telefone)
												.addComponent(campo_nome))
										.addGap(29, 29, 29)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.
												Alignment.LEADING)
												.addComponent(botao_excluir, javax.swing.GroupLayout.
														DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.
														MAX_VALUE)
												.addComponent(botao_fechar, javax.swing.GroupLayout.
														DEFAULT_SIZE, 77, Short.MAX_VALUE)))))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.
										createSequentialGroup()
										.addGap(0, 0, Short.MAX_VALUE)
										.addComponent(botao_atualizar)))
						.addContainerGap())
	
	);
	layout.setVerticalGroup(
			layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
			.addGroup(layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
							.addGroup(layout.createSequentialGroup()
									.addComponent(jLabel1)
									.addGap(32, 32, 32)
									.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.
											BASELINE)
											.addComponent(jLabel2)
											.addComponent(campo_codigo, javax.swing.GroupLayout.PREFERRED_SIZE,
													javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.
													PREFERRED_SIZE)
											.addComponent(botao_buscar))
									.addGap(29, 29, 29)
									.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.
											BASELINE)
											.addComponent(jLabel3)
											.addComponent(campo_nome, javax.swing.GroupLayout.PREFERRED_SIZE,
													javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.
													PREFERRED_SIZE))
									.addGap(18, 18, 18)
									.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.
											BASELINE)
											.addComponent(jLabel4)
											.addComponent(campo_telefone, javax.swing.GroupLayout.PREFERRED_SIZE
													, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.
													PREFERRED_SIZE))
									.addGap(18, 18, 18)
									.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.
											BASELINE)
											.addComponent(jLabel6)
											.addComponent(campo_celular, javax.swing.GroupLayout.PREFERRED_SIZE,
													javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.
													PREFERRED_SIZE))
									.addGap(18, 18, 18)
									.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.
											BASELINE)
											.addComponent(jLabel5)
											.addComponent(campo_email, javax.swing.GroupLayout.PREFERRED_SIZE,
													javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.
													PREFERRED_SIZE)))
							.addGroup(layout.createSequentialGroup()
									.addGap(79, 79, 79)
									.addComponent(botao_atualizar)
									.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
									.addComponent(botao_excluir)
									.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
									.addComponent(botao_fechar)))
					.addContainerGap(49, Short.MAX_VALUE))
	
			);
		pack();
	}
	private void botao_buscarActionPerformed(java.awt.event.ActionEvent evt) {
	
		try{
		Clientes clientes = new Clientes();
		clientes.setID(Integer.parseInt(campo_codigo.getText()));
		Conexao conexao = new Conexao();
		clientes = conexao.ProcurarCliente(clientes.getID());
		if(clientes.getID() != 0){
			campo_nome.setText(clientes.getNOME());
			campo_telefone.setText(clientes.getTELEFONE());
			campo_email.setText(clientes.getEMAIL());
			campo_celular.setText(clientes.getCELULAR());
	
			botao_atualizar.setEnabled(true);
			botao_excluir.setEnabled(true);
		}else{
		JOptionPane.showMessageDialog(null, "Cliente não encontrado","Aviso",
		JOptionPane.ERROR_MESSAGE);
		}
	}
		catch(Exception ex){
			JOptionPane.showMessageDialog(null, "Erro no banco de dados "+ex.getMessage(),
					"Aviso",JOptionPane.ERROR_MESSAGE);
		}
	}
		private void botao_atualizarActionPerformed(java.awt.event.ActionEvent evt) {
	
			try{
				int id = Integer.parseInt(campo_codigo.getText());
				String nome = campo_nome.getText();
				String telefone = campo_telefone.getText();
				String celular = campo_celular.getText();
				String email = campo_email.getText();
					Clientes clientes = new Clientes(nome, telefone, celular, email);
					Conexao conecta_cliente = new Conexao();
					conecta_cliente.AtualizarCliente(clientes, id);
					JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso!","Aviso",
					JOptionPane.INFORMATION_MESSAGE);
			} catch(Exception ex){
				JOptionPane.showMessageDialog(null, "Erro no banco de dados"+ex.getMessage(),"Aviso"
						,JOptionPane.ERROR_MESSAGE);
			}
	
		}
	
	
	private void botao_excluirActionPerformed(java.awt.event.ActionEvent evt) {
	
		try{
			int id = Integer.parseInt(campo_codigo.getText());
			Conexao conecta_cliente = new Conexao();
			conecta_cliente.RemoverCliente(id);
			campo_codigo.setText("");
			campo_nome.setText("");
			campo_telefone.setText("");
			campo_celular.setText("");
			campo_email.setText("");
			JOptionPane.showMessageDialog(null, "Dados removidos com sucesso!","Aviso",
					JOptionPane.INFORMATION_MESSAGE);
		}catch(Exception ex) {
			JOptionPane.showMessageDialog(null, "Erro do banco de dados"+ex.getMessage(),"Aviso"
			,JOptionPane.ERROR_MESSAGE);
			ex.printStackTrace();
		}
	}
	private void botao_fecharActionPerformed(java.awt.event.ActionEvent evt) {
	
	dispose();
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
			java.util.logging.Logger.getLogger(AtuCliente.class.getName()).log(java.util.logging
					.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(AtuCliente.class.getName()).log(java.util.logging
					.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(AtuCliente.class.getName()).log(java.util.logging
					.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(AtuCliente.class.getName()).log(java.util.logging
					.Level.SEVERE, null, ex);
		}
	
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new AtuCliente().setVisible(true);
			}
	
		});
	}
	
	private javax.swing.JButton botao_atualizar;
	private javax.swing.JButton botao_buscar;
	private javax.swing.JButton botao_excluir;
	private javax.swing.JButton botao_fechar;
	private javax.swing.JTextField campo_celular;
	private javax.swing.JTextField campo_codigo;
	private javax.swing.JTextField campo_email;
	private javax.swing.JTextField campo_nome;
	private javax.swing.JTextField campo_telefone;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	
	}