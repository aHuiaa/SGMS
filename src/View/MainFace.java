/*
 * MainFace.java
 *
 * Created on __DATE__, __TIME__
 */

package View;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.AddCourses;
import model.CourseSelection;
import model.DataConnection;
import model.Grade;
import model.ModelFactory;
import model.SLogin;
import model.TLogin;
import model.Teacher;

/**
 * 
 * @author __USER__
 */
public class MainFace extends javax.swing.JFrame {

	/** Creates new form MainFace 
	 * @param tea */
	private TLogin tea;
	Object info[][];
	Object o[][];
	Object o2[][];

	public MainFace(TLogin tea) {
		initComponents();
		this.setTitle("学生成绩管理系统-教师");
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		//int tid = tea.getTid();
		DataConnection dc = new DataConnection();
		try {
			ArrayList<AddCourses> res = ModelFactory.TLookCourse(dc.getStat());
			String title3[] = { "课程编号", "课程名称", "授课老师", "上课时间", "课程状态" };
			o = new Object[res.size()][5];
			for (int i = 0; i < res.size(); i++) {
				o[i][0] = res.get(i).getCid();
				o[i][1] = res.get(i).getCname();
				o[i][2] = res.get(i).getCteacher();
				o[i][3] = res.get(i).getCtime();
				o[i][4] = res.get(i).getState();
			}
			DefaultTableModel dtm = new DefaultTableModel(o, title3);
			this.jTable3.setModel(dtm);
			ArrayList<CourseSelection> res2 = ModelFactory.CourseSelection(dc
					.getStat());
			String title2[] = { "课程名称", "上课时间", "学生学号", "学生姓名", "学生性别", "系别",
					"班级" };
			o2 = new Object[res2.size()][7];
			for (int i = 0; i < res2.size(); i++) {
				o2[i][0] = res2.get(i).getCname();
				o2[i][1] = res2.get(i).getCtime();
				o2[i][2] = res2.get(i).getStuId();
				o2[i][3] = res2.get(i).getStuName();
				o2[i][4] = res2.get(i).getSex();
				o2[i][5] = res2.get(i).getDepartment();
				o2[i][6] = res2.get(i).getStuClass();
			}
			DefaultTableModel dtm2 = new DefaultTableModel(o2, title2);
			this.jTable2.setModel(dtm2);

			ArrayList<Grade> res5 = ModelFactory.Grade(dc.getStat());
			String title5[] = { "学生学号", "学生姓名", "课程名称", "上课时间", "课程成绩" };
			info = new Object[res5.size()][5];
			for (int i = 0; i < res5.size(); i++) {
				info[i][0] = res5.get(i).getSid();
				info[i][1] = res5.get(i).getSname();
				info[i][2] = res5.get(i).getCname();
				info[i][3] = res5.get(i).getCtime();
				info[i][4] = res5.get(i).getGrade();

			}
			DefaultTableModel dtm5 = new DefaultTableModel(info, title5);
			this.jTable5.setModel(dtm5);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(this, e.getMessage());
		}

	}

