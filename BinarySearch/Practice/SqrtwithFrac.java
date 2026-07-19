class SqrtwithFract{
    public int mySqrt(int x) {
        int s=1;
        int e=x;
        double ans=-1;

        if(x==0){
            return 0;
        }
        while(s<=e){
           int mid=s+(e-s)/2;
           if(mid == x/mid){
             return mid;

           }else if(mid>x/mid){
              //move left
              e=mid-1;
           }else{
            //mid*mid<x//mid<x/mid
            //potential solution par khade hai 
            //ans store karo move right
            ans=mid;
            s=mid+1;
           }

        }
        double factor=1;
        int totalPrecision=3;
        for(int round=1;round<=totalPrecision;round++){
            factor=factor/10;
            for(int i=0;i<10;i++){
                double newAns=ans+factor;
                //equilty case is ignored as of now ,but make sure that you keep in ur final code
                //if(newAns+newAns==x){
                  //  return newAns;
                //}
                if(newAns*newAns<x){
                    ans=newAns;
                }else{
                    break;
                }
            }
            System.out.println("Iss Round ka Ans is:" +Math.round(ans*1000.0)/1000.0);
        }
        System.out.println("Final Round ka Ans is:" +Math.round(ans*1000.0)/1000.0);
        //returning dummy value
        return -1;
    }
}