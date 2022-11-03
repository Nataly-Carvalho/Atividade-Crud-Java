package Telas;

public class menu extends javax.swing.JFrame {

	public menu() {
		initComponents();
	}

	@SuppressWarnings("unchecked")
	private void initComponents() {
	
	jButton1 = new javax.swing.JButton();
	jLabel2 = new javax.swing.JLabel();
	jMenuBar1 = new javax.swing.JMenuBar();
	jMenu1 = new javax.swing.JMenu();
	jMenuItem1 = new javax.swing.JMenuItem();
	jMenuItem2 = new javax.swing.JMenuItem();
	jSeparator1 = new javax.swing.JPopupMenu.Separator();
	jSair = new javax.swing.JMenuItem();
	
	setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

	jButton1.setText("Sair");
	jButton1.addActionListener(new java.awt.event.ActionListener() {
	public void actionPerformed(java.awt.event.ActionEvent evt) {
	jButton1ActionPerformed(evt);
	}
	
	});
	jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource(
	"/Telas/ETE_IMAGEM_gif.gif")));
	
	
	jMenu1.setText("Clientes ETE");
	jMenu1.addActionListener(new java.awt.event.ActionListener() {
		public void actionPerformed(java.awt.event.ActionEvent evt) {
			jMenu1ActionPerformed(evt);
	
		}
	});
	jMenuItem1.setText("Novo Cliente");
	jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
		public void actionPerformed(java.awt.event.ActionEvent evt) {
			jMenuItem1ActionPerformed(evt);
		}
	});
	jMenu1.add(jMenuItem1);
	
	jMenuItem2.setText("Atualizar cliente");
	jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
		public void actionPerformed(java.awt.event.ActionEvent evt) {
			jMenuItem2ActionPerformed(evt);
		}
	});
	jMenu1.add(jMenuItem2);
	jMenu1.add(jSeparator1);
	jSair.setText("Sair");
	jSair.addActionListener(new java.awt.event.ActionListener() {
		public void actionPerformed(java.awt.event.ActionEvent evt) {
			jSairActionPerformed(evt);
		}
	});
	jMenu1.add(jSair);
	
	jMenuBar1.add(jMenu1);
	
	setJMenuBar(jMenuBar1);
	
	javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addGap(29, 29, 29)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.
										swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(layout.createSequentialGroup()
										.addGap(33, 33, 33)
										.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 239,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				);
		
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
				.addContainerGap()
				.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.
				GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,57,Short.MAX_VALUE)
				.addComponent(jButton1)
				.addContainerGap())
				);
		pack();
	}
	private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
	
		CadCliente CadCli = new CadCliente();
			CadCli.setVisible(true);
	}
	private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {}
	
	private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
	
		AtuCliente atucliente = new AtuCliente();
			atucliente.setVisible(true);
	}
	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
	
			dispose(); 
	}
	private void jSairActionPerformed(java.awt.event.ActionEvent evt) {
	
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
		java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level
				.SEVERE, null, ex);
	} catch (InstantiationException ex) {
		java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level
				.SEVERE, null, ex);
	} catch (IllegalAccessException ex) {
		java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level
				.SEVERE, null, ex);
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
		java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level
				.SEVERE, null, ex);
	}
	
	java.awt.EventQueue.invokeLater(new Runnable() {
		public void run() {
			new menu().setVisible(true);
		}
		});
	}
	
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JMenu jMenu1;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JMenuItem jMenuItem1;
	private javax.swing.JMenuItem jMenuItem2;
	private javax.swing.JMenuItem jSair;
	private javax.swing.JPopupMenu.Separator jSeparator1;
	
	}
