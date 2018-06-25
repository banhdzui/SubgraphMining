import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import javax.swing.JToolBar;

public class SubgraphMining {

	private JFrame frame;
	private JTextField txtGraphFile;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SubgraphMining window = new SubgraphMining();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SubgraphMining() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 758, 640);
		frame.setMinimumSize(new Dimension(600, 370));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmHelpContents = new JMenuItem("Help Contents");
		mnHelp.add(mntmHelpContents);
		
		JToolBar toolBar = new JToolBar();
		menuBar.add(toolBar);
		
		JButton btnRun = new JButton("Run");
		toolBar.add(btnRun);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {30, 100, 100, 250, 20};
		gridBagLayout.rowHeights = new int[] {30, 160, 170, 200, 30, 20};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JPanel pnlInput = new JPanel();
		pnlInput.setBorder(new TitledBorder(null, "Input Files", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_pnlInput = new GridBagConstraints();
		gbc_pnlInput.gridwidth = 3;
		gbc_pnlInput.fill = GridBagConstraints.BOTH;
		gbc_pnlInput.insets = new Insets(0, 0, 5, 0);
		gbc_pnlInput.gridx = 1;
		gbc_pnlInput.gridy = 1;
		frame.getContentPane().add(pnlInput, gbc_pnlInput);
		GridBagLayout gbl_pnlInput = new GridBagLayout();
		gbl_pnlInput.columnWidths = new int[]{80, 400, 0, 0};
		gbl_pnlInput.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_pnlInput.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_pnlInput.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlInput.setLayout(gbl_pnlInput);
		
		JLabel lblNewLabel = new JLabel("Graph:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		pnlInput.add(lblNewLabel, gbc_lblNewLabel);
		
		txtGraphFile = new JTextField();
		GridBagConstraints gbc_txtGraphFile = new GridBagConstraints();
		gbc_txtGraphFile.anchor = GridBagConstraints.WEST;
		gbc_txtGraphFile.insets = new Insets(0, 0, 5, 5);
		gbc_txtGraphFile.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtGraphFile.gridx = 1;
		gbc_txtGraphFile.gridy = 0;
		pnlInput.add(txtGraphFile, gbc_txtGraphFile);
		txtGraphFile.setColumns(10);
		
		JButton button = new JButton("...");
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.anchor = GridBagConstraints.WEST;
		gbc_button.insets = new Insets(0, 0, 5, 0);
		gbc_button.gridx = 2;
		gbc_button.gridy = 0;
		pnlInput.add(button, gbc_button);
		
		JLabel lblNewLabel_1 = new JLabel("Labels:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		pnlInput.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.anchor = GridBagConstraints.WEST;
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 1;
		pnlInput.add(textField, gbc_textField);
		textField.setColumns(10);
		
		JButton button_1 = new JButton("...");
		GridBagConstraints gbc_button_1 = new GridBagConstraints();
		gbc_button_1.anchor = GridBagConstraints.WEST;
		gbc_button_1.insets = new Insets(0, 0, 5, 0);
		gbc_button_1.gridx = 2;
		gbc_button_1.gridy = 1;
		pnlInput.add(button_1, gbc_button_1);
		
		JLabel lblInterestingVertices = new JLabel("Interesting vertices:");
		GridBagConstraints gbc_lblInterestingVertices = new GridBagConstraints();
		gbc_lblInterestingVertices.anchor = GridBagConstraints.EAST;
		gbc_lblInterestingVertices.insets = new Insets(0, 0, 5, 5);
		gbc_lblInterestingVertices.gridx = 0;
		gbc_lblInterestingVertices.gridy = 2;
		pnlInput.add(lblInterestingVertices, gbc_lblInterestingVertices);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 2;
		pnlInput.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JButton button_2 = new JButton("...");
		GridBagConstraints gbc_button_2 = new GridBagConstraints();
		gbc_button_2.anchor = GridBagConstraints.WEST;
		gbc_button_2.insets = new Insets(0, 0, 5, 0);
		gbc_button_2.gridx = 2;
		gbc_button_2.gridy = 2;
		pnlInput.add(button_2, gbc_button_2);
		
		JLabel lblBackground = new JLabel("Background:");
		GridBagConstraints gbc_lblBackground = new GridBagConstraints();
		gbc_lblBackground.anchor = GridBagConstraints.EAST;
		gbc_lblBackground.insets = new Insets(0, 0, 0, 5);
		gbc_lblBackground.gridx = 0;
		gbc_lblBackground.gridy = 3;
		pnlInput.add(lblBackground, gbc_lblBackground);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 0, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 3;
		pnlInput.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JButton button_3 = new JButton("...");
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.anchor = GridBagConstraints.WEST;
		gbc_button_3.gridx = 2;
		gbc_button_3.gridy = 3;
		pnlInput.add(button_3, gbc_button_3);
		
		JPanel pnlOptions1 = new JPanel();
		pnlOptions1.setBorder(new TitledBorder(null, "Options", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_pnlOptions1 = new GridBagConstraints();
		gbc_pnlOptions1.gridwidth = 2;
		gbc_pnlOptions1.fill = GridBagConstraints.BOTH;
		gbc_pnlOptions1.insets = new Insets(0, 0, 5, 5);
		gbc_pnlOptions1.gridx = 1;
		gbc_pnlOptions1.gridy = 2;
		frame.getContentPane().add(pnlOptions1, gbc_pnlOptions1);
		GridBagLayout gbl_pnlOptions1 = new GridBagLayout();
		gbl_pnlOptions1.columnWidths = new int[]{0, 0, 0};
		gbl_pnlOptions1.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_pnlOptions1.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_pnlOptions1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlOptions1.setLayout(gbl_pnlOptions1);
		
		JLabel lblPvalue = new JLabel("Minimum support:");
		GridBagConstraints gbc_lblPvalue = new GridBagConstraints();
		gbc_lblPvalue.insets = new Insets(0, 0, 5, 5);
		gbc_lblPvalue.anchor = GridBagConstraints.EAST;
		gbc_lblPvalue.gridx = 0;
		gbc_lblPvalue.gridy = 0;
		pnlOptions1.add(lblPvalue, gbc_lblPvalue);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 0);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 1;
		gbc_textField_3.gridy = 0;
		pnlOptions1.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("p-value:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 1;
		pnlOptions1.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 0);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 1;
		gbc_textField_4.gridy = 1;
		pnlOptions1.add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNumberOfVertices = new JLabel("Number of vertices:");
		GridBagConstraints gbc_lblNumberOfVertices = new GridBagConstraints();
		gbc_lblNumberOfVertices.anchor = GridBagConstraints.EAST;
		gbc_lblNumberOfVertices.insets = new Insets(0, 0, 5, 5);
		gbc_lblNumberOfVertices.gridx = 0;
		gbc_lblNumberOfVertices.gridy = 2;
		pnlOptions1.add(lblNumberOfVertices, gbc_lblNumberOfVertices);
		
		textField_5 = new JTextField();
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.insets = new Insets(0, 0, 5, 0);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 1;
		gbc_textField_5.gridy = 2;
		pnlOptions1.add(textField_5, gbc_textField_5);
		textField_5.setColumns(10);
		
		JLabel lblAlgorithm = new JLabel("Algorithm:");
		GridBagConstraints gbc_lblAlgorithm = new GridBagConstraints();
		gbc_lblAlgorithm.anchor = GridBagConstraints.EAST;
		gbc_lblAlgorithm.insets = new Insets(0, 0, 0, 5);
		gbc_lblAlgorithm.gridx = 0;
		gbc_lblAlgorithm.gridy = 3;
		pnlOptions1.add(lblAlgorithm, gbc_lblAlgorithm);
		
		JComboBox comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 3;
		pnlOptions1.add(comboBox, gbc_comboBox);
		
		JPanel pnlOptions2 = new JPanel();
		pnlOptions2.setBorder(new TitledBorder(null, "Options", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		GridBagConstraints gbc_pnlOptions2 = new GridBagConstraints();
		gbc_pnlOptions2.insets = new Insets(0, 0, 5, 0);
		gbc_pnlOptions2.fill = GridBagConstraints.BOTH;
		gbc_pnlOptions2.gridx = 3;
		gbc_pnlOptions2.gridy = 2;
		frame.getContentPane().add(pnlOptions2, gbc_pnlOptions2);
		GridBagLayout gbl_pnlOptions2 = new GridBagLayout();
		gbl_pnlOptions2.columnWidths = new int[]{0, 0};
		gbl_pnlOptions2.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_pnlOptions2.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_pnlOptions2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		pnlOptions2.setLayout(gbl_pnlOptions2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Run with single label ");
		GridBagConstraints gbc_rdbtnNewRadioButton = new GridBagConstraints();
		gbc_rdbtnNewRadioButton.anchor = GridBagConstraints.WEST;
		gbc_rdbtnNewRadioButton.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnNewRadioButton.gridx = 0;
		gbc_rdbtnNewRadioButton.gridy = 0;
		pnlOptions2.add(rdbtnNewRadioButton, gbc_rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Undirected graph");
		GridBagConstraints gbc_rdbtnNewRadioButton_1 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_1.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnNewRadioButton_1.anchor = GridBagConstraints.WEST;
		gbc_rdbtnNewRadioButton_1.gridx = 0;
		gbc_rdbtnNewRadioButton_1.gridy = 1;
		pnlOptions2.add(rdbtnNewRadioButton_1, gbc_rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNestedPvalue = new JRadioButton("Nested p-value");
		GridBagConstraints gbc_rdbtnNestedPvalue = new GridBagConstraints();
		gbc_rdbtnNestedPvalue.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnNestedPvalue.anchor = GridBagConstraints.WEST;
		gbc_rdbtnNestedPvalue.gridx = 0;
		gbc_rdbtnNestedPvalue.gridy = 2;
		pnlOptions2.add(rdbtnNestedPvalue, gbc_rdbtnNestedPvalue);
		
		JRadioButton rdbtnStatistical = new JRadioButton("Memory statistics");
		GridBagConstraints gbc_rdbtnStatistical = new GridBagConstraints();
		gbc_rdbtnStatistical.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtnStatistical.anchor = GridBagConstraints.WEST;
		gbc_rdbtnStatistical.gridx = 0;
		gbc_rdbtnStatistical.gridy = 3;
		pnlOptions2.add(rdbtnStatistical, gbc_rdbtnStatistical);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Verbose");
		GridBagConstraints gbc_rdbtnNewRadioButton_2 = new GridBagConstraints();
		gbc_rdbtnNewRadioButton_2.anchor = GridBagConstraints.WEST;
		gbc_rdbtnNewRadioButton_2.gridx = 0;
		gbc_rdbtnNewRadioButton_2.gridy = 4;
		pnlOptions2.add(rdbtnNewRadioButton_2, gbc_rdbtnNewRadioButton_2);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Progress Report", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.gridwidth = 3;
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 1;
		gbc_panel.gridy = 3;
		frame.getContentPane().add(panel, gbc_panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JTextArea textArea = new JTextArea();
		panel.add(textArea);
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.gridwidth = 3;
		gbc_panel_1.insets = new Insets(0, 0, 0, 5);
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 4;
		frame.getContentPane().add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] {250, 351, 0};
		gbl_panel_1.rowHeights = new int[]{23, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JProgressBar progressBar = new JProgressBar();
		GridBagConstraints gbc_progressBar = new GridBagConstraints();
		gbc_progressBar.fill = GridBagConstraints.BOTH;
		gbc_progressBar.insets = new Insets(0, 0, 0, 5);
		gbc_progressBar.gridx = 0;
		gbc_progressBar.gridy = 0;
		panel_1.add(progressBar, gbc_progressBar);
		
		JLabel lblNewLabel_3 = new JLabel("status");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.fill = GridBagConstraints.BOTH;
		gbc_lblNewLabel_3.gridx = 1;
		gbc_lblNewLabel_3.gridy = 0;
		panel_1.add(lblNewLabel_3, gbc_lblNewLabel_3);
	}

}
