package Backtracking;

public class ratinamaze {
    public static void main(String[] args){
        int[][] maze=new int[3][3];   //block in a maze
        maze[1][1]=2;  
        mazepath(maze,0,0," ");
        // mazepath(new int[3][3],0,0," ");  //left-rigth up down ke leye

    }

public static void mazepath(int [][] maze,int r, int c, String ans){
    if(r==maze.length-1 && c==maze[0].length-1){
        System.out.println(ans);
        return;
    }
//    else if(r<0 || r>=maze.length || c<0 || c>=maze[0].length || maze[r][c]==1)
   else if(r<0 || r>=maze.length || c<0 || c>=maze[0].length || maze[r][c]!=0){
    return;

    }
    else{
        maze[r][c]=1;
        int [] row ={0,0,1,-1};   //Diagonally chlane ke leye 
        int col[]={1,-1,0,0};
        String[] a={"R","L","D","U"};
        for(int i=0;i<row.length;i++){
            mazepath(maze, r+row[i],c+col[i], ans+a[i]);
        }

        // mazepath(maze, r, c+1, ans+"R");
        // mazepath(maze, r, c-1, ans+"L");
        // mazepath(maze, r+1, c, ans+"D");
        // mazepath(maze, r-1, c, ans+"U");
        maze[r][c]=0;
    }
}
    
}
