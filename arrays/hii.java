package arrays;
class hii {
    public static void main(String[] args) {
       hii obj=new hii();
       obj.cal(5,1);
    }

    void cal(int start,int pro)
    {
        if(start==0)
        {
            System.out.println(pro);
        }
        else
        {
            pro=pro*start;
            cal(start-1,pro);
        }
    }
    }

