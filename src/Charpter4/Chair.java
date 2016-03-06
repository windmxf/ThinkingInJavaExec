package Charpter4;

/**
 * Created by maxiaofeng on 16/3/6.
 */
public class Chair {
   static public boolean grcun=false;
    static public boolean f=false;
    static public int created=0;
    static public int finalized=0;
    int i;
    Chair(){
        i=++created;
        if (created==47)System.out.println("Created47");
    }

    @Override
    protected void finalize() throws Throwable {
        if (!grcun){
            grcun=true;
            System.out.println("Begining to finalize after"+created+"Chairs have been created");
        }
        if (i==47){
            System.out.println("Finalizing Chair #47,"+"Setting flag to stop Chair creation");
            f=true;
        }
        finalized++;
        if (finalized>=created){
            System.out.println("All"+finalized+"finalized");
        }
    }

}

