/**
 * Support class for Game of Life
 * @author Philipp Graf
 */

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.Toolkit;
import java.util.Random;

import javax.swing.BoxLayout;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GoLGrid {
  private int gridElementPixels;

  private final int size;

  private int[][] cells;

  private GoLGridComponent gComp;

  public GoLGrid() {
    this(20);
  }

  /**
   * This initializes a window with a grid and shows it.
   * 
   * The window must be closed manually.
   * 
   * @param size Number of grid cells horizontally and vertically
   */
  public GoLGrid(int size) {
    this.size = size;

    // calc grid size
    Dimension sDimension = Toolkit.getDefaultToolkit().getScreenSize();
    int dim = Math.min(sDimension.width, sDimension.height) - 100;
    gridElementPixels = dim / Math.max(size, size);
    gridElementPixels = Math.max(gridElementPixels, 5);
    gridElementPixels = Math.min(gridElementPixels, 42);

    // Create cells
    cells = new int[size][size];
    for (int y = 0; y < size; y++) {
      for (int x = 0; x < size; x++) {
        cells[x][y] = 0;
      }
    }

    // Create UI
    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
    panel.setBackground(Color.WHITE);
    gComp = this.new GoLGridComponent();
    panel.add(gComp);
    gComp.setPreferredSize(new Dimension(getPixelXSize(), getPixelYSize()));

    JFrame frame = new JFrame("Game of Life");
    frame.setContentPane(panel);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setResizable(false);
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }

  private int getPixelXSize() {
    return size * gridElementPixels + 1;
  }

  private int getPixelYSize() {
    return size * gridElementPixels + 1;
  }

  /**
   * Set content of grid to contents given by array newCells
   * @param newCells Cell data: entry == 1 -> cell alive (black) / entry == 0 -> cell dead (white)
   */
  public void setData(int[][] newCells) {
    if (newCells.length != size) {
      throw new IllegalArgumentException("Expected array of dimensions " + size + "x" + size + ".");
    }

    for (int x = 0; x < size; x++) {
      if (newCells[x].length != size) {
        throw new IllegalArgumentException("Expected array of dimensions " + size + "x" + size + ".");
      }
      for (int y = 0; y < size; y++) {
        cells[x][y] = newCells[x][y];
      }
    }

    gComp.repaint();
  }

  /**
   * Creates data for a grid with random values
   * 
   * @param probabilityTrue
   *          Probability that an element value is true (0.0 - 1.0)
   * @return Array with random data fitting size of grid.
   */
  public int[][] createRandom(double probabilityTrue) {
    int[][] ret = new int[size][size];
        
    Random r = new Random();
    for (int y = 0; y < size; y++) {
      for (int x = 0; x < size; x++) {
        ret[x][y] = r.nextDouble() < probabilityTrue ? 1 : 0;
      }
    }
    return ret;
  }

  /**
   * Returns grid size (x and y)
   * 
   * @return Grid size
   */
  public int getGridSize() {
    return size;
  }
  
  /**
   * Calculates number of living neighbors of cell at (x,y). For cells at the
   * border of the grid neighbors include cells on the opposite side of grid.
   * 
   * @param x Horizontal index
   * @param y Vertical index
   * @return Number of neighbors alive
   */
  public int getNumberOfNeighbors(int x, int y) {
    int x_m_1 = x - 1;
    if (x_m_1 < 0) {
      x_m_1 = size - 1;
    }
    int y_m_1 = y - 1;
    if (y_m_1 < 0) {
      y_m_1 = size - 1;
    }

    int x_p_1 = x + 1;
    if (x_p_1 >= size) {
      x_p_1 = 0;
    }
    int y_p_1 = y + 1;
    if (y_p_1 >= size) {
      y_p_1 = 0;
    }

    int neighbors = cells[x_m_1][y_m_1] + cells[x][y_m_1]
        + cells[x_p_1][y_m_1] + cells[x_m_1][y] + cells[x_p_1][y]
        + cells[x_m_1][y_p_1] + cells[x][y_p_1]
        + cells[x_p_1][y_p_1];

    return neighbors;
  }
  
  /**
   * Pause for time in microseconds
   * @param microseconds Time in microseconds (1 second = 1000)
   */
  public void sleep(int microseconds) {
    try {
      Thread.sleep(microseconds);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
  
  
  
  private class GoLGridComponent extends JComponent {
    private static final long serialVersionUID = -2654674886073253732L;

    private final Stroke gridStroke = new BasicStroke(1.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10.0f, new float[]{3.0f}, 0.0f);

    @Override
    protected void paintComponent(Graphics g) {
      Graphics2D g2d = (Graphics2D)g;
      
      // Draw Grid Content
      for (int y = 0; y < size; y++) {
        for (int x = 0; x < size; x++) {
          g2d.setColor(cells[x][y] == 1 ? Color.BLACK : Color.WHITE);
          g2d.fillRect(x*gridElementPixels+1, y*gridElementPixels+1, gridElementPixels-1, gridElementPixels-1);
        }
      }
      
      // Draw Raster
      g2d.setStroke(gridStroke);    
      g2d.setColor(Color.LIGHT_GRAY);
      for(int y=0; y<=size; y++) {
          g2d.drawLine(0, y*gridElementPixels, getPixelXSize(), y*gridElementPixels);
        }
        
        for(int x=0; x<=size; x++){
          g2d.drawLine(x*gridElementPixels, 0, x*gridElementPixels, getPixelYSize());
        }
    }
    
  }
}
