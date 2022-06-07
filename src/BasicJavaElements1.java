public class BasicJavaElements1 {
}
/*
Consider the following directory structure shown in Image 1 that displays available folders and classes and the code given below.

class StockQuote
{
  Stock stock;
  public StockQuote(Stock s)  {
  }
  public double computePrice(){
    return Helper.getPricer(stock).price();
  }
}

Assuming that the code uses valid method calls, what statements must be added to the above class?
Answered Incorrectly

You had to select 2 option(s)
import com.enthu.*;
This is not required because the code is not using any class from this package.
import com.*.*;
Bad Syntax. You can only import one package (i.e. all classes in that package) using a * or one class in an import statement.
import *.*.*;
Bad syntax.
import com.*; // THIS
This is required because the code is using Helper.class, which exists in com package.
import com.enthu.rad.*; // THIS
This is required because the code is using Stock.class, which exists in com.enthu.rad package.
import all;


Since the given class does not have any package declaration, it belongs to the default package and therefore it must import com.Helper and com.enthu.rad.Stock classes.
 */
