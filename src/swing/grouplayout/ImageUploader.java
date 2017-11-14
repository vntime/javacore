/**
 * Copyright on vntime(2017).
 */
package swing.grouplayout;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 * @author vntime
 *
 */
public class ImageUploader extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JLabel lblNewLabel;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ImageUploader frame = new ImageUploader();
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
    public ImageUploader() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 662, 428);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        JButton btnFileOpen = new JButton("Reference");
        btnFileOpen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                FileNameExtensionFilter filter = new FileNameExtensionFilter("Image Files", "jpg", "png", "gif",
                        "jpeg");
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setFileFilter(filter);
                fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                int returnVal = fileChooser.showOpenDialog(contentPane);
                if (returnVal == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();
                    BufferedImage myPicture;
                    try {
                        myPicture = ImageIO.read(file);

                        // Image dimg = myPicture.getScaledInstance(lblNewLabel.getWidth(),
                        // lblNewLabel.getHeight(),
                        //
                        // Image.SCALE_SMOOTH);
                        // lblNewLabel.setIcon(new ImageIcon(dimg));

                        ImageIcon imageIcon;
                        int y = myPicture.getHeight() / lblNewLabel.getHeight();
                        int x = lblNewLabel.getWidth() / myPicture.getWidth();
                        if (x > y) {
                            imageIcon = new ImageIcon(new ImageIcon(myPicture).getImage().getScaledInstance(
                                    lblNewLabel.getWidth(), myPicture.getHeight() * (x / y), Image.SCALE_SMOOTH));
                        } else {
                            imageIcon = new ImageIcon(new ImageIcon(myPicture).getImage().getScaledInstance(
                                    lblNewLabel.getWidth(), myPicture.getHeight() * (y / x), Image.SCALE_SMOOTH));
                        }
                        // imageIcon = new ImageIcon(
                        // new ImageIcon(myPicture).getImage().getScaledInstance(20, 20,
                        // Image.SCALE_DEFAULT));
                        lblNewLabel.setIcon(imageIcon);
                        lblNewLabel.setAlignmentX(JLabel.CENTER_ALIGNMENT);
                        lblNewLabel.setAlignmentY(JLabel.CENTER_ALIGNMENT);
                        lblNewLabel.setIcon(imageIcon);

                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }

                }
                String url = fileChooser.getSelectedFile().toString();
                textField.setText(url);
            }
        });

        textField = new JTextField();
        textField.setColumns(10);
        textField.setEditable(false);

        lblNewLabel = new JLabel("");
        lblNewLabel.setBorder(new LineBorder(new Color(0, 0, 0)));
        GroupLayout gl_contentPane = new GroupLayout(contentPane);
        gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING).addGroup(gl_contentPane
                .createSequentialGroup()
                .addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
                        .addGroup(gl_contentPane.createSequentialGroup().addContainerGap().addComponent(lblNewLabel,
                                GroupLayout.PREFERRED_SIZE, 381, GroupLayout.PREFERRED_SIZE))
                        .addGroup(gl_contentPane.createSequentialGroup().addGap(91)
                                .addComponent(textField, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                                .addComponent(btnFileOpen)))
                .addGap(152)));
        gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
                .addGroup(gl_contentPane.createSequentialGroup()
                        .addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 241, GroupLayout.PREFERRED_SIZE)
                        .addGap(44)
                        .addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
                                .addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
                                        GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnFileOpen))
                        .addContainerGap(71, Short.MAX_VALUE)));
        contentPane.setLayout(gl_contentPane);
    }
}
