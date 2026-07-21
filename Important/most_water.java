class most_water {
    public int maxArea(int[] height) {
        int l=0;
        int maxi=0;
        int r=height.length-1;
        while(l<r)
        {
            int ar=Math.min(height[r],height[l])*(r-l);
            maxi=Math.max(maxi,ar);
            if(height[l]<height[r])
            {
                l++;
            }
            else
            {
                r--;
            }
        }
        return maxi;
    }
}