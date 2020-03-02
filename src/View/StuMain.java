/*
 * StuMain.java
 *
 * Created on __DATE__, __TIME__
 */

package View;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import model.DataConnection;
import model.ModelFactory;
import model.SLogin;
import model.StuGrade;

/**
 *
 * @author  __USER__
 */
public class StuMain extends javax.swing.JFrame {

	/** Creates new form StuMain */
	private static SLogin stu;

	public StuMain(SLogin stu) {
		initComponents();
		this.setTitle("学生成绩管理系统-学生");
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		DataConnection dc = new DataConnection();
		try {
			ArrayList<StuGrade> res = ModelFactory.StuGrade(dc.getStat());
			String title[] = { "课程名称", "成绩" };
			Object o[][] = new Object[res.size()][2];
			for (int i = 0; i < res.size(); i++) {
				o[i][0] = res.get(i).getCname();
				o[i][1] = res.get(i).getGrade();
			}
			DefaultTableModel dtm = new DefaultTableModel(o, title);
			this.jTable1.setModel(dtm);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	//	public StuMain() {
	//		// TODO Auto-generated constructor stub
	//	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel2 = new javax.swing.JPanel();
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jButton1 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1
				.setText("\u4eb2\u7231\u7684\u540c\u5b66\uff0c\u4f60\u597d\uff01\u6b22\u8fce\u6765\u5230\u5b66\u751f\u6210\u7ee9\u7ba1\u7406\u7cfb\u7edf\uff01");

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null }, { null, null },
						{ null, null }, { null, null }, { null, null },
						{ null, null }, { null, null } }, new String[] {
						"Title 1", "Title 2" }));
		jScrollPane1.setViewportView(jTable1);

		jButton1.setText("\u5237      \u65b0");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel1Layout.createSequentialGroup().addComponent(jLabel1)
						.addContainerGap(252, Short.MAX_VALUE)).addComponent(
				jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 516,
				Short.MAX_VALUE).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				jPanel1Layout.createSequentialGroup().addContainerGap(350,
						Short.MAX_VALUE).addComponent(jButton1,
						javax.swing.GroupLayout.PREFERRED_SIZE, 103,
						javax.swing.GroupLayout.PREFERRED_SIZE).addGap(63, 63,
						63)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addComponent(jLabel1)
										.addGap(33, 33, 33)
										.addComponent(
												jScrollPane1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												173,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jButton1).addGap(35, 35,
												35)));

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel2Layout.createSequentialGroup().addContainerGap()
						.addComponent(jPanel1,
								javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel2Layout.createSequentialGroup().addContainerGap()
						.addComponent(jPanel1,
								javax.swing.GroupLayout.DEFAULT_SIZE, 297,
								Short.MAX_VALUE).addContainerGap()));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		this.dispose();
		new StuMain(stu).setVisible(true);
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
				new StuMain(stu).setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	// End of variables declaration//GEN-END:variables

}