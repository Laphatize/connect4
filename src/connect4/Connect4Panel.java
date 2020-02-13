/*
 * Project Name: Connect 4
 * 
 * Project Description:  
 * In this two player game, you will try to get a column filled vertically, 
 * Horizontally, or diagonally.
 * 
 * Project Author: Pranav Ramesh
 * 
 */

package connect4;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Connect4Panel extends JPanel {

	// The first turn will always go to blue.
	String currentPlayer = "blue";
	JButton button = new JButton("Make Move");

	public Connect4Panel() {
		this.setFocusable(true);

		add(button);

	}



	int[][] grid = new int[][] { { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 },
			{ 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0 } };

			
			/*
			 * 0 0 0 0 0 1 0
			 * 0 0 0 0 1 1 0
			 * 0 0 0 1 0 0 0
			 * 0 0 1 0 0 0 0
			 * 0 1 0 0 0 0 0
			 * 1 0 0 0 0 0 0
			 */
	public void paintComponent(Graphics board) {

		
		
		
		/*
		if (grid[0][1] == 1 && grid[1][1] == 1 && grid[2][1] == 1 && grid[3][1] == 1 && grid[4][1] == 1 && grid[5][1] == 1 && grid[6][1] == 1 ) {
			System.out.println("Blue won the game!");
		}
		
		if (grid[0][2] == 1 && grid[1][2] == 1 && grid[2][2] == 1 && grid[3][2] == 1 && grid[4][2] == 1 && grid[5][2] == 1 && grid[6][2] == 1 ) {
			System.out.println("Blue won the game!");
		}
		
		if (grid[0][3] == 1 && grid[1][3] == 1 && grid[2][3] == 1 && grid[3][3] == 1 && grid[4][3] == 1 && grid[5][3] == 1 && grid[6][3] == 1 ) {
			System.out.println("Blue won the game!");
		}
		
		if (grid[0][4] == 1 && grid[1][4] == 1 && grid[2][4] == 1 && grid[3][4] == 1 && grid[4][4] == 1 && grid[5][4] == 1 && grid[6][4] == 1 ) {
			System.out.println("Blue won the game!");
		}
		
		if (grid[0][5] == 1 && grid[1][5] == 1 && grid[2][5] == 1 && grid[3][5] == 1 && grid[4][5] == 1 && grid[5][5] == 1 && grid[6][5] == 1 ) {
			System.out.println("Blue won the game!");
		}
		
		
		*/
		try {
			BufferedImage dbImage = ImageIO.read(new File("C:\\Users\\lapha\\Downloads\\connect4-background.jpg"));
			board.drawImage(dbImage, 0, 0, getWidth(), getHeight(), this);
		} catch (IOException e) {

			e.printStackTrace();

		}

		button.addActionListener(new ActionListener() {
			String response = "nothing";

			@Override
			public void actionPerformed(ActionEvent evt) {
				
				//  ensure nobody has one a game yet
				
				

				// horizontal and vertical checks
				for (int i = 0; i < 6; i++) {
					if (grid[0][i] == 1 && grid[1][i] == 1 && grid[2][i] == 1 && grid[3][i] == 1 && grid[4][i] == 1 && grid[5][i] == 1 && grid[6][i] == 1 ) {
						System.out.println("Blue won the game!");
					}
				}
				
				for (int i = 0; i < 5; i++) {
					if (grid[i][0] == 1 && grid[i][0] == 1 && grid[i][0] == 1 && grid[i][0] == 1 && grid[i][0] == 1 && grid[5][i] == 1 && grid[6][i] == 1 ) {
						System.out.println("Blue won the game!");
					}
				}
				
				
				for (int i = 0; i < 6; i++) {
					if (grid[0][i] == 2 && grid[1][i] == 2 && grid[2][i] == 2 && grid[3][i] == 2 && grid[4][i] == 2 && grid[5][i] == 2 && grid[6][i] == 2 ) {
						System.out.println("Red won the game!");
					}
				}
				
				for (int i = 0; i < 5; i++) {
					if (grid[i][0] == 2 && grid[i][0] == 2 && grid[i][0] == 2 && grid[i][0] == 2 && grid[i][0] == 2 && grid[5][i] == 2 && grid[6][i] == 2 ) {
						System.out.println("Red won the game!");
					}
				}
				response = JOptionPane.showInputDialog(
						"Current Player: " + currentPlayer + ".\nTell what column you want to drop a coin.");
				if (currentPlayer.equals("blue")) {
					// System.out.println(grid[0][0]);
					if (response.equals("1")) {
						if (grid[0][5] == 0) {
							grid[0][5] = 1;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
						} else if (grid[0][4] == 0) {
							grid[0][4] = 1;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						} else if (grid[0][3] == 0) {
							grid[0][3] = 1;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						} else if (grid[0][2] == 0) {
							grid[0][2] = 1;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						} else if (grid[0][1] == 0) {
							grid[0][1] = 1;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						} else if (grid[0][0] == 0) {
							System.out.println("touched");
							grid[0][0] = 1;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						}

					}
					// 2nd column blue
					if (response.equals("2")) {
						if (grid[1][5] == 0) {
							grid[1][5] = 1;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
						} else if (grid[1][4] == 0) {
							grid[1][4] = 1;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						} else if (grid[1][3] == 0) {
							grid[1][3] = 1;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						} else if (grid[1][2] == 0) {
							grid[1][2] = 1;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						} else if (grid[1][1] == 0) {
							grid[1][1] = 1;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						} else if (grid[1][0] == 0) {
							System.out.println("touched");
							grid[1][0] = 1;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						}

					}
					
					// third column
					if (response.equals("3")) {
						if (grid[2][5] == 0) {
							grid[2][5] = 1;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
						} else if (grid[1][4] == 0) {
							grid[2][4] = 1;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						} else if (grid[1][3] == 0) {
							grid[2][3] = 1;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						} else if (grid[2][2] == 0) {
							grid[2][2] = 1;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						} else if (grid[2][1] == 0) {
							grid[2][1] = 1;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						} else if (grid[2][0] == 0) {
							System.out.println("touched");
							grid[2][0] = 1;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						}

					}
					
					
					// third column
					if (response.equals("4")) {
						if (grid[3][5] == 0) {
							grid[3][5] = 1;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
						} else if (grid[3][4] == 0) {
							grid[3][4] = 1;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						} else if (grid[3][3] == 0) {
							grid[3][3] = 1;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						} else if (grid[3][2] == 0) {
							grid[3][2] = 1;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						} else if (grid[3][1] == 0) {
							grid[3][1] = 1;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						} else if (grid[3][0] == 0) {
							System.out.println("touched");
							grid[3][0] = 1;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						}

					}
					
					// thirdISH i forget  column
					if (response.equals("5")) {
						if (grid[4][5] == 0) {
							grid[4][5] = 1;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
						} else if (grid[4][4] == 0) {
							grid[4][4] = 1;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						} else if (grid[4][3] == 0) {
							grid[4][3] = 1;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						} else if (grid[3][2] == 0) {
							grid[4][2] = 1;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						} else if (grid[4][1] == 0) {
							grid[4][1] = 1;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						} else if (grid[4][0] == 0) {
							System.out.println("touched");
							grid[4][0] = 1;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						}
						
						

					}
					
					
					
					
					
					
					
					
					// third column
					if (response.equals("6")) {
						if (grid[5][5] == 0) {
							grid[5][5] = 1;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
						} else if (grid[5][4] == 0) {
							grid[5][4] = 1;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						} else if (grid[5][3] == 0) {
							grid[5][3] = 1;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						} else if (grid[5][2] == 0) {
							grid[5][2] = 1;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						} else if (grid[5][1] == 0) {
							grid[5][1] = 1;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						} else if (grid[5][0] == 0) {
							System.out.println("touched");
							grid[5][0] = 1;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						}

					}
					
					// third column
					if (response.equals("7")) {
						if (grid[6][5] == 0) {
							grid[6][5] = 1;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
						} else if (grid[6][4] == 0) {
							grid[6][4] = 1;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						} else if (grid[6][3] == 0) {
							grid[6][3] = 1;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						} else if (grid[6][2] == 0) {
							grid[6][2] = 1;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						} else if (grid[6][1] == 0) {
							grid[6][1] = 1;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						} else if (grid[6][0] == 0) {
							System.out.println("touched");
							grid[6][0] = 1;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						}

					}
					
					
					
					
					
					// RED PLAYER
				} else {
					if (response.equals("1")) {
						if (grid[0][5] == 0) {
							grid[0][5] = 2;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
						} else if (grid[0][4] == 0) {
							grid[0][4] = 2;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						} else if (grid[0][3] == 0) {
							grid[0][3] = 2;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						} else if (grid[0][2] == 0) {
							grid[0][2] = 2;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						} else if (grid[0][1] == 0) {
							grid[0][1] = 2;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						} else if (grid[0][0] == 0) {
							System.out.println("touched");
							grid[0][0] = 2;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						}

					}
					// 2nd column blue
					if (response.equals("2")) {
						if (grid[1][5] == 0) {
							grid[1][5] = 2;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
						} else if (grid[1][4] == 0) {
							grid[1][4] = 2;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						} else if (grid[1][3] == 0) {
							grid[1][3] = 2;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						} else if (grid[1][2] == 0) {
							grid[1][2] = 2;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						} else if (grid[1][1] == 0) {
							grid[1][1] = 2;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						} else if (grid[1][0] == 0) {
							System.out.println("touched");
							grid[1][0] = 2;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						}

					}
					
					// third column
					if (response.equals("3")) {
						if (grid[2][5] == 0) {
							grid[2][5] = 1;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
						} else if (grid[1][4] == 0) {
							grid[2][4] = 2;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						} else if (grid[1][3] == 0) {
							grid[2][3] = 2;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						} else if (grid[2][2] == 0) {
							grid[2][2] = 2;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						} else if (grid[2][1] == 0) {
							grid[2][1] = 2;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						} else if (grid[2][0] == 0) {
							System.out.println("touched");
							grid[2][0] = 2;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						}

					}
					
					
					// third column
					if (response.equals("4")) {
						if (grid[3][5] == 0) {
							grid[3][5] = 2;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
						} else if (grid[3][4] == 0) {
							grid[3][4] = 2;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						} else if (grid[3][3] == 0) {
							grid[3][3] = 2;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						} else if (grid[3][2] == 0) {
							grid[3][2] = 2;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						} else if (grid[3][1] == 0) {
							grid[3][1] = 2;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						} else if (grid[3][0] == 0) {
							System.out.println("touched");
							grid[3][0] = 2;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						}

					}
					
					// thirdISH i forget  column
					if (response.equals("5")) {
						if (grid[4][5] == 0) {
							grid[4][5] = 2;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
						} else if (grid[4][4] == 0) {
							grid[4][4] = 2;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						} else if (grid[4][3] == 0) {
							grid[4][3] = 2;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						} else if (grid[3][2] == 0) {
							grid[4][2] = 2;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						} else if (grid[4][1] == 0) {
							grid[4][1] = 2;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						} else if (grid[4][0] == 0) {
							System.out.println("touched");
							grid[4][0] = 2;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						}
						
						

					}
					
					
					
					
					
					
					
					
					// third column
					if (response.equals("6")) {
						if (grid[5][5] == 0) {
							grid[5][5] = 2;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
						} else if (grid[5][4] == 0) {
							grid[5][4] = 2;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						} else if (grid[5][3] == 0) {
							grid[5][3] = 2;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						} else if (grid[5][2] == 0) {
							grid[5][2] = 2;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						} else if (grid[5][1] == 0) {
							grid[5][1] = 2;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						} else if (grid[5][0] == 0) {
							System.out.println("touched");
							grid[5][0] = 2;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						}

					}
					
					// third column
					if (response.equals("7")) {
						if (grid[6][5] == 0) {
							grid[6][5] = 2;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
						} else if (grid[6][4] == 0) {
							grid[6][4] = 2;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						} else if (grid[6][3] == 0) {
							grid[6][3] = 2;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						} else if (grid[6][2] == 0) {
							grid[6][2] = 2;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						} else if (grid[6][1] == 0) {
							grid[6][1] = 2;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						} else if (grid[6][0] == 0) {
							System.out.println("touched");
							grid[6][0] = 2;
							repaint();
							if (currentPlayer.equals("blue")) {
								currentPlayer = "red";
							} else {
								currentPlayer = "blue";
							}
							// return;
						}

					}
					
					
					
					
					

				}
			}
		});

		// Column 1

		try {
			BufferedImage dbImage = ImageIO.read(new File("C:\\Users\\lapha\\Downloads\\game-logo.png"));
			board.drawImage(dbImage, 0, 0, getWidth(), getHeight(), this);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			BufferedImage dbImage = ImageIO.read(new File("C:\\Users\\lapha\\Downloads\\connect4-background.jpg"));
			board.drawImage(dbImage, 0, 0, getWidth(), getHeight(), this);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		board.setColor(Color.green);
		Font currentFont = board.getFont();
		Font newFont = currentFont.deriveFont(currentFont.getSize() * 1.8F);
		board.setFont(newFont);
		board.drawString("Current Player: " + currentPlayer, 100, 80);

		if (grid[0][0] == 1) {
			board.setColor(Color.blue);
		} else if (grid[0][0] == 0) {
			board.setColor(Color.black);
		} else {
			board.setColor(Color.red);
		}
		board.fillOval(100, 100, 40, 40);

		if (grid[0][1] == 1) {
			board.setColor(Color.blue);
		} else if (grid[0][1] == 0) {
			board.setColor(Color.black);
		} else {
			board.setColor(Color.red);
		}
		board.fillOval(100, 180, 40, 40);

		if (grid[0][2] == 1) {
			board.setColor(Color.blue);
		} else if (grid[0][2] == 0) {
			board.setColor(Color.black);
		} else {
			board.setColor(Color.red);
		}
		board.fillOval(100, 260, 40, 40);

		if (grid[0][3] == 1) {
			board.setColor(Color.blue);
		} else if (grid[0][3] == 0) {
			board.setColor(Color.black);
		} else {
			board.setColor(Color.red);
		}
		board.fillOval(100, 340, 40, 40);

		if (grid[0][4] == 1) {
			board.setColor(Color.blue);
		} else if (grid[0][4] == 0) {
			board.setColor(Color.black);
		} else {
			board.setColor(Color.red);
		}
		board.fillOval(100, 420, 40, 40);

		if (grid[0][5] == 1) {
			board.setColor(Color.blue);
		} else if (grid[0][5] == 0) {
			board.setColor(Color.black);
		} else {
			board.setColor(Color.red);
		}
		board.fillOval(100, 500, 40, 40);

		// Column 2

		if (grid[1][0] == 1) {
			board.setColor(Color.blue);
		} else if (grid[1][0] == 0) {
			board.setColor(Color.black);
		} else {
			board.setColor(Color.red);
		}
		board.fillOval(200, 100, 40, 40);

		if (grid[1][1] == 1) {
			board.setColor(Color.blue);
		} else if (grid[1][1] == 0) {
			board.setColor(Color.black);
		} else {
			board.setColor(Color.red);
		}
		board.fillOval(200, 180, 40, 40);

		if (grid[1][2] == 1) {
			board.setColor(Color.blue);
		} else if (grid[1][2] == 0) {
			board.setColor(Color.black);
		} else {
			board.setColor(Color.red);
		}
		board.fillOval(200, 260, 40, 40);

		if (grid[1][3] == 1) {
			board.setColor(Color.blue);
		} else if (grid[1][3] == 0) {
			board.setColor(Color.black);
		} else {
			board.setColor(Color.red);
		}
		board.fillOval(200, 340, 40, 40);

		if (grid[1][4] == 1) {
			board.setColor(Color.blue);
		} else if (grid[1][4] == 0) {
			board.setColor(Color.black);
		} else {
			board.setColor(Color.red);
		}
		board.fillOval(200, 420, 40, 40);

		if (grid[1][5] == 1) {
			board.setColor(Color.blue);
		} else if (grid[1][5] == 0) {
			board.setColor(Color.black);
		} else {
			board.setColor(Color.red);
		}
		board.fillOval(200, 500, 40, 40);

		// Column 3

		if (grid[2][0] == 1) {
			board.setColor(Color.blue);
		} else if (grid[2][0] == 0) {
			board.setColor(Color.black);
		} else {
			board.setColor(Color.red);
		}
		board.fillOval(300, 100, 40, 40);

		if (grid[2][1] == 1) {
			board.setColor(Color.blue);
		} else if (grid[2][1] == 0) {
			board.setColor(Color.black);
		} else {
			board.setColor(Color.red);
		}
		board.fillOval(300, 180, 40, 40);

		if (grid[2][2] == 1) {
			board.setColor(Color.blue);
		} else if (grid[2][2] == 0) {
			board.setColor(Color.black);
		} else {
			board.setColor(Color.red);
		}
		board.fillOval(300, 260, 40, 40);

		if (grid[2][3] == 1) {
			board.setColor(Color.blue);
		} else if (grid[2][3] == 0) {
			board.setColor(Color.black);
		} else {
			board.setColor(Color.red);
		}
		board.fillOval(300, 340, 40, 40);

		if (grid[2][4] == 1) {
			board.setColor(Color.blue);
		} else if (grid[2][4] == 0) {
			board.setColor(Color.black);
		} else {
			board.setColor(Color.red);
		}
		board.fillOval(300, 420, 40, 40);

		if (grid[2][5] == 1) {
			board.setColor(Color.blue);
		} else if (grid[2][5] == 0) {
			board.setColor(Color.black);
		} else {
			board.setColor(Color.red);
		}
		board.fillOval(300, 500, 40, 40);

		// Column 5

		if (grid[3][0] == 1) {
			board.setColor(Color.blue);
		} else if (grid[3][0] == 0) {
			board.setColor(Color.black);
		} else {
			board.setColor(Color.red);
		}
		board.fillOval(400, 100, 40, 40);

		if (grid[3][1] == 1) {
			board.setColor(Color.blue);
		} else if (grid[3][1] == 0) {
			board.setColor(Color.black);
		} else {
			board.setColor(Color.red);
		}
		board.fillOval(400, 180, 40, 40);

		if (grid[3][2] == 1) {
			board.setColor(Color.blue);
		} else if (grid[3][2] == 0) {
			board.setColor(Color.black);
		} else {
			board.setColor(Color.red);
		}
		board.fillOval(400, 260, 40, 40);

		if (grid[3][3] == 1) {
			board.setColor(Color.blue);
		} else if (grid[3][3] == 0) {
			board.setColor(Color.black);
		} else {
			board.setColor(Color.red);
		}
		board.fillOval(400, 340, 40, 40);

		if (grid[3][4] == 1) {
			board.setColor(Color.blue);
		} else if (grid[3][4] == 0) {
			board.setColor(Color.black);
		} else {
			board.setColor(Color.red);
		}
		board.fillOval(400, 420, 40, 40);

		if (grid[3][5] == 1) {
			board.setColor(Color.blue);
		} else if (grid[3][5] == 0) {
			board.setColor(Color.black);
		} else {
			board.setColor(Color.red);
		}
		board.fillOval(400, 500, 40, 40);
		// Column 6

		if (grid[4][0] == 1) {
			board.setColor(Color.blue);
		} else if (grid[4][0] == 0) {
			board.setColor(Color.black);
		} else {
			board.setColor(Color.red);
		}
		board.fillOval(500, 100, 40, 40);

		if (grid[4][1] == 1) {
			board.setColor(Color.blue);
		} else if (grid[4][1] == 0) {
			board.setColor(Color.black);
		} else {
			board.setColor(Color.red);
		}
		board.fillOval(500, 180, 40, 40);

		if (grid[4][2] == 1) {
			board.setColor(Color.blue);
		} else if (grid[4][2] == 0) {
			board.setColor(Color.black);
		} else {
			board.setColor(Color.red);
		}
		board.fillOval(500, 260, 40, 40);

		if (grid[4][3] == 1) {
			board.setColor(Color.blue);
		} else if (grid[4][3] == 0) {
			board.setColor(Color.black);
		} else {
			board.setColor(Color.red);
		}
		board.fillOval(500, 340, 40, 40);

		if (grid[4][4] == 1) {
			board.setColor(Color.blue);
		} else if (grid[4][4] == 0) {
			board.setColor(Color.black);
		} else {
			board.setColor(Color.red);
		}
		board.fillOval(500, 420, 40, 40);

		if (grid[4][5] == 1) {
			board.setColor(Color.blue);
		} else if (grid[4][5] == 0) {
			board.setColor(Color.black);
		} else {
			board.setColor(Color.red);
		}
		board.fillOval(500, 500, 40, 40);

		// Column 6

		if (grid[5][0] == 1) {
			board.setColor(Color.blue);
		} else if (grid[5][0] == 0) {
			board.setColor(Color.black);
		} else {
			board.setColor(Color.red);
		}
		board.fillOval(600, 100, 40, 40);

		if (grid[5][1] == 1) {
			board.setColor(Color.blue);
		} else if (grid[5][1] == 0) {
			board.setColor(Color.black);
		} else {
			board.setColor(Color.red);
		}
		board.fillOval(600, 180, 40, 40);

		if (grid[5][2] == 1) {
			board.setColor(Color.blue);
		} else if (grid[5][2] == 0) {
			board.setColor(Color.black);
		} else {
			board.setColor(Color.red);
		}
		board.fillOval(600, 260, 40, 40);

		if (grid[5][3] == 1) {
			board.setColor(Color.blue);
		} else if (grid[5][3] == 0) {
			board.setColor(Color.black);
		} else {
			board.setColor(Color.red);
		}
		board.fillOval(600, 340, 40, 40);

		if (grid[5][4] == 1) {
			board.setColor(Color.blue);
		} else if (grid[5][4] == 0) {
			board.setColor(Color.black);
		} else {
			board.setColor(Color.red);
		}
		board.fillOval(600, 420, 40, 40);

		if (grid[5][5] == 1) {
			board.setColor(Color.blue);
		} else if (grid[5][5] == 0) {
			board.setColor(Color.black);
		} else {
			board.setColor(Color.red);
		}
		board.fillOval(600, 500, 40, 40);

		// next column
		// Column 6
		if (grid[6][0] == 1) {
			board.setColor(Color.blue);
		} else if (grid[6][0] == 0) {
			board.setColor(Color.black);
		} else {
			board.setColor(Color.red);
		}
		board.fillOval(700, 100, 40, 40);

		if (grid[6][1] == 1) {
			board.setColor(Color.blue);
		} else if (grid[6][1] == 0) {
			board.setColor(Color.black);
		} else {
			board.setColor(Color.red);
		}
		board.fillOval(700, 180, 40, 40);

		if (grid[6][2] == 1) {
			board.setColor(Color.blue);
		} else if (grid[6][2] == 0) {
			board.setColor(Color.black);
		} else {
			board.setColor(Color.red);
		}
		board.fillOval(700, 260, 40, 40);

		if (grid[6][3] == 1) {
			board.setColor(Color.blue);
		} else if (grid[6][3] == 0) {
			board.setColor(Color.black);
		} else {
			board.setColor(Color.red);
		}
		board.fillOval(700, 340, 40, 40);

		if (grid[6][4] == 1) {
			board.setColor(Color.blue);
		} else if (grid[6][4] == 0) {
			board.setColor(Color.black);
		} else {
			board.setColor(Color.red);
		}
		board.fillOval(700, 420, 40, 40);

		if (grid[6][5] == 1) {
			board.setColor(Color.blue);
		} else if (grid[6][5] == 0) {
			board.setColor(Color.black);
		} else {
			board.setColor(Color.red);
		}
		board.fillOval(700, 500, 40, 40);
	}

}
