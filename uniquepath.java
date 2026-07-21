class uniquePath {
    public int check(int r,int c, int m,int n)
    {
        if(r==m-1 && c==n-1)
            return 1;
        if(r>=m || c>=n)
            return 0;
        
        return check(r+1,c,m,n)+check(r,c+1,m,n);
    }
    public int uniquePaths(int m, int n) {
        int res=check(0,0,m,n);
        return res;
    }
}