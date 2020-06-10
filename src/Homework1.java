
public class Homework1 {

	public static void main(String[] args) 
	
	{
		int x=20;
        String sup = (x < 15) ? "small" : (x < 22)? "tiny" : "huge";
        System.out.println(sup);
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        if ( b1  && b2 || b2 && b3 || b2 ) /* Line 8 */
            System.out.print("ok ");
        if ( b1 && b2 || b2 && b3 || b2 || b1 ) /*Line 10*/
            System.out.println("dokey");
        
        
     System.out.println("------------------------------------------------------------------------------");

    
     if ( b1  && b2 || b2 && b3 || b2 ) /* Line 8 */
         System.out.print("ok ");
     if ( b1 && b2 || b2 && b3 || b2 || b1 ) /*Line 10*/
         System.out.println("dokey");
     
     
	}

}
