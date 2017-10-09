/**
 * Copyright on vntime(2017).
 */
package swing.grouplayout;

import java.awt.EventQueue;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;

/**
 * @author vntime
 *
 */
public class DemoA extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8520730106743017144L;
	private JComponent label;
	private JComponent textField;
	private JComponent caseButton;
	private JComponent wholeButton;
	private JComponent wrapButton;
	private JComponent backButton;
	private JComponent findButton;
	private JComponent cancelButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					DemoA frame = new DemoA();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Initialize component
	 */
	private void init() {
		label = new JLabel("Label");
		textField = new JTextField();
		caseButton = new JButton("caseButton-------------");
		wholeButton = new JButton("wholeButton");
		wrapButton = new JButton("wrapButton-------------");
		backButton = new JButton("backButton");
		findButton = new JButton("Find Button");
		cancelButton = new JButton("Cancel Button");
	}

	/**
	 * Create the frame.
	 */
	public DemoA() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setSize(600, 400);
		setLocationRelativeTo(null);
		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);

		init();
		layout.setHorizontalGroup(layout.createSequentialGroup()
				.addComponent(label)
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,
		                   GroupLayout.PREFERRED_SIZE, Short.MAX_VALUE)
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(textField, 120, 120, 120)
						.addGroup(layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(caseButton)
										.addComponent(wholeButton)
								)
								.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(wrapButton)
										.addComponent(backButton)
								)
						)
				)
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,
		                   GroupLayout.PREFERRED_SIZE, Short.MAX_VALUE)
				
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
						.addComponent(findButton)
						.addComponent(cancelButton)
				)
		);
		layout.linkSize(SwingConstants.HORIZONTAL, caseButton, wholeButton);
		
		layout.setVerticalGroup(layout.createSequentialGroup()
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(label)
						.addComponent(textField)
						.addComponent(findButton)
				)
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,
		                   GroupLayout.PREFERRED_SIZE, Short.MAX_VALUE)
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
										.addComponent(caseButton,60,60,60)
										.addComponent(wrapButton)
								)
								.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(wholeButton,60,60,60)
										.addComponent(backButton)
								)
						)
						.addComponent(cancelButton)
				)
		);
		
	}

}
