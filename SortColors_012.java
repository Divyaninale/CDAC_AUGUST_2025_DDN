class SortColors_012 {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int c0=0;
        int c1=0;
        int c2=0;
        int j=0;

        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
            {
                c0++;
            }
            else if(nums[i]==1)
            {
                c1++;
            }
            else
            {
                c2++;
            }
        }

        for(int i=0;i<c0;i++)
        {
            nums[j++]=0;


        }

        for(int i=0;i<c1;i++)
        {
            nums[j++]=1;
        }

        for(int i=0;i<c2;i++)
        {
            nums[j++]=2;
        }

        

        
    }
}
