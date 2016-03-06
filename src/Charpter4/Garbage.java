package Charpter4;

/**
 * Created by maxiaofeng on 16/3/6.
 */
public class Garbage {
    public static void main(String[] args){
        if (args.length==0){
            System.out.println("Usage:java Garbage before or java Grarbage after");
            return;
        }
        while (!Chair.f){
            new Chair();
            new String("To take up space");
        }
        System.out.println("After all chairs have been created: total created="+Chair.created+
                ",total finalized="+Chair.finalized);
        if (args[0].equals("before")){

            System.out.println("run finalization()");
            System.runFinalization();
            System.out.println("gc()");
            System.gc();
        }
        System.out.println("bye");
        if (args[0].equals("after")){
            System.runFinalizersOnExit(true);
        }
    }

//    publ i c stati c voi d mai n(Stri ng[] args) {
//        if(args.length==0) { System.err.println("Usage: \n" +
//                "javaGarbagebefore\n or:\n" +
//                " j a v a Ga r b a g e a f t e r " ) ; return;
//        }
//        while(!Chair.f) {
//            new Chai r ( ) ;
//            new S t r i ng( " T o t ak e up s pace" ) ; }
//        S y s t e m. o u t . p r i n t l n (
//                "After all Chairs havebeencreated:\n" + "total created = " + Chai r.created +
//                        ", total finalized=" +Chair.finalized);
//        if(args[0].equals("before")) {
//            S y s t e m. o u t . p r i n t l n ( " g c ( ) : " ) ;
//            S y s t e m. g c ( ) ;
//            S y s t e m. o u t . p r i n t l n ( " r u n F i n a l i z a t i o n ( ) : " ) ; S y s t e m. r u n F i n a l i z a t i o n ( ) ;
//        }
//        S y s t e m. o u t . p r i n t l n ( " b y e ! " ) ; i f ( ar gs [ 0] . equal s ( " af t er " ) )
//        S y s t e m. r u n F i n a l i z e r s On E x i t ( t r u e ) ; }
}
