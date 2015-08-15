package maze;

import java.util.Arrays;


public class MazeSolver {
	
	private int maze[][];
	private int startingPosition[];
	private boolean isVisited[][];
	
	
	public void solveMaze(String fileName,int rows, int cols){
		
		
		FileReader fileReader = new FileReader(fileName,rows,cols);
		fileReader.parseFile();
		this.maze=fileReader.getMaze();
		this.startingPosition=fileReader.getStartPosition();
		this.isVisited=new boolean[this.maze.length][this.maze.length];
		//System.out.println(Arrays.deepToString(maze));
		//System.out.println(Arrays.toString(this.startingPosition));
		System.out.println(isVisited[0][0]);

		try {
			findWayOut(this.startingPosition[0],this.startingPosition[1]);
			System.out.println("no solutions");
		} catch (RuntimeException e) {
			
			System.out.println("Exit Found");
		}
		
		
			//dfs(this.startingPosition[0],this.startingPosition[1]+1);
			//System.out.println("No Solution Found");
		
	}
	
	public void findWayOut(int i,int j){
		
		System.out.println(i + "," + j);
		
		if(maze[i][j]==3){
			System.out.println(i + "," + j);
			throw new RuntimeException();
		}
		
		if(maze[i][j] ==1 ){
			return;
		}
		
		if(i < 0 || i >= maze.length){
			return;
		}
		
		if(j < 0 || j >= maze.length){
			return;
		}
		
		if(this.isVisited[i][j]){
			return;
		}
		
		else{
			this.isVisited[i][j]=true;
			findWayOut(i+1,j);
			findWayOut(i,j+1);
			findWayOut(i,j-1);
			findWayOut(i-1,j);
		}
		
	}
}
	