class ArrayException
{
    public static void main(String args[])
    {
        int a[] = {10, 20, 30};

        try
        {
            System.out.println(a[5]);
        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index is out of range");
        }

        finally
        {
            System.out.println("Program completed");
        }
    }
}
