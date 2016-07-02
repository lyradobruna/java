public class Detyra_27_03_2016
{ public int summation(int i)
  { int totali=0;
    if (i<0)
    { System.out.println("Numri duhet te jete pozitiv."); }
    else
    { int nr=0;
      while (nr!=i)
      { nr=nr+1;
      totali=totali+nr;
      }
    }
    return totali;
  }
  
  public int product(int a,int b)
  { int totali1=1;
    if (a>b && a>0 && b>0)
    { System.out.println("Numri i pare duhet te jete me i vogel se numri i dyte."); 
      totali1=0; }
    else if (a<=0 || b<=0)
    { System.out.println("Te dy numrat duhet te jene pozitiv."); 
      totali1=0; }
    else
    { while (a<=b)
      { totali1=totali1*a;
        a=a+1;
      }
    }
    return totali1;
  }
  
  public int factorial(int f)
  { int totali2=1;
    if (f<0)
    { System.out.println("Numri duhet te jete pozitiv.");
      totali2=0; }
    else if (f==0)
    { return totali2; }
    else  
    { int nr2=1;
      while (nr2!=f)
      { nr2=nr2+1;
        totali2=totali2*nr2;
      }
    }
    return totali2;
  }
  
  public double sine(double x)
  { double sin=x;
    int numri=3;
    while (numri<=19)
    { double d=Math.pow(x,numri)/factorial(numri);
      if ((numri%4)==3)
      { sin=sin-d; }
      else 
      { sin=sin+d; }
      numri=numri+2;
     }
     return sin;
  }
  
  public double cosine(double x)
  { double cos=1;
    int numri=2;
    while (numri<=20)
    { double d=Math.pow(x,numri)/factorial(numri);
      if ((numri%4)==2)
      { cos=cos-d; }
      else 
      { cos=cos+d; }
      numri=numri+2;
     }
     return cos;
  }
  
  public static void main(String[] args)
  { Detyra_27_03_2016 llogaritje=new Detyra_27_03_2016();
    System.out.println(llogaritje.summation(5));
    System.out.println(llogaritje.product(3,6));
    System.out.println(llogaritje.factorial(5));
    System.out.println(llogaritje.sine(Math.PI/2));
    System.out.println(llogaritje.cosine(0));
  }
}