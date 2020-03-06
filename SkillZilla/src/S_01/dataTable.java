package S_01;

	import java.io.*;
	import java.awt.*;
	import java.util.*;
	import javax.swing.*;
	import java.awt.event.*;
	import javax.swing.table.*;

	public class dataTable extends AbstractTableModel {
		Vector data;
		Vector columns;

		public dataTable() {
			String line;
			data = new Vector();
			columns = new Vector();
			try {
				
				FileInputStream fis = new FileInputStream("D:\\\\Studentinfo.txt");
				BufferedReader br = new BufferedReader(new InputStreamReader(fis));
				StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
				while (st1.hasMoreTokens())
					columns.addElement(st1.nextToken());
				while ((line = br.readLine()) != null) {
					StringTokenizer st2 = new StringTokenizer(line, " ");
					while (st2.hasMoreTokens())
						data.addElement(st2.nextToken());
				}
				br.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		public int getRowCount() {
			return data.size() / getColumnCount();
		}

		public int getColumnCount() {
			return columns.size();
		}

		public Object getValueAt(int rowIndex, int columnIndex) {
			return (String) data.elementAt((rowIndex * getColumnCount())
					+ columnIndex);
		}

		public static void main(String s[]) {
			dataTable model = new dataTable();
			JTable table = new JTable();
			table.setBounds(10,20,600,40);
			table.setModel(model);
			JScrollPane scrollpane = new JScrollPane(table);
			JPanel panel = new JPanel();
			panel.add(scrollpane);
			JFrame frame = new JFrame();
			frame.add(panel, "Center");
			frame.pack();
			frame.setVisible(true);
		}
	}
	


