public class main
{
    //The goal of this project is to implement all 6 Logic Gates in Java.
    public static boolean AND(boolean a, boolean b, boolean c)
    {
        return (a && b && c);
    
    }

    public static boolean NAND(boolean a, boolean b, boolean c)
    {
        return(!(AND(a, b, c)));
    }

    public static boolean OR(boolean a, boolean b, boolean c)
    {
        return (a || b || c);   
    }

    public static boolean NOR(boolean a, boolean b, boolean c)
    {
        return(!(OR(a, b, c)));
    
    }

    public static boolean XOR(boolean a, boolean b, boolean c)
    {
        int cTrue = 0;
        if (a)
        {++cTrue;}
        if (b)
        {++cTrue;}
        if (c)
        {++cTrue;}
    
        if (cTrue % 2 == 0)
            return false;
        return true;
    }
    //Overloaded Functions for 2 Values
    public static boolean AND(boolean a, boolean b)
    {
        return (AND(a,b, true));
    
    }

    public static boolean NAND(boolean a, boolean b)
    {
        return(!(AND(a, b, true)));
    }

    public static boolean OR(boolean a, boolean b)
    {
        return (OR(a, b, false));   
    }

    public static boolean NOR(boolean a, boolean b)
    {
        return(!(OR(a, b, false)));
    
    }

    public static boolean XOR(boolean a, boolean b)
    {
        int cTrue = 0;
        if (a)
        {++cTrue;}
        if (b)
        {++cTrue;}
    
        if (cTrue % 2 == 0)
            return false;
        return true;
    }

    public static boolean NOT(boolean a)
    {   
        return (!a);
    }

    public static void main(String[] args)
    {
        String output = "false\n";
        if (AND(true, true, false))
        {
            output = "true\n";
        }
        System.out.println(output);

        output = "false\n";
        if (AND(true, true))
        {
            output = "true\n";
        }
        System.out.println(output);

        //Testing Or Cases
        output = "false\n";
        if (OR(true, true, false))
        {
            output = "true\n";
        }
        System.out.println(output);

        output = "false\n";
        if (OR(false, false))
        {
            output = "true\n";
        }
        System.out.println(output);

        //Testing Not And Gates
        output = "false\n";
        if (NAND(true, true, false))
        {
            output = "true\n";
        }
        System.out.println(output);

        output = "false\n";
        if (NAND(true, true))
        {
            output = "true\n";
        }
        System.out.println(output);

        output = "false\n";
        if (NOR(true, true, false))
        {
            output = "true\n";
        }
        System.out.println(output);

        output = "false\n";
        if (NOR(true, true))
        {
            output = "true\n";
        }
        System.out.println(output);

        output = "false\n";
        if (XOR(true, true, false))
        {
            output = "true\n";
        }
        System.out.println(output);

        output = "false\n";
        if (XOR(true, false))
        {
            output = "true\n";
        }
        System.out.println(output);
        output = "false\n";
        if (NOT(true))
        {
            output = "true\n";
        }
        System.out.println(output);
    }
}
