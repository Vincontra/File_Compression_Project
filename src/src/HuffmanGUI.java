import javax.swing.*;
import java.awt.*;
import java.io.File;

public class HuffmanGUI extends JFrame {

    public HuffmanGUI() {
        setTitle("Huffman File Compression");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Layout
        setLayout(new GridLayout(3, 1, 10, 10));

        JLabel title = new JLabel("Huffman Compression System", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 16));

        JButton compressBtn = new JButton("Compress File");
        JButton decompressBtn = new JButton("Decompress File");

        add(title);
        add(compressBtn);
        add(decompressBtn);

        // Compress action
        compressBtn.addActionListener(e -> compressFile());

        // Decompress action
        decompressBtn.addActionListener(e -> decompressFile());
    }

    private void compressFile() {
        JFileChooser chooser = new JFileChooser();

        // Select source file
        int result = chooser.showOpenDialog(this);
        if (result != JFileChooser.APPROVE_OPTION) return;

        File inputFile = chooser.getSelectedFile();

        // Select destination file
        result = chooser.showSaveDialog(this);
        if (result != JFileChooser.APPROVE_OPTION) return;

        File outputFile = chooser.getSelectedFile();

        try {
            HuffCompression.compress(
                    inputFile.getAbsolutePath(),
                    outputFile.getAbsolutePath()
            );
            JOptionPane.showMessageDialog(this, "File Compressed Successfully!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Compression Failed!");
            ex.printStackTrace();
        }
    }

    private void decompressFile() {
        JFileChooser chooser = new JFileChooser();

        // Select compressed file
        int result = chooser.showOpenDialog(this);
        if (result != JFileChooser.APPROVE_OPTION) return;

        File inputFile = chooser.getSelectedFile();

        // Select output file
        result = chooser.showSaveDialog(this);
        if (result != JFileChooser.APPROVE_OPTION) return;

        File outputFile = chooser.getSelectedFile();

        try {
            HuffCompression.decompress(
                    inputFile.getAbsolutePath(),
                    outputFile.getAbsolutePath()
            );
            JOptionPane.showMessageDialog(this, "File Decompressed Successfully!");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Decompression Failed!");
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new HuffmanGUI().setVisible(true);
        });
    }
}
