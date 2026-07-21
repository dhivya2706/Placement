public class island
{
    public static int check(char[][] grid)
    {
        int c=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]=='1')
                {
                    dfs(grid,i,j);
                    c++;
                }
            }
        }
        return c;
    }
    public static void dfs(char[][] grid,int i,int j)
    {
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length|| grid[i][j]=='0')
        {
            return;
        }
        grid[i][j]='0';
        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
    }
	public static void main(String[] args) {
		 char[][] grid={
                {'1','1','0'},
                {'0','1','0'},
                {'1','0','1'}
        };
		int res=check(grid);
		System.out.println(res);
	}
}