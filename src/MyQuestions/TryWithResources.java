package MyQuestions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResources
{
    public static void main(String[] args)
    {
          String n;
          BufferedReader br=null;
          System.out.println("Enter something......");
             br=new BufferedReader(new InputStreamReader(System.in));
            try
        {
            n=br.readLine();
            System.out.println(n);
        }
                  catch (IOException e)
{
            e.printStackTrace();
}            finally
        {
              try
              {
                br.close();
            }
              catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}
