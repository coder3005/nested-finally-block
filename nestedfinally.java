/* try-catch-finally inside finally block */
class nestedfinally
{
    public static void main(String[] args) {
        
        try
        {
            String a="abhi";
            System.out.println(a.toUpperCase());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            try
            {
                System.out.println(10/0);
            }
            catch(ArithmeticException a)
            {
                System.out.println(a);
            }
            finally
            {
                System.out.println("Learn Coding");
            }
        }
        System.out.println("main method ended");
    }
}
