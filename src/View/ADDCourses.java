/*
 * ADDCourses.java
 *
 * Created on __DATE__, __TIME__
 */

package View;

import java.sql.SQLException;

import javax.swing.JOptionPane;

import model.AddCourses;
import model.ModelFactory;

/**
 *
 * @author  __USER__
 */
public class ADDCourses extends javax.swing.JFrame {

	/** Creates new form ADDCourses */
	public ADDCourses() {
		initComponents();
		this.setTitle("���ӿγ�");
		this.setResizable(false);
		this.setLocationRelativeTo(null);
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel5 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jTextField2 = new javax.swing.JTextField();
		jTextField3 = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jTextField5 = new javax.swing.JTextField();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jLabel1.setFont(new java.awt.Font("����", 0, 18));
		jLabel1.setForeground(new java.awt.Color(102, 102, 102));
		jLabel1
				.setText("\u8bf7\u8f93\u5165\u8981\u589e\u52a0\u7684\u8bfe\u7a0b\u4fe1\u606f");

		jLabel2.setText("\u8bfe\u7a0b\u540d\u79f0:");

		jLabel3.setText("\u4e0a\u8bfe\u65f6\u95f4:");

		jLabel4.setText("\u4efb\u6559\u8001\u5e08:");

		jLabel5.setText("\u8bfe\u7a0b\u72b6\u6001:");

		jTextField3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField3ActionPerformed(evt);
			}
		});

		jButton1.setText("\u786e\u8ba4");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					jButton1ActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jButton2.setText("\u53d6\u6d88");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				94,
																				94,
																				94)
																		.addComponent(
																				jLabel1))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				59,
																				59,
																				59)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jLabel2)
																						.addComponent(
																								jLabel3)
																						.addComponent(
																								jLabel4)
																						.addComponent(
																								jLabel5))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addGap(
																												16,
																												16,
																												16)
																										.addComponent(
																												jButton1)
																										.addGap(
																												18,
																												18,
																												18)
																										.addComponent(
																												jButton2))
																						.addGroup(
																								jPanel1Layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.TRAILING,
																												false)
																										.addComponent(
																												jTextField3,
																												javax.swing.GroupLayout.Alignment.LEADING)
																										.addComponent(
																												jTextField2,
																												javax.swing.GroupLayout.Alignment.LEADING)
																										.addGroup(
																												javax.swing.GroupLayout.Alignment.LEADING,
																												jPanel1Layout
																														.createSequentialGroup()
																														.addGap(
																																1,
																																1,
																																1)
																														.addGroup(
																																jPanel1Layout
																																		.createParallelGroup(
																																				javax.swing.GroupLayout.Alignment.TRAILING,
																																				false)
																																		.addComponent(
																																				jTextField5,
																																				javax.swing.GroupLayout.Alignment.LEADING)
																																		.addComponent(
																																				jTextField1,
																																				javax.swing.GroupLayout.Alignment.LEADING,
																																				javax.swing.GroupLayout.DEFAULT_SIZE,
																																				190,
																																				Short.MAX_VALUE)))))))
										.addGap(67, 67, 67)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addGap(30, 30, 30)
										.addComponent(jLabel1)
										.addGap(18, 18, 18)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel2)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel3)
														.addComponent(
																jTextField5,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel4)
														.addComponent(
																jTextField2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(15, 15, 15)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel5)
														.addComponent(
																jTextField3,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton2)
														.addComponent(jButton1))
										.addContainerGap(45, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 375,
				Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		this.dispose();
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)
			throws SQLException, ClassNotFoundException {
		// TODO add your handling code here:
		String cname = this.jTextField1.getText();
		String cteacher = this.jTextField2.getText();
		String ctime = this.jTextField5.getText();
		String state = this.jTextField3.getText();
		AddCourses addCourse = ModelFactory.AddCourses(cname, cteacher, ctime,
				state);
		try {
			if (addCourse == null) {
				throw new Exception("�γ����ӳɹ���");
			} else
				throw new Exception("�γ�����ʧ�ܣ�");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, e.getMessage());
		}

	}

	private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		try {
			org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
		} catch (Exception e) {
			// TODO exception
		}
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ADDCourses().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField5;
	// End of variables declaration//GEN-END:variables

}