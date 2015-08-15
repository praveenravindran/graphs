package maze;

import java.io.File;
import java.io.FileNotFoundException;
//import java.util.Arrays;
import java.util.Scanner;

public class FileReader {
	
	private int maze[][];
	private int rowsNo;
	private int colsNo;
	private String fileName;
	private int startPosition[];
	
	public FileReader(String fileName, int rows, int cols){
		this.fileName=fileName;
		this.rowsNo=rows;
		this.colsNo=cols;
		maze = new int[rowsNo][colsNo];
	}
	
	public void parseFile(){
		try {
			Scanner scanner = new Scanner(new File(this.fileName));
			for(int i=0;i<this.rowsNo;i++){
				for(int j=0;j<this.colsNo;j++){
					maze[i][j]=scanner.nextInt();
					if(maze[i][j]==2){
						this.startPosition= new int[2];
						this.startPosition[0]=i;
						this.startPosition[1]=j;
					}
				}
			}
			//System.out.println(Arrays.deepToString(maze));
			//System.out.println(Arrays.toString(this.startPosition));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public int[][] getMaze() {
		return maze;
	}

	public void setMaze(int[][] maze) {
		this.maze = maze;
	}

	public int[] getStartPosition() {
		return startPosition;
	}

	public void setStartPosition(int[] startPosition) {
		this.startPosition = startPosition;
	}

}
