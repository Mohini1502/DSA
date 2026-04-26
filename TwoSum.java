public class TwoSum {
    public static void main(String[]args)
    {
         for(int firstInd=0;firstInd<nums.length;firstInd++)
        {
            for(int secInd=0;secInd<nums.length;secInd++)
            if(secInd!=firstInd)
            {
                if(nums[firstInd]+nums[secInd==target])
                return new int[]{firstInd,secInd};
            }
        }
        return new int[]{-1,-1};
    }
}
