package exception_handeling.try_catch_block;

public class TryCatchBlock {
    public static void main(String[] args) {

        try{
            String name = null;
            System.out.println(name.length());
        }catch (Exception e){
//            System.out.println(e.getMessage());
//            System.out.println(e.getClass());
//            System.out.println(e.getCause());
//            System.out.println(e.getLocalizedMessage());
            
            System.out.println(e.getSuppressed());
//            e.printStackTrace();

//            System.out.println(e);
        }

    }
}