	public MainFace() {
		// TODO Auto-generated constructor stub
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jToggleButton1 = new javax.swing.JToggleButton();
		panel1 = new java.awt.Panel();
		menuBar1 = new java.awt.MenuBar();
		menu1 = new java.awt.Menu();
		jTabbedPane1 = new javax.swing.JTabbedPane();
		jScrollPane4 = new javax.swing.JScrollPane();
		jTable4 = new javax.swing.JTable();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		jPanel1 = new javax.swing.JPanel();
		jPanel2 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jTabbedPane2 = new javax.swing.JTabbedPane();
		jPanel4 = new javax.swing.JPanel();
		jScrollPane3 = new javax.swing.JScrollPane();
		jTable3 = new javax.swing.JTable();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		jTextField1 = new javax.swing.JTextField();
		jPanel5 = new javax.swing.JPanel();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTable2 = new javax.swing.JTable();
		jButton6 = new javax.swing.JButton();
		jButton7 = new javax.swing.JButton();
		jButton8 = new javax.swing.JButton();
		jTextField2 = new javax.swing.JTextField();
		jPanel6 = new javax.swing.JPanel();
		jPanel3 = new javax.swing.JPanel();
		jScrollPane5 = new javax.swing.JScrollPane();
		jTable5 = new javax.swing.JTable();
		jButton11 = new javax.swing.JButton();
		jButton12 = new javax.swing.JButton();
		jTextField3 = new javax.swing.JTextField();
		jButton9 = new javax.swing.JButton();

		jToggleButton1.setText("jToggleButton1");

		javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(
				panel1);
		panel1.setLayout(panel1Layout);
		panel1Layout.setHorizontalGroup(panel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 100,
				Short.MAX_VALUE));
		panel1Layout.setVerticalGroup(panel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 100,
				Short.MAX_VALUE));

		menu1.setLabel("Menu");
		menuBar1.add(menu1);

		jTable4.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null },
						{ null, null, null, null } }, new String[] { "Title 1",
						"Title 2", "Title 3", "Title 4" }));
		jScrollPane4.setViewportView(jTable4);

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null },
						{ null, null, null, null } }, new String[] { "Title 1",
						"Title 2", "Title 3", "Title 4" }));
		jScrollPane1.setViewportView(jTable1);

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 105,
				Short.MAX_VALUE));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 0,
				Short.MAX_VALUE));

		jLabel1
				.setText("\u4eb2\u7231\u7684\u8001\u5e08\uff0c\u60a8\u597d\uff01\u6b22\u8fce\u6765\u5230\u5b66\u751f\u6210\u7ee9\u7ba1\u7406\u7cfb\u7edf\uff01");

		jTable3.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null } }, new String[] {
						"课程代号", "课程名称", "任教老师", "课程人数", "开课情况" }));
		jScrollPane3.setViewportView(jTable3);

		jButton3.setText("\u5f00\u8bfe/\u7ed3\u8bfe");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jButton4.setText("\u67e5\u627e\u8bfe\u7a0b");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		jTextField1.setText("\u8bf7\u8f93\u5165\u8bfe\u7a0b\u540d\u79f0");

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(
				jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout
				.setHorizontalGroup(jPanel4Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jScrollPane3,
								javax.swing.GroupLayout.DEFAULT_SIZE, 659,
								Short.MAX_VALUE)
						.addGroup(
								jPanel4Layout
										.createSequentialGroup()
										.addComponent(
												jTextField1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												136,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton4)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												220, Short.MAX_VALUE)
										.addComponent(
												jButton3,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												145,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(70, 70, 70)));
		jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel4Layout.createSequentialGroup().addComponent(
						jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE,
						219, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18,
						18, 18).addGroup(
						jPanel4Layout.createParallelGroup(
								javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jTextField1,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton4).addComponent(jButton3))
						.addContainerGap(19, Short.MAX_VALUE)));

		jTabbedPane2.addTab("\u8bfe\u7a0b\u67e5\u770b", jPanel4);

		jTable2.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null },
						{ null, null, null, null }, { null, null, null, null },
						{ null, null, null, null } }, new String[] { "Title 1",
						"Title 2", "Title 3", "Title 4" }));
		jScrollPane2.setViewportView(jTable2);

		jButton6.setText("\u589e\u52a0\u5b66\u751f");
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		jButton7.setText("\u5220\u9664\u5b66\u751f");
		jButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton7ActionPerformed(evt);
			}
		});

		jButton8.setText("\u67e5\u627e\u5b66\u751f");
		jButton8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton8ActionPerformed(evt);
			}
		});

		jTextField2.setText("\u8bf7\u8f93\u5165\u5b66\u751f\u59d3\u540d");

		javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(
				jPanel6);
		jPanel6.setLayout(jPanel6Layout);
		jPanel6Layout.setHorizontalGroup(jPanel6Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 100,
				Short.MAX_VALUE));
		jPanel6Layout.setVerticalGroup(jPanel6Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 100,
				Short.MAX_VALUE));

		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(
				jPanel5);
		jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout
				.setHorizontalGroup(jPanel5Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel5Layout
										.createSequentialGroup()
										.addComponent(
												jTextField2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												120,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton8)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												242, Short.MAX_VALUE)
										.addComponent(jButton6).addGap(18, 18,
												18).addComponent(jButton7)
										.addGap(29, 29, 29))
						.addGroup(
								jPanel5Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(
												jPanel6,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(547, Short.MAX_VALUE))
						.addComponent(jScrollPane2,
								javax.swing.GroupLayout.DEFAULT_SIZE, 659,
								Short.MAX_VALUE));
		jPanel5Layout
				.setVerticalGroup(jPanel5Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel5Layout
										.createSequentialGroup()
										.addComponent(
												jScrollPane2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												223,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												jPanel5Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jTextField2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jButton8)
														.addComponent(jButton6)
														.addComponent(jButton7))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(
												jPanel6,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap()));

		jTabbedPane2.addTab("\u5b66\u751f\u7ba1\u7406", jPanel5);

		jTable5.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null },
						{ null, null, null, null, null } }, new String[] {
						"学生学号", "学生姓名", "课程名称", "上课时间", "课程成绩" }));
		jScrollPane5.setViewportView(jTable5);

		jButton11.setText("\u4fee\u6539\u6210\u7ee9");
		jButton11.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton11ActionPerformed(evt);
			}
		});

		jButton12.setText("\u67e5\u8be2\u6210\u7ee9");
		jButton12.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton12ActionPerformed(evt);
			}
		});

		jTextField3.setText("\u8bf7\u8f93\u5165\u5b66\u751f\u59d3\u540d");

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(
				jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout
				.setHorizontalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jScrollPane5,
								javax.swing.GroupLayout.DEFAULT_SIZE, 659,
								Short.MAX_VALUE)
						.addGroup(
								jPanel3Layout
										.createSequentialGroup()
										.addGap(1, 1, 1)
										.addComponent(
												jTextField3,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												161,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton12)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												302, Short.MAX_VALUE)
										.addComponent(jButton11).addGap(26, 26,
												26)));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel3Layout.createSequentialGroup().addComponent(
						jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE,
						222, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(18,
						18, 18).addGroup(
						jPanel3Layout.createParallelGroup(
								javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButton11).addComponent(
										jTextField3,
										javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jButton12)).addContainerGap(16,
						Short.MAX_VALUE)));

		jTabbedPane2.addTab("\u6210\u7ee9\u7ba1\u7406", jPanel3);

		jButton9.setText("\u5237\u65b0");
		jButton9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton9ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout
				.setHorizontalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addComponent(
																				jTabbedPane2,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				664,
																				Short.MAX_VALUE)
																		.addContainerGap())
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel1)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				215,
																				Short.MAX_VALUE)
																		.addComponent(
																				jButton9,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				157,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				40,
																				40,
																				40)))));
		jPanel2Layout
				.setVerticalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addGap(22, 22, 22)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel1)
														.addComponent(jButton9))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jTabbedPane2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												312,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(121, Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup().addGap(583, 583, 583)
						.addComponent(jPanel1,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)).addComponent(jPanel2,
				javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addComponent(
												jPanel2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jPanel1,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
		String sid = o2[this.jTable2.getSelectedRow()][2] + "";
		String cname = o2[this.jTable2.getSelectedRow()][0] + "";
		try {
			ModelFactory.deleteCourseStu(new DataConnection().getStat(), cname, Integer.parseInt(sid));
			JOptionPane.showMessageDialog(this, "删除成功！");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String cid = o[this.jTable3.getSelectedRow()][0] + "";
		try {
			ModelFactory.changeCourse(new DataConnection().getStat(), Integer
					.parseInt(cid));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(this, e.getMessage());
		}
	}

	@SuppressWarnings("static-access")
	private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String sid = info[this.jTable5.getSelectedRow()][0] + "";
		String cname = info[this.jTable5.getSelectedRow()][2] + "";
		String result = this.jTable5.getValueAt(this.jTable5.getSelectedRow(),
				4)
				+ "";
		try {
			ModelFactory.changeResult(new DataConnection().getStat(), cname,
					Integer.parseInt(sid), Integer.parseInt(result));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(this, e.getMessage());
		}
	}

	private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		this.dispose();
		new MainFace(tea).setVisible(true);

	}

	private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String courses = this.jTextField3.getText();
		for (int i = 0; i < this.jTable5.getColumnCount(); i++) {
			if (courses.equals(this.jTable5.getValueAt(i, 1))) {
				this.setTitle(courses);
				this.jTable5.setRowSelectionInterval(i, i);
				this.jTable5.setSelectionBackground(Color.black);
				return;
			}
		}
	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String courses = this.jTextField1.getText();
		for (int i = 0; i < this.jTable3.getColumnCount(); i++) {
			if (courses.equals(this.jTable3.getValueAt(i, 1))) {
				this.setTitle(courses);
				this.jTable3.setRowSelectionInterval(i, i);
				this.jTable3.setSelectionBackground(Color.black);
				return;
			}
		}
	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		new AddCourseStu().setVisible(true);
	}

	private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		String courses = this.jTextField2.getText();
		for (int i = 0; i < this.jTable2.getColumnCount(); i++) {
			if (courses.equals(this.jTable2.getValueAt(i, 3))) {
				this.setTitle(courses);
				this.jTable2.setRowSelectionInterval(i, i);
				this.jTable2.setSelectionBackground(Color.black);
				return;
			}
		}
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		try {
			org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
		} catch (Exception e) {
			// TODO exception
		}
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new MainFace().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton11;
	private javax.swing.JButton jButton12;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JButton jButton8;
	private javax.swing.JButton jButton9;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JPanel jPanel6;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JScrollPane jScrollPane3;
	private javax.swing.JScrollPane jScrollPane4;
	private javax.swing.JScrollPane jScrollPane5;
	private javax.swing.JTabbedPane jTabbedPane1;
	private javax.swing.JTabbedPane jTabbedPane2;
	private javax.swing.JTable jTable1;
	private javax.swing.JTable jTable2;
	private javax.swing.JTable jTable3;
	private javax.swing.JTable jTable4;
	private javax.swing.JTable jTable5;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JToggleButton jToggleButton1;
	private java.awt.Menu menu1;
	private java.awt.MenuBar menuBar1;
	private java.awt.Panel panel1;
	// End of variables declaration//GEN-END:variables

}