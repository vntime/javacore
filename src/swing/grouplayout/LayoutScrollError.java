/**
 * Copyright on vntime(2017).
 */
package swing.grouplayout;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JButton;
import java.awt.Component;

/**
 * @author vntime
 *
 */
public class LayoutScrollError extends JFrame {

    private JPanel contentPane;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LayoutScrollError frame = new LayoutScrollError();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public LayoutScrollError() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 660, 407);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setViewportBorder(new LineBorder(new Color(0, 0, 0)));
        GroupLayout gl_contentPane = new GroupLayout(contentPane);
        gl_contentPane.setHorizontalGroup(
            gl_contentPane.createParallelGroup(Alignment.LEADING)
                .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 634, GroupLayout.PREFERRED_SIZE)
        );
        gl_contentPane.setVerticalGroup(
            gl_contentPane.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_contentPane.createSequentialGroup()
                    .addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 271, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(87, Short.MAX_VALUE))
        );
        
        JPanel panel = new JPanel();
        panel.setAlignmentY(Component.TOP_ALIGNMENT);
        panel.setAlignmentX(Component.LEFT_ALIGNMENT);
        scrollPane.setViewportView(panel);
        
        JPanel panel_1 = new JPanel();
        panel_1.setAlignmentY(Component.TOP_ALIGNMENT);
        panel_1.setAlignmentX(Component.LEFT_ALIGNMENT);
        panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
        GroupLayout gl_panel = new GroupLayout(panel);
        gl_panel.setHorizontalGroup(
            gl_panel.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_panel.createSequentialGroup()
                    .addGap(1)
                    .addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 605, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1, Short.MAX_VALUE))
        );
        gl_panel.setVerticalGroup(
            gl_panel.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_panel.createSequentialGroup()
                    .addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 1618, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        
        JButton btnNewButton_1 = new JButton("New button");
        
        JButton btnNewButton = new JButton("New button");
        
        JButton btnNewButton_2 = new JButton("New button");
        GroupLayout gl_panel_1 = new GroupLayout(panel_1);
        gl_panel_1.setHorizontalGroup(
            gl_panel_1.createParallelGroup(Alignment.TRAILING)
                .addGroup(gl_panel_1.createSequentialGroup()
                    .addContainerGap(213, Short.MAX_VALUE)
                    .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
                        .addGroup(gl_panel_1.createSequentialGroup()
                            .addComponent(btnNewButton_1)
                            .addGap(5)
                            .addComponent(btnNewButton))
                        .addGroup(gl_panel_1.createSequentialGroup()
                            .addComponent(btnNewButton_2)
                            .addGap(234))))
        );
        gl_panel_1.setVerticalGroup(
            gl_panel_1.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_panel_1.createSequentialGroup()
                    .addGap(5)
                    .addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
                        .addComponent(btnNewButton_1)
                        .addComponent(btnNewButton))
                    .addGap(600)
                    .addComponent(btnNewButton_2)
                    .addContainerGap(198, Short.MAX_VALUE))
        );
        panel_1.setLayout(gl_panel_1);
        panel.setLayout(gl_panel);
        contentPane.setLayout(gl_contentPane);
    }
}
