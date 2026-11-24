import assessments.AssessmentFeed;

import java.awt.*;          // Color, GridLayout and BorderLayout.
import java.awt.event.*;    // MouseAdapter and MouseEvent (only if you add B9).
import java.util.ArrayList;
import javax.swing.*;       // JFrame, JPanel, JLabel, JButton and Swing Timer.
import static assessments.AssessmentFeed.getCIDs;
import static assessments.AssessmentFeed.getCIDs;

public class Main {
    private static int StudentNumber = 4+1;

    // ADD FIELDS HERE: copy only fields required by the chosen blocks.
    // PASTE at // ADD FIELDS HERE.
    private static final int REPORT_MS = 3000; // EDIT: 30 seconds; 24 simulated hours = 24 * 3000.
    private Timer reportTimer;


    private static final int ROWS = StudentNumber;             // EDIT: number of grid rows.
    private static final int COLS = 7;             // EDIT: cells in each row.
    private final JLabel[][] cells = new JLabel[ROWS][COLS];
    private final JFrame frame = new JFrame("My grid"); // EDIT: window title.
    private final JPanel controls = new JPanel();       // Optional buttons/sliders go here.








    public Main() {


        JPanel grid = new JPanel(new GridLayout(ROWS, COLS, 4, 4));
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                JLabel cell = new JLabel("-", SwingConstants.CENTER);
                cell.setOpaque(true);              // Needed to show background colours.
                cell.setBackground(Color.WHITE);
                cells[row][col] = cell;            // Save the reference for later updates.
                grid.add(cell);
            }
        }
        frame.setLayout(new BorderLayout());
        frame.add(grid, BorderLayout.CENTER);
        frame.add(controls, BorderLayout.SOUTH);
        // ADD CONSTRUCTOR LINES HERE: after cells exist, before setVisible.
        // PASTE inside constructor, after the loops build cells.
        updateCell(0, 0, "CID");      // EDIT: row, column and displayed text.
        updateCell(0, 1, "Type");
        updateCell(0, 2, "independentPT");
        updateCell(0, 3, "AIPP");
        updateCell(0, 4, "SDV");
        updateCell(0, 5, "Total");
        updateCell(0, 6, "weighted");// Delete if not needed.
// Example after the grid is built:
        markCell(0, 1, false);  //list of cids that alert            // EDIT: pass your warning condition.

        frame.setSize(600, 300);                   // EDIT: width and height in pixels.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        // ADD START CALLS HERE: e.g. startUpdates(); and startReporting();
// PASTE at // ADD START CALLS HERE.
        startReporting();



    }

    // ADD METHODS HERE: paste the chosen block methods before the final brace.
    // PASTE inside Main, under // ADD METHODS HERE.
    // PASTE inside Main, under // ADD METHODS HERE.
    private void markCell(int row, int col, boolean warning) {
        JLabel cell = cells[row][col];
        cell.setBackground(warning ? Color.RED : Color.WHITE);
        cell.setForeground(warning ? Color.WHITE : Color.BLACK);
    }

    private void updateCell(int row, int col, String text) {
        cells[row][col].setText(text);  // row and col begin at zero.
    }
    // PASTE under // ADD METHODS HERE.
    private void startReporting() {
        reportTimer = new Timer(REPORT_MS, e -> printReport());
        reportTimer.start();
    }

    private void printReport() {
        System.out.println("Report:");
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                System.out.print(cells[row][col].getText() + " | ");
            }
            System.out.println();
        }
    }




    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::new);    // Build the GUI on the Swing event thread.
    }

}
