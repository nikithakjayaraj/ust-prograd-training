class Solution {
    public static String whoLikesIt(String... names) {
        //Do your magic here
        int length=0;
        length=names.length;
        String msg="";

        if(length==0)
        {
            msg="no one likes this";
        }
        else if(length==1)
        {
            msg=names[0]+" likes this";
        }
        else if(length==2)
        {
            msg=names[0]+" and " +names[1]+" like this";
        }
        else if(length==3)
        {
            msg=names[0]+", "+names[1]+" and "+names[2]+" like this";
        }
        else
        {
            msg=names[0]+", "+names[1]+" and "+(length-2)+" others like this";
        }

            return msg;
        }



    }
