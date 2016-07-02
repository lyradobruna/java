import javax.swing.*;
public class Detyra_8_3_2
{ public static void main(String[] args)
  { int[] code=new int[ 27]; 
    int k=new Integer(JOptionPane.showInputDialog("Shkruaje amën (numër i plotë) : ")).intValue();
    code[0]=k;
    for (int i=1; i!=code.length; i=i+1)
    { code[i]=(int)((code[i-1]*1.3)+1); 
    }
    String answer="";
    boolean proccesing=true;
    while (proccesing)
    { String input=JOptionPane.showInputDialog("Shkruaje një numër të plotë për ta dekoduar" +"(ose asgjë, për të përfunduar) : ");
      if (input.equals(""))
      { proccesing=false; 
      }
      else { char c=decode(code, new Integer(input).intValue());
             answer=answer+c;
           }
    }
    System.out.println(answer);
  }
  private static char decode(int[] code, int i)
  { char c='*';
    boolean find=false;
    int index=0;
    while (!find&&index!=code.length)
    { if (code[index]==i)
      { find=true;
        if (index==0)
        { c=' '; }
        else { c=(char)(index+'a'-1); }
      }
      else { index=index+1; }
   }
   return c;
  }
}